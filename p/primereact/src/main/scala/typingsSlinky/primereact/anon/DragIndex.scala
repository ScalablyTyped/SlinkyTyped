package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragIndex extends js.Object {
  var dragIndex: Double = js.native
  var dropIndex: Double = js.native
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  var value: js.Any = js.native
}

object DragIndex {
  @scala.inline
  def apply(dragIndex: Double, dropIndex: Double, originalEvent: org.scalajs.dom.raw.Event, value: js.Any): DragIndex = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragIndex]
  }
  @scala.inline
  implicit class DragIndexOps[Self <: DragIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: org.scalajs.dom.raw.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

