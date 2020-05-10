package typingsSlinky.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderStyle extends js.Object {
  var lowerTrackColor: js.UndefOr[String] = js.native
  var upperTrackColor: js.UndefOr[String] = js.native
}

object SliderStyle {
  @scala.inline
  def apply(): SliderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStyle]
  }
  @scala.inline
  implicit class SliderStyleOps[Self <: SliderStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerTrackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerTrackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerTrackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerTrackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperTrackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperTrackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperTrackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperTrackColor")(js.undefined)
        ret
    }
  }
  
}

