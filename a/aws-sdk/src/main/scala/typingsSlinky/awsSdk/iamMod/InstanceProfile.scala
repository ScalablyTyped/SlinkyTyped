package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfile extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  /**
    * The date when the instance profile was created.
    */
  var CreateDate: js.Date = js.native
  /**
    *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var InstanceProfileId: idType = js.native
  /**
    * The name identifying the instance profile.
    */
  var InstanceProfileName: instanceProfileNameType = js.native
  /**
    *  The path to the instance profile. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  /**
    * The role associated with the instance profile.
    */
  var Roles: roleListType = js.native
}

object InstanceProfile {
  @scala.inline
  def apply(
    Arn: arnType,
    CreateDate: js.Date,
    InstanceProfileId: idType,
    InstanceProfileName: instanceProfileNameType,
    Path: pathType,
    Roles: roleListType
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], InstanceProfileId = InstanceProfileId.asInstanceOf[js.Any], InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfile]
  }
  @scala.inline
  implicit class InstanceProfileOps[Self <: InstanceProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceProfileId(value: idType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceProfileName(value: instanceProfileNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: pathType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoles(value: roleListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

