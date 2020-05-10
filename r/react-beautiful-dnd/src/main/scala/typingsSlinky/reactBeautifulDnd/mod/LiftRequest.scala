package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiftRequest extends js.Object {
  var draggableId: DraggableId = js.native
  var scrollOptions: ScrollOptions = js.native
}

object LiftRequest {
  @scala.inline
  def apply(draggableId: DraggableId, scrollOptions: ScrollOptions): LiftRequest = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], scrollOptions = scrollOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftRequest]
  }
  @scala.inline
  implicit class LiftRequestOps[Self <: LiftRequest] (val x: Self) extends AnyVal {
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
    def withScrollOptions(value: ScrollOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

