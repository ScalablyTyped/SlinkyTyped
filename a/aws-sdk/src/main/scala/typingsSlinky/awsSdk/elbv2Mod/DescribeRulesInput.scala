package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRulesInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.ListenerArn] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.PageSize] = js.native
  /**
    * The Amazon Resource Names (ARN) of the rules.
    */
  var RuleArns: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.RuleArns] = js.native
}

object DescribeRulesInput {
  @scala.inline
  def apply(): DescribeRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRulesInput]
  }
  @scala.inline
  implicit class DescribeRulesInputOps[Self <: DescribeRulesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListenerArn(value: ListenerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleArns(value: RuleArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleArns")(js.undefined)
        ret
    }
  }
  
}

