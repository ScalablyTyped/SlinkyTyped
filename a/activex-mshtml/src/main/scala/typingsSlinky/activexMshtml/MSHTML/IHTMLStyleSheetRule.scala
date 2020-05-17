package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLStyleSheetRule extends js.Object {
  @JSName("MSHTML.IHTMLStyleSheetRule_typekey")
  var MSHTMLDotIHTMLStyleSheetRule_typekey: IHTMLStyleSheetRule = js.native
  val readOnly: Boolean = js.native
  var selectorText: String = js.native
  val style: IHTMLRuleStyle = js.native
}

object IHTMLStyleSheetRule {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLStyleSheetRule_typekey: IHTMLStyleSheetRule,
    readOnly: Boolean,
    selectorText: String,
    style: IHTMLRuleStyle
  ): IHTMLStyleSheetRule = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLStyleSheetRule_typekey")(MSHTMLDotIHTMLStyleSheetRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleSheetRule]
  }
  @scala.inline
  implicit class IHTMLStyleSheetRuleOps[Self <: IHTMLStyleSheetRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLStyleSheetRule_typekey(value: IHTMLStyleSheetRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLStyleSheetRule_typekey")(value.asInstanceOf[js.Any])
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
  }
  
}

