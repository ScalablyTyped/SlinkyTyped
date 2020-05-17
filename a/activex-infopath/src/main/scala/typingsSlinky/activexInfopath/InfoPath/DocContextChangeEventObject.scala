package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocContextChangeEventObject extends js.Object {
  val Context: IXMLDOMNode = js.native
  @JSName("InfoPath.DocContextChangeEventObject_typekey")
  var InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject = js.native
  val IsUndoRedo: Boolean = js.native
  val Type: String = js.native
  val XDocument: _XDocument = js.native
}

object DocContextChangeEventObject {
  @scala.inline
  def apply(
    Context: IXMLDOMNode,
    InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject,
    IsUndoRedo: Boolean,
    Type: String,
    XDocument: _XDocument
  ): DocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], IsUndoRedo = IsUndoRedo.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocContextChangeEventObject_typekey")(InfoPathDotDocContextChangeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocContextChangeEventObject]
  }
  @scala.inline
  implicit class DocContextChangeEventObjectOps[Self <: DocContextChangeEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotDocContextChangeEventObject_typekey(value: DocContextChangeEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.DocContextChangeEventObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUndoRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
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

