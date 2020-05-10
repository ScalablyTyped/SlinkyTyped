package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampledHTTPRequest extends js.Object {
  /**
    * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
    */
  var Action: js.UndefOr[typingsSlinky.awsSdk.wafMod.Action] = js.native
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest = js.native
  /**
    * This value is returned if the GetSampledRequests request specifies the ID of a RuleGroup rather than the ID of an individual rule. RuleWithinRuleGroup is the rule within the specified RuleGroup that matched the request listed in the response.
    */
  var RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.native
  /**
    * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
  /**
    * A value that indicates how one result in the response relates proportionally to other results in the response. A result that has a weight of 2 represents roughly twice as many CloudFront web requests as a result that has a weight of 1.
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
    def withRuleWithinRuleGroup(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleWithinRuleGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleWithinRuleGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleWithinRuleGroup")(js.undefined)
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

