package typingsSlinky.jwtExpress.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTExpressError extends Error
object JWTExpressError {
  
  @scala.inline
  def apply(message: String, name: String): JWTExpressError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTExpressError]
  }
}
