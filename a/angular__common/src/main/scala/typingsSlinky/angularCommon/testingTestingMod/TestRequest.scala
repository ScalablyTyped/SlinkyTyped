package typingsSlinky.angularCommon.testingTestingMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.ErrorEvent
import typingsSlinky.angularCommon.anon.StatusText
import typingsSlinky.angularCommon.httpHttpMod.HttpEvent
import typingsSlinky.angularCommon.httpMod.HttpRequest
import typingsSlinky.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/testing/testing", "TestRequest")
@js.native
class TestRequest protected () extends js.Object {
  def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  
  /**
    * Whether the request was cancelled after it was sent.
    */
  def cancelled: Boolean = js.native
  
  /**
    * Resolve the request by returning an `ErrorEvent` (e.g. simulating a network failure).
    */
  def error(error: ErrorEvent): Unit = js.native
  def error(error: ErrorEvent, opts: StatusText): Unit = js.native
  
  /**
    * Deliver an arbitrary `HttpEvent` (such as a progress event) on the response stream for this
    * request.
    */
  def event(event: HttpEvent[_]): Unit = js.native
  
  /**
    * Resolve the request by returning a body plus additional HTTP information (such as response
    * headers) if provided.
    * If the request specifies an expected body type, the body is converted into the requested type.
    * Otherwise, the body is converted to `JSON` by default.
    *
    * Both successful and unsuccessful responses can be delivered via `flush()`.
    */
  def flush(): Unit = js.native
  def flush(body: String): Unit = js.native
  def flush(body: String, opts: StatusText): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null]): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null], opts: StatusText): Unit = js.native
  def flush(body: js.Object): Unit = js.native
  def flush(body: js.Object, opts: StatusText): Unit = js.native
  def flush(body: Double): Unit = js.native
  def flush(body: Double, opts: StatusText): Unit = js.native
  def flush(body: Null, opts: StatusText): Unit = js.native
  def flush(body: js.typedarray.ArrayBuffer): Unit = js.native
  def flush(body: js.typedarray.ArrayBuffer, opts: StatusText): Unit = js.native
  def flush(body: Blob): Unit = js.native
  def flush(body: Blob, opts: StatusText): Unit = js.native
  
  var observer: js.Any = js.native
  
  var request: HttpRequest[_] = js.native
}
