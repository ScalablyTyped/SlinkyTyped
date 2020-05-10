package typingsSlinky.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontProps extends js.Object {
  var font: js.UndefOr[Font] = js.native
  var fontFamily: js.UndefOr[FontFamily] = js.native
  var fontSize: js.UndefOr[typingsSlinky.reactSketchapp.propsMod.fontSize] = js.native
  var fontStretch: js.UndefOr[FontStretch] = js.native
  var fontStyle: js.UndefOr[FontStyle] = js.native
  var fontVariant: js.UndefOr[FontVariant] = js.native
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.native
  var fontWeight: js.UndefOr[FontWeight] = js.native
  var kerning: js.UndefOr[Kerning] = js.native
  var letterSpacing: js.UndefOr[LetterSpacing] = js.native
  var textAnchor: js.UndefOr[TextAnchor] = js.native
  var textDecoration: js.UndefOr[TextDecoration] = js.native
  var wordSpacing: js.UndefOr[WordSpacing] = js.native
}

object FontProps {
  @scala.inline
  def apply(): FontProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontProps]
  }
  @scala.inline
  implicit class FontPropsOps[Self <: FontProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: FontFamily): Self = {
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
    def withFontSize(value: fontSize): Self = {
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
    def withFontStretch(value: FontStretch): Self = {
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
    def withFontStyle(value: FontStyle): Self = {
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
    def withFontVariant(value: FontVariant): Self = {
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
    def withFontVariantLigatures(value: FontVariantLigatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariantLigatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariantLigatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariantLigatures")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: FontWeight): Self = {
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
    def withKerning(value: Kerning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: LetterSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnchor(value: TextAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: TextDecoration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
    @scala.inline
    def withWordSpacing(value: WordSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSpacing")(js.undefined)
        ret
    }
  }
  
}

