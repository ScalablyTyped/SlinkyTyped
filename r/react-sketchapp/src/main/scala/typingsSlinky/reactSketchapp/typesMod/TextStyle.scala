package typingsSlinky.reactSketchapp.typesMod

import typingsSlinky.reactSketchapp.anon.Width
import typingsSlinky.reactSketchapp.reactSketchappStrings.auto
import typingsSlinky.reactSketchapp.reactSketchappStrings.center
import typingsSlinky.reactSketchapp.reactSketchappStrings.italic
import typingsSlinky.reactSketchapp.reactSketchappStrings.justify
import typingsSlinky.reactSketchapp.reactSketchappStrings.left
import typingsSlinky.reactSketchapp.reactSketchappStrings.lowercase
import typingsSlinky.reactSketchapp.reactSketchappStrings.ltr
import typingsSlinky.reactSketchapp.reactSketchappStrings.normal
import typingsSlinky.reactSketchapp.reactSketchappStrings.right
import typingsSlinky.reactSketchapp.reactSketchappStrings.rtl
import typingsSlinky.reactSketchapp.reactSketchappStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  var color: js.UndefOr[Color] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[normal | italic] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var letterSpacing: js.UndefOr[Double] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var paragraphSpacing: js.UndefOr[Double] = js.native
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.native
  var textDecoration: js.UndefOr[String] = js.native
  var textShadowColor: js.UndefOr[Color] = js.native
  var textShadowOffset: js.UndefOr[Width] = js.native
  var textShadowOpacity: js.UndefOr[Double] = js.native
  var textShadowRadius: js.UndefOr[Double] = js.native
  var textShadowSpread: js.UndefOr[Double] = js.native
  var textTransform: js.UndefOr[uppercase | lowercase] = js.native
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
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
    def withFontStyle(value: normal | italic): Self = {
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
    def withLetterSpacing(value: Double): Self = {
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
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: auto | left | right | center | justify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: String): Self = {
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
    def withTextShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowOffset(value: Width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadowSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadowSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTransform(value: uppercase | lowercase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withWritingDirection(value: auto | ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingDirection")(js.undefined)
        ret
    }
  }
  
}

