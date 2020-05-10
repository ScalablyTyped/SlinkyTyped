package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSelectionsListMember extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * The date and time a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * Specifies the IAM role Amazon Resource Name (ARN) to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Uniquely identifies a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.native
  /**
    * The display name of a resource selection document.
    */
  var SelectionName: js.UndefOr[BackupSelectionName] = js.native
}

object BackupSelectionsListMember {
  @scala.inline
  def apply(): BackupSelectionsListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSelectionsListMember]
  }
  @scala.inline
  implicit class BackupSelectionsListMemberOps[Self <: BackupSelectionsListMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: IAMRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionName(value: BackupSelectionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionName")(js.undefined)
        ret
    }
  }
  
}

