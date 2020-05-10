package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatusSummary extends js.Object {
  /**
    * The system instance health or application instance health.
    */
  var Details: js.UndefOr[InstanceStatusDetailsList] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[SummaryStatus] = js.native
}

object InstanceStatusSummary {
  @scala.inline
  def apply(): InstanceStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusSummary]
  }
  @scala.inline
  implicit class InstanceStatusSummaryOps[Self <: InstanceStatusSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: InstanceStatusDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SummaryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

