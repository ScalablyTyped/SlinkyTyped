package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCSSImportRule extends js.Object {
  @JSName("MSHTML.HTMLCSSImportRule_typekey")
  var MSHTMLDotHTMLCSSImportRule_typekey: HTMLCSSImportRule = js.native
  var cssText: String = js.native
  val href: String = js.native
  var media: js.Any = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val styleSheet: IHTMLStyleSheet = js.native
  val `type`: Double = js.native
}

object HTMLCSSImportRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSImportRule_typekey: HTMLCSSImportRule,
    cssText: String,
    href: String,
    media: js.Any,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    styleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSImportRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], styleSheet = styleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSImportRule_typekey")(MSHTMLDotHTMLCSSImportRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSImportRule]
  }
  @scala.inline
  implicit class HTMLCSSImportRuleOps[Self <: HTMLCSSImportRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLCSSImportRule_typekey(value: HTMLCSSImportRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLCSSImportRule_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
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
    def withStyleSheet(value: IHTMLStyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSheet")(value.asInstanceOf[js.Any])
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

