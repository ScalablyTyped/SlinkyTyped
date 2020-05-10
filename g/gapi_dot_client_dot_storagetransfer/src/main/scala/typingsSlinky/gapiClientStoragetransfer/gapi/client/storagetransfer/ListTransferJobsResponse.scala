package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTransferJobsResponse extends js.Object {
  /** The list next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** A list of transfer jobs. */
  var transferJobs: js.UndefOr[js.Array[TransferJob]] = js.native
}

object ListTransferJobsResponse {
  @scala.inline
  def apply(): ListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferJobsResponse]
  }
  @scala.inline
  implicit class ListTransferJobsResponseOps[Self <: ListTransferJobsResponse] (val x: Self) extends AnyVal {
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
    def withTransferJobs(value: js.Array[TransferJob]): Self = {
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

