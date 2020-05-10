package typingsSlinky.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestPromise.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeError extends Error {
  var error: js.Any = js.native
  var options: Options = js.native
  var response: IncomingMessage = js.native
  var statusCode: Double = js.native
}

@JSImport("request-promise/errors", "StatusCodeError")
@js.native
object StatusCodeError extends TopLevel[StatusCodeErrorConstructor]

