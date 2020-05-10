package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTransferRunsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListTransferRunsRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Output only. The stored pipeline transfer runs. */
  var transferRuns: js.UndefOr[js.Array[TransferRun]] = js.native
}

object ListTransferRunsResponse {
  @scala.inline
  def apply(): ListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferRunsResponse]
  }
  @scala.inline
  implicit class ListTransferRunsResponseOps[Self <: ListTransferRunsResponse] (val x: Self) extends AnyVal {
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
    def withTransferRuns(value: js.Array[TransferRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferRuns")(js.undefined)
        ret
    }
  }
  
}

