package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverwriteModelError
  extends typingsSlinky.mongoose.mod.Error {
  @JSName("name")
  var name_OverwriteModelError: typingsSlinky.mongoose.mongooseStrings.OverwriteModelError
}

object OverwriteModelError {
  @scala.inline
  def apply(name: typingsSlinky.mongoose.mongooseStrings.OverwriteModelError): OverwriteModelError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteModelError]
  }
}

