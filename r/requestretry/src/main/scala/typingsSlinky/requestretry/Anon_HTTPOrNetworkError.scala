package typingsSlinky.requestretry

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestretry.requestretryMod.RetryStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_HTTPOrNetworkError extends js.Object {
  @JSName("HTTPOrNetworkError")
  var HTTPOrNetworkError_Original: RetryStrategy = js.native
  @JSName("HttpError")
  var HttpError_Original: RetryStrategy = js.native
  @JSName("NetworkError")
  var NetworkError_Original: RetryStrategy = js.native
  def HTTPOrNetworkError(err: js.Error, response: IncomingMessage, body: js.Any): Boolean = js.native
  def HttpError(err: js.Error, response: IncomingMessage, body: js.Any): Boolean = js.native
  def NetworkError(err: js.Error, response: IncomingMessage, body: js.Any): Boolean = js.native
}

