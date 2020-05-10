package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobParameters extends js.Object {
  /**
    * The ID of the archive that you want to retrieve. This field is required only if Type is set to select or archive-retrievalcode&gt;. An error occurs if you specify this request parameter for an inventory retrieval job request. 
    */
  var ArchiveId: js.UndefOr[String] = js.native
  /**
    * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E hexadecimal.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the default format. Valid values are "CSV" and "JSON".
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * Input parameters used for range inventory retrieval.
    */
  var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.native
  /**
    * Contains information about the location where the select job results are stored.
    */
  var OutputLocation: js.UndefOr[typingsSlinky.awsSdk.glacierMod.OutputLocation] = js.native
  /**
    * The byte range to retrieve for an archive retrieval. in the form "StartByteValue-EndByteValue" If not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned which means that StartByteValue must be divisible by 1 MB and EndByteValue plus 1 must be divisible by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this operation returns a 400 response.  An error occurs if you specify this field for an inventory retrieval job request.
    */
  var RetrievalByteRange: js.UndefOr[String] = js.native
  /**
    * The Amazon SNS topic ARN to which Amazon S3 Glacier sends a notification when the job is completed and the output is ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must exist.
    */
  var SNSTopic: js.UndefOr[String] = js.native
  /**
    * Contains the parameters that define a job.
    */
  var SelectParameters: js.UndefOr[typingsSlinky.awsSdk.glacierMod.SelectParameters] = js.native
  /**
    * The tier to use for a select or an archive retrieval job. Valid values are Expedited, Standard, or Bulk. Standard is the default.
    */
  var Tier: js.UndefOr[String] = js.native
  /**
    * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
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
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withInventoryRetrievalParameters(value: InventoryRetrievalJobInput): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

