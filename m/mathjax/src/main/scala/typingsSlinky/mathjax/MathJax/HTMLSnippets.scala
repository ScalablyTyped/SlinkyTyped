package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLSnippets extends js.Object {
  /*HTML that gives the download link for the STIX fonts only. (Used in place of fonts when the HTML-CSS option
    * for availableFonts only includes the STIX fonts.)
    */
  var STIXfonts: js.UndefOr[String] = js.native
  /*HTML that gives the download link for the MathJax TeX fonts only. (Used in place of fonts when the HTML-CSS
    * option for availableFonts only includes the TeX fonts.)
    */
  var TeXfonts: js.UndefOr[String] = js.native
  /*The HTML for the close box in the FontWarning message.*/
  var closeBox: js.UndefOr[String] = js.native
  /*HTML that includes links to the MathJax and STIX font download pages.*/
  var fonts: js.UndefOr[String] = js.native
  /*The HTML for a paragraph suggesting an upgrade to a more modern browser that supports web fonts.*/
  var webfonts: js.UndefOr[String] = js.native
}

object HTMLSnippets {
  @scala.inline
  def apply(): HTMLSnippets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLSnippets]
  }
  @scala.inline
  implicit class HTMLSnippetsOps[Self <: HTMLSnippets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSTIXfonts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STIXfonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSTIXfonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STIXfonts")(js.undefined)
        ret
    }
    @scala.inline
    def withTeXfonts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeXfonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeXfonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeXfonts")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBox")(js.undefined)
        ret
    }
    @scala.inline
    def withFonts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withWebfonts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webfonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebfonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webfonts")(js.undefined)
        ret
    }
  }
  
}

