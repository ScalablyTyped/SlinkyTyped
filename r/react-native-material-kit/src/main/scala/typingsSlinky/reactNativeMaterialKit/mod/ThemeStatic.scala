package typingsSlinky.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeStatic extends js.Object {
  var accentColor: js.UndefOr[String] = js.native
  var accentColorRGB: js.UndefOr[String] = js.native
  var bgDisabled: js.UndefOr[String] = js.native
  var bgPlain: js.UndefOr[String] = js.native
  var cardActionStyle: js.UndefOr[CardActionStyle] = js.native
  var cardContentStyle: js.UndefOr[CardContentStyle] = js.native
  var cardImageStyle: js.UndefOr[CardImageStyle] = js.native
  var cardMenuStyle: js.UndefOr[CardMenuStyle] = js.native
  var cardStyle: js.UndefOr[CardStyle] = js.native
  var cardTitleStyle: js.UndefOr[CardTitleStyle] = js.native
  var checkboxStyle: js.UndefOr[CheckboxStyle] = js.native
  var fontColor: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var iconToggleStyle: js.UndefOr[IconToggleStyle] = js.native
  var primaryColor: js.UndefOr[String] = js.native
  var primaryColorRGB: js.UndefOr[String] = js.native
  var progressStyle: js.UndefOr[ProgressStyle] = js.native
  var radioStyle: js.UndefOr[RadioStyle] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var sliderStyle: js.UndefOr[SliderStyle] = js.native
  var spinnerStyle: js.UndefOr[SpinnerStyle] = js.native
  var switchStyle: js.UndefOr[SwitchStyle] = js.native
  var textfieldStyle: js.UndefOr[TextFieldStyle] = js.native
}

object ThemeStatic {
  @scala.inline
  def apply(): ThemeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeStatic]
  }
  @scala.inline
  implicit class ThemeStaticOps[Self <: ThemeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAccentColorRGB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColorRGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColorRGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColorRGB")(js.undefined)
        ret
    }
    @scala.inline
    def withBgDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBgPlain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgPlain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgPlain")(js.undefined)
        ret
    }
    @scala.inline
    def withCardActionStyle(value: CardActionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardActionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardActionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardActionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCardContentStyle(value: CardContentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCardImageStyle(value: CardImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardImageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardImageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCardMenuStyle(value: CardMenuStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardMenuStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardMenuStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardMenuStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCardStyle(value: CardStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCardTitleStyle(value: CardTitleStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxStyle(value: CheckboxStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIconToggleStyle(value: IconToggleStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconToggleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconToggleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconToggleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryColorRGB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColorRGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColorRGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColorRGB")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressStyle(value: ProgressStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioStyle(value: RadioStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioStyle")(js.undefined)
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
    def withSliderStyle(value: SliderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerStyle(value: SpinnerStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchStyle(value: SwitchStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextfieldStyle(value: TextFieldStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textfieldStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextfieldStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textfieldStyle")(js.undefined)
        ret
    }
  }
  
}

