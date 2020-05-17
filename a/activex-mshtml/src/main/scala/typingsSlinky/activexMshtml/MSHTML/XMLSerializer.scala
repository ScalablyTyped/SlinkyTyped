package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLSerializer extends js.Object {
  @JSName("MSHTML.XMLSerializer_typekey")
  var MSHTMLDotXMLSerializer_typekey: XMLSerializer = js.native
  def serializeToString(pNode: IHTMLDOMNode): String = js.native
}

object XMLSerializer {
  @scala.inline
  def apply(MSHTMLDotXMLSerializer_typekey: XMLSerializer, serializeToString: IHTMLDOMNode => String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.XMLSerializer_typekey")(MSHTMLDotXMLSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSerializer]
  }
  @scala.inline
  implicit class XMLSerializerOps[Self <: XMLSerializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotXMLSerializer_typekey(value: XMLSerializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.XMLSerializer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializeToString(value: IHTMLDOMNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeToString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

