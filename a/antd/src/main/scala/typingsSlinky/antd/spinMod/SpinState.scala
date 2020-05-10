package typingsSlinky.antd.spinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinState extends js.Object {
  var notCssAnimationSupported: js.UndefOr[Boolean] = js.native
  var spinning: js.UndefOr[Boolean] = js.native
}

object SpinState {
  @scala.inline
  def apply(): SpinState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinState]
  }
  @scala.inline
  implicit class SpinStateOps[Self <: SpinState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotCssAnimationSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notCssAnimationSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotCssAnimationSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notCssAnimationSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinning")(js.undefined)
        ret
    }
  }
  
}

