package typingsSlinky.antd.confirmDialogMod

import typingsSlinky.antd.modalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmDialogProps extends ModalFuncProps {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  def close(args: js.Any*): Unit = js.native
}

object ConfirmDialogProps {
  @scala.inline
  def apply(close: /* repeated */ js.Any => Unit): ConfirmDialogProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    __obj.asInstanceOf[ConfirmDialogProps]
  }
  @scala.inline
  implicit class ConfirmDialogPropsOps[Self <: ConfirmDialogProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.undefined)
        ret
    }
  }
  
}

