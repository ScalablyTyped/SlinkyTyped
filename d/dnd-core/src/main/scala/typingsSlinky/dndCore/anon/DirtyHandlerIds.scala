package typingsSlinky.dndCore.anon

import typingsSlinky.dndCore.dragOffsetMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirtyHandlerIds extends js.Object {
  var dirtyHandlerIds: js.Array[String]
  var dragOffset: State
  var dragOperation: typingsSlinky.dndCore.dragOperationMod.State
  var refCount: Double
  var stateId: Double
}

object DirtyHandlerIds {
  @scala.inline
  def apply(
    dirtyHandlerIds: js.Array[String],
    dragOffset: State,
    dragOperation: typingsSlinky.dndCore.dragOperationMod.State,
    refCount: Double,
    stateId: Double
  ): DirtyHandlerIds = {
    val __obj = js.Dynamic.literal(dirtyHandlerIds = dirtyHandlerIds.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], dragOperation = dragOperation.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], stateId = stateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirtyHandlerIds]
  }
}

