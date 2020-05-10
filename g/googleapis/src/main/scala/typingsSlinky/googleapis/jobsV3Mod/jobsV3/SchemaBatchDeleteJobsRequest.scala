package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Batch delete jobs request.
  */
@js.native
trait SchemaBatchDeleteJobsRequest extends js.Object {
  /**
    * Required.  The filter string specifies the jobs to be deleted.  Supported
    * operator: =, AND  The fields eligible for filtering are:  * `companyName`
    * (Required) * `requisitionId` (Required)  Sample Query: companyName =
    * &quot;projects/api-test-project/companies/123&quot; AND requisitionId =
    * &quot;req-1&quot;
    */
  var filter: js.UndefOr[String] = js.native
}

object SchemaBatchDeleteJobsRequest {
  @scala.inline
  def apply(): SchemaBatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteJobsRequest]
  }
  @scala.inline
  implicit class SchemaBatchDeleteJobsRequestOps[Self <: SchemaBatchDeleteJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
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

