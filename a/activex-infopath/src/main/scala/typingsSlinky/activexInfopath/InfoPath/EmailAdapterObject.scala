package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailAdapterObject extends js.Object {
  var AttachmentFileName: String = js.native
  var AttachmentType: XdAttachmentType = js.native
  var BCC: String = js.native
  var CC: String = js.native
  @JSName("InfoPath.EmailAdapterObject_typekey")
  var InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject = js.native
  var Intro: String = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  var Subject: String = js.native
  val SubmitAllowed: Boolean = js.native
  var To: String = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
  def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

object EmailAdapterObject {
  @scala.inline
  def apply(
    AttachmentFileName: String,
    AttachmentType: XdAttachmentType,
    BCC: String,
    CC: String,
    InfoPathDotEmailAdapterObject_typekey: EmailAdapterObject,
    Intro: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Subject: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Unit,
    To: String
  ): EmailAdapterObject = {
    val __obj = js.Dynamic.literal(AttachmentFileName = AttachmentFileName.asInstanceOf[js.Any], AttachmentType = AttachmentType.asInstanceOf[js.Any], BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Intro = Intro.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1(SubmitData), To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.EmailAdapterObject_typekey")(InfoPathDotEmailAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAdapterObject]
  }
  @scala.inline
  implicit class EmailAdapterObjectOps[Self <: EmailAdapterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentType(value: XdAttachmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBCC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BCC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotEmailAdapterObject_typekey(value: EmailAdapterObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.EmailAdapterObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntro(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Intro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitData(value: IXMLDOMNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

