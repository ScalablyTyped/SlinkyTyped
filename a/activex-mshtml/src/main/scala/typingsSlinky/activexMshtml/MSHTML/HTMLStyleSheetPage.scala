package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStyleSheetPage extends js.Object {
  @JSName("MSHTML.HTMLStyleSheetPage_typekey")
  var MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage = js.native
  val constructor: js.Any = js.native
  var cssText: String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val pseudoClass: String = js.native
  val selector: String = js.native
  var selectorText: String = js.native
  val style: IHTMLRuleStyle = js.native
  val `type`: Double = js.native
}

object HTMLStyleSheetPage {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage,
    constructor: js.Any,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    pseudoClass: String,
    selector: String,
    selectorText: String,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleSheetPage = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], pseudoClass = pseudoClass.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleSheetPage_typekey")(MSHTMLDotHTMLStyleSheetPage_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleSheetPage]
  }
  @scala.inline
  implicit class HTMLStyleSheetPageOps[Self <: HTMLStyleSheetPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLStyleSheetPage_typekey(value: HTMLStyleSheetPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLStyleSheetPage_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
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
    def withPseudoClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorText")(value.asInstanceOf[js.Any])
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

