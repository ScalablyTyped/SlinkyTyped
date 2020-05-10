package typingsSlinky.reactNativePopupDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationDuration extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.native
  var toValue: js.UndefOr[Double] = js.native
}

object AnonAnimationDuration {
  @scala.inline
  def apply(): AnonAnimationDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnimationDuration]
  }
  @scala.inline
  implicit class AnonAnimationDurationOps[Self <: AnonAnimationDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withToValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toValue")(js.undefined)
        ret
    }
  }
  
}

