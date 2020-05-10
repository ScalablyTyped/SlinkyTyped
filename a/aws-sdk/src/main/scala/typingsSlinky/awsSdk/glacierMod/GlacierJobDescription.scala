package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlacierJobDescription extends js.Object {
  /**
    * The job type. This value is either ArchiveRetrieval, InventoryRetrieval, or Select. 
    */
  var Action: js.UndefOr[ActionCode] = js.native
  /**
    * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
    */
  var ArchiveId: js.UndefOr[String] = js.native
  /**
    * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.
    */
  var ArchiveSHA256TreeHash: js.UndefOr[String] = js.native
  /**
    * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.
    */
  var ArchiveSizeInBytes: js.UndefOr[Size] = js.native
  /**
    * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
    */
  var Completed: js.UndefOr[Boolean] = js.native
  /**
    * The UTC time that the job request completed. While the job is in progress, the value is null.
    */
  var CompletionDate: js.UndefOr[String] = js.native
  /**
    * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example "2012-03-20T17:03:43.221Z".
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * Parameters used for range inventory retrieval.
    */
  var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.native
  /**
    * For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an archive retrieval or select job, this value is null.
    */
  var InventorySizeInBytes: js.UndefOr[Size] = js.native
  /**
    * The job description provided when initiating the job.
    */
  var JobDescription: js.UndefOr[String] = js.native
  /**
    * An opaque string that identifies an Amazon S3 Glacier job.
    */
  var JobId: js.UndefOr[String] = js.native
  /**
    * Contains the job output location.
    */
  var JobOutputPath: js.UndefOr[String] = js.native
  /**
    * Contains the location where the data from the select job is stored.
    */
  var OutputLocation: js.UndefOr[typingsSlinky.awsSdk.glacierMod.OutputLocation] = js.native
  /**
    * The retrieved byte range for archive retrieval jobs in the form StartByteValue-EndByteValue. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, StartByteValue equals 0 and EndByteValue equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. 
    */
  var RetrievalByteRange: js.UndefOr[String] = js.native
  /**
    * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null. The SHA256 tree hash value for the requested range of an archive. If the InitiateJob request for an archive specified a tree-hash aligned range, then this field returns a value. If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value. This field is null for the following:   Archive retrieval jobs that specify a range that is not tree-hash aligned     Archival jobs that specify a range that is equal to the whole archive, when the job status is InProgress      Inventory jobs   Select jobs  
    */
  var SHA256TreeHash: js.UndefOr[String] = js.native
  /**
    * An Amazon SNS topic that receives notification.
    */
  var SNSTopic: js.UndefOr[String] = js.native
  /**
    * Contains the parameters used for a select.
    */
  var SelectParameters: js.UndefOr[typingsSlinky.awsSdk.glacierMod.SelectParameters] = js.native
  /**
    * The status code can be InProgress, Succeeded, or Failed, and indicates the status of the job.
    */
  var StatusCode: js.UndefOr[typingsSlinky.awsSdk.glacierMod.StatusCode] = js.native
  /**
    * A friendly message that describes the job status.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The tier to use for a select or an archive retrieval. Valid values are Expedited, Standard, or Bulk. Standard is the default.
    */
  var Tier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object GlacierJobDescription {
  @scala.inline
  def apply(): GlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlacierJobDescription]
  }
  @scala.inline
  implicit class GlacierJobDescriptionOps[Self <: GlacierJobDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ActionCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withArchiveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveId")(js.undefined)
        ret
    }
    @scala.inline
    def withArchiveSHA256TreeHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveSHA256TreeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveSHA256TreeHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveSHA256TreeHash")(js.undefined)
        ret
    }
    @scala.inline
    def withArchiveSizeInBytes(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchiveSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Completed")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: String): Self = {
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
    def withInventoryRetrievalParameters(value: InventoryRetrievalJobDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryRetrievalParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryRetrievalParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryRetrievalParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withInventorySizeInBytes(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventorySizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventorySizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventorySizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withJobDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobId")(js.undefined)
        ret
    }
    @scala.inline
    def withJobOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobOutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobOutputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocation(value: OutputLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrievalByteRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrievalByteRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrievalByteRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetrievalByteRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSHA256TreeHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256TreeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSHA256TreeHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256TreeHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSNSTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNSTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectParameters(value: SelectParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultARN")(js.undefined)
        ret
    }
  }
  
}

