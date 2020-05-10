package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPerfSamplesResponse extends js.Object {
  /**
    * Optional, returned if result size exceeds the page size specified in the request (or the default page size, 500, if unspecified). It indicates the last
    * sample timestamp to be used as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.native
}

object ListPerfSamplesResponse {
  @scala.inline
  def apply(): ListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPerfSamplesResponse]
  }
  @scala.inline
  implicit class ListPerfSamplesResponseOps[Self <: ListPerfSamplesResponse] (val x: Self) extends AnyVal {
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
    def withPerfSamples(value: js.Array[PerfSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfSamples")(js.undefined)
        ret
    }
  }
  
}

