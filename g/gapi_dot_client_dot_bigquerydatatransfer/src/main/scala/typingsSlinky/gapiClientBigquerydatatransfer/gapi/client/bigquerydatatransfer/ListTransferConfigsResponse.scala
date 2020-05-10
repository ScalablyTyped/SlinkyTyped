package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTransferConfigsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListTransferConfigsRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Output only. The stored pipeline transfer configurations. */
  var transferConfigs: js.UndefOr[js.Array[TransferConfig]] = js.native
}

object ListTransferConfigsResponse {
  @scala.inline
  def apply(): ListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferConfigsResponse]
  }
  @scala.inline
  implicit class ListTransferConfigsResponseOps[Self <: ListTransferConfigsResponse] (val x: Self) extends AnyVal {
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
    def withTransferConfigs(value: js.Array[TransferConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferConfigs")(js.undefined)
        ret
    }
  }
  
}

