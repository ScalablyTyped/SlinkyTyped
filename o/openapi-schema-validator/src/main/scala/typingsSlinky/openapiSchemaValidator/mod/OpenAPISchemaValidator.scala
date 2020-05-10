package typingsSlinky.openapiSchemaValidator.mod

import typingsSlinky.openapiTypes.mod.OpenAPI.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPISchemaValidator extends IOpenAPISchemaValidator {
  var validator: js.Any = js.native
}

object OpenAPISchemaValidator {
  @scala.inline
  def apply(validate: Document => OpenAPISchemaValidatorResult, validator: js.Any): OpenAPISchemaValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate), validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISchemaValidator]
  }
  @scala.inline
  implicit class OpenAPISchemaValidatorOps[Self <: OpenAPISchemaValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

