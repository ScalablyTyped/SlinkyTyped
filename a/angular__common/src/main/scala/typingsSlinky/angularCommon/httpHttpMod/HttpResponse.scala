package typingsSlinky.angularCommon.httpHttpMod

import typingsSlinky.angularCommon.anon.Body
import typingsSlinky.angularCommon.anon.Headers
import typingsSlinky.angularCommon.anon.Status
import typingsSlinky.angularCommon.httpHttpMod.HttpEventType.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpResponse")
@js.native
/**
  * Construct a new `HttpResponse`.
  */
class HttpResponse[T] ()
  extends HttpResponseBase
     with HttpEvent[T] {
  def this(init: Body[T]) = this()
  
  /**
    * The response body, or `null` if one was not returned.
    */
  val body: T | Null = js.native
  
  def clone(update: Headers): HttpResponse[T] = js.native
  def clone[V](update: Status[V]): HttpResponse[V] = js.native
  
  @JSName("type")
  val type_HttpResponse: Response = js.native
}
