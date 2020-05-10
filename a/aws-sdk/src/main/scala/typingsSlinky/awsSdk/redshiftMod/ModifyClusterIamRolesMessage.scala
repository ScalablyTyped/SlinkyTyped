package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterIamRolesMessage extends js.Object {
  /**
    * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
    */
  var AddIamRoles: js.UndefOr[IamRoleArnList] = js.native
  /**
    * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
    */
  var ClusterIdentifier: String = js.native
  /**
    * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles from a single cluster in a single request.
    */
  var RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.native
}

object ModifyClusterIamRolesMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterIamRolesMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterIamRolesMessage]
  }
  @scala.inline
  implicit class ModifyClusterIamRolesMessageOps[Self <: ModifyClusterIamRolesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddIamRoles(value: IamRoleArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddIamRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddIamRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddIamRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveIamRoles(value: IamRoleArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveIamRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveIamRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveIamRoles")(js.undefined)
        ret
    }
  }
  
}

