package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Update job request.
  */
@js.native
trait SchemaUpdateJobRequest extends js.Object {
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_mask is provided, only the specified fields in job
    * are updated. Otherwise all the fields are updated.  A field mask to
    * restrict the fields that are updated. Only top level fields of Job are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
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
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

