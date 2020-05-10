package typingsSlinky.rcPicker.uiUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardConfig extends js.Object {
  var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
  var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.native
}

object KeyboardConfig {
  @scala.inline
  def apply(): KeyboardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardConfig]
  }
  @scala.inline
  implicit class KeyboardConfigOps[Self <: KeyboardConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCtrlLeftRight(value: /* diff */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCtrlLeftRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCtrlLeftRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCtrlLeftRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCtrlLeftRightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCtrlLeftRight")(null)
        ret
    }
    @scala.inline
    def withOnEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(null)
        ret
    }
    @scala.inline
    def withOnLeftRight(value: /* diff */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLeftRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeftRightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeftRight")(null)
        ret
    }
    @scala.inline
    def withOnPageUpDown(value: /* diff */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageUpDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageUpDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageUpDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageUpDownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageUpDown")(null)
        ret
    }
    @scala.inline
    def withOnUpDown(value: /* diff */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpDownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpDown")(null)
        ret
    }
  }
  
}

