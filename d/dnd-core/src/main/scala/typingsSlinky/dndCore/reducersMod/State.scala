package typingsSlinky.dndCore.reducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var dirtyHandlerIds: typingsSlinky.dndCore.dirtyHandlerIdsMod.State = js.native
  var dragOffset: typingsSlinky.dndCore.dragOffsetMod.State = js.native
  var dragOperation: typingsSlinky.dndCore.dragOperationMod.State = js.native
  var refCount: typingsSlinky.dndCore.refCountMod.State = js.native
  var stateId: typingsSlinky.dndCore.stateIdMod.State = js.native
}

object State {
  @scala.inline
  def apply(
    dirtyHandlerIds: typingsSlinky.dndCore.dirtyHandlerIdsMod.State,
    dragOffset: typingsSlinky.dndCore.dragOffsetMod.State,
    dragOperation: typingsSlinky.dndCore.dragOperationMod.State,
    refCount: typingsSlinky.dndCore.refCountMod.State,
    stateId: typingsSlinky.dndCore.stateIdMod.State
  ): State = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirtyHandlerIds(value: typingsSlinky.dndCore.dirtyHandlerIdsMod.State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyHandlerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOffset(value: typingsSlinky.dndCore.dragOffsetMod.State): Self = {
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
    def withRefCount(value: typingsSlinky.dndCore.refCountMod.State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateId(value: typingsSlinky.dndCore.stateIdMod.State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

