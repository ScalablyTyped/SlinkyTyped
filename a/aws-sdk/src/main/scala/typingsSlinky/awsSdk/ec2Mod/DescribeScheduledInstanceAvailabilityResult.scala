package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstanceAvailabilityResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the available Scheduled Instances.
    */
  var ScheduledInstanceAvailabilitySet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ScheduledInstanceAvailabilitySet] = js.native
}

object DescribeScheduledInstanceAvailabilityResult {
  @scala.inline
  def apply(): DescribeScheduledInstanceAvailabilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstanceAvailabilityResult]
  }
  @scala.inline
  implicit class DescribeScheduledInstanceAvailabilityResultOps[Self <: DescribeScheduledInstanceAvailabilityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledInstanceAvailabilitySet(value: ScheduledInstanceAvailabilitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledInstanceAvailabilitySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledInstanceAvailabilitySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledInstanceAvailabilitySet")(js.undefined)
        ret
    }
  }
  
}

