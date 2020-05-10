package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFEmailImportance
import typingsSlinky.mfiles.MFiles.MFEmailSensitivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEmailMessageInformation extends js.Object {
  var Cc: IStrings = js.native
  var From: String = js.native
  var Importance: MFEmailImportance = js.native
  var InReplyTo: String = js.native
  var MessageID: String = js.native
  var Received: ITimestamp = js.native
  var Sensitivity: MFEmailSensitivity = js.native
  var Sent: ITimestamp = js.native
  var Subject: String = js.native
  var To: IStrings = js.native
  def Clone(): IEmailMessageInformation = js.native
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit = js.native
}

object IEmailMessageInformation {
  @scala.inline
  def apply(
    Cc: IStrings,
    Clone: () => IEmailMessageInformation,
    CloneFrom: IEmailMessageInformation => Unit,
    From: String,
    Importance: MFEmailImportance,
    InReplyTo: String,
    MessageID: String,
    Received: ITimestamp,
    Sensitivity: MFEmailSensitivity,
    Sent: ITimestamp,
    Subject: String,
    To: IStrings
  ): IEmailMessageInformation = {
    val __obj = js.Dynamic.literal(Cc = Cc.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), From = From.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], InReplyTo = InReplyTo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Sensitivity = Sensitivity.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailMessageInformation]
  }
  @scala.inline
  implicit class IEmailMessageInformationOps[Self <: IEmailMessageInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCc(value: IStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IEmailMessageInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IEmailMessageInformation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportance(value: MFEmailImportance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceived(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSensitivity(value: MFEmailSensitivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSent(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: IStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

