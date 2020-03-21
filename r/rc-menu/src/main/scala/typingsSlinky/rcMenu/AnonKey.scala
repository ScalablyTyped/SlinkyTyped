package typingsSlinky.rcMenu

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var domEvent: SyntheticMouseEvent[HTMLElement]
  var key: Key
}

object AnonKey {
  @scala.inline
  def apply(domEvent: SyntheticMouseEvent[HTMLElement], key: Key): AnonKey = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

