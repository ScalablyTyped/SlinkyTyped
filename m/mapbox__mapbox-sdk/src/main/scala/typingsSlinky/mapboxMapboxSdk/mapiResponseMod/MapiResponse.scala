package typingsSlinky.mapboxMapboxSdk.mapiResponseMod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapiResponse extends js.Object {
  /**
    * The response body, parsed as JSON.
    */
  var body: js.Any = js.native
  /**
    * The parsed response headers.
    */
  var headers: js.Any = js.native
  /**
    * The parsed response links
    */
  var links: js.Any = js.native
  /**
    * The raw response body.
    */
  var rawBody: String = js.native
  /**
    * The response's originating MapiRequest.
    */
  var request: MapiRequest = js.native
  /**
    * The response's status code.
    */
  var statusCode: Double = js.native
  def hasNextPage(): Boolean = js.native
  def nextPage(): MapiRequest = js.native
}

object MapiResponse {
  @scala.inline
  def apply(
    body: js.Any,
    hasNextPage: () => Boolean,
    headers: js.Any,
    links: js.Any,
    nextPage: () => MapiRequest,
    rawBody: String,
    request: MapiRequest,
    statusCode: Double
  ): MapiResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hasNextPage = js.Any.fromFunction0(hasNextPage), headers = headers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), rawBody = rawBody.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapiResponse]
  }
  @scala.inline
  implicit class MapiResponseOps[Self <: MapiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNextPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPage(value: () => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRawBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

