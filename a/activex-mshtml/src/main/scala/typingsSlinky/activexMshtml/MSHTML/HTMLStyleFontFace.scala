package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStyleFontFace extends js.Object {
  @JSName("MSHTML.HTMLStyleFontFace_typekey")
  var MSHTMLDotHTMLStyleFontFace_typekey: HTMLStyleFontFace = js.native
  var cssText: String = js.native
  var fontsrc: String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val style: IHTMLRuleStyle = js.native
  val `type`: Double = js.native
}

object HTMLStyleFontFace {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleFontFace_typekey: HTMLStyleFontFace,
    cssText: String,
    fontsrc: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleFontFace = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], fontsrc = fontsrc.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleFontFace_typekey")(MSHTMLDotHTMLStyleFontFace_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleFontFace]
  }
  @scala.inline
  implicit class HTMLStyleFontFaceOps[Self <: HTMLStyleFontFace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLStyleFontFace_typekey(value: HTMLStyleFontFace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLStyleFontFace_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontsrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRule(value: IHTMLCSSRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentStyleSheet(value: IHTMLStyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentStyleSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: IHTMLRuleStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

