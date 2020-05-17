package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessage Class */
@js.native
trait FaxIncomingMessage extends IFaxIncomingMessage {
  @JSName("FAXCOMEXLib.FaxIncomingMessage_typekey")
  var FAXCOMEXLibDotFaxIncomingMessage_typekey: FaxIncomingMessage = js.native
  /** Has Cover page */
  var HasCoverPage: Boolean = js.native
  /** Read flag on the message */
  var Read: Boolean = js.native
  /** Set of recipient names */
  var Recipients: String = js.native
  /** Sender's fax number */
  var SenderFaxNumber: String = js.native
  /** Sender's name */
  var SenderName: String = js.native
  /** Contents of cover page subject field */
  var Subject: String = js.native
  /** Is message reassigned? */
  val WasReAssigned: Boolean = js.native
  /** Reassigns the message */
  def ReAssign(): Unit = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxIncomingMessage {
  @scala.inline
  def apply(
    CSID: String,
    CallerId: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    FAXCOMEXLibDotFaxIncomingMessage_typekey: FaxIncomingMessage,
    HasCoverPage: Boolean,
    Id: String,
    Pages: Double,
    ReAssign: () => Unit,
    Read: Boolean,
    Recipients: String,
    Refresh: () => Unit,
    Retries: Double,
    RoutingInformation: String,
    Save: () => Unit,
    SenderFaxNumber: String,
    SenderName: String,
    Size: Double,
    Subject: String,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate,
    WasReAssigned: Boolean
  ): FaxIncomingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], HasCoverPage = HasCoverPage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], ReAssign = js.Any.fromFunction0(ReAssign), Read = Read.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SenderFaxNumber = SenderFaxNumber.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any], WasReAssigned = WasReAssigned.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingMessage_typekey")(FAXCOMEXLibDotFaxIncomingMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingMessage]
  }
  @scala.inline
  implicit class FaxIncomingMessageOps[Self <: FaxIncomingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxIncomingMessage_typekey(value: FaxIncomingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxIncomingMessage_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCoverPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCoverPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReAssign(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReAssign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSenderFaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderFaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasReAssigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WasReAssigned")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

