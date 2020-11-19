package typingsSlinky.mapboxMapboxSdk.mapiRequestMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.mapboxMapboxSdk.mapiErrorMod.MapiError
import typingsSlinky.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import typingsSlinky.mapboxMapboxSdk.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapiRequest extends js.Object {
  
  def abort(): Unit = js.native
  
  /**
    * If the request has been aborted (via abort), this property will be true.
    */
  var aborted: Boolean = js.native
  
  /**
    * Data to send with the request. If the request has a body, it will also be sent with the header 'Content-Type: application/json'.
    */
  var body: js.UndefOr[js.Any] = js.native
  
  /**
    * This request's MapiClient.
    */
  var client: default = js.native
  
  def eachPage(callback: PageCallbackFunction): Unit = js.native
  
  /**
    * An event emitter.
    */
  var emitter: EventEmitter = js.native
  
  /**
    * If this request has been sent and received an error in response, the error is available on this property.
    */
  var error: js.UndefOr[MapiError | js.Error] = js.native
  
  /**
    * A file to send with the request. The browser client accepts Blobs and ArrayBuffers.
    */
  var file: Blob | js.typedarray.ArrayBuffer | String = js.native
  
  /**
    * The request's headers.
    */
  var headers: js.Any = js.native
  
  /**
    * The request's HTTP method.
    */
  var method: String = js.native
  
  /**
    * The request's origin.
    */
  var origin: String = js.native
  
  /**
    * A route parameters object, whose values will be interpolated the path.
    */
  var params: js.Any = js.native
  
  /**
    * The request's path, including colon-prefixed route parameters.
    */
  var path: String = js.native
  
  /**
    * A query object, which will be transformed into a URL query string.
    */
  var query: js.Any = js.native
  
  /**
    * If this request has been sent and received a response, the response is available on this property.
    */
  var response: js.UndefOr[MapiResponse] = js.native
  
  def send(): js.Promise[MapiResponse] = js.native
  
  /**
    * If the request has been sent, this property will be true.
    * You cannot send the same request twice, so if you need to create a new request
    * that is the equivalent of an existing one, use clone.
    */
  var sent: Boolean = js.native
  
  def url(): String = js.native
  def url(accessToken: String): String = js.native
}
