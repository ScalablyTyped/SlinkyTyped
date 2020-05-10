package typingsSlinky.meteor.Meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedError
  extends typingsSlinky.std.Error {
  var errorType: String = js.native
}

@JSGlobal("Meteor.TypedError")
@js.native
object TypedError extends TopLevel[TypedErrorStatic]

