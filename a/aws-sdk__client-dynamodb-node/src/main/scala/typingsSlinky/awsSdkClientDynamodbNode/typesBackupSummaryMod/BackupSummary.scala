package typingsSlinky.awsSdkClientDynamodbNode.typesBackupSummaryMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSummary extends js.Object {
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.native
  /**
    * <p>Time at which the backup was created.</p>
    */
  var BackupCreationDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Name of the specified backup.</p>
    */
  var BackupName: js.UndefOr[String] = js.native
  /**
    * <p>Size of the backup in bytes.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.native
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED.</p>
    */
  var BackupStatus: js.UndefOr[CREATING | DELETED | AVAILABLE | String] = js.native
  /**
    * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
    */
  var BackupType: js.UndefOr[USER | SYSTEM | String] = js.native
  /**
    * <p>ARN associated with the table.</p>
    */
  var TableArn: js.UndefOr[String] = js.native
  /**
    * <p>Unique identifier for the table.</p>
    */
  var TableId: js.UndefOr[String] = js.native
  /**
    * <p>Name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.native
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
    def withBackupArn(value: String): Self = {
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
    def withBackupCreationDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupCreationDateTime(value: js.Date | String | Double): Self = {
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
    def withBackupExpiryDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupExpiryDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupExpiryDateTime(value: js.Date | String | Double): Self = {
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
    def withBackupName(value: String): Self = {
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
    def withBackupSizeBytes(value: Double): Self = {
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
    def withBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = {
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
    def withBackupType(value: USER | SYSTEM | String): Self = {
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
    def withTableArn(value: String): Self = {
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
    def withTableId(value: String): Self = {
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
    def withTableName(value: String): Self = {
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

