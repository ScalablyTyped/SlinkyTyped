package typingsSlinky.reactNativeJoi.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError
  extends Error
     with JoiObject {
  var _object: js.Any = js.native
  var details: js.Array[ValidationErrorItem] = js.native
  def annotate(): String = js.native
}

object ValidationError {
  @scala.inline
  def apply(
    _object: js.Any,
    annotate: () => String,
    details: js.Array[ValidationErrorItem],
    isJoi: Boolean,
    message: String,
    name: String
  ): ValidationError = {
    val __obj = js.Dynamic.literal(_object = _object.asInstanceOf[js.Any], annotate = js.Any.fromFunction0(annotate), details = details.asInstanceOf[js.Any], isJoi = isJoi.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_object(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetails(value: js.Array[ValidationErrorItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

