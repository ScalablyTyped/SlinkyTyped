package typingsSlinky.openapiRequestValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ajv.mod.ErrorObject
import typingsSlinky.ajv.mod.FormatDefinition
import typingsSlinky.ajv.mod.FormatValidator
import typingsSlinky.openapiTypes.mod.IJsonSchema
import typingsSlinky.openapiTypes.mod.OpenAPI.Parameters
import typingsSlinky.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typingsSlinky.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestValidatorArgs extends js.Object {
  var componentSchemas: js.UndefOr[js.Array[IJsonSchema]] = js.native
  var customFormats: js.UndefOr[StringDictionary[FormatValidator | FormatDefinition]] = js.native
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.native
  var externalSchemas: js.UndefOr[StringDictionary[IJsonSchema]] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var loggingKey: js.UndefOr[String] = js.native
  var parameters: Parameters = js.native
  var requestBody: js.UndefOr[RequestBodyObject] = js.native
  var schemas: js.UndefOr[js.Array[IJsonSchema]] = js.native
}

object OpenAPIRequestValidatorArgs {
  @scala.inline
  def apply(parameters: Parameters): OpenAPIRequestValidatorArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestValidatorArgs]
  }
  @scala.inline
  implicit class OpenAPIRequestValidatorArgsOps[Self <: OpenAPIRequestValidatorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentSchemas(value: js.Array[IJsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSchemas")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFormats(value: StringDictionary[FormatValidator | FormatDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTransformer(
      value: (/* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, /* ajvError */ ErrorObject) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalSchemas(value: StringDictionary[IJsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSchemas")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: RequestBodyObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[IJsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
  }
  
}

