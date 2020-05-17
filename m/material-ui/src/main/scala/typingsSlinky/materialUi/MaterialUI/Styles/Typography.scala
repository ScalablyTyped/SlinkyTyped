package typingsSlinky.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typography extends js.Object {
  var fontStyleButtonFontSize: Double = js.native
  // font weight
  var fontWeightLight: Double = js.native
  var fontWeightMedium: Double = js.native
  var fontWeightNormal: Double = js.native
  var textDarkBlack: String = js.native
  var textDarkWhite: String = js.native
  var textFullBlack: String = js.native
  var textFullWhite: String = js.native
  var textLightBlack: String = js.native
  var textLightWhite: String = js.native
  var textMinBlack: String = js.native
}

object Typography {
  @scala.inline
  def apply(
    fontStyleButtonFontSize: Double,
    fontWeightLight: Double,
    fontWeightMedium: Double,
    fontWeightNormal: Double,
    textDarkBlack: String,
    textDarkWhite: String,
    textFullBlack: String,
    textFullWhite: String,
    textLightBlack: String,
    textLightWhite: String,
    textMinBlack: String
  ): Typography = {
    val __obj = js.Dynamic.literal(fontStyleButtonFontSize = fontStyleButtonFontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightNormal = fontWeightNormal.asInstanceOf[js.Any], textDarkBlack = textDarkBlack.asInstanceOf[js.Any], textDarkWhite = textDarkWhite.asInstanceOf[js.Any], textFullBlack = textFullBlack.asInstanceOf[js.Any], textFullWhite = textFullWhite.asInstanceOf[js.Any], textLightBlack = textLightBlack.asInstanceOf[js.Any], textLightWhite = textLightWhite.asInstanceOf[js.Any], textMinBlack = textMinBlack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
  @scala.inline
  implicit class TypographyOps[Self <: Typography] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontStyleButtonFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyleButtonFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeightLight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeightMedium(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeightNormal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDarkBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDarkBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDarkWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDarkWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFullBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFullBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextFullWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFullWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLightBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLightBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLightWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLightWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextMinBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMinBlack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

