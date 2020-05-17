package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailEnvelopeObject extends js.Object {
  var BCC: String = js.native
  var CC: String = js.native
  @JSName("InfoPath.MailEnvelopeObject_typekey")
  var InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject = js.native
  var Subject: String = js.native
  var To: String = js.native
  var Visible: Boolean = js.native
}

object MailEnvelopeObject {
  @scala.inline
  def apply(
    BCC: String,
    CC: String,
    InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject,
    Subject: String,
    To: String,
    Visible: Boolean
  ): MailEnvelopeObject = {
    val __obj = js.Dynamic.literal(BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MailEnvelopeObject_typekey")(InfoPathDotMailEnvelopeObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailEnvelopeObject]
  }
  @scala.inline
  implicit class MailEnvelopeObjectOps[Self <: MailEnvelopeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withInfoPathDotMailEnvelopeObject_typekey(value: MailEnvelopeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.MailEnvelopeObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

