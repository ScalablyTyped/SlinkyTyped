package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupPlanOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * The date and time a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.native
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version Ids cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteBackupPlanOutput {
  @scala.inline
  def apply(): DeleteBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupPlanOutput]
  }
  @scala.inline
  implicit class DeleteBackupPlanOutputOps[Self <: DeleteBackupPlanOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPlanArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPlanArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPlanArn")(js.undefined)
        ret
    }
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
    def withDeletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

