package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from ListTransferJobs.
  */
@js.native
trait SchemaListTransferJobsResponse extends js.Object {
  /**
    * The list next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of transfer jobs.
    */
  var transferJobs: js.UndefOr[js.Array[SchemaTransferJob]] = js.native
}

object SchemaListTransferJobsResponse {
  @scala.inline
  def apply(): SchemaListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferJobsResponse]
  }
  @scala.inline
  implicit class SchemaListTransferJobsResponseOps[Self <: SchemaListTransferJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTransferJobs(value: js.Array[SchemaTransferJob]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferJobs")(js.undefined)
        ret
    }
  }
  
}

