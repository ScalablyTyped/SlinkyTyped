package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLDOMAttribute extends js.Object {
  @JSName("MSHTML.IHTMLDOMAttribute_typekey")
  var MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute = js.native
  val nodeName: String = js.native
  var nodeValue: js.Any = js.native
  val specified: Boolean = js.native
}

object IHTMLDOMAttribute {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute,
    nodeName: String,
    nodeValue: js.Any,
    specified: Boolean
  ): IHTMLDOMAttribute = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], specified = specified.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDOMAttribute_typekey")(MSHTMLDotIHTMLDOMAttribute_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMAttribute]
  }
  @scala.inline
  implicit class IHTMLDOMAttributeOps[Self <: IHTMLDOMAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLDOMAttribute_typekey(value: IHTMLDOMAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLDOMAttribute_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

