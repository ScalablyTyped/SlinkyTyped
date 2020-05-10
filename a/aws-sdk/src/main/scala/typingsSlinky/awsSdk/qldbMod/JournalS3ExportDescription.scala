package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JournalS3ExportDescription extends js.Object {
  /**
    * The exclusive end date and time for the range of journal contents that are specified in the original export request.
    */
  var ExclusiveEndTime: js.Date = js.native
  /**
    * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var ExportCreationTime: js.Date = js.native
  /**
    * The unique ID of the journal export job.
    */
  var ExportId: UniqueId = js.native
  /**
    * The inclusive start date and time for the range of journal contents that are specified in the original export request.
    */
  var InclusiveStartTime: js.Date = js.native
  /**
    * The name of the ledger.
    */
  var LedgerName: typingsSlinky.awsSdk.qldbMod.LedgerName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption of your exported data.  
    */
  var RoleArn: Arn = js.native
  var S3ExportConfiguration: typingsSlinky.awsSdk.qldbMod.S3ExportConfiguration = js.native
  /**
    * The current state of the journal export job.
    */
  var Status: ExportStatus = js.native
}

object JournalS3ExportDescription {
  @scala.inline
  def apply(
    ExclusiveEndTime: js.Date,
    ExportCreationTime: js.Date,
    ExportId: UniqueId,
    InclusiveStartTime: js.Date,
    LedgerName: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration,
    Status: ExportStatus
  ): JournalS3ExportDescription = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime.asInstanceOf[js.Any], ExportCreationTime = ExportCreationTime.asInstanceOf[js.Any], ExportId = ExportId.asInstanceOf[js.Any], InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3ExportConfiguration = S3ExportConfiguration.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalS3ExportDescription]
  }
  @scala.inline
  implicit class JournalS3ExportDescriptionOps[Self <: JournalS3ExportDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusiveEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportCreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportId(value: UniqueId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusiveStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InclusiveStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLedgerName(value: LedgerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LedgerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3ExportConfiguration(value: S3ExportConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ExportConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ExportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

