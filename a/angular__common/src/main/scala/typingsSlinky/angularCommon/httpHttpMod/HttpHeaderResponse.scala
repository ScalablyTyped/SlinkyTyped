package typingsSlinky.angularCommon.httpHttpMod

import typingsSlinky.angularCommon.anon.Headers
import typingsSlinky.angularCommon.httpHttpMod.HttpEventType.ResponseHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpHeaderResponse")
@js.native
/**
  * Create a new `HttpHeaderResponse` with the given parameters.
  */
class HttpHeaderResponse ()
  extends HttpResponseBase
     with HttpEvent[js.Any] {
  def this(init: Headers) = this()
  @JSName("type")
  val type_HttpHeaderResponse: ResponseHeader = js.native
  def clone(update: Headers): HttpHeaderResponse = js.native
}

