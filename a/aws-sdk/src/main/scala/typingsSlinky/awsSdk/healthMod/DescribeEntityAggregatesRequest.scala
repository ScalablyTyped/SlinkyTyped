package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityAggregatesRequest extends js.Object {
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[EventArnsList] = js.native
}

object DescribeEntityAggregatesRequest {
  @scala.inline
  def apply(): DescribeEntityAggregatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityAggregatesRequest]
  }
  @scala.inline
  implicit class DescribeEntityAggregatesRequestOps[Self <: DescribeEntityAggregatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventArns(value: EventArnsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArns")(js.undefined)
        ret
    }
  }
  
}

