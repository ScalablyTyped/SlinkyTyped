package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1PredictRequest extends js.Object {
  /** Required. The prediction request body. */
  var httpBody: js.UndefOr[GoogleApiHttpBody] = js.native
}

object GoogleCloudMlV1PredictRequest {
  @scala.inline
  def apply(): GoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictRequest]
  }
  @scala.inline
  implicit class GoogleCloudMlV1PredictRequestOps[Self <: GoogleCloudMlV1PredictRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpBody(value: GoogleApiHttpBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpBody")(js.undefined)
        ret
    }
  }
  
}

