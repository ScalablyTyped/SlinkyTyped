package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTask extends js.Object {
  /**
    * The data exported from the snapshot. Valid values are the following:    database - Export all the data of the snapshot.    database.table [table-name] - Export a table of the snapshot.    database.schema [schema-name] - Export a database schema of the snapshot. This value isn't valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.    database.schema.table [table-name] - Export a table of the database schema. This value isn't valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.  
    */
  var ExportOnly: js.UndefOr[StringList] = js.native
  /**
    * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the snapshot is exported to. 
    */
  var ExportTaskIdentifier: js.UndefOr[String] = js.native
  /**
    * The reason the export failed, if it failed.
    */
  var FailureCause: js.UndefOr[String] = js.native
  /**
    * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot. 
    */
  var IamRoleArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS key. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The progress of the snapshot export task as a percentage.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  /**
    * The Amazon S3 bucket that the snapshot is exported to.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[String] = js.native
  /**
    * The time that the snapshot was created.
    */
  var SnapshotTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
    */
  var SourceArn: js.UndefOr[String] = js.native
  /**
    * The progress status of the export task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The time that the snapshot export task completed.
    */
  var TaskEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that the snapshot export task started.
    */
  var TaskStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The total amount of data exported, in gigabytes.
    */
  var TotalExtractedDataInGB: js.UndefOr[Integer] = js.native
  /**
    * A warning about the snapshot export task.
    */
  var WarningMessage: js.UndefOr[String] = js.native
}

object ExportTask {
  @scala.inline
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  @scala.inline
  implicit class ExportTaskOps[Self <: ExportTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportOnly(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withExportTaskIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTaskIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCause")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: String): Self = {
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
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentProgress(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    def withTaskEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalExtractedDataInGB(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalExtractedDataInGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalExtractedDataInGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalExtractedDataInGB")(js.undefined)
        ret
    }
    @scala.inline
    def withWarningMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarningMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarningMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarningMessage")(js.undefined)
        ret
    }
  }
  
}

