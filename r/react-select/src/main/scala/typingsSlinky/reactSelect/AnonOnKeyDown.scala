package typingsSlinky.reactSelect

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactSelect.typesMod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnKeyDown extends js.Object {
  var onKeyDown: KeyboardEventHandler = js.native
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[AnonOnKeyDown]
  }
  @scala.inline
  implicit class AnonOnKeyDownOps[Self <: AnonOnKeyDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnKeyDown(value: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

