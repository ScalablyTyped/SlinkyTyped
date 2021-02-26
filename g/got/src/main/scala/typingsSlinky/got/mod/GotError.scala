package typingsSlinky.got.mod

import typingsSlinky.got.gotStrings.connect
import typingsSlinky.got.gotStrings.lookup
import typingsSlinky.got.gotStrings.request
import typingsSlinky.got.gotStrings.response
import typingsSlinky.got.gotStrings.secureConnect
import typingsSlinky.got.gotStrings.send
import typingsSlinky.got.gotStrings.socket
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.got.mod.RequestError
  - typingsSlinky.got.mod.ReadError
  - typingsSlinky.got.mod.ParseError
  - typingsSlinky.got.mod.HTTPError
  - typingsSlinky.got.mod.MaxRedirectsError
  - typingsSlinky.got.mod.UnsupportedProtocolError
  - typingsSlinky.got.mod.CancelError
  - typingsSlinky.got.mod.TimeoutError
*/
trait GotError extends StObject
object GotError {
  
  @scala.inline
  def CancelError(message: String, name: typingsSlinky.got.gotStrings.CancelError): typingsSlinky.got.mod.CancelError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.CancelError]
  }
  
  @scala.inline
  def HTTPError(
    body: Buffer | String | js.Object,
    headers: IncomingHttpHeaders,
    message: String,
    name: typingsSlinky.got.gotStrings.HTTPError,
    statusCode: Double,
    statusMessage: String
  ): typingsSlinky.got.mod.HTTPError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.HTTPError]
  }
  
  @scala.inline
  def MaxRedirectsError(
    message: String,
    name: typingsSlinky.got.gotStrings.MaxRedirectsError,
    redirectUrls: js.Array[String],
    statusCode: Double,
    statusMessage: String
  ): typingsSlinky.got.mod.MaxRedirectsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], redirectUrls = redirectUrls.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.MaxRedirectsError]
  }
  
  @scala.inline
  def ParseError(
    message: String,
    name: typingsSlinky.got.gotStrings.ParseError,
    statusCode: Double,
    statusMessage: String
  ): typingsSlinky.got.mod.ParseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.ParseError]
  }
  
  @scala.inline
  def ReadError(message: String, name: typingsSlinky.got.gotStrings.ReadError): typingsSlinky.got.mod.ReadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.ReadError]
  }
  
  @scala.inline
  def RequestError(message: String, name: typingsSlinky.got.gotStrings.RequestError): typingsSlinky.got.mod.RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.RequestError]
  }
  
  @scala.inline
  def TimeoutError(
    event: lookup | connect | secureConnect | socket | response | send | request,
    message: String,
    name: typingsSlinky.got.gotStrings.TimeoutError
  ): typingsSlinky.got.mod.TimeoutError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.TimeoutError]
  }
  
  @scala.inline
  def UnsupportedProtocolError(message: String, name: typingsSlinky.got.gotStrings.UnsupportedProtocolError): typingsSlinky.got.mod.UnsupportedProtocolError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.got.mod.UnsupportedProtocolError]
  }
}
