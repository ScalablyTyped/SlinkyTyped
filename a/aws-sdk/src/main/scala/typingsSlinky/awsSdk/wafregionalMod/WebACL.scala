package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebACL extends js.Object {
  /**
    * The action to perform if none of the Rules contained in the WebACL match. The action is specified by the WafAction object.
    */
  var DefaultAction: WafAction = js.native
  /**
    * A friendly name or description for the metrics for this WebACL. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the WebACL.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.MetricName] = js.native
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * An array that contains the action for each Rule in a WebACL, the priority of the Rule, and the ID of the Rule.
    */
  var Rules: ActivatedRules = js.native
  /**
    * Tha Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: js.UndefOr[ResourceArn] = js.native
  /**
    * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId = js.native
}

object WebACL {
  @scala.inline
  def apply(DefaultAction: WafAction, Rules: ActivatedRules, WebACLId: ResourceId): WebACL = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACL]
  }
  @scala.inline
  implicit class WebACLOps[Self <: WebACL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAction(value: WafAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: ActivatedRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebACLId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withWebACLArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebACLArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLArn")(js.undefined)
        ret
    }
  }
  
}

