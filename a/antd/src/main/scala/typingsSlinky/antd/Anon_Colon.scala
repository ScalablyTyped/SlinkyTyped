package typingsSlinky.antd

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.SyntheticEvent
import typingsSlinky.antd.antdStrings.`inline`
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colon extends js.Object {
  var colon: Boolean
  var hideRequiredMark: Boolean
  var layout: `inline` | horizontal | vertical
  def onSubmit(e: SyntheticEvent[EventTarget with HTMLFormElement, Event]): Unit
}

object Anon_Colon {
  @scala.inline
  def apply(
    colon: Boolean,
    hideRequiredMark: Boolean,
    layout: `inline` | horizontal | vertical,
    onSubmit: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit
  ): Anon_Colon = {
    val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], hideRequiredMark = hideRequiredMark.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction1(onSubmit))
  
    __obj.asInstanceOf[Anon_Colon]
  }
}

