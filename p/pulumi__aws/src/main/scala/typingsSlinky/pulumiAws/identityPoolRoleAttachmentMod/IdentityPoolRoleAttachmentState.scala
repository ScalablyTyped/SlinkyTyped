package typingsSlinky.pulumiAws.identityPoolRoleAttachmentMod

import typingsSlinky.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping
import typingsSlinky.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoles
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentState extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: js.UndefOr[Input[String]] = js.native
  /**
    * A List of Role Mapping.
    */
  val roleMappings: js.UndefOr[Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]] = js.native
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: js.UndefOr[Input[IdentityPoolRoleAttachmentRoles]] = js.native
}

object IdentityPoolRoleAttachmentState {
  @scala.inline
  def apply(): IdentityPoolRoleAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolRoleAttachmentState]
  }
  @scala.inline
  implicit class IdentityPoolRoleAttachmentStateOps[Self <: IdentityPoolRoleAttachmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPoolId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleMappings(value: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: Input[IdentityPoolRoleAttachmentRoles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
  }
  
}

