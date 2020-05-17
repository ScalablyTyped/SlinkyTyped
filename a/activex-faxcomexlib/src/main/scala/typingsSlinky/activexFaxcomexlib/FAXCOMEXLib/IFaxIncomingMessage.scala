package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxIncomingMessage interface */
@js.native
trait IFaxIncomingMessage extends js.Object {
  /** Called Station ID */
  val CSID: String = js.native
  /** Caller ID */
  val CallerId: String = js.native
  /** Name of the device that received the message */
  val DeviceName: String = js.native
  /** Unique message ID */
  val Id: String = js.native
  /** Total number of pages */
  val Pages: Double = js.native
  /** Number of failed routing retries */
  val Retries: Double = js.native
  /** Routing information */
  val RoutingInformation: String = js.native
  /** Size in bytes of the message's TIFF file */
  val Size: Double = js.native
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

object IFaxIncomingMessage {
  @scala.inline
  def apply(
    CSID: String,
    CallerId: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    Id: String,
    Pages: Double,
    Retries: Double,
    RoutingInformation: String,
    Size: Double,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxIncomingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxIncomingMessage]
  }
  @scala.inline
  implicit class IFaxIncomingMessageOps[Self <: IFaxIncomingMessage] (val x: Self) extends AnyVal {
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
    def withCallerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerId")(value.asInstanceOf[js.Any])
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
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

