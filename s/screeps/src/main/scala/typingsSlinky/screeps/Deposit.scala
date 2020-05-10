package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rare resource deposit needed for producing commodities.
  * Can be harvested by creeps with a WORK body part.
  * Each harvest operation triggers a cooldown period, which becomes longer and longer over time.
  */
@js.native
trait Deposit extends RoomObject {
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double = js.native
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var depositType: DepositConstant = js.native
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * The cooldown of the last harvest operation on this deposit.
    */
  var lastCooldown: Double = js.native
  /**
    * The amount of game ticks when this deposit will disappear.
    */
  var ticksToDecay: Double = js.native
}

@JSGlobal("Deposit")
@js.native
object Deposit extends TopLevel[DepositConstructor]

