package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentNotFoundError
  extends typingsSlinky.mongoose.mod.Error {
  var filter: js.Any
  @JSName("name")
  var name_DocumentNotFoundError: typingsSlinky.mongoose.mongooseStrings.DocumentNotFoundError
  var query: js.Any
}

object DocumentNotFoundError {
  @scala.inline
  def apply(filter: js.Any, name: typingsSlinky.mongoose.mongooseStrings.DocumentNotFoundError, query: js.Any): DocumentNotFoundError = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentNotFoundError]
  }
}

