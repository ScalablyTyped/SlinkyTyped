package typingsSlinky.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodeError extends Error {
  var error: js.Any
  var options: Options
  var response: FullResponse
  var statusCode: Double
}

@JSImport("request-promise-native/errors", "StatusCodeError")
@js.native
object StatusCodeError extends TopLevel[StatusCodeErrorConstructor]

