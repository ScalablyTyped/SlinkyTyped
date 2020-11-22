package typingsSlinky.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestPromise.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestError extends Error {
  
  var cause: js.Any = js.native
  
  var error: js.Any = js.native
  
  var options: Options = js.native
  
  var response: IncomingMessage = js.native
}
@JSImport("request-promise/errors", "RequestError")
@js.native
object RequestError extends TopLevel[RequestErrorConstructor]
