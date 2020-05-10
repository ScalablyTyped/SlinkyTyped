package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeCapture extends js.Object {
  var draggableId: DraggableId = js.native
  var mode: MovementMode = js.native
}

object BeforeCapture {
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode): BeforeCapture = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCapture]
  }
  @scala.inline
  implicit class BeforeCaptureOps[Self <: BeforeCapture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggableId(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: MovementMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

