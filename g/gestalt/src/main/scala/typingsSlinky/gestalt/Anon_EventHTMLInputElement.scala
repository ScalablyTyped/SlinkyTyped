package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLInputElement extends js.Object {
  var event: SyntheticEvent[Event, HTMLInputElement]
}

object Anon_EventHTMLInputElement {
  @scala.inline
  def apply(event: SyntheticEvent[Event, HTMLInputElement]): Anon_EventHTMLInputElement = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventHTMLInputElement]
  }
}

