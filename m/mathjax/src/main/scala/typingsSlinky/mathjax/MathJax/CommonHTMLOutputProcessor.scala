package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonHTMLOutputProcessor extends js.Object {
  /*This is an object that configures automatic linebreaking in the CommonHTML output. In order to be backward
    * compatible with earlier versions of MathJax, only explicit line breaks are performed by default, so you must
    * enable line breaks if you want automatic ones.
    */
  var linebreaks: js.UndefOr[LineBreaks] = js.native
  /*This gives a minimum scale (as a percent) for the scaling used by MathJax to match the equation to the
    * surrounding text. This will prevent MathJax from making the mathematics too small.
    */
  var minScaleAdjust: js.UndefOr[Double] = js.native
  /*This setting controls whether <mtext> elements will be typeset using the math fonts or the font of the
    * surrounding text. When false, the font for mathvariant="normal" will be used; when true, the font will be
    * inherited from the surrounding paragraph.
    */
  var mtextFontInherit: js.UndefOr[Boolean] = js.native
  /*The scaling factor (as a percentage) of math with respect to the surrounding text. The CommonHTML output
    * processor tries to match the ex-size of the mathematics with that of the text where it is placed, but you may
    * want to adjust the results using this scaling factor. The user can also adjust this value using the contextual
    * menu item associated with the typeset mathematics.
    */
  var scale: js.UndefOr[Double] = js.native
}

object CommonHTMLOutputProcessor {
  @scala.inline
  def apply(): CommonHTMLOutputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonHTMLOutputProcessor]
  }
  @scala.inline
  implicit class CommonHTMLOutputProcessorOps[Self <: CommonHTMLOutputProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinebreaks(value: LineBreaks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linebreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinebreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linebreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScaleAdjust(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScaleAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withMtextFontInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtextFontInherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtextFontInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtextFontInherit")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

