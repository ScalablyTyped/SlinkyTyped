package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampledHTTPRequest extends js.Object {
  /**
    * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
    */
  var Action: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.Action] = js.native
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest = js.native
  /**
    * The name of the Rule that the request matched. For managed rule groups, the format for this name is &lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;. For your own rule groups, the format for this name is &lt;rule group name&gt;#&lt;rule name&gt;. If the rule is not in a rule group, the format is &lt;rule name&gt;. 
    */
  var RuleNameWithinRuleGroup: js.UndefOr[EntityName] = js.native
  /**
    * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
  /**
    * A value that indicates how one result in the response relates proportionally to other results in the response. For example, a result that has a weight of 2 represents roughly twice as many web requests as a result that has a weight of 1.
    */
  var Weight: SampleWeight = js.native
}

object SampledHTTPRequest {
  @scala.inline
  def apply(Request: HTTPRequest, Weight: SampleWeight): SampledHTTPRequest = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledHTTPRequest]
  }
  @scala.inline
  implicit class SampledHTTPRequestOps[Self <: SampledHTTPRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: HTTPRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: SampleWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleNameWithinRuleGroup(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNameWithinRuleGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleNameWithinRuleGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleNameWithinRuleGroup")(js.undefined)
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

