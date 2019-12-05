package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLDivElementKeyboardEvent extends js.Object {
  var event: SyntheticEvent[
    Event, 
    SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
  ]
}

object Anon_EventHTMLDivElementKeyboardEvent {
  @scala.inline
  def apply(
    event: SyntheticEvent[
      Event, 
      SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
    ]
  ): Anon_EventHTMLDivElementKeyboardEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventHTMLDivElementKeyboardEvent]
  }
}

