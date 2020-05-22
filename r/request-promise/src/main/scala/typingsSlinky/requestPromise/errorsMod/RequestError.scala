package typingsSlinky.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestPromise.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: IncomingMessage
}

@JSImport("request-promise/errors", "RequestError")
@js.native
object RequestError extends TopLevel[RequestErrorConstructor]

