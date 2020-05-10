package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledActionsResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * Information about the scheduled actions.
    */
  var ScheduledActions: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.ScheduledActions] = js.native
}

object DescribeScheduledActionsResponse {
  @scala.inline
  def apply(): DescribeScheduledActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsResponse]
  }
  @scala.inline
  implicit class DescribeScheduledActionsResponseOps[Self <: DescribeScheduledActionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: XmlString): Self = {
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
    def withScheduledActions(value: ScheduledActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActions")(js.undefined)
        ret
    }
  }
  
}

