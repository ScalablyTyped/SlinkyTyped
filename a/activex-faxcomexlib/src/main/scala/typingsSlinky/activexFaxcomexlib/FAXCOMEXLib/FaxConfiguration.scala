package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxConfiguration Class */
@js.native
trait FaxConfiguration extends js.Object {
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean = js.native
  /** Indicates how long the fax message is kept on the server */
  var ArchiveAgeLimit: Double = js.native
  /** Location of the archive on the server */
  var ArchiveLocation: String = js.native
  /** The high 32-bit value of the archive size */
  val ArchiveSizeHigh: Double = js.native
  /** The low 32-bit value of the archive size */
  val ArchiveSizeLow: Double = js.native
  /** Does the server auto-create fax account on connect */
  var AutoCreateAccountOnConnect: Boolean = js.native
  /** Does the server generate a brand */
  var Branding: Boolean = js.native
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate = js.native
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate = js.native
  @JSName("FAXCOMEXLib.FaxConfiguration_typekey")
  var FAXCOMEXLibDotFaxConfiguration_typekey: FaxConfiguration = js.native
  /** High quota water mark */
  var HighQuotaWaterMark: Double = js.native
  /** Are incoming faxes viewable by everyone */
  var IncomingFaxesArePublic: Boolean = js.native
  /** Is queue blocked for incoming faxes */
  var IncomingQueueBlocked: Boolean = js.native
  /** Low quota water mark */
  var LowQuotaWaterMark: Double = js.native
  /** How long the failed fax job is kept on the server */
  var OutgoingQueueAgeLimit: Double = js.native
  /** Is queue blocked for outgoing faxes */
  var OutgoingQueueBlocked: Boolean = js.native
  /** Is queue paused for outgoing faxes */
  var OutgoingQueuePaused: Boolean = js.native
  /** Number of retries */
  var Retries: Double = js.native
  /** Retry delay */
  var RetryDelay: Double = js.native
  /** Is size quota warning on */
  var SizeQuotaWarning: Boolean = js.native
  /** Whether faxes should be archived */
  var UseArchive: Boolean = js.native
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxConfiguration {
  @scala.inline
  def apply(
    AllowPersonalCoverPages: Boolean,
    ArchiveAgeLimit: Double,
    ArchiveLocation: String,
    ArchiveSizeHigh: Double,
    ArchiveSizeLow: Double,
    AutoCreateAccountOnConnect: Boolean,
    Branding: Boolean,
    DiscountRateEnd: VarDate,
    DiscountRateStart: VarDate,
    FAXCOMEXLibDotFaxConfiguration_typekey: FaxConfiguration,
    HighQuotaWaterMark: Double,
    IncomingFaxesArePublic: Boolean,
    IncomingQueueBlocked: Boolean,
    LowQuotaWaterMark: Double,
    OutgoingQueueAgeLimit: Double,
    OutgoingQueueBlocked: Boolean,
    OutgoingQueuePaused: Boolean,
    Refresh: () => Unit,
    Retries: Double,
    RetryDelay: Double,
    Save: () => Unit,
    SizeQuotaWarning: Boolean,
    UseArchive: Boolean,
    UseDeviceTSID: Boolean
  ): FaxConfiguration = {
    val __obj = js.Dynamic.literal(AllowPersonalCoverPages = AllowPersonalCoverPages.asInstanceOf[js.Any], ArchiveAgeLimit = ArchiveAgeLimit.asInstanceOf[js.Any], ArchiveLocation = ArchiveLocation.asInstanceOf[js.Any], ArchiveSizeHigh = ArchiveSizeHigh.asInstanceOf[js.Any], ArchiveSizeLow = ArchiveSizeLow.asInstanceOf[js.Any], AutoCreateAccountOnConnect = AutoCreateAccountOnConnect.asInstanceOf[js.Any], Branding = Branding.asInstanceOf[js.Any], DiscountRateEnd = DiscountRateEnd.asInstanceOf[js.Any], DiscountRateStart = DiscountRateStart.asInstanceOf[js.Any], HighQuotaWaterMark = HighQuotaWaterMark.asInstanceOf[js.Any], IncomingFaxesArePublic = IncomingFaxesArePublic.asInstanceOf[js.Any], IncomingQueueBlocked = IncomingQueueBlocked.asInstanceOf[js.Any], LowQuotaWaterMark = LowQuotaWaterMark.asInstanceOf[js.Any], OutgoingQueueAgeLimit = OutgoingQueueAgeLimit.asInstanceOf[js.Any], OutgoingQueueBlocked = OutgoingQueueBlocked.asInstanceOf[js.Any], OutgoingQueuePaused = OutgoingQueuePaused.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RetryDelay = RetryDelay.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SizeQuotaWarning = SizeQuotaWarning.asInstanceOf[js.Any], UseArchive = UseArchive.asInstanceOf[js.Any], UseDeviceTSID = UseDeviceTSID.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxConfiguration_typekey")(FAXCOMEXLibDotFaxConfiguration_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxConfiguration]
  }
  @scala.inline
  implicit class FaxConfigurationOps[Self <: FaxConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPersonalCoverPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowPersonalCoverPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchiveAgeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveAgeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchiveLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchiveSizeHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveSizeHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArchiveSizeLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveSizeLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCreateAccountOnConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreateAccountOnConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Branding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscountRateEnd(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscountRateEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscountRateStart(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscountRateStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxConfiguration_typekey(value: FaxConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxConfiguration_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighQuotaWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighQuotaWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingFaxesArePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingFaxesArePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomingQueueBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncomingQueueBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowQuotaWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowQuotaWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingQueueAgeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingQueueAgeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingQueueBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingQueueBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingQueuePaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutgoingQueuePaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSizeQuotaWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeQuotaWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseArchive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseArchive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDeviceTSID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDeviceTSID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

