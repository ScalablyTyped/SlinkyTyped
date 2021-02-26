package typingsSlinky.amphtmlValidator

import typingsSlinky.node.vmMod.Context
import typingsSlinky.node.vmMod.Script
import typingsSlinky.node.vmMod.ScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amphtml-validator", "Validator")
  @js.native
  class Validator protected () extends Script {
    def this(code: String) = this()
    def this(code: String, options: ScriptOptions) = this()
    
    var sandbox: Context = js.native
    
    def validateString(stringToValidate: String): ValidationResult = js.native
    def validateString(stringToValidate: String, htmlFormat: String): ValidationResult = js.native
  }
  
  @JSImport("amphtml-validator", "getInstance")
  @js.native
  def getInstance(): js.Promise[Validator] = js.native
  @JSImport("amphtml-validator", "getInstance")
  @js.native
  def getInstance(validatorJs: js.UndefOr[scala.Nothing], userAgent: String): js.Promise[Validator] = js.native
  @JSImport("amphtml-validator", "getInstance")
  @js.native
  def getInstance(validatorJs: String): js.Promise[Validator] = js.native
  @JSImport("amphtml-validator", "getInstance")
  @js.native
  def getInstance(validatorJs: String, userAgent: String): js.Promise[Validator] = js.native
  
  @JSImport("amphtml-validator", "newInstance")
  @js.native
  def newInstance(validatorJsContents: String): Validator = js.native
  
  @js.native
  trait ValidationError extends StObject {
    
    var code: ValidationErrorCode = js.native
    
    var col: Double = js.native
    
    var line: Double = js.native
    
    var message: String = js.native
    
    var params: js.Array[String] = js.native
    
    var severity: ValidationErrorSeverity = js.native
    
    var specUrl: String | Null = js.native
  }
  object ValidationError {
    
    @scala.inline
    def apply(
      code: ValidationErrorCode,
      col: Double,
      line: Double,
      message: String,
      params: js.Array[String],
      severity: ValidationErrorSeverity
    ): ValidationError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: ValidationErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
      
      @scala.inline
      def setSeverity(value: ValidationErrorSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUrl(value: String): Self = StObject.set(x, "specUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUrlNull: Self = StObject.set(x, "specUrl", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_CODE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_REQUIRED_BY_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_EXCLUDED_BY_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_UNUSED
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.EXTENSION_UNUSED
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_REQUIRED_BUT_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.GENERAL_DISALLOWED_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_SCRIPT_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_ATTR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_STYLE_ATTR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_ATTR_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_ATTRIBUTE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_LAYOUT_ATTRIBUTES
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.IMPLIED_LAYOUT_INVALID
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.SPECIFIED_LAYOUT_INVALID
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ATTR_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ANYOF_ATTR_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_DIMENSION
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WRONG_PARENT_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_TOO_LONG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_AND_INLINE_STYLE_TOO_LONG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INLINE_STYLE_TOO_LONG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CDATA_VIOLATES_BLACKLIST
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_JSON_CDATA
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_ATTR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL_PROTOCOL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_DOMAIN
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_RELATIVE_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_IN_ATTR_NAME
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG_ANCESTOR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_LAST_CHILD_TAG
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_NUM_CHILD_TAGS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_CHILD_TAG_NAME
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_MANUFACTURED_BODY
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_REFERENCE_POINT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_REFERENCE_POINT_CONFLICT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_REQUIRED_EXTENSION
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_TOO_COMPLEX
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_UTF8
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_SIZE_LIMIT_EXCEEDED
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEV_MODE_ONLY
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.VALUE_SET_MISMATCH
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_BAD_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_EXCESSIVELY_NESTED
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION
  */
  trait ValidationErrorCode extends StObject
  object ValidationErrorCode {
    
    @scala.inline
    def ATTR_DISALLOWED_BY_IMPLIED_LAYOUT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT = "ATTR_DISALLOWED_BY_IMPLIED_LAYOUT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT]
    
    @scala.inline
    def ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT = "ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT]
    
    @scala.inline
    def ATTR_MISSING_REQUIRED_EXTENSION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION = "ATTR_MISSING_REQUIRED_EXTENSION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION]
    
    @scala.inline
    def ATTR_REQUIRED_BUT_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_REQUIRED_BUT_MISSING = "ATTR_REQUIRED_BUT_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_REQUIRED_BUT_MISSING]
    
    @scala.inline
    def ATTR_VALUE_REQUIRED_BY_LAYOUT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT = "ATTR_VALUE_REQUIRED_BY_LAYOUT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT]
    
    @scala.inline
    def BASE_TAG_MUST_PRECEED_ALL_URLS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS = "BASE_TAG_MUST_PRECEED_ALL_URLS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS]
    
    @scala.inline
    def CDATA_VIOLATES_BLACKLIST: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CDATA_VIOLATES_BLACKLIST = "CDATA_VIOLATES_BLACKLIST".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CDATA_VIOLATES_BLACKLIST]
    
    @scala.inline
    def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT = "CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT]
    
    @scala.inline
    def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR = "CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR]
    
    @scala.inline
    def CSS_EXCESSIVELY_NESTED: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_EXCESSIVELY_NESTED = "CSS_EXCESSIVELY_NESTED".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_EXCESSIVELY_NESTED]
    
    @scala.inline
    def CSS_SYNTAX_BAD_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_BAD_URL = "CSS_SYNTAX_BAD_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_BAD_URL]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_DOMAIN: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN = "CSS_SYNTAX_DISALLOWED_DOMAIN".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME = "CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE = "CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_MEDIA_TYPE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE = "CSS_SYNTAX_DISALLOWED_MEDIA_TYPE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE = "CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT = "CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME = "CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME]
    
    @scala.inline
    def CSS_SYNTAX_DISALLOWED_RELATIVE_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL = "CSS_SYNTAX_DISALLOWED_RELATIVE_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL]
    
    @scala.inline
    def CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE = "CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE]
    
    @scala.inline
    def CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR = "CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR]
    
    @scala.inline
    def CSS_SYNTAX_INCOMPLETE_DECLARATION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION = "CSS_SYNTAX_INCOMPLETE_DECLARATION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_ATTR_SELECTOR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR = "CSS_SYNTAX_INVALID_ATTR_SELECTOR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_AT_RULE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE = "CSS_SYNTAX_INVALID_AT_RULE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_DECLARATION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION = "CSS_SYNTAX_INVALID_DECLARATION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_PROPERTY: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY = "CSS_SYNTAX_INVALID_PROPERTY".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_PROPERTY_NOLIST: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST = "CSS_SYNTAX_INVALID_PROPERTY_NOLIST".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL = "CSS_SYNTAX_INVALID_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL]
    
    @scala.inline
    def CSS_SYNTAX_INVALID_URL_PROTOCOL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL = "CSS_SYNTAX_INVALID_URL_PROTOCOL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL]
    
    @scala.inline
    def CSS_SYNTAX_MALFORMED_MEDIA_QUERY: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY = "CSS_SYNTAX_MALFORMED_MEDIA_QUERY".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY]
    
    @scala.inline
    def CSS_SYNTAX_MISSING_SELECTOR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR = "CSS_SYNTAX_MISSING_SELECTOR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR]
    
    @scala.inline
    def CSS_SYNTAX_MISSING_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_URL = "CSS_SYNTAX_MISSING_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_URL]
    
    @scala.inline
    def CSS_SYNTAX_NOT_A_SELECTOR_START: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START = "CSS_SYNTAX_NOT_A_SELECTOR_START".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START]
    
    @scala.inline
    def CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH = "CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH]
    
    @scala.inline
    def CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE = "CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE]
    
    @scala.inline
    def CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION = "CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION]
    
    @scala.inline
    def CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS = "CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS]
    
    @scala.inline
    def CSS_SYNTAX_STRAY_TRAILING_BACKSLASH: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH = "CSS_SYNTAX_STRAY_TRAILING_BACKSLASH".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH]
    
    @scala.inline
    def CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR = "CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR]
    
    @scala.inline
    def CSS_SYNTAX_UNTERMINATED_COMMENT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT = "CSS_SYNTAX_UNTERMINATED_COMMENT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT]
    
    @scala.inline
    def CSS_SYNTAX_UNTERMINATED_STRING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING = "CSS_SYNTAX_UNTERMINATED_STRING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING]
    
    @scala.inline
    def DEPRECATED_ATTR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_ATTR = "DEPRECATED_ATTR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_ATTR]
    
    @scala.inline
    def DEPRECATED_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_TAG = "DEPRECATED_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_TAG]
    
    @scala.inline
    def DEV_MODE_ONLY: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEV_MODE_ONLY = "DEV_MODE_ONLY".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DEV_MODE_ONLY]
    
    @scala.inline
    def DISALLOWED_ATTR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_ATTR = "DISALLOWED_ATTR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_ATTR]
    
    @scala.inline
    def DISALLOWED_CHILD_TAG_NAME: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_CHILD_TAG_NAME = "DISALLOWED_CHILD_TAG_NAME".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_CHILD_TAG_NAME]
    
    @scala.inline
    def DISALLOWED_DOMAIN: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_DOMAIN = "DISALLOWED_DOMAIN".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_DOMAIN]
    
    @scala.inline
    def DISALLOWED_FIRST_CHILD_TAG_NAME: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME = "DISALLOWED_FIRST_CHILD_TAG_NAME".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME]
    
    @scala.inline
    def DISALLOWED_MANUFACTURED_BODY: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_MANUFACTURED_BODY = "DISALLOWED_MANUFACTURED_BODY".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_MANUFACTURED_BODY]
    
    @scala.inline
    def DISALLOWED_PROPERTY_IN_ATTR_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE = "DISALLOWED_PROPERTY_IN_ATTR_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE]
    
    @scala.inline
    def DISALLOWED_RELATIVE_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_RELATIVE_URL = "DISALLOWED_RELATIVE_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_RELATIVE_URL]
    
    @scala.inline
    def DISALLOWED_SCRIPT_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_SCRIPT_TAG = "DISALLOWED_SCRIPT_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_SCRIPT_TAG]
    
    @scala.inline
    def DISALLOWED_STYLE_ATTR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_STYLE_ATTR = "DISALLOWED_STYLE_ATTR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_STYLE_ATTR]
    
    @scala.inline
    def DISALLOWED_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG = "DISALLOWED_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG]
    
    @scala.inline
    def DISALLOWED_TAG_ANCESTOR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG_ANCESTOR = "DISALLOWED_TAG_ANCESTOR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG_ANCESTOR]
    
    @scala.inline
    def DOCUMENT_SIZE_LIMIT_EXCEEDED: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_SIZE_LIMIT_EXCEEDED = "DOCUMENT_SIZE_LIMIT_EXCEEDED".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_SIZE_LIMIT_EXCEEDED]
    
    @scala.inline
    def DOCUMENT_TOO_COMPLEX: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_TOO_COMPLEX = "DOCUMENT_TOO_COMPLEX".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_TOO_COMPLEX]
    
    @scala.inline
    def DUPLICATE_ATTRIBUTE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_ATTRIBUTE = "DUPLICATE_ATTRIBUTE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_ATTRIBUTE]
    
    @scala.inline
    def DUPLICATE_DIMENSION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_DIMENSION = "DUPLICATE_DIMENSION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_DIMENSION]
    
    @scala.inline
    def DUPLICATE_REFERENCE_POINT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_REFERENCE_POINT = "DUPLICATE_REFERENCE_POINT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_REFERENCE_POINT]
    
    @scala.inline
    def DUPLICATE_UNIQUE_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG = "DUPLICATE_UNIQUE_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG]
    
    @scala.inline
    def DUPLICATE_UNIQUE_TAG_WARNING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING = "DUPLICATE_UNIQUE_TAG_WARNING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING]
    
    @scala.inline
    def EXTENSION_UNUSED: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.EXTENSION_UNUSED = "EXTENSION_UNUSED".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.EXTENSION_UNUSED]
    
    @scala.inline
    def GENERAL_DISALLOWED_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.GENERAL_DISALLOWED_TAG = "GENERAL_DISALLOWED_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.GENERAL_DISALLOWED_TAG]
    
    @scala.inline
    def IMPLIED_LAYOUT_INVALID: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.IMPLIED_LAYOUT_INVALID = "IMPLIED_LAYOUT_INVALID".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.IMPLIED_LAYOUT_INVALID]
    
    @scala.inline
    def INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT = "INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT]
    
    @scala.inline
    def INCORRECT_MIN_NUM_CHILD_TAGS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS = "INCORRECT_MIN_NUM_CHILD_TAGS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS]
    
    @scala.inline
    def INCORRECT_NUM_CHILD_TAGS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_NUM_CHILD_TAGS = "INCORRECT_NUM_CHILD_TAGS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_NUM_CHILD_TAGS]
    
    @scala.inline
    def INLINE_STYLE_TOO_LONG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INLINE_STYLE_TOO_LONG = "INLINE_STYLE_TOO_LONG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INLINE_STYLE_TOO_LONG]
    
    @scala.inline
    def INVALID_ATTR_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_ATTR_VALUE = "INVALID_ATTR_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_ATTR_VALUE]
    
    @scala.inline
    def INVALID_JSON_CDATA: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_JSON_CDATA = "INVALID_JSON_CDATA".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_JSON_CDATA]
    
    @scala.inline
    def INVALID_PROPERTY_VALUE_IN_ATTR_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE = "INVALID_PROPERTY_VALUE_IN_ATTR_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE]
    
    @scala.inline
    def INVALID_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL = "INVALID_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL]
    
    @scala.inline
    def INVALID_URL_PROTOCOL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL_PROTOCOL = "INVALID_URL_PROTOCOL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL_PROTOCOL]
    
    @scala.inline
    def INVALID_UTF8: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_UTF8 = "INVALID_UTF8".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.INVALID_UTF8]
    
    @scala.inline
    def MANDATORY_ANYOF_ATTR_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ANYOF_ATTR_MISSING = "MANDATORY_ANYOF_ATTR_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ANYOF_ATTR_MISSING]
    
    @scala.inline
    def MANDATORY_ATTR_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ATTR_MISSING = "MANDATORY_ATTR_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ATTR_MISSING]
    
    @scala.inline
    def MANDATORY_CDATA_MISSING_OR_INCORRECT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT = "MANDATORY_CDATA_MISSING_OR_INCORRECT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT]
    
    @scala.inline
    def MANDATORY_LAST_CHILD_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_LAST_CHILD_TAG = "MANDATORY_LAST_CHILD_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_LAST_CHILD_TAG]
    
    @scala.inline
    def MANDATORY_ONEOF_ATTR_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING = "MANDATORY_ONEOF_ATTR_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING]
    
    @scala.inline
    def MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE = "MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE]
    
    @scala.inline
    def MANDATORY_REFERENCE_POINT_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING = "MANDATORY_REFERENCE_POINT_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING]
    
    @scala.inline
    def MANDATORY_TAG_ANCESTOR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR = "MANDATORY_TAG_ANCESTOR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR]
    
    @scala.inline
    def MANDATORY_TAG_ANCESTOR_WITH_HINT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT = "MANDATORY_TAG_ANCESTOR_WITH_HINT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT]
    
    @scala.inline
    def MANDATORY_TAG_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_MISSING = "MANDATORY_TAG_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_MISSING]
    
    @scala.inline
    def MISSING_LAYOUT_ATTRIBUTES: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_LAYOUT_ATTRIBUTES = "MISSING_LAYOUT_ATTRIBUTES".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_LAYOUT_ATTRIBUTES]
    
    @scala.inline
    def MISSING_REQUIRED_EXTENSION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_REQUIRED_EXTENSION = "MISSING_REQUIRED_EXTENSION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_REQUIRED_EXTENSION]
    
    @scala.inline
    def MISSING_URL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_URL = "MISSING_URL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MISSING_URL]
    
    @scala.inline
    def MUTUALLY_EXCLUSIVE_ATTRS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS = "MUTUALLY_EXCLUSIVE_ATTRS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS]
    
    @scala.inline
    def NON_WHITESPACE_CDATA_ENCOUNTERED: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED = "NON_WHITESPACE_CDATA_ENCOUNTERED".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED]
    
    @scala.inline
    def SPECIFIED_LAYOUT_INVALID: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.SPECIFIED_LAYOUT_INVALID = "SPECIFIED_LAYOUT_INVALID".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.SPECIFIED_LAYOUT_INVALID]
    
    @scala.inline
    def STYLESHEET_AND_INLINE_STYLE_TOO_LONG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_AND_INLINE_STYLE_TOO_LONG = "STYLESHEET_AND_INLINE_STYLE_TOO_LONG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_AND_INLINE_STYLE_TOO_LONG]
    
    @scala.inline
    def STYLESHEET_TOO_LONG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_TOO_LONG = "STYLESHEET_TOO_LONG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_TOO_LONG]
    
    @scala.inline
    def TAG_EXCLUDED_BY_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_EXCLUDED_BY_TAG = "TAG_EXCLUDED_BY_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_EXCLUDED_BY_TAG]
    
    @scala.inline
    def TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS = "TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS]
    
    @scala.inline
    def TAG_REFERENCE_POINT_CONFLICT: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_REFERENCE_POINT_CONFLICT = "TAG_REFERENCE_POINT_CONFLICT".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_REFERENCE_POINT_CONFLICT]
    
    @scala.inline
    def TAG_REQUIRED_BY_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_REQUIRED_BY_MISSING = "TAG_REQUIRED_BY_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TAG_REQUIRED_BY_MISSING]
    
    @scala.inline
    def TEMPLATE_IN_ATTR_NAME: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_IN_ATTR_NAME = "TEMPLATE_IN_ATTR_NAME".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_IN_ATTR_NAME]
    
    @scala.inline
    def TEMPLATE_PARTIAL_IN_ATTR_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE = "TEMPLATE_PARTIAL_IN_ATTR_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE]
    
    @scala.inline
    def UNESCAPED_TEMPLATE_IN_ATTR_VALUE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE = "UNESCAPED_TEMPLATE_IN_ATTR_VALUE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE]
    
    @scala.inline
    def UNKNOWN_CODE: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_CODE = "UNKNOWN_CODE".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_CODE]
    
    @scala.inline
    def VALUE_SET_MISMATCH: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.VALUE_SET_MISMATCH = "VALUE_SET_MISMATCH".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.VALUE_SET_MISMATCH]
    
    @scala.inline
    def WARNING_EXTENSION_DEPRECATED_VERSION: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION = "WARNING_EXTENSION_DEPRECATED_VERSION".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION]
    
    @scala.inline
    def WARNING_EXTENSION_UNUSED: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_UNUSED = "WARNING_EXTENSION_UNUSED".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_UNUSED]
    
    @scala.inline
    def WARNING_TAG_REQUIRED_BY_MISSING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING = "WARNING_TAG_REQUIRED_BY_MISSING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING]
    
    @scala.inline
    def WRONG_PARENT_TAG: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WRONG_PARENT_TAG = "WRONG_PARENT_TAG".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WRONG_PARENT_TAG]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ERROR
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING
  */
  trait ValidationErrorSeverity extends StObject
  object ValidationErrorSeverity {
    
    @scala.inline
    def ERROR: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.ERROR]
    
    @scala.inline
    def UNKNOWN_SEVERITY: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY = "UNKNOWN_SEVERITY".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY]
    
    @scala.inline
    def WARNING: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING = "WARNING".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.WARNING]
  }
  
  @js.native
  trait ValidationResult extends StObject {
    
    var errors: js.Array[ValidationError] = js.native
    
    var status: ValidationResultStatus = js.native
  }
  object ValidationResult {
    
    @scala.inline
    def apply(errors: js.Array[ValidationError], status: ValidationResultStatus): ValidationResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    @scala.inline
    implicit class ValidationResultMutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: ValidationResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.PASS
    - typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.FAIL
  */
  trait ValidationResultStatus extends StObject
  object ValidationResultStatus {
    
    @scala.inline
    def FAIL: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.FAIL = "FAIL".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.FAIL]
    
    @scala.inline
    def PASS: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.PASS = "PASS".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.PASS]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN]
  }
}
