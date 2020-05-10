package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebACLRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  /**
    * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the rules in a web ACL.
    */
  var DefaultAction: js.UndefOr[WafAction] = js.native
  /**
    * An array of updates to make to the WebACL. An array of WebACLUpdate objects that you want to insert into or delete from a WebACL. For more information, see the applicable data types:    WebACLUpdate: Contains Action and ActivatedRule     ActivatedRule: Contains Action, OverrideAction, Priority, RuleId, and Type. ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case, you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.     WafAction: Contains Type   
    */
  var Updates: js.UndefOr[WebACLUpdates] = js.native
  /**
    * The WebACLId of the WebACL that you want to update. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId = js.native
}

object UpdateWebACLRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, WebACLId: ResourceId): UpdateWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebACLRequest]
  }
  @scala.inline
  implicit class UpdateWebACLRequestOps[Self <: UpdateWebACLRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebACLId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebACLId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAction(value: WafAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAction")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdates(value: WebACLUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Updates")(js.undefined)
        ret
    }
  }
  
}

