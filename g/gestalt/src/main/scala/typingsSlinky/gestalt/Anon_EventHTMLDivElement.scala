package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLDivElement extends js.Object {
  var event: SyntheticEvent[Event, SyntheticMouseEvent[HTMLDivElement]]
}

object Anon_EventHTMLDivElement {
  @scala.inline
  def apply(event: SyntheticEvent[Event, SyntheticMouseEvent[HTMLDivElement]]): Anon_EventHTMLDivElement = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventHTMLDivElement]
  }
}

