package typingsSlinky.jsonwebtoken.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.jsonwebtoken.jsonwebtokenMod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: String, date: js.Date) = this()
  var date: js.Date = js.native
}

