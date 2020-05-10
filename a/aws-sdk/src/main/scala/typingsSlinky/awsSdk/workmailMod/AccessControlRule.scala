package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlRule extends js.Object {
  /**
    * Access protocol actions to include in the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Actions: js.UndefOr[ActionsList] = js.native
  /**
    * The date that the rule was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The date that the rule was modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.native
  /**
    * The rule description.
    */
  var Description: js.UndefOr[AccessControlRuleDescription] = js.native
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.native
  /**
    * IPv4 CIDR ranges to include in the rule.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.native
  /**
    * The rule name.
    */
  var Name: js.UndefOr[AccessControlRuleName] = js.native
  /**
    * Access protocol actions to exclude from the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var NotActions: js.UndefOr[ActionsList] = js.native
  /**
    * IPv4 CIDR ranges to exclude from the rule.
    */
  var NotIpRanges: js.UndefOr[IpRangeList] = js.native
  /**
    * User IDs to exclude from the rule.
    */
  var NotUserIds: js.UndefOr[UserIdList] = js.native
  /**
    * User IDs to include in the rule.
    */
  var UserIds: js.UndefOr[UserIdList] = js.native
}

object AccessControlRule {
  @scala.inline
  def apply(): AccessControlRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlRule]
  }
  @scala.inline
  implicit class AccessControlRuleOps[Self <: AccessControlRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ActionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateModified")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: AccessControlRuleDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: AccessControlRuleEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effect")(js.undefined)
        ret
    }
    @scala.inline
    def withIpRanges(value: IpRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AccessControlRuleName): Self = {
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
    def withNotActions(value: ActionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotActions")(js.undefined)
        ret
    }
    @scala.inline
    def withNotIpRanges(value: IpRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotIpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotIpRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withNotUserIds(value: UserIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotUserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotUserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIds(value: UserIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIds")(js.undefined)
        ret
    }
  }
  
}

