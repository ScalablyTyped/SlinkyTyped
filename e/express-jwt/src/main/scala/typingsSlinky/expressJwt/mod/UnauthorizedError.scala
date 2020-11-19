package typingsSlinky.expressJwt.mod

import typingsSlinky.expressJwt.anon.Message
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: ErrorCode, error: Message) = this()
  
  var code: ErrorCode = js.native
  
  var inner: Message = js.native
  
  @JSName("name")
  var name_UnauthorizedError: typingsSlinky.expressJwt.expressJwtStrings.UnauthorizedError = js.native
  
  var status: Double = js.native
}
