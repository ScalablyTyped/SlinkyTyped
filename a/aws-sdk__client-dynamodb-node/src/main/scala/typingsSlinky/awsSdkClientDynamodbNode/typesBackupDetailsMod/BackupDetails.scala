package typingsSlinky.awsSdkClientDynamodbNode.typesBackupDetailsMod

import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.AVAILABLE
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETED
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupDetails extends js.Object {
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: String = js.native
  /**
    * <p>Time at which the backup was created. This is the request time of the backup. </p>
    */
  var BackupCreationDateTime: js.Date | String | Double = js.native
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Name of the requested backup.</p>
    */
  var BackupName: String = js.native
  /**
    * <p>Size of the backup in bytes.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.native
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED. </p>
    */
  var BackupStatus: CREATING | DELETED | AVAILABLE | String = js.native
  /**
    * <p>BackupType:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> </ul>
    */
  var BackupType: USER | SYSTEM | String = js.native
}

object BackupDetails {
  @scala.inline
  def apply(
    BackupArn: String,
    BackupCreationDateTime: js.Date | String | Double,
    BackupName: String,
    BackupStatus: CREATING | DELETED | AVAILABLE | String,
    BackupType: USER | SYSTEM | String
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
    def withBackupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupArn")(value.asInstanceOf[js.Any])
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
    def withBackupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupStatus(value: CREATING | DELETED | AVAILABLE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupType(value: USER | SYSTEM | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupType")(value.asInstanceOf[js.Any])
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
  }
  
}

