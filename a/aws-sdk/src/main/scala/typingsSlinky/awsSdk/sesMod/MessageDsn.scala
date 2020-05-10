package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageDsn extends js.Object {
  /**
    * When the message was received by the reporting mail transfer agent (MTA), in RFC 822 date-time format.
    */
  var ArrivalDate: js.UndefOr[js.Date] = js.native
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.native
  /**
    * The reporting MTA that attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). The default value is dns; inbound-smtp.[region].amazonaws.com.
    */
  var ReportingMta: typingsSlinky.awsSdk.sesMod.ReportingMta = js.native
}

object MessageDsn {
  @scala.inline
  def apply(ReportingMta: ReportingMta): MessageDsn = {
    val __obj = js.Dynamic.literal(ReportingMta = ReportingMta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDsn]
  }
  @scala.inline
  implicit class MessageDsnOps[Self <: MessageDsn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportingMta(value: ReportingMta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportingMta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrivalDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrivalDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrivalDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrivalDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionFields(value: ExtensionFieldList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionFields")(js.undefined)
        ret
    }
  }
  
}

