package typingsSlinky.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.requestPromiseNative.mod.FullResponse
import typingsSlinky.requestPromiseNative.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodeError extends Error {
  
  var error: js.Any = js.native
  
  var options: Options = js.native
  
  var response: FullResponse = js.native
  
  var statusCode: Double = js.native
}
@JSImport("request-promise-native/errors", "StatusCodeError")
@js.native
object StatusCodeError extends TopLevel[StatusCodeErrorConstructor]
