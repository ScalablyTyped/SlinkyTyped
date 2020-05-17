package typingsSlinky.mongoose.mod.Error

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError
  extends typingsSlinky.mongoose.mod.Error {
  var errors: StringDictionary[ValidatorError | CastError] = js.native
  @JSName("name")
  var name_ValidationError: typingsSlinky.mongoose.mongooseStrings.ValidationError = js.native
  def addError(path: String, error: js.Any): Unit = js.native
  def inspect(): js.Object = js.native
  def toJSON(): js.Object = js.native
}

object ValidationError {
  @scala.inline
  def apply(
    addError: (String, js.Any) => Unit,
    errors: StringDictionary[ValidatorError | CastError],
    inspect: () => js.Object,
    name: typingsSlinky.mongoose.mongooseStrings.ValidationError,
    toJSON: () => js.Object
  ): ValidationError = {
    val __obj = js.Dynamic.literal(addError = js.Any.fromFunction2(addError), errors = errors.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddError(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withErrors(value: StringDictionary[ValidatorError | CastError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInspect(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: typingsSlinky.mongoose.mongooseStrings.ValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

