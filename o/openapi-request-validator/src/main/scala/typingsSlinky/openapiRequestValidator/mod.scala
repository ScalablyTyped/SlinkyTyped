package typingsSlinky.openapiRequestValidator

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ajv.mod.ErrorObject
import typingsSlinky.ajv.mod.FormatDefinition
import typingsSlinky.ajv.mod.FormatValidator
import typingsSlinky.ajv.mod.KeywordDefinition
import typingsSlinky.openapiTypes.mod.IJsonSchema
import typingsSlinky.openapiTypes.mod.OpenAPI.Parameters
import typingsSlinky.openapiTypes.mod.OpenAPI.Request
import typingsSlinky.openapiTypes.mod.OpenAPIV2.Parameter
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ParameterObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typingsSlinky.tsLog.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-request-validator", JSImport.Default)
  @js.native
  class default protected () extends OpenAPIRequestValidator {
    def this(args: OpenAPIRequestValidatorArgs) = this()
  }
  
  @js.native
  trait IOpenAPIRequestValidator extends StObject {
    
    def validateRequest(request: Request): js.Any = js.native
  }
  object IOpenAPIRequestValidator {
    
    @scala.inline
    def apply(validateRequest: Request => js.Any): IOpenAPIRequestValidator = {
      val __obj = js.Dynamic.literal(validateRequest = js.Any.fromFunction1(validateRequest))
      __obj.asInstanceOf[IOpenAPIRequestValidator]
    }
    
    @scala.inline
    implicit class IOpenAPIRequestValidatorMutableBuilder[Self <: IOpenAPIRequestValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidateRequest(value: Request => js.Any): Self = StObject.set(x, "validateRequest", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OpenAPIRequestValidator extends IOpenAPIRequestValidator {
    
    var bodySchema: js.Any = js.native
    
    var errorMapper: js.Any = js.native
    
    var isBodyRequired: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var loggingKey: js.Any = js.native
    
    var requestBody: js.Any = js.native
    
    var requestBodyValidators: js.Any = js.native
    
    def validate(request: js.Any): Unit = js.native
    
    var validateBody: js.Any = js.native
    
    var validateFormData: js.Any = js.native
    
    var validateHeaders: js.Any = js.native
    
    var validatePath: js.Any = js.native
    
    var validateQuery: js.Any = js.native
    
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
    implicit class OpenAPIRequestValidatorMutableBuilder[Self <: OpenAPIRequestValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodySchema(value: js.Any): Self = StObject.set(x, "bodySchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMapper(value: js.Any): Self = StObject.set(x, "errorMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBodyRequired(value: js.Any): Self = StObject.set(x, "isBodyRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingKey(value: js.Any): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBody(value: js.Any): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBodyValidators(value: js.Any): Self = StObject.set(x, "requestBodyValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: js.Any => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateBody(value: js.Any): Self = StObject.set(x, "validateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFormData(value: js.Any): Self = StObject.set(x, "validateFormData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateHeaders(value: js.Any): Self = StObject.set(x, "validateHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatePath(value: js.Any): Self = StObject.set(x, "validatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateQuery(value: js.Any): Self = StObject.set(x, "validateQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequest(value: js.Any => js.Any): Self = StObject.set(x, "validateRequest", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OpenAPIRequestValidatorArgs extends StObject {
    
    var componentSchemas: js.UndefOr[js.Array[IJsonSchema]] = js.native
    
    var customFormats: js.UndefOr[StringDictionary[FormatValidator | FormatDefinition]] = js.native
    
    var customKeywords: js.UndefOr[StringDictionary[KeywordDefinition]] = js.native
    
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
    
    var parameters: js.UndefOr[Parameters] = js.native
    
    var requestBody: js.UndefOr[RequestBodyObject] = js.native
    
    var schemas: js.UndefOr[js.Array[IJsonSchema]] = js.native
  }
  object OpenAPIRequestValidatorArgs {
    
    @scala.inline
    def apply(): OpenAPIRequestValidatorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIRequestValidatorArgs]
    }
    
    @scala.inline
    implicit class OpenAPIRequestValidatorArgsMutableBuilder[Self <: OpenAPIRequestValidatorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentSchemas(value: js.Array[IJsonSchema]): Self = StObject.set(x, "componentSchemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentSchemasUndefined: Self = StObject.set(x, "componentSchemas", js.undefined)
      
      @scala.inline
      def setComponentSchemasVarargs(value: IJsonSchema*): Self = StObject.set(x, "componentSchemas", js.Array(value :_*))
      
      @scala.inline
      def setCustomFormats(value: StringDictionary[FormatValidator | FormatDefinition]): Self = StObject.set(x, "customFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFormatsUndefined: Self = StObject.set(x, "customFormats", js.undefined)
      
      @scala.inline
      def setCustomKeywords(value: StringDictionary[KeywordDefinition]): Self = StObject.set(x, "customKeywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomKeywordsUndefined: Self = StObject.set(x, "customKeywords", js.undefined)
      
      @scala.inline
      def setErrorTransformer(
        value: (/* openAPIResponseValidatorValidationError */ OpenAPIRequestValidatorError, /* ajvError */ ErrorObject) => _
      ): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      @scala.inline
      def setExternalSchemas(value: StringDictionary[IJsonSchema]): Self = StObject.set(x, "externalSchemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalSchemasUndefined: Self = StObject.set(x, "externalSchemas", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingKeyUndefined: Self = StObject.set(x, "loggingKey", js.undefined)
      
      @scala.inline
      def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(
        value: (Parameter | ParameterObject | ReferenceObject | typingsSlinky.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
      ): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setRequestBody(value: RequestBodyObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      @scala.inline
      def setSchemas(value: js.Array[IJsonSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      @scala.inline
      def setSchemasVarargs(value: IJsonSchema*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OpenAPIRequestValidatorError extends StObject {
    
    var errorCode: String = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[js.Any] = js.native
  }
  object OpenAPIRequestValidatorError {
    
    @scala.inline
    def apply(errorCode: String, message: String): OpenAPIRequestValidatorError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPIRequestValidatorError]
    }
    
    @scala.inline
    implicit class OpenAPIRequestValidatorErrorMutableBuilder[Self <: OpenAPIRequestValidatorError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
