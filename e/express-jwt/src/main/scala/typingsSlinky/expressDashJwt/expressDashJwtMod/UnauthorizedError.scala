package typingsSlinky.expressDashJwt.expressDashJwtMod

import typingsSlinky.expressDashJwt.Anon_Message
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-jwt", "UnauthorizedError")
@js.native
class UnauthorizedError protected () extends Error {
  def this(code: ErrorCode, error: Anon_Message) = this()
  var code: ErrorCode = js.native
  var inner: Anon_Message = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  var name_UnauthorizedError: typingsSlinky.expressDashJwt.expressDashJwtStrings.UnauthorizedError = js.native
  var status: Double = js.native
}

