package typingsSlinky.otplib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotpOptionsInterface extends HotpOptionsInterface {
  var epoch: js.UndefOr[js.Any] = js.native
  var step: js.UndefOr[Double] = js.native
  var window: js.UndefOr[Double | js.Array[Double]] = js.native
}

object TotpOptionsInterface {
  @scala.inline
  def apply(): TotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotpOptionsInterface]
  }
  @scala.inline
  implicit class TotpOptionsInterfaceOps[Self <: TotpOptionsInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpoch(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpoch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epoch")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
  }
  
}

