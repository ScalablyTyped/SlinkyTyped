package typingsSlinky.scErrors.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "AuthTokenExpiredError")
@js.native
class AuthTokenExpiredError protected () extends Error {
  def this(message: String, expiry: js.Date) = this()
  var expiry: js.Date = js.native
}

