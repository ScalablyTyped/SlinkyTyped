package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A site of a structure which is currently under construction.
  */
@js.native
trait ConstructionSite[T /* <: BuildableStructureConstant */] extends RoomObject {
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  /**
    * Whether this is your own construction site.
    */
  var my: Boolean = js.native
  /**
    * An object with the structure’s owner info.
    */
  var owner: Owner = js.native
  /**
    * The current construction progress.
    */
  var progress: Double = js.native
  /**
    * The total construction progress needed for the structure to be built.
    */
  var progressTotal: Double = js.native
  /**
    * One of the `STRUCTURE_*` constants.
    */
  var structureType: T = js.native
  /**
    * Remove the construction site.
    * @returns Result Code: OK, ERR_NOT_OWNER
    */
  def remove(): Double = js.native
}

@JSGlobal("ConstructionSite")
@js.native
object ConstructionSite extends TopLevel[ConstructionSiteConstructor]

