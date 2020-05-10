package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleNamesByTargetRequest extends js.Object {
  /**
    * Limits the results to show only the rules associated with the specified event bus.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target resource.
    */
  var TargetArn: typingsSlinky.awsSdk.cloudwatcheventsMod.TargetArn = js.native
}

object ListRuleNamesByTargetRequest {
  @scala.inline
  def apply(TargetArn: TargetArn): ListRuleNamesByTargetRequest = {
    val __obj = js.Dynamic.literal(TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleNamesByTargetRequest]
  }
  @scala.inline
  implicit class ListRuleNamesByTargetRequestOps[Self <: ListRuleNamesByTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetArn(value: TargetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventBusName(value: EventBusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventBusName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventBusName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventBusName")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: LimitMax100): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
  }
  
}

