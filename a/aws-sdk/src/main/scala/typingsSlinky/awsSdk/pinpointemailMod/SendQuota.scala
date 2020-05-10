package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendQuota extends js.Object {
  /**
    * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
    */
  var Max24HourSend: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.Max24HourSend] = js.native
  /**
    * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
    */
  var MaxSendRate: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.MaxSendRate] = js.native
  /**
    * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.SentLast24Hours] = js.native
}

object SendQuota {
  @scala.inline
  def apply(): SendQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendQuota]
  }
  @scala.inline
  implicit class SendQuotaOps[Self <: SendQuota] (val x: Self) extends AnyVal {
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

