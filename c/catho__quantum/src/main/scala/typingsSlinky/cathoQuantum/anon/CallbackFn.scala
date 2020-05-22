package typingsSlinky.cathoQuantum.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackFn extends js.Object {
  var callbackFn: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object CallbackFn {
  @scala.inline
  def apply(callbackFn: SyntheticMouseEvent[HTMLButtonElement] => Unit = null, title: String = null): CallbackFn = {
    val __obj = js.Dynamic.literal()
    if (callbackFn != null) __obj.updateDynamic("callbackFn")(js.Any.fromFunction1(callbackFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackFn]
  }
}

