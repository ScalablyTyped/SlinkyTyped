package typingsSlinky.reactNativePopupDialog.anon

import typingsSlinky.reactNativePopupDialog.mod.SlideFromTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideFrom extends js.Object {
  var slideFrom: js.UndefOr[SlideFromTypes] = js.native
  var toValue: js.UndefOr[Double] = js.native
}

object SlideFrom {
  @scala.inline
  def apply(): SlideFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideFrom]
  }
  @scala.inline
  implicit class SlideFromOps[Self <: SlideFrom] (val x: Self) extends AnyVal {
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

