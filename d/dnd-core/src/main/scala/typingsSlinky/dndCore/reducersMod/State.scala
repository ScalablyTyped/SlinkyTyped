package typingsSlinky.dndCore.reducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dirtyHandlerIds: typingsSlinky.dndCore.dirtyHandlerIdsMod.State
  var dragOffset: typingsSlinky.dndCore.dragOffsetMod.State
  var dragOperation: typingsSlinky.dndCore.dragOperationMod.State
  var refCount: typingsSlinky.dndCore.refCountMod.State
  var stateId: typingsSlinky.dndCore.stateIdMod.State
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
}

