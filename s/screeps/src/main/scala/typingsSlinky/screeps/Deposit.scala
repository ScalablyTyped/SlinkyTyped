package typingsSlinky.screeps

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

object Deposit {
  @scala.inline
  def apply(
    cooldown: Double,
    depositType: DepositConstant,
    effects: js.Array[RoomObjectEffect],
    id: Id[Deposit],
    lastCooldown: Double,
    pos: RoomPosition,
    ticksToDecay: Double
  ): Deposit = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], depositType = depositType.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastCooldown = lastCooldown.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deposit]
  }
  @scala.inline
  implicit class DepositOps[Self <: Deposit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepositType(value: DepositConstant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depositType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Id[Deposit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksToDecay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksToDecay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

