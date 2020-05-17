package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCSSRule extends js.Object {
  @JSName("MSHTML.HTMLCSSRule_typekey")
  var MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule = js.native
  var cssText: String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val `type`: Double = js.native
}

object HTMLCSSRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSRule_typekey")(MSHTMLDotHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSRule]
  }
  @scala.inline
  implicit class HTMLCSSRuleOps[Self <: HTMLCSSRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLCSSRule_typekey(value: HTMLCSSRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLCSSRule_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssText")(value.asInstanceOf[js.Any])
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
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

