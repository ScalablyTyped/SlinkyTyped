package typingsSlinky.screeps

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

object ConstructionSite {
  @scala.inline
  def apply[T](
    effects: js.Array[RoomObjectEffect],
    id: Id[ConstructionSite[T]],
    my: Boolean,
    owner: Owner,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    remove: () => Double,
    structureType: T
  ): ConstructionSite[T] = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructionSite[T]]
  }
  @scala.inline
  implicit class ConstructionSiteOps[Self[t] <: ConstructionSite[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withId(value: Id[ConstructionSite[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMy(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Owner): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressTotal(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStructureType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

