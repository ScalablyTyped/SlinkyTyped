package typingsSlinky.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetAmpUrlsResponse extends js.Object {
  /**
    * For each URL in BatchAmpUrlsRequest, the URL response. The response might
    * not be in the same order as URLs in the batch request.
    * If BatchAmpUrlsRequest contains duplicate URLs, AmpUrl is generated
    * only once.
    */
  var ampUrls: js.UndefOr[js.Array[AmpUrl]] = js.native
  /** The errors for requested URLs that have no AMP URL. */
  var urlErrors: js.UndefOr[js.Array[AmpUrlError]] = js.native
}

object BatchGetAmpUrlsResponse {
  @scala.inline
  def apply(): BatchGetAmpUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAmpUrlsResponse]
  }
  @scala.inline
  implicit class BatchGetAmpUrlsResponseOps[Self <: BatchGetAmpUrlsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpUrls(value: js.Array[AmpUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlErrors(value: js.Array[AmpUrlError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlErrors")(js.undefined)
        ret
    }
  }
  
}

