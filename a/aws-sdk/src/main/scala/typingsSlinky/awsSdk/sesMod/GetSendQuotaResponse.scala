package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSendQuotaResponse extends js.Object {
  /**
    * The maximum number of emails the user is allowed to send in a 24-hour interval. A value of -1 signifies an unlimited quota.
    */
  var Max24HourSend: js.UndefOr[typingsSlinky.awsSdk.sesMod.Max24HourSend] = js.native
  /**
    * The maximum number of emails that Amazon SES can accept from the user's account per second.  The rate at which Amazon SES accepts the user's messages might be less than the maximum send rate. 
    */
  var MaxSendRate: js.UndefOr[typingsSlinky.awsSdk.sesMod.MaxSendRate] = js.native
  /**
    * The number of emails sent during the previous 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typingsSlinky.awsSdk.sesMod.SentLast24Hours] = js.native
}

object GetSendQuotaResponse {
  @scala.inline
  def apply(): GetSendQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendQuotaResponse]
  }
  @scala.inline
  implicit class GetSendQuotaResponseOps[Self <: GetSendQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax24HourSend(value: Max24HourSend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max24HourSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax24HourSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max24HourSend")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSendRate(value: MaxSendRate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSendRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSendRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSendRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSentLast24Hours(value: SentLast24Hours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentLast24Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentLast24Hours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SentLast24Hours")(js.undefined)
        ret
    }
  }
  
}

