package typingsSlinky.scErrors.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "AuthTokenNotBeforeError")
@js.native
class AuthTokenNotBeforeError protected () extends Error {
  def this(message: String, date: js.Date) = this()
  var date: js.Date = js.native
}

