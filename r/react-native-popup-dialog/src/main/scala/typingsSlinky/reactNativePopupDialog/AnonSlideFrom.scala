package typingsSlinky.reactNativePopupDialog

import typingsSlinky.reactNativePopupDialog.mod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSlideFrom extends js.Object {
  var slideFrom: js.UndefOr[SlideFromTypes] = js.native
  var toValue: js.UndefOr[Double] = js.native
}

object AnonSlideFrom {
  @scala.inline
  def apply(): AnonSlideFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSlideFrom]
  }
  @scala.inline
  implicit class AnonSlideFromOps[Self <: AnonSlideFrom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlideFrom(value: SlideFromTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideFrom")(js.undefined)
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

