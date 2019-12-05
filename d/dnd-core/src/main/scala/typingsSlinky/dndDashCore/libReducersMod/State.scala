package typingsSlinky.dndDashCore.libReducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var dirtyHandlerIds: typingsSlinky.dndDashCore.libReducersDirtyHandlerIdsMod.State
  var dragOffset: typingsSlinky.dndDashCore.libReducersDragOffsetMod.State
  var dragOperation: typingsSlinky.dndDashCore.libReducersDragOperationMod.State
  var refCount: typingsSlinky.dndDashCore.libReducersRefCountMod.State
  var stateId: typingsSlinky.dndDashCore.libReducersStateIdMod.State
}

object State {
  @scala.inline
  def apply(
    dirtyHandlerIds: typingsSlinky.dndDashCore.libReducersDirtyHandlerIdsMod.State,
    dragOffset: typingsSlinky.dndDashCore.libReducersDragOffsetMod.State,
    dragOperation: typingsSlinky.dndDashCore.libReducersDragOperationMod.State,
    refCount: typingsSlinky.dndDashCore.libReducersRefCountMod.State,
    stateId: typingsSlinky.dndDashCore.libReducersStateIdMod.State
  ): State = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

