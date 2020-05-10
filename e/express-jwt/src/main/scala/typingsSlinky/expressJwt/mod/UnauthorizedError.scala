package typingsSlinky.expressJwt.mod

import typingsSlinky.expressJwt.AnonMessage
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: ErrorCode, error: AnonMessage) = this()
  var code: ErrorCode = js.native
  var inner: AnonMessage = js.native
  @JSName("name")
  var name_UnauthorizedError: typingsSlinky.expressJwt.expressJwtStrings.UnauthorizedError = js.native
  var status: Double = js.native
}

