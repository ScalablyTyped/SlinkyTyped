package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Create job request.
  */
@js.native
trait SchemaCreateJobRequest extends js.Object {
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt to resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * Optional.  Options for job processing.
    */
  var processingOptions: js.UndefOr[SchemaJobProcessingOptions] = js.native
}

object SchemaCreateJobRequest {
  @scala.inline
  def apply(): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
  @scala.inline
  implicit class SchemaCreateJobRequestOps[Self <: SchemaCreateJobRequest] (val x: Self) extends AnyVal {
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
  }
  
}

