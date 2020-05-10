package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Update job request.
  */
@js.native
trait SchemaUpdateJobRequest extends js.Object {
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * Optional.  Options for job processing.
    * UpdateJobRequest.disable_street_address_resolution is ignored if this
    * flag is set.
    */
  var processingOptions: js.UndefOr[SchemaJobProcessingOptions] = js.native
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_job_fields is provided, only the specified fields
    * in job are updated. Otherwise all the fields are updated.  A field mask
    * to restrict the fields that are updated. Valid values are:  * jobTitle *
    * employmentTypes * description * applicationUrls * applicationEmailList *
    * applicationInstruction * responsibilities * qualifications *
    * educationLevels * level * department * startDate * endDate *
    * compensationInfo * incentives * languageCode * benefits * expireTime *
    * customAttributes * visibility * publishDate * promotionValue * locations
    * * region * expiryDate (deprecated) * filterableCustomFields (deprecated)
    * * unindexedCustomFields (deprecated)
    */
  var updateJobFields: js.UndefOr[String] = js.native
}

object SchemaUpdateJobRequest {
  @scala.inline
  def apply(): SchemaUpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateJobRequest]
  }
  @scala.inline
  implicit class SchemaUpdateJobRequestOps[Self <: SchemaUpdateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableStreetAddressResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetAddressResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStreetAddressResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetAddressResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withJob(value: SchemaJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingOptions(value: SchemaJobProcessingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateJobFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateJobFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateJobFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateJobFields")(js.undefined)
        ret
    }
  }
  
}

