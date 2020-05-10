package typingsSlinky.openapiRequestValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestValidator extends IOpenAPIRequestValidator {
  var bodySchema: js.Any = js.native
  var errorMapper: js.Any = js.native
  var isBodyRequired: js.Any = js.native
  var logger: js.Any = js.native
  var loggingKey: js.Any = js.native
  var requestBody: js.Any = js.native
  var requestBodyValidators: js.Any = js.native
  var validateBody: js.Any = js.native
  var validateFormData: js.Any = js.native
  var validateHeaders: js.Any = js.native
  var validatePath: js.Any = js.native
  var validateQuery: js.Any = js.native
  def validate(request: js.Any): Unit = js.native
  def validateRequest(request: js.Any): js.Any = js.native
}

object OpenAPIRequestValidator {
  @scala.inline
  def apply(
    bodySchema: js.Any,
    errorMapper: js.Any,
    isBodyRequired: js.Any,
    logger: js.Any,
    loggingKey: js.Any,
    requestBody: js.Any,
    requestBodyValidators: js.Any,
    validate: js.Any => Unit,
    validateBody: js.Any,
    validateFormData: js.Any,
    validateHeaders: js.Any,
    validatePath: js.Any,
    validateQuery: js.Any,
    validateRequest: js.Any => js.Any
  ): OpenAPIRequestValidator = {
    val __obj = js.Dynamic.literal(bodySchema = bodySchema.asInstanceOf[js.Any], errorMapper = errorMapper.asInstanceOf[js.Any], isBodyRequired = isBodyRequired.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestBodyValidators = requestBodyValidators.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate), validateBody = validateBody.asInstanceOf[js.Any], validateFormData = validateFormData.asInstanceOf[js.Any], validateHeaders = validateHeaders.asInstanceOf[js.Any], validatePath = validatePath.asInstanceOf[js.Any], validateQuery = validateQuery.asInstanceOf[js.Any], validateRequest = js.Any.fromFunction1(validateRequest))
    __obj.asInstanceOf[OpenAPIRequestValidator]
  }
  @scala.inline
  implicit class OpenAPIRequestValidatorOps[Self <: OpenAPIRequestValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodySchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMapper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBodyRequired(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBodyRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggingKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestBodyValidators(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBodyValidators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateFormData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFormData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatePath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateRequest(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateRequest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

