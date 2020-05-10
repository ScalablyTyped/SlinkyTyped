package typingsSlinky.polished.fontFaceConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceConfiguration extends js.Object {
  var fileFormats: js.UndefOr[js.Array[String]] = js.native
  var fontDisplay: js.UndefOr[String] = js.native
  var fontFamily: String = js.native
  var fontFeatureSettings: js.UndefOr[String] = js.native
  var fontFilePath: js.UndefOr[String] = js.native
  var fontStretch: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontVariant: js.UndefOr[String] = js.native
  var fontVariationSettings: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var formatHint: js.UndefOr[Boolean] = js.native
  var localFonts: js.UndefOr[js.Array[String]] = js.native
  var unicodeRange: js.UndefOr[String] = js.native
}

object FontFaceConfiguration {
  @scala.inline
  def apply(fontFamily: String): FontFaceConfiguration = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceConfiguration]
  }
  @scala.inline
  implicit class FontFaceConfigurationOps[Self <: FontFaceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withFontDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFeatureSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFeatureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFeatureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFeatureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStretch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withFontVariationSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatHint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatHint")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalFonts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeRange")(js.undefined)
        ret
    }
  }
  
}

