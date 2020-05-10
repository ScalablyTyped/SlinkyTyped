package typingsSlinky.objection.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "ValidationError")
@js.native
class ValidationError protected () extends Error {
  def this(args: CreateValidationErrorArgs) = this()
  var data: js.UndefOr[ErrorHash | js.Any] = js.native
  var statusCode: Double = js.native
  var `type`: ValidationErrorType = js.native
}

