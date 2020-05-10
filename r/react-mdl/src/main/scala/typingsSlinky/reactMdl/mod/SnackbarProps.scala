package typingsSlinky.reactMdl.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var active: Boolean = js.native
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  def onTimeout(): js.Any = js.native
}

object SnackbarProps {
  @scala.inline
  def apply(active: Boolean, onTimeout: () => js.Any): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onTimeout = js.Any.fromFunction0(onTimeout))
    __obj.asInstanceOf[SnackbarProps]
  }
  @scala.inline
  implicit class SnackbarPropsOps[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTimeout(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnActionClick(value: SyntheticMouseEvent[Snackbar] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActionClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

