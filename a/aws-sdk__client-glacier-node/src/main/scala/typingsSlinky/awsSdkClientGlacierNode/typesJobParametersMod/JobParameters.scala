package typingsSlinky.awsSdkClientGlacierNode.typesJobParametersMod

import typingsSlinky.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod.InventoryRetrievalJobInput
import typingsSlinky.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation
import typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobParameters extends js.Object {
  
  /**
    * <p>The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request parameter for an inventory retrieval job request. </p>
    */
  var ArchiveId: js.UndefOr[String] = js.native
  
  /**
    * <p>The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E hexadecimal.</p>
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * <p>When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the default format. Valid values are "CSV" and "JSON".</p>
    */
  var Format: js.UndefOr[String] = js.native
  
  /**
    * <p>Input parameters used for range inventory retrieval.</p>
    */
  var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.native
  
  /**
    * <p>Contains information about the location where the select job results are stored.</p>
    */
  var OutputLocation: js.UndefOr[typingsSlinky.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation] = js.native
  
  /**
    * <p>The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this operation returns a 400 response. </p> <p>An error occurs if you specify this field for an inventory retrieval job request.</p>
    */
  var RetrievalByteRange: js.UndefOr[String] = js.native
  
  /**
    * <p>The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must exist.</p>
    */
  var SNSTopic: js.UndefOr[String] = js.native
  
  /**
    * <p>Contains the parameters that define a job.</p>
    */
  var SelectParameters: js.UndefOr[typingsSlinky.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters] = js.native
  
  /**
    * <p>The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
    */
  var Tier: js.UndefOr[String] = js.native
  
  /**
    * <p>The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".</p>
    */
  var Type: js.UndefOr[String] = js.native
}
object JobParameters {
  
  @scala.inline
  def apply(): JobParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobParameters]
  }
  
  @scala.inline
  implicit class JobParametersOps[Self <: JobParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchiveId(value: String): Self = this.set("ArchiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveId: Self = this.set("ArchiveId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setInventoryRetrievalParameters(value: InventoryRetrievalJobInput): Self = this.set("InventoryRetrievalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryRetrievalParameters: Self = this.set("InventoryRetrievalParameters", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    
    @scala.inline
    def setRetrievalByteRange(value: String): Self = this.set("RetrievalByteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrievalByteRange: Self = this.set("RetrievalByteRange", js.undefined)
    
    @scala.inline
    def setSNSTopic(value: String): Self = this.set("SNSTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSNSTopic: Self = this.set("SNSTopic", js.undefined)
    
    @scala.inline
    def setSelectParameters(value: SelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
