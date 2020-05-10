package typingsSlinky.cypress.cypressMod.Cypress

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var allRequestResponses: js.Array[_] = js.native
  var body: js.Any = js.native
  var duration: Double = js.native
  var headers: StringDictionary[String] = js.native
  var isOkStatusCode: Boolean = js.native
  var redirectedToUrl: String = js.native
  var requestHeaders: StringDictionary[String] = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

object Response {
  @scala.inline
  def apply(
    allRequestResponses: js.Array[_],
    body: js.Any,
    duration: Double,
    headers: StringDictionary[String],
    isOkStatusCode: Boolean,
    redirectedToUrl: String,
    requestHeaders: StringDictionary[String],
    status: Double,
    statusText: String
  ): Response = {
    val __obj = js.Dynamic.literal(allRequestResponses = allRequestResponses.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isOkStatusCode = isOkStatusCode.asInstanceOf[js.Any], redirectedToUrl = redirectedToUrl.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllRequestResponses(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allRequestResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOkStatusCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOkStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectedToUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectedToUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

