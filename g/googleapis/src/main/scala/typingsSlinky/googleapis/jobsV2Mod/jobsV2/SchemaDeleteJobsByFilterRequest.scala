package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Delete job by
  * filter request.  The job typically becomes unsearchable within 10 seconds,
  * but it may take up to 5 minutes.
  */
@js.native
trait SchemaDeleteJobsByFilterRequest extends js.Object {
  /**
    * Optional.  If set to true, this call waits for all processing steps to
    * complete before the job is cleaned up. Otherwise, the call returns while
    * some steps are still taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean] = js.native
  /**
    * Required.  Restrictions on the scope of the delete request.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
}

object SchemaDeleteJobsByFilterRequest {
  @scala.inline
  def apply(): SchemaDeleteJobsByFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteJobsByFilterRequest]
  }
  @scala.inline
  implicit class SchemaDeleteJobsByFilterRequestOps[Self <: SchemaDeleteJobsByFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableFastProcess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFastProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFastProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFastProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: SchemaFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

