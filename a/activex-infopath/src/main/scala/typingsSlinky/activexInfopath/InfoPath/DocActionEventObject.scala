package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocActionEventObject extends js.Object {
  @JSName("InfoPath.DocActionEventObject_typekey")
  var InfoPathDotDocActionEventObject_typekey: DocActionEventObject = js.native
  var ReturnStatus: Boolean = js.native
  val Source: IXMLDOMNode = js.native
  val XDocument: _XDocument = js.native
}

object DocActionEventObject {
  @scala.inline
  def apply(
    InfoPathDotDocActionEventObject_typekey: DocActionEventObject,
    ReturnStatus: Boolean,
    Source: IXMLDOMNode,
    XDocument: _XDocument
  ): DocActionEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocActionEventObject_typekey")(InfoPathDotDocActionEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocActionEventObject]
  }
  @scala.inline
  implicit class DocActionEventObjectOps[Self <: DocActionEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotDocActionEventObject_typekey(value: DocActionEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.DocActionEventObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

