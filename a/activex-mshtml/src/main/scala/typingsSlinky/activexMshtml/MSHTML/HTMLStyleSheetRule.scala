package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStyleSheetRule extends js.Object {
  @JSName("MSHTML.HTMLStyleSheetRule_typekey")
  var MSHTMLDotHTMLStyleSheetRule_typekey: HTMLStyleSheetRule = js.native
  val constructor: js.Any = js.native
  var cssText: String = js.native
  var ie9_selectorText: String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val readOnly: Boolean = js.native
  var selectorText: String = js.native
  val style: IHTMLRuleStyle = js.native
  val `type`: Double = js.native
  def msGetSpecificity(index: Double): Double = js.native
}

object HTMLStyleSheetRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleSheetRule_typekey: HTMLStyleSheetRule,
    constructor: js.Any,
    cssText: String,
    ie9_selectorText: String,
    msGetSpecificity: Double => Double,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    readOnly: Boolean,
    selectorText: String,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleSheetRule = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], ie9_selectorText = ie9_selectorText.asInstanceOf[js.Any], msGetSpecificity = js.Any.fromFunction1(msGetSpecificity), parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleSheetRule_typekey")(MSHTMLDotHTMLStyleSheetRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleSheetRule]
  }
  @scala.inline
  implicit class HTMLStyleSheetRuleOps[Self <: HTMLStyleSheetRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLStyleSheetRule_typekey(value: HTMLStyleSheetRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLStyleSheetRule_typekey")(value.asInstanceOf[js.Any])
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
    def withIe9_selectorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie9_selectorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsGetSpecificity(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msGetSpecificity")(js.Any.fromFunction1(value))
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
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
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

