package typingsSlinky.graphqlTools.schemaErrorMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaError extends Error

object SchemaError {
  @scala.inline
  def apply(message: String, name: String): SchemaError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaError]
  }
}

