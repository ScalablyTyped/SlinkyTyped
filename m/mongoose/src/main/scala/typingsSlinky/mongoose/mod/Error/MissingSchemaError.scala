package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingSchemaError
  extends typingsSlinky.mongoose.mod.Error {
  @JSName("name")
  var name_MissingSchemaError: typingsSlinky.mongoose.mongooseStrings.MissingSchemaError
}

object MissingSchemaError {
  @scala.inline
  def apply(name: typingsSlinky.mongoose.mongooseStrings.MissingSchemaError): MissingSchemaError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingSchemaError]
  }
}

