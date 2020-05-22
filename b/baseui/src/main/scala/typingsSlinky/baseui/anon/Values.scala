package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Values extends js.Object {
  var event: SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event]
  var values: js.Array[String]
}

object Values {
  @scala.inline
  def apply(
    event: SyntheticEvent[EventTarget with HTMLInputElement, org.scalajs.dom.raw.Event],
    values: js.Array[String]
  ): Values = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
}

