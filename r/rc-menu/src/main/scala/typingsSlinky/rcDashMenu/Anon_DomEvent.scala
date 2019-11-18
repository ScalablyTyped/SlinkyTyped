package typingsSlinky.rcDashMenu

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEvent extends js.Object {
  var domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]
  var key: Key
}

object Anon_DomEvent {
  @scala.inline
  def apply(domEvent: SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], key: Key): Anon_DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomEvent]
  }
}

