package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends js.Object {
  /**
    * The ARN of the backup. 
    */
  var BackupArn: js.UndefOr[String] = js.native
  /**
    *  The generated ID of the backup. Example: myServerName-yyyyMMddHHmmssSSS 
    */
  var BackupId: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.BackupId] = js.native
  /**
    *  The backup type. Valid values are automated or manual. 
    */
  var BackupType: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.BackupType] = js.native
  /**
    *  The time stamp when the backup was created in the database. Example: 2016-07-29T13:38:47.520Z 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    *  A user-provided description for a manual backup. This field is empty for automated backups. 
    */
  var Description: js.UndefOr[String] = js.native
  /**
    *  The engine type that is obtained from the server when the backup is created. 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    *  The engine model that is obtained from the server when the backup is created. 
    */
  var EngineModel: js.UndefOr[String] = js.native
  /**
    *  The engine version that is obtained from the server when the backup is created. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    *  The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup. 
    */
  var InstanceProfileArn: js.UndefOr[String] = js.native
  /**
    *  The instance type that is obtained from the server when the backup is created. 
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    *  The key pair that is obtained from the server when the backup is created. 
    */
  var KeyPair: js.UndefOr[String] = js.native
  /**
    *  The preferred backup period that is obtained from the server when the backup is created. 
    */
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  /**
    *  The preferred maintenance period that is obtained from the server when the backup is created. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataSize: js.UndefOr[Integer] = js.native
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataUrl: js.UndefOr[String] = js.native
  /**
    *  The Amazon S3 URL of the backup's log file. 
    */
  var S3LogUrl: js.UndefOr[String] = js.native
  /**
    *  The security group IDs that are obtained from the server when the backup is created. 
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    *  The name of the server from which the backup was made. 
    */
  var ServerName: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.ServerName] = js.native
  /**
    *  The service role ARN that is obtained from the server when the backup is created. 
    */
  var ServiceRoleArn: js.UndefOr[String] = js.native
  /**
    * The status of a backup while in progress. 
    */
  var Status: js.UndefOr[BackupStatus] = js.native
  /**
    *  An informational message about backup status. 
    */
  var StatusDescription: js.UndefOr[String] = js.native
  /**
    *  The subnet IDs that are obtained from the server when the backup is created. 
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  /**
    *  The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created. 
    */
  var ToolsVersion: js.UndefOr[String] = js.native
  /**
    *  The IAM user ARN of the requester for manual backups. This field is empty for automated backups. 
    */
  var UserArn: js.UndefOr[String] = js.native
}

object Backup {
  @scala.inline
  def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  @scala.inline
  implicit class BackupOps[Self <: Backup] (val x: Self) extends AnyVal {
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
    def withBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupId")(js.undefined)
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
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineModel")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceProfileArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPair(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPair")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: TimeWindowDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DataSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DataSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataSize")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DataUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DataUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withS3LogUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3LogUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3LogUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3LogUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: BackupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withToolsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(js.undefined)
        ret
    }
  }
  
}

