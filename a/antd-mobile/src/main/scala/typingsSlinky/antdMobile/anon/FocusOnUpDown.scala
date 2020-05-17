package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusOnUpDown extends js.Object {
  var focusOnUpDown: Boolean = js.native
  var prefixCls: String = js.native
  var readOnly: Boolean = js.native
  var showNumber: Boolean = js.native
  var step: Double = js.native
}

object FocusOnUpDown {
  @scala.inline
  def apply(focusOnUpDown: Boolean, prefixCls: String, readOnly: Boolean, showNumber: Boolean, step: Double): FocusOnUpDown = {
    val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], showNumber = showNumber.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOnUpDown]
  }
  @scala.inline
  implicit class FocusOnUpDownOps[Self <: FocusOnUpDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusOnUpDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnUpDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

