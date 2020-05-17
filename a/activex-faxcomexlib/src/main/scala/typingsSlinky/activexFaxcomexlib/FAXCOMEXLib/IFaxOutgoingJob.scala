package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxOutgoingJob interface */
@js.native
trait IFaxOutgoingJob extends js.Object {
  /** Available operations, a bit-wise combination of FAX_JOB_OPERATIONS values */
  val AvailableOperations: FAX_JOB_OPERATIONS_ENUM = js.native
  /** Called Station ID */
  val CSID: String = js.native
  /** Page currently in transmision */
  val CurrentPage: Double = js.native
  /** Device ID that transmits the job */
  val DeviceId: Double = js.native
  /** Document's friendly name */
  val DocumentName: String = js.native
  /** Extended status description */
  val ExtendedStatus: String = js.native
  /** Code of the job's extended status */
  val ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM = js.native
  @JSName("FAXCOMEXLib.IFaxOutgoingJob_typekey")
  var FAXCOMEXLibDotIFaxOutgoingJob_typekey: IFaxOutgoingJob = js.native
  /** Whether to group broadcast receipts */
  val GroupBroadcastReceipts: Boolean = js.native
  /** Unique job ID */
  val Id: String = js.native
  /** Time the job was originally scheduled to be transmitted */
  val OriginalScheduledTime: VarDate = js.native
  /** Total number of pages */
  val Pages: Double = js.native
  /** Priority of the fax */
  val Priority: FAX_PRIORITY_TYPE_ENUM = js.native
  /** Type of receipt */
  val ReceiptType: FAX_RECEIPT_TYPE_ENUM = js.native
  /** Recipient information object */
  val Recipient: FaxRecipient = js.native
  /** Number of failed transmission retries */
  val Retries: Double = js.native
  /** The time the fax job is scheduled to be transmitted */
  val ScheduledTime: VarDate = js.native
  /** Sender information object */
  val Sender: FaxSender = js.native
  /** Size in bytes of TIFF file */
  val Size: Double = js.native
  /** Current queue status of the job */
  val Status: FAX_JOB_STATUS_ENUM = js.native
  /** Cover page's subject field */
  val Subject: String = js.native
  /** Unique ID the submission process created for the Job */
  val SubmissionId: String = js.native
  /** Time the job was submitted */
  val SubmissionTime: VarDate = js.native
  /** Transmitting Station ID */
  val TSID: String = js.native
  /** The time the fax job finished its transmission */
  val TransmissionEnd: VarDate = js.native
  /** The time the fax job started its transmission */
  val TransmissionStart: VarDate = js.native
  /** Cancel the outbound job */
  def Cancel(): Unit = js.native
  /** Copy the job's TIFF image */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  /** Pause the outbound job */
  def Pause(): Unit = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Restart the outbound job */
  def Restart(): Unit = js.native
  /** Resume the outbound job */
  def Resume(): Unit = js.native
}

object IFaxOutgoingJob {
  @scala.inline
  def apply(
    AvailableOperations: FAX_JOB_OPERATIONS_ENUM,
    CSID: String,
    Cancel: () => Unit,
    CopyTiff: String => Unit,
    CurrentPage: Double,
    DeviceId: Double,
    DocumentName: String,
    ExtendedStatus: String,
    ExtendedStatusCode: FAX_JOB_EXTENDED_STATUS_ENUM,
    FAXCOMEXLibDotIFaxOutgoingJob_typekey: IFaxOutgoingJob,
    GroupBroadcastReceipts: Boolean,
    Id: String,
    OriginalScheduledTime: VarDate,
    Pages: Double,
    Pause: () => Unit,
    Priority: FAX_PRIORITY_TYPE_ENUM,
    ReceiptType: FAX_RECEIPT_TYPE_ENUM,
    Recipient: FaxRecipient,
    Refresh: () => Unit,
    Restart: () => Unit,
    Resume: () => Unit,
    Retries: Double,
    ScheduledTime: VarDate,
    Sender: FaxSender,
    Size: Double,
    Status: FAX_JOB_STATUS_ENUM,
    Subject: String,
    SubmissionId: String,
    SubmissionTime: VarDate,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxOutgoingJob = {
    val __obj = js.Dynamic.literal(AvailableOperations = AvailableOperations.asInstanceOf[js.Any], CSID = CSID.asInstanceOf[js.Any], Cancel = js.Any.fromFunction0(Cancel), CopyTiff = js.Any.fromFunction1(CopyTiff), CurrentPage = CurrentPage.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], DocumentName = DocumentName.asInstanceOf[js.Any], ExtendedStatus = ExtendedStatus.asInstanceOf[js.Any], ExtendedStatusCode = ExtendedStatusCode.asInstanceOf[js.Any], GroupBroadcastReceipts = GroupBroadcastReceipts.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OriginalScheduledTime = OriginalScheduledTime.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Pause = js.Any.fromFunction0(Pause), Priority = Priority.asInstanceOf[js.Any], ReceiptType = ReceiptType.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Restart = js.Any.fromFunction0(Restart), Resume = js.Any.fromFunction0(Resume), Retries = Retries.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SubmissionId = SubmissionId.asInstanceOf[js.Any], SubmissionTime = SubmissionTime.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.IFaxOutgoingJob_typekey")(FAXCOMEXLibDotIFaxOutgoingJob_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxOutgoingJob]
  }
  @scala.inline
  implicit class IFaxOutgoingJobOps[Self <: IFaxOutgoingJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableOperations(value: FAX_JOB_OPERATIONS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopyTiff(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTiff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendedStatusCode(value: FAX_JOB_EXTENDED_STATUS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotIFaxOutgoingJob_typekey(value: IFaxOutgoingJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.IFaxOutgoingJob_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBroadcastReceipts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBroadcastReceipts")(value.asInstanceOf[js.Any])
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
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPriority(value: FAX_PRIORITY_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiptType(value: FAX_RECEIPT_TYPE_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceiptType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipient(value: FaxRecipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledTime")(value.asInstanceOf[js.Any])
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
    def withStatus(value: FAX_JOB_STATUS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
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

