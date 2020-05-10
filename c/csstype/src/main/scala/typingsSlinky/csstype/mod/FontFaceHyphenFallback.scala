package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceHyphenFallback extends js.Object {
  var `-moz-font-feature-settings`: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  var `font-display`: js.UndefOr[FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]] = js.native
  var `font-family`: js.UndefOr[String | js.Array[String]] = js.native
  var `font-feature-settings`: js.UndefOr[
    FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]
  ] = js.native
  var `font-stretch`: js.UndefOr[FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]] = js.native
  var `font-style`: js.UndefOr[FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]] = js.native
  var `font-variant`: js.UndefOr[FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]] = js.native
  var `font-variation-settings`: js.UndefOr[
    FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]
  ] = js.native
  var `font-weight`: js.UndefOr[FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]] = js.native
  var src: js.UndefOr[String | js.Array[String]] = js.native
  var `unicode-range`: js.UndefOr[String | js.Array[String]] = js.native
}

object FontFaceHyphenFallback {
  @scala.inline
  def apply(): FontFaceHyphenFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceHyphenFallback]
  }
  @scala.inline
  implicit class FontFaceHyphenFallbackOps[Self <: FontFaceHyphenFallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with-moz-font-feature-settings`(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-moz-font-feature-settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-moz-font-feature-settings`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-moz-font-feature-settings")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-display`(value: FontFaceFontDisplayProperty | js.Array[FontFaceFontDisplayProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-display`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-display")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-family`(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-feature-settings`(value: FontFaceFontFeatureSettingsProperty | js.Array[FontFaceFontFeatureSettingsProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-feature-settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-feature-settings`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-feature-settings")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-stretch`(value: FontFaceFontStretchProperty | js.Array[FontFaceFontStretchProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-stretch`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-stretch")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-style`(value: FontFaceFontStyleProperty | js.Array[FontFaceFontStyleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variant`(value: FontFaceFontVariantProperty | js.Array[FontFaceFontVariantProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variant")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-variation-settings`(value: FontFaceFontVariationSettingsProperty | js.Array[FontFaceFontVariationSettingsProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variation-settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-variation-settings`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-variation-settings")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-weight`(value: FontFaceFontWeightProperty | js.Array[FontFaceFontWeightProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-weight")(js.undefined)
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
    def `withUnicode-range`(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUnicode-range`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode-range")(js.undefined)
        ret
    }
  }
  
}

