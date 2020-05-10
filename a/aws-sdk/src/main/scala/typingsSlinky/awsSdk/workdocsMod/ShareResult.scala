package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareResult extends js.Object {
  /**
    * The ID of the invited user.
    */
  var InviteePrincipalId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the principal.
    */
  var PrincipalId: js.UndefOr[IdType] = js.native
  /**
    * The role.
    */
  var Role: js.UndefOr[RoleType] = js.native
  /**
    * The ID of the resource that was shared.
    */
  var ShareId: js.UndefOr[ResourceIdType] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[ShareStatusType] = js.native
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[MessageType] = js.native
}

object ShareResult {
  @scala.inline
  def apply(): ShareResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareResult]
  }
  @scala.inline
  implicit class ShareResultOps[Self <: ShareResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInviteePrincipalId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InviteePrincipalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteePrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InviteePrincipalId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrincipalId")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: RoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
    @scala.inline
    def withShareId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ShareStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

