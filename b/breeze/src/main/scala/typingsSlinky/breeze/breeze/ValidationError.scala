package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var context: js.Any = js.native
  var errorMessage: String = js.native
  var key: String = js.native
  var property: IProperty = js.native
  var propertyName: String = js.native
  var validator: Validator = js.native
  def getKey(validator: Validator, property: String): String = js.native
}

object ValidationError {
  @scala.inline
  def apply(
    context: js.Any,
    errorMessage: String,
    getKey: (Validator, String) => String,
    key: String,
    property: IProperty,
    propertyName: String,
    validator: Validator
  ): ValidationError = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], getKey = js.Any.fromFunction2(getKey), key = key.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKey(value: (Validator, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: IProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidator(value: Validator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

