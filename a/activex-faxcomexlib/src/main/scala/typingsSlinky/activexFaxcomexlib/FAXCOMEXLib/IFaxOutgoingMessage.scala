package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingMessage interface */
@js.native
trait IFaxOutgoingMessage extends js.Object {
  /** Called Station ID */
  val CSID: String = js.native
  /** Name of the device transmitting the message */
  val DeviceName: String = js.native
  /** Document's friendly name */
  val DocumentName: String = js.native
  /** Unique message ID */
  val Id: String = js.native
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate = js.native
  /** Total number of pages */
  val Pages: Double = js.native
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  /** Number of failed routing retries */
  val Retries: Double = js.native
  /** Sender information object */
  val Sender: FaxSender = js.native
  /** Size in bytes of TIFF file */
  val Size: Double = js.native
  /** Cover page's subject field */
  val Subject: String = js.native
  /** Unique ID the submission process created for the job */
  val SubmissionId: String = js.native
  /** Time the job was submitted */
  val SubmissionTime: VarDate = js.native
  /** Transmitting Station ID */
  val TSID: String = js.native
  /** Transmission end time */
  val TransmissionEnd: VarDate = js.native
  /** Transmission start time */
  val TransmissionStart: VarDate = js.native
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  /** Delete the message from the archive */
  def Delete(): Unit = js.native
}

object IFaxOutgoingMessage {
  @scala.inline
  def apply(
    CSID: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    DocumentName: String,
    Id: String,
    OriginalScheduledTime: VarDate,
    Pages: Double,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    Recipient: FaxRecipient,
    Retries: Double,
    Sender: FaxSender,
    Size: Double,
    Subject: String,
    SubmissionId: String,
    SubmissionTime: VarDate,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxOutgoingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginalScheduledTime = OriginalScheduledTime.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], SubmissionTime = SubmissionTime.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxOutgoingMessage]
  }
  @scala.inline
  implicit class IFaxOutgoingMessageOps[Self <: IFaxOutgoingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyTiff(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTiff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalScheduledTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalScheduledTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: FaxRecipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: FaxSender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmissionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmissionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmissionTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmissionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmissionEnd(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransmissionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransmissionStart(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransmissionStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

