package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCSSNamespaceRule extends js.Object {
  @JSName("MSHTML.HTMLCSSNamespaceRule_typekey")
  var MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule = js.native
  var cssText: String = js.native
  val namespaceURI: String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val prefix: String = js.native
  val `type`: Double = js.native
}

object HTMLCSSNamespaceRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule,
    cssText: String,
    namespaceURI: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    prefix: String,
    `type`: Double
  ): HTMLCSSNamespaceRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSNamespaceRule_typekey")(MSHTMLDotHTMLCSSNamespaceRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSNamespaceRule]
  }
  @scala.inline
  implicit class HTMLCSSNamespaceRuleOps[Self <: HTMLCSSNamespaceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLCSSNamespaceRule_typekey(value: HTMLCSSNamespaceRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLCSSNamespaceRule_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
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

