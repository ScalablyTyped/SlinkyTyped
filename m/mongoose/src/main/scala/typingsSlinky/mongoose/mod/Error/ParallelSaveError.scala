package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelSaveError
  extends typingsSlinky.mongoose.mod.Error {
  @JSName("name")
  var name_ParallelSaveError: typingsSlinky.mongoose.mongooseStrings.ParallelSaveError
}

object ParallelSaveError {
  @scala.inline
  def apply(name: typingsSlinky.mongoose.mongooseStrings.ParallelSaveError): ParallelSaveError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelSaveError]
  }
}

