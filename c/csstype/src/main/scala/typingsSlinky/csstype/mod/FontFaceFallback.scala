package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceFallback extends js.Object {
  var MozFontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.native
  var fontFamily: js.UndefOr[String | js.Array[String]] = js.native
  var fontFeatureSettings: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.native
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.native
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.native
  var fontVariationSettings: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.native
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.native
  var src: js.UndefOr[String | js.Array[String]] = js.native
  var unicodeRange: js.UndefOr[String | js.Array[String]] = js.native
}

object FontFaceFallback {
  @scala.inline
  def apply(): FontFaceFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceFallback]
  }
  @scala.inline
  implicit class FontFaceFallbackOps[Self <: FontFaceFallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozFontFeatureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozFontFeatureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozFontFeatureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFontDisplay(value: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]): Self = {
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
    def withFontFamily(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFeatureSettings(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = {
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
    def withFontStretch(value: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]): Self = {
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
    def withFontStyle(value: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]): Self = {
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
    def withFontVariant(value: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]): Self = {
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
    def withFontVariationSettings(value: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]): Self = {
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
    def withFontWeight(value: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]): Self = {
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
    def withSrc(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeRange(value: String | js.Array[String]): Self = {
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

