package typingsSlinky.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemePalette extends js.Object {
  var accent1Color: js.UndefOr[String] = js.native
  var accent2Color: js.UndefOr[String] = js.native
  var accent3Color: js.UndefOr[String] = js.native
  var alternateTextColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var canvasColor: js.UndefOr[String] = js.native
  var clockCircleColor: js.UndefOr[String] = js.native
  var disabledColor: js.UndefOr[String] = js.native
  var pickerHeaderColor: js.UndefOr[String] = js.native
  var primary1Color: js.UndefOr[String] = js.native
  var primary2Color: js.UndefOr[String] = js.native
  var primary3Color: js.UndefOr[String] = js.native
  var secondaryTextColor: js.UndefOr[String] = js.native
  var shadowColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object ThemePalette {
  @scala.inline
  def apply(): ThemePalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemePalette]
  }
  @scala.inline
  implicit class ThemePaletteOps[Self <: ThemePalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccent1Color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent1Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent1Color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent1Color")(js.undefined)
        ret
    }
    @scala.inline
    def withAccent2Color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent2Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent2Color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent2Color")(js.undefined)
        ret
    }
    @scala.inline
    def withAccent3Color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent3Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccent3Color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accent3Color")(js.undefined)
        ret
    }
    @scala.inline
    def withAlternateTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvasColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClockCircleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockCircleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockCircleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockCircleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerHeaderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerHeaderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerHeaderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary1Color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary1Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary1Color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary1Color")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary2Color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary2Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary2Color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary2Color")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary3Color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary3Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary3Color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary3Color")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

