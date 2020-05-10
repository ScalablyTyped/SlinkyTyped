package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessControlEffectRequest extends js.Object {
  /**
    * The access protocol action. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Action: AccessControlRuleAction = js.native
  /**
    * The IPv4 address.
    */
  var IpAddress: typingsSlinky.awsSdk.workmailMod.IpAddress = js.native
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The user ID.
    */
  var UserId: WorkMailIdentifier = js.native
}

object GetAccessControlEffectRequest {
  @scala.inline
  def apply(
    Action: AccessControlRuleAction,
    IpAddress: IpAddress,
    OrganizationId: OrganizationId,
    UserId: WorkMailIdentifier
  ): GetAccessControlEffectRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessControlEffectRequest]
  }
  @scala.inline
  implicit class GetAccessControlEffectRequestOps[Self <: GetAccessControlEffectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: AccessControlRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationId(value: OrganizationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: WorkMailIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

