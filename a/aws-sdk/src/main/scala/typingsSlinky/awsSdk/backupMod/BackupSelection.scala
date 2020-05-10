package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSelection extends js.Object {
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * An array of conditions used to specify a set of resources to assign to a backup plan; for example, "STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting".
    */
  var ListOfTags: js.UndefOr[typingsSlinky.awsSdk.backupMod.ListOfTags] = js.native
  /**
    * An array of strings that contain Amazon Resource Names (ARNs) of resources to assign to a backup plan.
    */
  var Resources: js.UndefOr[ResourceArns] = js.native
  /**
    * The display name of a resource selection document.
    */
  var SelectionName: BackupSelectionName = js.native
}

object BackupSelection {
  @scala.inline
  def apply(IamRoleArn: IAMRoleArn, SelectionName: BackupSelectionName): BackupSelection = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SelectionName = SelectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupSelection]
  }
  @scala.inline
  implicit class BackupSelectionOps[Self <: BackupSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionName(value: BackupSelectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListOfTags(value: ListOfTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListOfTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListOfTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListOfTags")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: ResourceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
  }
  
}

