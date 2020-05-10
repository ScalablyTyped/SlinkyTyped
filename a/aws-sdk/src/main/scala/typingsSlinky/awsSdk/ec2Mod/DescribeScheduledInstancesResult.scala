package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstancesResult extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ScheduledInstanceSet] = js.native
}

object DescribeScheduledInstancesResult {
  @scala.inline
  def apply(): DescribeScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstancesResult]
  }
  @scala.inline
  implicit class DescribeScheduledInstancesResultOps[Self <: DescribeScheduledInstancesResult] (val x: Self) extends AnyVal {
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
    def withScheduledInstanceSet(value: ScheduledInstanceSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledInstanceSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledInstanceSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledInstanceSet")(js.undefined)
        ret
    }
  }
  
}

