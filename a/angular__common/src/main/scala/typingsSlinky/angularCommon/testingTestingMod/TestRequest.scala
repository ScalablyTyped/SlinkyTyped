package typingsSlinky.angularCommon.testingTestingMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.ErrorEvent
import typingsSlinky.angularCommon.AnonStatusText
import typingsSlinky.angularCommon.httpHttpMod.HttpEvent
import typingsSlinky.angularCommon.httpMod.HttpRequest
import typingsSlinky.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/testing/testing", "TestRequest")
@js.native
class TestRequest protected () extends js.Object {
  def this(request: HttpRequest[_], observer: Observer[HttpEvent[_]]) = this()
  /**
    * Whether the request was cancelled after it was sent.
    */
  val cancelled: Boolean = js.native
  var observer: js.Any = js.native
  var request: HttpRequest[_] = js.native
  /**
    * Resolve the request by returning an `ErrorEvent` (e.g. simulating a network failure).
    */
  def error(error: ErrorEvent): Unit = js.native
  def error(error: ErrorEvent, opts: AnonStatusText): Unit = js.native
  /**
    * Deliver an arbitrary `HttpEvent` (such as a progress event) on the response stream for this
    * request.
    */
  def event(event: HttpEvent[_]): Unit = js.native
  def flush(): Unit = js.native
  def flush(body: String): Unit = js.native
  def flush(body: String, opts: AnonStatusText): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null]): Unit = js.native
  def flush(body: js.Array[String | Double | js.Object | Null], opts: AnonStatusText): Unit = js.native
  def flush(body: js.Object): Unit = js.native
  def flush(body: js.Object, opts: AnonStatusText): Unit = js.native
  def flush(body: Double): Unit = js.native
  def flush(body: Double, opts: AnonStatusText): Unit = js.native
  def flush(body: Null, opts: AnonStatusText): Unit = js.native
  /**
    * Resolve the request by returning a body plus additional HTTP information (such as response
    * headers) if provided.
    * If the request specifies an expected body type, the body is converted into the requested type.
    * Otherwise, the body is converted to `JSON` by default.
    *
    * Both successful and unsuccessful responses can be delivered via `flush()`.
    */
  def flush(body: js.typedarray.ArrayBuffer): Unit = js.native
  def flush(body: js.typedarray.ArrayBuffer, opts: AnonStatusText): Unit = js.native
  def flush(body: Blob): Unit = js.native
  def flush(body: Blob, opts: AnonStatusText): Unit = js.native
}

