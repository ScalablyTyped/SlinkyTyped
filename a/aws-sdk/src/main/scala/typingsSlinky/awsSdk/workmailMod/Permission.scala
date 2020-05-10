package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    * The identifier of the user, group, or resource to which the permissions are granted.
    */
  var GranteeId: WorkMailIdentifier = js.native
  /**
    * The type of user, group, or resource referred to in GranteeId.
    */
  var GranteeType: MemberType = js.native
  /**
    * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
    */
  var PermissionValues: typingsSlinky.awsSdk.workmailMod.PermissionValues = js.native
}

object Permission {
  @scala.inline
  def apply(GranteeId: WorkMailIdentifier, GranteeType: MemberType, PermissionValues: PermissionValues): Permission = {
    val __obj = js.Dynamic.literal(GranteeId = GranteeId.asInstanceOf[js.Any], GranteeType = GranteeType.asInstanceOf[js.Any], PermissionValues = PermissionValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranteeId(value: WorkMailIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGranteeType(value: MemberType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionValues(value: PermissionValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

