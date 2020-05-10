package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
import typingsSlinky.reactNativeMaterialKit.AnonChecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKSwitchProperties extends TouchableWithoutFeedbackProps {
  var checked: js.UndefOr[Boolean] = js.native
  var offColor: js.UndefOr[String] = js.native
  var onCheckedChange: js.UndefOr[js.Function1[/* opts */ AnonChecked, Unit]] = js.native
  var onColor: js.UndefOr[String] = js.native
  var rippleAniDuration: js.UndefOr[Double] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var thumbAniDuration: js.UndefOr[Double] = js.native
  var thumbOffColor: js.UndefOr[String] = js.native
  var thumbOnColor: js.UndefOr[String] = js.native
  var thumbRadius: js.UndefOr[Double] = js.native
  var trackLength: js.UndefOr[Double] = js.native
  var trackSize: js.UndefOr[Double] = js.native
}

object MKSwitchProperties {
  @scala.inline
  def apply(): MKSwitchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSwitchProperties]
  }
  @scala.inline
  implicit class MKSwitchPropertiesOps[Self <: MKSwitchProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withOffColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCheckedChange(value: /* opts */ AnonChecked => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckedChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCheckedChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckedChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleAniDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleAniDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleAniDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleAniDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbAniDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbAniDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbAniDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbAniDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbOffColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOffColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbOffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOffColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbOnColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOnColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbOnColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOnColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSize")(js.undefined)
        ret
    }
  }
  
}

