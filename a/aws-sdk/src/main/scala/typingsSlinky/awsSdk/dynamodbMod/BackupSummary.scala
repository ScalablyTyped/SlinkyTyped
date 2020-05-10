package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSummary extends js.Object {
  /**
    * ARN associated with the backup.
    */
  var BackupArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupArn] = js.native
  /**
    * Time at which the backup was created.
    */
  var BackupCreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Name of the specified backup.
    */
  var BackupName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupName] = js.native
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupSizeBytes] = js.native
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  var BackupStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupStatus] = js.native
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BackupType] = js.native
  /**
    * ARN associated with the table.
    */
  var TableArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableArn] = js.native
  /**
    * Unique identifier for the table.
    */
  var TableId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableId] = js.native
  /**
    * Name of the table.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableName] = js.native
}

object BackupSummary {
  @scala.inline
  def apply(): BackupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSummary]
  }
  @scala.inline
  implicit class BackupSummaryOps[Self <: BackupSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupArn(value: BackupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupCreationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupExpiryDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupExpiryDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupExpiryDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupExpiryDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupName(value: BackupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupName")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupSizeBytes(value: BackupSizeBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupStatus(value: BackupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupType(value: BackupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(js.undefined)
        ret
    }
    @scala.inline
    def withTableArn(value: TableArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: TableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
  }
  
}

