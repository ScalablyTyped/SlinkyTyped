package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverwriteModelError
  extends typingsSlinky.mongoose.mod.Error {
  @JSName("name")
  var name_OverwriteModelError: typingsSlinky.mongoose.mongooseStrings.OverwriteModelError = js.native
}

object OverwriteModelError {
  @scala.inline
  def apply(name: typingsSlinky.mongoose.mongooseStrings.OverwriteModelError): OverwriteModelError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteModelError]
  }
  @scala.inline
  implicit class OverwriteModelErrorOps[Self <: OverwriteModelError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.mongoose.mongooseStrings.OverwriteModelError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

