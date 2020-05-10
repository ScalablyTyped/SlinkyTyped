package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list Cloud Dataflow jobs.  This may be a partial
  * response, depending on the page size in the ListJobsRequest.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  /**
    * Zero or more messages describing the [regional endpoints]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var failedLocation: js.UndefOr[js.Array[SchemaFailedLocation]] = js.native
  /**
    * A subset of the requested job information.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * Set if there may be more results than fit in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobsResponse {
  @scala.inline
  def apply(): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
  @scala.inline
  implicit class SchemaListJobsResponseOps[Self <: SchemaListJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedLocation(value: js.Array[SchemaFailedLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withJobs(value: js.Array[SchemaJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

