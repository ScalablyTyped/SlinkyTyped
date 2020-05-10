package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDataPoint extends js.Object {
  /**
    * Number of emails that have bounced.
    */
  var Bounces: js.UndefOr[Counter] = js.native
  /**
    * Number of unwanted emails that were rejected by recipients.
    */
  var Complaints: js.UndefOr[Counter] = js.native
  /**
    * Number of emails that have been sent.
    */
  var DeliveryAttempts: js.UndefOr[Counter] = js.native
  /**
    * Number of emails rejected by Amazon SES.
    */
  var Rejects: js.UndefOr[Counter] = js.native
  /**
    * Time of the data point.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object SendDataPoint {
  @scala.inline
  def apply(): SendDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDataPoint]
  }
  @scala.inline
  implicit class SendDataPointOps[Self <: SendDataPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounces(value: Counter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounces")(js.undefined)
        ret
    }
    @scala.inline
    def withComplaints(value: Counter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Complaints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplaints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Complaints")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryAttempts(value: Counter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withRejects(value: Counter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rejects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rejects")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

