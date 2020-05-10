package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsWafWebAclDetails extends js.Object {
  /**
    * The action to perform if none of the Rules contained in the WebACL match.
    */
  var DefaultAction: js.UndefOr[NonEmptyString] = js.native
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
    */
  var Rules: js.UndefOr[AwsWafWebAclRuleList] = js.native
  /**
    * A unique identifier for a WebACL.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.native
}

object AwsWafWebAclDetails {
  @scala.inline
  def apply(): AwsWafWebAclDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafWebAclDetails]
  }
  @scala.inline
  implicit class AwsWafWebAclDetailsOps[Self <: AwsWafWebAclDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAction(value: NonEmptyString): Self = {
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
    def withName(value: NonEmptyString): Self = {
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
    def withRules(value: AwsWafWebAclRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAclId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAclId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebAclId")(js.undefined)
        ret
    }
  }
  
}

