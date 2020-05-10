package typingsSlinky.firebasePerformance.networkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkRequest extends js.Object {
  var httpMethod: js.UndefOr[HttpMethod] = js.native
  var httpResponseCode: js.UndefOr[Double] = js.native
  var requestPayloadBytes: js.UndefOr[Double] = js.native
  var responseContentType: js.UndefOr[String] = js.native
  var responsePayloadBytes: js.UndefOr[Double] = js.native
  var startTimeUs: js.UndefOr[Double] = js.native
  var timeToRequestCompletedUs: js.UndefOr[Double] = js.native
  var timeToResponseCompletedUs: js.UndefOr[Double] = js.native
  var timeToResponseInitiatedUs: js.UndefOr[Double] = js.native
  var url: String = js.native
}

object NetworkRequest {
  @scala.inline
  def apply(url: String): NetworkRequest = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkRequest]
  }
  @scala.inline
  implicit class NetworkRequestOps[Self <: NetworkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayloadBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayloadBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayloadBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayloadBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsePayloadBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePayloadBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsePayloadBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePayloadBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeUs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeUs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeUs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeUs")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToRequestCompletedUs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToRequestCompletedUs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToRequestCompletedUs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToRequestCompletedUs")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToResponseCompletedUs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToResponseCompletedUs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToResponseCompletedUs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToResponseCompletedUs")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToResponseInitiatedUs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToResponseInitiatedUs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToResponseInitiatedUs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToResponseInitiatedUs")(js.undefined)
        ret
    }
  }
  
}

