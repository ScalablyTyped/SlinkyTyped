package typingsSlinky.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.requestPromiseNative.mod.FullResponse
import typingsSlinky.requestPromiseNative.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestError extends Error {
  
  var cause: js.Any = js.native
  
  var error: js.Any = js.native
  
  var options: Options = js.native
  
  var response: FullResponse = js.native
}
@JSImport("request-promise-native/errors", "RequestError")
@js.native
object RequestError extends TopLevel[RequestErrorConstructor]
