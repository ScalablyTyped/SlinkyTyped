package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxEventLogging Class */
@js.native
trait FaxEventLogging extends js.Object {
  @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging = js.native
  /** Detail level of event logs for general (other) events */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for inbound fax events */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for initialization events */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Detail level of event logs for outbound fax events */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxEventLogging {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging,
    GeneralEventsLevel: FAX_LOG_LEVEL_ENUM,
    InboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    InitEventsLevel: FAX_LOG_LEVEL_ENUM,
    OutboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxEventLogging = {
    val __obj = js.Dynamic.literal(GeneralEventsLevel = GeneralEventsLevel.asInstanceOf[js.Any], InboundEventsLevel = InboundEventsLevel.asInstanceOf[js.Any], InitEventsLevel = InitEventsLevel.asInstanceOf[js.Any], OutboundEventsLevel = OutboundEventsLevel.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxEventLogging_typekey")(FAXCOMEXLibDotFaxEventLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxEventLogging]
  }
  @scala.inline
  implicit class FaxEventLoggingOps[Self <: FaxEventLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAXCOMEXLibDotFaxEventLogging_typekey(value: FaxEventLogging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxEventLogging_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneralEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneralEventsLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboundEventsLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitEventsLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundEventsLevel")(value.asInstanceOf[js.Any])
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
  }
  
}

