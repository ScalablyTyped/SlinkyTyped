package typingsSlinky.rcMenu.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var domEvent: SyntheticMouseEvent[HTMLElement]
  var key: typingsSlinky.react.mod.Key
}

object Key {
  @scala.inline
  def apply(domEvent: SyntheticMouseEvent[HTMLElement], key: typingsSlinky.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

