package typingsSlinky.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounce extends js.Object {
  var BouncedAt: String = js.native
  var CanActivate: Boolean = js.native
  var Content: js.UndefOr[String] = js.native
  var Description: String = js.native
  var Details: String = js.native
  var DumpAvailable: Boolean = js.native
  var Email: String = js.native
  var From: String = js.native
  var ID: Double = js.native
  var Inactive: Boolean = js.native
  var MessageID: String = js.native
  var MessageStream: String = js.native
  var Name: String = js.native
  var RecordType: String = js.native
  var ServerID: String = js.native
  var Subject: String = js.native
  var Tag: js.UndefOr[String] = js.native
  var Type: String = js.native
  var TypeCode: Double = js.native
}

object Bounce {
  @scala.inline
  def apply(
    BouncedAt: String,
    CanActivate: Boolean,
    Description: String,
    Details: String,
    DumpAvailable: Boolean,
    Email: String,
    From: String,
    ID: Double,
    Inactive: Boolean,
    MessageID: String,
    MessageStream: String,
    Name: String,
    RecordType: String,
    ServerID: String,
    Subject: String,
    Type: String,
    TypeCode: Double
  ): Bounce = {
    val __obj = js.Dynamic.literal(BouncedAt = BouncedAt.asInstanceOf[js.Any], CanActivate = CanActivate.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], DumpAvailable = DumpAvailable.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Inactive = Inactive.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeCode = TypeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounce]
  }
  @scala.inline
  implicit class BounceOps[Self <: Bounce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBouncedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BouncedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanActivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDumpAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DumpAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageStream(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

