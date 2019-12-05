package typingsSlinky.requestDashPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestDashPromise.requestDashPromiseMod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: IncomingMessage
}

@JSImport("request-promise/errors", "TransformError")
@js.native
object TransformError extends TopLevel[TransformErrorConstructor]

