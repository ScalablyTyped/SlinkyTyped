package typingsSlinky.awsSdkClientGlacierNode.typesDescribeJobOutputMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ArchiveRetrieval
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Failed
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InProgress
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InventoryRetrieval
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Select
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Succeeded
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.UnmarshalledInventoryRetrievalJobDescription
import typingsSlinky.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or <code>Select</code>. </p>
    */
  var Action: js.UndefOr[ArchiveRetrieval | InventoryRetrieval | Select | String] = js.native
  /**
    * <p>The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.</p>
    */
  var ArchiveId: js.UndefOr[String] = js.native
  /**
    * <p>The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.</p>
    */
  var ArchiveSHA256TreeHash: js.UndefOr[String] = js.native
  /**
    * <p>For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.</p>
    */
  var ArchiveSizeInBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The job status. When a job is completed, you get the job's output using Get Job Output (GET output).</p>
    */
  var Completed: js.UndefOr[Boolean] = js.native
  /**
    * <p>The UTC time that the job request completed. While the job is in progress, the value is null.</p>
    */
  var CompletionDate: js.UndefOr[String] = js.native
  /**
    * <p>The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example <code>"2012-03-20T17:03:43.221Z"</code>.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>Parameters used for range inventory retrieval.</p>
    */
  var InventoryRetrievalParameters: js.UndefOr[UnmarshalledInventoryRetrievalJobDescription] = js.native
  /**
    * <p>For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an archive retrieval or select job, this value is null.</p>
    */
  var InventorySizeInBytes: js.UndefOr[Double] = js.native
  /**
    * <p>The job description provided when initiating the job.</p>
    */
  var JobDescription: js.UndefOr[String] = js.native
  /**
    * <p>An opaque string that identifies an Amazon Glacier job.</p>
    */
  var JobId: js.UndefOr[String] = js.native
  /**
    * <p>Contains the job output location.</p>
    */
  var JobOutputPath: js.UndefOr[String] = js.native
  /**
    * <p>Contains the location where the data from the select job is stored.</p>
    */
  var OutputLocation: js.UndefOr[UnmarshalledOutputLocation] = js.native
  /**
    * <p>The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. </p>
    */
  var RetrievalByteRange: js.UndefOr[String] = js.native
  /**
    * <p>For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.</p> <p>The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an archive specified a tree-hash aligned range, then this field returns a value.</p> <p>If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.</p> <p>This field is null for the following:</p> <ul> <li> <p>Archive retrieval jobs that specify a range that is not tree-hash aligned</p> </li> </ul> <ul> <li> <p>Archival jobs that specify a range that is equal to the whole archive, when the job status is <code>InProgress</code> </p> </li> </ul> <ul> <li> <p>Inventory jobs</p> </li> <li> <p>Select jobs</p> </li> </ul>
    */
  var SHA256TreeHash: js.UndefOr[String] = js.native
  /**
    * <p>An Amazon SNS topic that receives notification.</p>
    */
  var SNSTopic: js.UndefOr[String] = js.native
  /**
    * <p>Contains the parameters used for a select.</p>
    */
  var SelectParameters: js.UndefOr[UnmarshalledSelectParameters] = js.native
  /**
    * <p>The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the status of the job.</p>
    */
  var StatusCode: js.UndefOr[InProgress | Succeeded | Failed | String] = js.native
  /**
    * <p>A friendly message that describes the job status.</p>
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * <p>The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
    */
  var Tier: js.UndefOr[String] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.</p>
    */
  var VaultARN: js.UndefOr[String] = js.native
}

object DescribeJobOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DescribeJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobOutput]
  }
  @scala.inline
  implicit class DescribeJobOutputOps[Self <: DescribeJobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: ArchiveRetrieval | InventoryRetrieval | Select | String): Self = {
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
    def withArchiveSizeInBytes(value: Double): Self = {
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
    def withInventoryRetrievalParameters(value: UnmarshalledInventoryRetrievalJobDescription): Self = {
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
    def withInventorySizeInBytes(value: Double): Self = {
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
    def withOutputLocation(value: UnmarshalledOutputLocation): Self = {
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
    def withSelectParameters(value: UnmarshalledSelectParameters): Self = {
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
    def withStatusCode(value: InProgress | Succeeded | Failed | String): Self = {
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

