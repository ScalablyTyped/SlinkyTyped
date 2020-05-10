package typingsSlinky.dndCore

import typingsSlinky.dndCore.dragOffsetMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirtyHandlerIds extends js.Object {
  var dirtyHandlerIds: js.Array[String] = js.native
  var dragOffset: State = js.native
  var dragOperation: typingsSlinky.dndCore.dragOperationMod.State = js.native
  var refCount: Double = js.native
  var stateId: Double = js.native
}

object AnonDirtyHandlerIds {
  @scala.inline
  def apply(
    dirtyHandlerIds: js.Array[String],
    dragOffset: State,
    dragOperation: typingsSlinky.dndCore.dragOperationMod.State,
    refCount: Double,
    stateId: Double
  ): AnonDirtyHandlerIds = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirtyHandlerIds]
  }
  @scala.inline
  implicit class AnonDirtyHandlerIdsOps[Self <: AnonDirtyHandlerIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirtyHandlerIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyHandlerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOffset(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOperation(value: typingsSlinky.dndCore.dragOperationMod.State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

