package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedPermissionsBoundary extends js.Object {
  /**
    *  The ARN of the policy used to set the permissions boundary for the user or role.
    */
  var PermissionsBoundaryArn: js.UndefOr[arnType] = js.native
  /**
    *  The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary for an entity. This data type can only have a value of Policy.
    */
  var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.native
}

object AttachedPermissionsBoundary {
  @scala.inline
  def apply(): AttachedPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPermissionsBoundary]
  }
  @scala.inline
  implicit class AttachedPermissionsBoundaryOps[Self <: AttachedPermissionsBoundary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissionsBoundaryArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundaryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionsBoundaryArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundaryArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionsBoundaryType(value: PermissionsBoundaryAttachmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionsBoundaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsBoundaryType")(js.undefined)
        ret
    }
  }
  
}

