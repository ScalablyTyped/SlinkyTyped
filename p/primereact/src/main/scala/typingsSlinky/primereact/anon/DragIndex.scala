package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragIndex extends js.Object {
  var dragIndex: Double
  var dropIndex: Double
  var originalEvent: org.scalajs.dom.raw.Event
  var value: js.Any
}

object DragIndex {
  @scala.inline
  def apply(dragIndex: Double, dropIndex: Double, originalEvent: org.scalajs.dom.raw.Event, value: js.Any): DragIndex = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragIndex]
  }
}

