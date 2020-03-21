package typingsSlinky.angularCommon.httpHttpMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.angularCommon.AnonMethod
import typingsSlinky.angularCommon.AnonParams
import typingsSlinky.angularCommon.AnonSetHeaders
import typingsSlinky.angularCommon.angularCommonStrings.DELETE
import typingsSlinky.angularCommon.angularCommonStrings.GET
import typingsSlinky.angularCommon.angularCommonStrings.HEAD
import typingsSlinky.angularCommon.angularCommonStrings.JSONP
import typingsSlinky.angularCommon.angularCommonStrings.OPTIONS
import typingsSlinky.angularCommon.angularCommonStrings.PATCH
import typingsSlinky.angularCommon.angularCommonStrings.POST
import typingsSlinky.angularCommon.angularCommonStrings.PUT
import typingsSlinky.angularCommon.angularCommonStrings.arraybuffer
import typingsSlinky.angularCommon.angularCommonStrings.blob
import typingsSlinky.angularCommon.angularCommonStrings.json
import typingsSlinky.angularCommon.angularCommonStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpRequest")
@js.native
class HttpRequest[T] protected () extends js.Object {
  def this(method: String, url: String) = this()
  def this(method: DELETE, url: String) = this()
  def this(method: GET, url: String) = this()
  def this(method: HEAD, url: String) = this()
  def this(method: JSONP, url: String) = this()
  def this(method: OPTIONS, url: String) = this()
  def this(method: PATCH, url: String) = this()
  def this(method: POST, url: String) = this()
  def this(method: PUT, url: String) = this()
  def this(method: String, url: String, body: T) = this()
  def this(method: DELETE, url: String, init: AnonParams) = this()
  def this(method: GET, url: String, init: AnonParams) = this()
  def this(method: HEAD, url: String, init: AnonParams) = this()
  def this(method: JSONP, url: String, init: AnonParams) = this()
  def this(method: OPTIONS, url: String, init: AnonParams) = this()
  def this(method: PATCH, url: String, body: T) = this()
  def this(method: POST, url: String, body: T) = this()
  def this(method: PUT, url: String, body: T) = this()
  def this(method: String, url: String, body: T, init: AnonParams) = this()
  def this(method: String, url: String, body: Null, init: AnonParams) = this()
  def this(method: PATCH, url: String, body: T, init: AnonParams) = this()
  def this(method: PATCH, url: String, body: Null, init: AnonParams) = this()
  def this(method: POST, url: String, body: T, init: AnonParams) = this()
  def this(method: POST, url: String, body: Null, init: AnonParams) = this()
  def this(method: PUT, url: String, body: T, init: AnonParams) = this()
  def this(method: PUT, url: String, body: Null, init: AnonParams) = this()
  /**
    * The request body, or `null` if one isn't set.
    *
    * Bodies are not enforced to be immutable, as they can include a reference to any
    * user-defined data type. However, interceptors should take care to preserve
    * idempotence by treating them as such.
    */
  val body: T | Null = js.native
  /**
    * Outgoing headers for this request.
    */
  val headers: HttpHeaders = js.native
  /**
    * The outgoing HTTP request method.
    */
  val method: String = js.native
  /**
    * Outgoing URL parameters.
    */
  val params: HttpParams = js.native
  /**
    * Whether this request should be made in a way that exposes progress events.
    *
    * Progress events are expensive (change detection runs on each event) and so
    * they should only be requested if the consumer intends to monitor them.
    */
  val reportProgress: Boolean = js.native
  /**
    * The expected response type of the server.
    *
    * This is used to parse the response appropriately before returning it to
    * the requestee.
    */
  val responseType: arraybuffer | blob | json | text = js.native
  val url: String = js.native
  /**
    * The outgoing URL with all URL parameters set.
    */
  val urlWithParams: String = js.native
  /**
    * Whether this request should be sent with outgoing credentials (cookies).
    */
  val withCredentials: Boolean = js.native
  def clone(update: AnonMethod[T]): HttpRequest[T] = js.native
  def clone[V](update: AnonSetHeaders[V]): HttpRequest[V] = js.native
  /**
    * Examine the body and attempt to infer an appropriate MIME type
    * for it.
    *
    * If no such type can be inferred, this method will return `null`.
    */
  def detectContentTypeHeader(): String | Null = js.native
  /**
    * Transform the free-form body into a serialized format suitable for
    * transmission to the server.
    */
  def serializeBody(): scala.scalajs.js.typedarray.ArrayBuffer | Blob | FormData | String | Null = js.native
}

