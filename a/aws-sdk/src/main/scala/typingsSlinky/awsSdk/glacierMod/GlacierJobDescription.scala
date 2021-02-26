package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlacierJobDescription extends StObject {
  
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
  implicit class GlacierJobDescriptionMutableBuilder[Self <: GlacierJobDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionCode): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setArchiveId(value: String): Self = StObject.set(x, "ArchiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveIdUndefined: Self = StObject.set(x, "ArchiveId", js.undefined)
    
    @scala.inline
    def setArchiveSHA256TreeHash(value: String): Self = StObject.set(x, "ArchiveSHA256TreeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveSHA256TreeHashUndefined: Self = StObject.set(x, "ArchiveSHA256TreeHash", js.undefined)
    
    @scala.inline
    def setArchiveSizeInBytes(value: Size): Self = StObject.set(x, "ArchiveSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveSizeInBytesUndefined: Self = StObject.set(x, "ArchiveSizeInBytes", js.undefined)
    
    @scala.inline
    def setCompleted(value: Boolean): Self = StObject.set(x, "Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "Completed", js.undefined)
    
    @scala.inline
    def setCompletionDate(value: String): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setInventoryRetrievalParameters(value: InventoryRetrievalJobDescription): Self = StObject.set(x, "InventoryRetrievalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryRetrievalParametersUndefined: Self = StObject.set(x, "InventoryRetrievalParameters", js.undefined)
    
    @scala.inline
    def setInventorySizeInBytes(value: Size): Self = StObject.set(x, "InventorySizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySizeInBytesUndefined: Self = StObject.set(x, "InventorySizeInBytes", js.undefined)
    
    @scala.inline
    def setJobDescription(value: String): Self = StObject.set(x, "JobDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDescriptionUndefined: Self = StObject.set(x, "JobDescription", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobOutputPath(value: String): Self = StObject.set(x, "JobOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobOutputPathUndefined: Self = StObject.set(x, "JobOutputPath", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    @scala.inline
    def setRetrievalByteRange(value: String): Self = StObject.set(x, "RetrievalByteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalByteRangeUndefined: Self = StObject.set(x, "RetrievalByteRange", js.undefined)
    
    @scala.inline
    def setSHA256TreeHash(value: String): Self = StObject.set(x, "SHA256TreeHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHA256TreeHashUndefined: Self = StObject.set(x, "SHA256TreeHash", js.undefined)
    
    @scala.inline
    def setSNSTopic(value: String): Self = StObject.set(x, "SNSTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNSTopicUndefined: Self = StObject.set(x, "SNSTopic", js.undefined)
    
    @scala.inline
    def setSelectParameters(value: SelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    @scala.inline
    def setVaultARN(value: String): Self = StObject.set(x, "VaultARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultARNUndefined: Self = StObject.set(x, "VaultARN", js.undefined)
  }
}
