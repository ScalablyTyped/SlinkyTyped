package typingsSlinky.reactSortablePane.mod.global

import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var TouchEvent: org.scalajs.dom.raw.TouchEvent
}

object Window {
  @scala.inline
  def apply(TouchEvent: TouchEvent): Window = {
    val __obj = js.Dynamic.literal(TouchEvent = TouchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

