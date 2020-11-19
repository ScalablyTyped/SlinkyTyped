package typingsSlinky.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.jsonwebtoken.mod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "TokenExpiredError")
@js.native
class TokenExpiredError protected () extends JsonWebTokenError {
  def this(message: String, expiredAt: js.Date) = this()
  
  var expiredAt: js.Date = js.native
}
