package typingsSlinky.dndCore.reducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirtyHandlerIdsVarargs(value: String*): Self = this.set("dirtyHandlerIds", js.Array(value :_*))
    
    @scala.inline
    def setDirtyHandlerIds(value: typingsSlinky.dndCore.dirtyHandlerIdsMod.State): Self = this.set("dirtyHandlerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOffset(value: typingsSlinky.dndCore.dragOffsetMod.State): Self = this.set("dragOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOperation(value: typingsSlinky.dndCore.dragOperationMod.State): Self = this.set("dragOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefCount(value: typingsSlinky.dndCore.refCountMod.State): Self = this.set("refCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateId(value: typingsSlinky.dndCore.stateIdMod.State): Self = this.set("stateId", value.asInstanceOf[js.Any])
  }
}
