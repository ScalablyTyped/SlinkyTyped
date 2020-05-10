package typingsSlinky.openapiResponseValidator.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ajv.mod.ErrorObject
import typingsSlinky.ajv.mod.FormatDefinition
import typingsSlinky.ajv.mod.FormatValidator
import typingsSlinky.openapiResponseValidator.AnonSchema
import typingsSlinky.openapiTypes.mod.IJsonSchema
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ComponentsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIResponseValidatorArgs extends js.Object {
  var components: js.UndefOr[ComponentsObject] = js.native
  var customFormats: StringDictionary[FormatValidator | FormatDefinition] = js.native
  var definitions: StringDictionary[IJsonSchema] = js.native
  var errorTransformer: js.UndefOr[
    js.Function2[
      /* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, 
      /* ajvError */ ErrorObject, 
      _
    ]
  ] = js.native
  var externalSchemas: StringDictionary[IJsonSchema] = js.native
  var loggingKey: String = js.native
  var responses: StringDictionary[AnonSchema] = js.native
}

object OpenAPIResponseValidatorArgs {
  @scala.inline
  def apply(
    customFormats: StringDictionary[FormatValidator | FormatDefinition],
    definitions: StringDictionary[IJsonSchema],
    externalSchemas: StringDictionary[IJsonSchema],
    loggingKey: String,
    responses: StringDictionary[AnonSchema]
  ): OpenAPIResponseValidatorArgs = {
    val __obj = js.Dynamic.literal(customFormats = customFormats.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], loggingKey = loggingKey.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIResponseValidatorArgs]
  }
  @scala.inline
  implicit class OpenAPIResponseValidatorArgsOps[Self <: OpenAPIResponseValidatorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFormats(value: StringDictionary[FormatValidator | FormatDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitions(value: StringDictionary[IJsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalSchemas(value: StringDictionary[IJsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoggingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponses(value: StringDictionary[AnonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: ComponentsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTransformer(
      value: (/* openAPIResponseValidatorValidationError */ OpenAPIResponseValidatorError, /* ajvError */ ErrorObject) => _
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
  }
  
}

