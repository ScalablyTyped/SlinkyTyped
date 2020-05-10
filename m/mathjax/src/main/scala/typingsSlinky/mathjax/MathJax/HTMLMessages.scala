package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLMessages extends js.Object {
  /*The message used for when MathJax must use image fonts rather than local or web-based fonts (for those
    * browsers that don’t handle the @font-face CSS directive).
    */
  var imageFonts: js.UndefOr[js.Array[_]] = js.native
  /*The message used when MathJax is unable to find any font to use (i.e., neither local nor web-based nor
    * image-based fonts are available).
    */
  var noFonts: js.UndefOr[js.Array[_]] = js.native
  /*The message used for when MathJax uses web-based fonts (rather than local fonts installed on the user’s
    * system).
    */
  var webFont: js.UndefOr[js.Array[_]] = js.native
}

object HTMLMessages {
  @scala.inline
  def apply(): HTMLMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLMessages]
  }
  @scala.inline
  implicit class HTMLMessagesOps[Self <: HTMLMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageFonts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withNoFonts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withWebFont(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webFont")(js.undefined)
        ret
    }
  }
  
}

