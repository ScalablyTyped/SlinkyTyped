package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupDetails extends js.Object {
  /**
    * ARN associated with the backup.
    */
  var BackupArn: typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
  /**
    * Time at which the backup was created. This is the request time of the backup. 
    */
  var BackupCreationDateTime: js.Date = js.native
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Name of the requested backup.
    */
  var BackupName: typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupName = js.native
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupSizeBytes] = js.native
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
    */
  var BackupStatus: typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupStatus = js.native
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: typingsSlinky.awsSdk.documentClientMod.DocumentClient.BackupType = js.native
}

object BackupDetails {
  @scala.inline
  def apply(
    BackupArn: BackupArn,
    BackupCreationDateTime: js.Date,
    BackupName: BackupName,
    BackupStatus: BackupStatus,
    BackupType: BackupType
  ): BackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], BackupCreationDateTime = BackupCreationDateTime.asInstanceOf[js.Any], BackupName = BackupName.asInstanceOf[js.Any], BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDetails]
  }
  @scala.inline
  implicit class BackupDetailsOps[Self <: BackupDetails] (val x: Self) extends AnyVal {
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
    def withBackupCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupName(value: BackupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupStatus(value: BackupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupType(value: BackupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(value.asInstanceOf[js.Any])
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
  }
  
}

