package typingsSlinky.rcPicker.panelContextMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOperationRefProps extends js.Object {
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Boolean]] = js.native
}

object ContextOperationRefProps {
  @scala.inline
  def apply(): ContextOperationRefProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOperationRefProps]
  }
  @scala.inline
  implicit class ContextOperationRefPropsOps[Self <: ContextOperationRefProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLElement] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
  }
  
}

