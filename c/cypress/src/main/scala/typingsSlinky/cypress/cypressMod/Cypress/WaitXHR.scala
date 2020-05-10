package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.cypress.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitXHR extends js.Object {
  var duration: Double = js.native
  var id: String = js.native
  var method: HttpMethod = js.native
  var request: AnonBody = js.native
  var requestBody: String | ObjectLike = js.native
  var requestHeaders: ObjectLike = js.native
  var response: AnonBody = js.native
  var responseBody: String | ObjectLike = js.native
  var responseHeaders: ObjectLike = js.native
  var status: Double = js.native
  var statusMessage: String = js.native
  var url: String = js.native
  var xhr: XMLHttpRequest = js.native
}

object WaitXHR {
  @scala.inline
  def apply(
    duration: Double,
    id: String,
    method: HttpMethod,
    request: AnonBody,
    requestBody: String | ObjectLike,
    requestHeaders: ObjectLike,
    response: AnonBody,
    responseBody: String | ObjectLike,
    responseHeaders: ObjectLike,
    status: Double,
    statusMessage: String,
    url: String,
    xhr: XMLHttpRequest
  ): WaitXHR = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseBody = responseBody.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitXHR]
  }
  @scala.inline
  implicit class WaitXHROps[Self <: WaitXHR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: HttpMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestBody(value: String | ObjectLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestHeaders(value: ObjectLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseBody(value: String | ObjectLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseHeaders(value: ObjectLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhr(value: XMLHttpRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

