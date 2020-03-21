package typingsSlinky.jsonwebtokenPromisified.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: String, date: js.Date) = this()
  var date: js.Date = js.native
}

