package typingsSlinky.expressValidator.schemaMod

import typingsSlinky.expressValidator.anon.`0`
import typingsSlinky.expressValidator.baseMod.DynamicMessageCreator
import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.baseMod.Meta
import typingsSlinky.expressValidator.expressValidatorBooleans.`true`
import typingsSlinky.expressValidator.expressValidatorStrings.blacklist
import typingsSlinky.expressValidator.expressValidatorStrings.contains
import typingsSlinky.expressValidator.expressValidatorStrings.custom
import typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer
import typingsSlinky.expressValidator.expressValidatorStrings.equals
import typingsSlinky.expressValidator.expressValidatorStrings.escape
import typingsSlinky.expressValidator.expressValidatorStrings.exists
import typingsSlinky.expressValidator.expressValidatorStrings.isAfter
import typingsSlinky.expressValidator.expressValidatorStrings.isAlpha
import typingsSlinky.expressValidator.expressValidatorStrings.isAlphanumeric
import typingsSlinky.expressValidator.expressValidatorStrings.isArray
import typingsSlinky.expressValidator.expressValidatorStrings.isAscii
import typingsSlinky.expressValidator.expressValidatorStrings.isBIC
import typingsSlinky.expressValidator.expressValidatorStrings.isBase32
import typingsSlinky.expressValidator.expressValidatorStrings.isBase64
import typingsSlinky.expressValidator.expressValidatorStrings.isBefore
import typingsSlinky.expressValidator.expressValidatorStrings.isBoolean
import typingsSlinky.expressValidator.expressValidatorStrings.isBtcAddress
import typingsSlinky.expressValidator.expressValidatorStrings.isByteLength
import typingsSlinky.expressValidator.expressValidatorStrings.isCreditCard
import typingsSlinky.expressValidator.expressValidatorStrings.isCurrency
import typingsSlinky.expressValidator.expressValidatorStrings.isDataURI
import typingsSlinky.expressValidator.expressValidatorStrings.isDate
import typingsSlinky.expressValidator.expressValidatorStrings.isDecimal
import typingsSlinky.expressValidator.expressValidatorStrings.isDivisibleBy
import typingsSlinky.expressValidator.expressValidatorStrings.isEAN
import typingsSlinky.expressValidator.expressValidatorStrings.isEmail
import typingsSlinky.expressValidator.expressValidatorStrings.isEmpty
import typingsSlinky.expressValidator.expressValidatorStrings.isEthereumAddress
import typingsSlinky.expressValidator.expressValidatorStrings.isFQDN
import typingsSlinky.expressValidator.expressValidatorStrings.isFloat
import typingsSlinky.expressValidator.expressValidatorStrings.isFullWidth
import typingsSlinky.expressValidator.expressValidatorStrings.isHSL
import typingsSlinky.expressValidator.expressValidatorStrings.isHalfWidth
import typingsSlinky.expressValidator.expressValidatorStrings.isHash
import typingsSlinky.expressValidator.expressValidatorStrings.isHexColor
import typingsSlinky.expressValidator.expressValidatorStrings.isHexadecimal
import typingsSlinky.expressValidator.expressValidatorStrings.isIBAN
import typingsSlinky.expressValidator.expressValidatorStrings.isIMEI
import typingsSlinky.expressValidator.expressValidatorStrings.isIP
import typingsSlinky.expressValidator.expressValidatorStrings.isIPRange
import typingsSlinky.expressValidator.expressValidatorStrings.isISBN
import typingsSlinky.expressValidator.expressValidatorStrings.isISIN
import typingsSlinky.expressValidator.expressValidatorStrings.isISO31661Alpha2
import typingsSlinky.expressValidator.expressValidatorStrings.isISO31661Alpha3
import typingsSlinky.expressValidator.expressValidatorStrings.isISO8601
import typingsSlinky.expressValidator.expressValidatorStrings.isISRC
import typingsSlinky.expressValidator.expressValidatorStrings.isISSN
import typingsSlinky.expressValidator.expressValidatorStrings.isIdentityCard
import typingsSlinky.expressValidator.expressValidatorStrings.isIn
import typingsSlinky.expressValidator.expressValidatorStrings.isInt
import typingsSlinky.expressValidator.expressValidatorStrings.isJSON
import typingsSlinky.expressValidator.expressValidatorStrings.isJWT
import typingsSlinky.expressValidator.expressValidatorStrings.isLatLong
import typingsSlinky.expressValidator.expressValidatorStrings.isLength
import typingsSlinky.expressValidator.expressValidatorStrings.isLocale
import typingsSlinky.expressValidator.expressValidatorStrings.isLowercase
import typingsSlinky.expressValidator.expressValidatorStrings.isMACAddress
import typingsSlinky.expressValidator.expressValidatorStrings.isMD5
import typingsSlinky.expressValidator.expressValidatorStrings.isMagnetURI
import typingsSlinky.expressValidator.expressValidatorStrings.isMimeType
import typingsSlinky.expressValidator.expressValidatorStrings.isMobilePhone
import typingsSlinky.expressValidator.expressValidatorStrings.isMongoId
import typingsSlinky.expressValidator.expressValidatorStrings.isMultibyte
import typingsSlinky.expressValidator.expressValidatorStrings.isNumeric
import typingsSlinky.expressValidator.expressValidatorStrings.isOctal
import typingsSlinky.expressValidator.expressValidatorStrings.isPassportNumber
import typingsSlinky.expressValidator.expressValidatorStrings.isPort
import typingsSlinky.expressValidator.expressValidatorStrings.isPostalCode
import typingsSlinky.expressValidator.expressValidatorStrings.isRFC3339
import typingsSlinky.expressValidator.expressValidatorStrings.isRgbColor
import typingsSlinky.expressValidator.expressValidatorStrings.isSemVer
import typingsSlinky.expressValidator.expressValidatorStrings.isSlug
import typingsSlinky.expressValidator.expressValidatorStrings.isString
import typingsSlinky.expressValidator.expressValidatorStrings.isSurrogatePair
import typingsSlinky.expressValidator.expressValidatorStrings.isTaxID
import typingsSlinky.expressValidator.expressValidatorStrings.isURL
import typingsSlinky.expressValidator.expressValidatorStrings.isUUID
import typingsSlinky.expressValidator.expressValidatorStrings.isUppercase
import typingsSlinky.expressValidator.expressValidatorStrings.isVariableWidth
import typingsSlinky.expressValidator.expressValidatorStrings.isWhitelisted
import typingsSlinky.expressValidator.expressValidatorStrings.ltrim
import typingsSlinky.expressValidator.expressValidatorStrings.matches
import typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail
import typingsSlinky.expressValidator.expressValidatorStrings.not
import typingsSlinky.expressValidator.expressValidatorStrings.notEmpty
import typingsSlinky.expressValidator.expressValidatorStrings.rtrim
import typingsSlinky.expressValidator.expressValidatorStrings.stripLow
import typingsSlinky.expressValidator.expressValidatorStrings.toArray
import typingsSlinky.expressValidator.expressValidatorStrings.toBoolean
import typingsSlinky.expressValidator.expressValidatorStrings.toDate
import typingsSlinky.expressValidator.expressValidatorStrings.toFloat
import typingsSlinky.expressValidator.expressValidatorStrings.toInt
import typingsSlinky.expressValidator.expressValidatorStrings.trim
import typingsSlinky.expressValidator.expressValidatorStrings.unescape
import typingsSlinky.expressValidator.expressValidatorStrings.whitelist
import typingsSlinky.expressValidator.expressValidatorStrings.withMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined express-validator.express-validator/src/middlewares/schema.ParamSchema */
@js.native
trait ValidationParamSchema extends js.Object {
  
  var blacklist: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.blacklist]
  ] = js.native
  
  var contains: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.contains]
  ] = js.native
  
  var custom: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.custom]
  ] = js.native
  
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer]
  ] = js.native
  
  @JSName("equals")
  var equals_FValidationParamSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.native
  
  var errorMessage: js.UndefOr[DynamicMessageCreator | js.Any] = js.native
  
  var escape: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.escape]
  ] = js.native
  
  var exists: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.exists]
  ] = js.native
  
  var in: js.UndefOr[Location | js.Array[Location]] = js.native
  
  var isAfter: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isAfter]
  ] = js.native
  
  var isAlpha: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isAlpha]
  ] = js.native
  
  var isAlphanumeric: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isAlphanumeric]
  ] = js.native
  
  var isArray: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isArray]
  ] = js.native
  
  var isAscii: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isAscii]
  ] = js.native
  
  var isBIC: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isBIC]
  ] = js.native
  
  var isBase32: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isBase32]
  ] = js.native
  
  var isBase64: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isBase64]
  ] = js.native
  
  var isBefore: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isBefore]
  ] = js.native
  
  var isBoolean: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isBoolean]
  ] = js.native
  
  var isBtcAddress: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isBtcAddress]
  ] = js.native
  
  var isByteLength: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isByteLength]
  ] = js.native
  
  var isCreditCard: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isCreditCard]
  ] = js.native
  
  var isCurrency: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isCurrency]
  ] = js.native
  
  var isDataURI: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isDataURI]
  ] = js.native
  
  var isDate: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isDate]
  ] = js.native
  
  var isDecimal: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isDecimal]
  ] = js.native
  
  var isDivisibleBy: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isDivisibleBy]
  ] = js.native
  
  var isEAN: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isEAN]
  ] = js.native
  
  var isEmail: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isEmail]
  ] = js.native
  
  var isEmpty: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isEmpty]
  ] = js.native
  
  var isEthereumAddress: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isEthereumAddress]
  ] = js.native
  
  var isFQDN: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isFQDN]
  ] = js.native
  
  var isFloat: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isFloat]
  ] = js.native
  
  var isFullWidth: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isFullWidth]
  ] = js.native
  
  var isHSL: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isHSL]
  ] = js.native
  
  var isHalfWidth: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isHalfWidth]
  ] = js.native
  
  var isHash: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isHash]
  ] = js.native
  
  var isHexColor: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isHexColor]
  ] = js.native
  
  var isHexadecimal: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isHexadecimal]
  ] = js.native
  
  var isIBAN: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isIBAN]
  ] = js.native
  
  var isIMEI: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isIMEI]
  ] = js.native
  
  var isIP: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isIP]
  ] = js.native
  
  var isIPRange: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isIPRange]
  ] = js.native
  
  var isISBN: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISBN]
  ] = js.native
  
  var isISIN: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISIN]
  ] = js.native
  
  var isISO31661Alpha2: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISO31661Alpha2]
  ] = js.native
  
  var isISO31661Alpha3: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISO31661Alpha3]
  ] = js.native
  
  var isISO8601: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISO8601]
  ] = js.native
  
  var isISRC: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISRC]
  ] = js.native
  
  var isISSN: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isISSN]
  ] = js.native
  
  var isIdentityCard: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isIdentityCard]
  ] = js.native
  
  var isIn: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isIn]
  ] = js.native
  
  var isInt: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isInt]
  ] = js.native
  
  var isJSON: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isJSON]
  ] = js.native
  
  var isJWT: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isJWT]
  ] = js.native
  
  var isLatLong: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isLatLong]
  ] = js.native
  
  var isLength: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isLength]
  ] = js.native
  
  var isLocale: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isLocale]
  ] = js.native
  
  var isLowercase: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isLowercase]
  ] = js.native
  
  var isMACAddress: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMACAddress]
  ] = js.native
  
  var isMD5: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMD5]
  ] = js.native
  
  var isMagnetURI: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMagnetURI]
  ] = js.native
  
  var isMimeType: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMimeType]
  ] = js.native
  
  var isMobilePhone: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMobilePhone]
  ] = js.native
  
  var isMongoId: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMongoId]
  ] = js.native
  
  var isMultibyte: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isMultibyte]
  ] = js.native
  
  var isNumeric: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isNumeric]
  ] = js.native
  
  var isOctal: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isOctal]
  ] = js.native
  
  var isPassportNumber: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isPassportNumber]
  ] = js.native
  
  var isPort: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isPort]
  ] = js.native
  
  var isPostalCode: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isPostalCode]
  ] = js.native
  
  var isRFC3339: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isRFC3339]
  ] = js.native
  
  var isRgbColor: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isRgbColor]
  ] = js.native
  
  var isSemVer: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isSemVer]
  ] = js.native
  
  var isSlug: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isSlug]
  ] = js.native
  
  var isString: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isString]
  ] = js.native
  
  var isSurrogatePair: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isSurrogatePair]
  ] = js.native
  
  var isTaxID: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isTaxID]
  ] = js.native
  
  var isURL: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isURL]
  ] = js.native
  
  var isUUID: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isUUID]
  ] = js.native
  
  var isUppercase: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isUppercase]
  ] = js.native
  
  var isVariableWidth: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isVariableWidth]
  ] = js.native
  
  var isWhitelisted: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isWhitelisted]
  ] = js.native
  
  var ltrim: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.ltrim]
  ] = js.native
  
  var matches: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.matches]
  ] = js.native
  
  var normalizeEmail: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail]
  ] = js.native
  
  var not: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.not]
  ] = js.native
  
  var notEmpty: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.notEmpty]
  ] = js.native
  
  var optional: js.UndefOr[`true` | `0`] = js.native
  
  var rtrim: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.rtrim]
  ] = js.native
  
  var stripLow: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.stripLow]
  ] = js.native
  
  var toArray: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toArray]
  ] = js.native
  
  var toBoolean: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toBoolean]
  ] = js.native
  
  var toDate: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toDate]
  ] = js.native
  
  var toFloat: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toFloat]
  ] = js.native
  
  var toInt: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toInt]
  ] = js.native
  
  var trim: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.trim]
  ] = js.native
  
  var unescape: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.unescape]
  ] = js.native
  
  var whitelist: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.whitelist]
  ] = js.native
  
  var withMessage: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.withMessage]
  ] = js.native
}
object ValidationParamSchema {
  
  @scala.inline
  def apply(): ValidationParamSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationParamSchema]
  }
  
  @scala.inline
  implicit class ValidationParamSchemaOps[Self <: ValidationParamSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setContains(value: ValidatorSchemaOptions[contains]): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setCustom(value: ValidatorSchemaOptions[custom]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = this.set("customSanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSanitizer: Self = this.set("customSanitizer", js.undefined)
    
    @scala.inline
    def setEquals(value: ValidatorSchemaOptions[equals]): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setErrorMessageFunction2(value: (/* value */ js.Any, /* meta */ Meta) => js.Any): Self = this.set("errorMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorMessage(value: DynamicMessageCreator | js.Any): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setEscape(value: SanitizerSchemaOptions[escape]): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setExists(value: ValidatorSchemaOptions[exists]): Self = this.set("exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExists: Self = this.set("exists", js.undefined)
    
    @scala.inline
    def setInVarargs(value: Location*): Self = this.set("in", js.Array(value :_*))
    
    @scala.inline
    def setIn(value: Location | js.Array[Location]): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = this.set("isAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAfter: Self = this.set("isAfter", js.undefined)
    
    @scala.inline
    def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = this.set("isAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlpha: Self = this.set("isAlpha", js.undefined)
    
    @scala.inline
    def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = this.set("isAlphanumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlphanumeric: Self = this.set("isAlphanumeric", js.undefined)
    
    @scala.inline
    def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = this.set("isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    
    @scala.inline
    def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = this.set("isAscii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAscii: Self = this.set("isAscii", js.undefined)
    
    @scala.inline
    def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = this.set("isBIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBIC: Self = this.set("isBIC", js.undefined)
    
    @scala.inline
    def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = this.set("isBase32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBase32: Self = this.set("isBase32", js.undefined)
    
    @scala.inline
    def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = this.set("isBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBase64: Self = this.set("isBase64", js.undefined)
    
    @scala.inline
    def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = this.set("isBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBefore: Self = this.set("isBefore", js.undefined)
    
    @scala.inline
    def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = this.set("isBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBoolean: Self = this.set("isBoolean", js.undefined)
    
    @scala.inline
    def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = this.set("isBtcAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBtcAddress: Self = this.set("isBtcAddress", js.undefined)
    
    @scala.inline
    def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = this.set("isByteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsByteLength: Self = this.set("isByteLength", js.undefined)
    
    @scala.inline
    def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = this.set("isCreditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCreditCard: Self = this.set("isCreditCard", js.undefined)
    
    @scala.inline
    def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = this.set("isCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCurrency: Self = this.set("isCurrency", js.undefined)
    
    @scala.inline
    def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = this.set("isDataURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDataURI: Self = this.set("isDataURI", js.undefined)
    
    @scala.inline
    def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = this.set("isDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDate: Self = this.set("isDate", js.undefined)
    
    @scala.inline
    def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = this.set("isDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDecimal: Self = this.set("isDecimal", js.undefined)
    
    @scala.inline
    def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = this.set("isDivisibleBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDivisibleBy: Self = this.set("isDivisibleBy", js.undefined)
    
    @scala.inline
    def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = this.set("isEAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEAN: Self = this.set("isEAN", js.undefined)
    
    @scala.inline
    def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = this.set("isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmail: Self = this.set("isEmail", js.undefined)
    
    @scala.inline
    def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmpty: Self = this.set("isEmpty", js.undefined)
    
    @scala.inline
    def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = this.set("isEthereumAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEthereumAddress: Self = this.set("isEthereumAddress", js.undefined)
    
    @scala.inline
    def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = this.set("isFQDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFQDN: Self = this.set("isFQDN", js.undefined)
    
    @scala.inline
    def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = this.set("isFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFloat: Self = this.set("isFloat", js.undefined)
    
    @scala.inline
    def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = this.set("isFullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFullWidth: Self = this.set("isFullWidth", js.undefined)
    
    @scala.inline
    def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = this.set("isHSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHSL: Self = this.set("isHSL", js.undefined)
    
    @scala.inline
    def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = this.set("isHalfWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHalfWidth: Self = this.set("isHalfWidth", js.undefined)
    
    @scala.inline
    def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = this.set("isHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHash: Self = this.set("isHash", js.undefined)
    
    @scala.inline
    def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = this.set("isHexColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHexColor: Self = this.set("isHexColor", js.undefined)
    
    @scala.inline
    def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = this.set("isHexadecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHexadecimal: Self = this.set("isHexadecimal", js.undefined)
    
    @scala.inline
    def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = this.set("isIBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIBAN: Self = this.set("isIBAN", js.undefined)
    
    @scala.inline
    def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = this.set("isIMEI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIMEI: Self = this.set("isIMEI", js.undefined)
    
    @scala.inline
    def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = this.set("isIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIP: Self = this.set("isIP", js.undefined)
    
    @scala.inline
    def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = this.set("isIPRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIPRange: Self = this.set("isIPRange", js.undefined)
    
    @scala.inline
    def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = this.set("isISBN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISBN: Self = this.set("isISBN", js.undefined)
    
    @scala.inline
    def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = this.set("isISIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISIN: Self = this.set("isISIN", js.undefined)
    
    @scala.inline
    def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = this.set("isISO31661Alpha2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISO31661Alpha2: Self = this.set("isISO31661Alpha2", js.undefined)
    
    @scala.inline
    def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = this.set("isISO31661Alpha3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISO31661Alpha3: Self = this.set("isISO31661Alpha3", js.undefined)
    
    @scala.inline
    def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = this.set("isISO8601", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISO8601: Self = this.set("isISO8601", js.undefined)
    
    @scala.inline
    def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = this.set("isISRC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISRC: Self = this.set("isISRC", js.undefined)
    
    @scala.inline
    def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = this.set("isISSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsISSN: Self = this.set("isISSN", js.undefined)
    
    @scala.inline
    def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = this.set("isIdentityCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIdentityCard: Self = this.set("isIdentityCard", js.undefined)
    
    @scala.inline
    def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = this.set("isIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIn: Self = this.set("isIn", js.undefined)
    
    @scala.inline
    def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = this.set("isInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInt: Self = this.set("isInt", js.undefined)
    
    @scala.inline
    def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = this.set("isJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsJSON: Self = this.set("isJSON", js.undefined)
    
    @scala.inline
    def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = this.set("isJWT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsJWT: Self = this.set("isJWT", js.undefined)
    
    @scala.inline
    def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = this.set("isLatLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLatLong: Self = this.set("isLatLong", js.undefined)
    
    @scala.inline
    def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = this.set("isLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLength: Self = this.set("isLength", js.undefined)
    
    @scala.inline
    def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = this.set("isLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocale: Self = this.set("isLocale", js.undefined)
    
    @scala.inline
    def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = this.set("isLowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLowercase: Self = this.set("isLowercase", js.undefined)
    
    @scala.inline
    def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = this.set("isMACAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMACAddress: Self = this.set("isMACAddress", js.undefined)
    
    @scala.inline
    def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = this.set("isMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMD5: Self = this.set("isMD5", js.undefined)
    
    @scala.inline
    def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = this.set("isMagnetURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMagnetURI: Self = this.set("isMagnetURI", js.undefined)
    
    @scala.inline
    def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = this.set("isMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMimeType: Self = this.set("isMimeType", js.undefined)
    
    @scala.inline
    def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = this.set("isMobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobilePhone: Self = this.set("isMobilePhone", js.undefined)
    
    @scala.inline
    def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = this.set("isMongoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMongoId: Self = this.set("isMongoId", js.undefined)
    
    @scala.inline
    def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = this.set("isMultibyte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultibyte: Self = this.set("isMultibyte", js.undefined)
    
    @scala.inline
    def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = this.set("isNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNumeric: Self = this.set("isNumeric", js.undefined)
    
    @scala.inline
    def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = this.set("isOctal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOctal: Self = this.set("isOctal", js.undefined)
    
    @scala.inline
    def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = this.set("isPassportNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPassportNumber: Self = this.set("isPassportNumber", js.undefined)
    
    @scala.inline
    def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = this.set("isPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPort: Self = this.set("isPort", js.undefined)
    
    @scala.inline
    def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = this.set("isPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPostalCode: Self = this.set("isPostalCode", js.undefined)
    
    @scala.inline
    def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = this.set("isRFC3339", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRFC3339: Self = this.set("isRFC3339", js.undefined)
    
    @scala.inline
    def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = this.set("isRgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRgbColor: Self = this.set("isRgbColor", js.undefined)
    
    @scala.inline
    def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = this.set("isSemVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSemVer: Self = this.set("isSemVer", js.undefined)
    
    @scala.inline
    def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = this.set("isSlug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSlug: Self = this.set("isSlug", js.undefined)
    
    @scala.inline
    def setIsString(value: ValidatorSchemaOptions[isString]): Self = this.set("isString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsString: Self = this.set("isString", js.undefined)
    
    @scala.inline
    def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = this.set("isSurrogatePair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSurrogatePair: Self = this.set("isSurrogatePair", js.undefined)
    
    @scala.inline
    def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = this.set("isTaxID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTaxID: Self = this.set("isTaxID", js.undefined)
    
    @scala.inline
    def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = this.set("isURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsURL: Self = this.set("isURL", js.undefined)
    
    @scala.inline
    def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = this.set("isUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUUID: Self = this.set("isUUID", js.undefined)
    
    @scala.inline
    def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = this.set("isUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUppercase: Self = this.set("isUppercase", js.undefined)
    
    @scala.inline
    def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = this.set("isVariableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVariableWidth: Self = this.set("isVariableWidth", js.undefined)
    
    @scala.inline
    def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = this.set("isWhitelisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWhitelisted: Self = this.set("isWhitelisted", js.undefined)
    
    @scala.inline
    def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = this.set("ltrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtrim: Self = this.set("ltrim", js.undefined)
    
    @scala.inline
    def setMatches(value: ValidatorSchemaOptions[matches]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    
    @scala.inline
    def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = this.set("normalizeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeEmail: Self = this.set("normalizeEmail", js.undefined)
    
    @scala.inline
    def setNot(value: ValidatorSchemaOptions[not]): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = this.set("notEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotEmpty: Self = this.set("notEmpty", js.undefined)
    
    @scala.inline
    def setOptional(value: `true` | `0`): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = this.set("rtrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtrim: Self = this.set("rtrim", js.undefined)
    
    @scala.inline
    def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = this.set("stripLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripLow: Self = this.set("stripLow", js.undefined)
    
    @scala.inline
    def setToArray(value: SanitizerSchemaOptions[toArray]): Self = this.set("toArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToArray: Self = this.set("toArray", js.undefined)
    
    @scala.inline
    def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = this.set("toBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToBoolean: Self = this.set("toBoolean", js.undefined)
    
    @scala.inline
    def setToDate(value: SanitizerSchemaOptions[toDate]): Self = this.set("toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDate: Self = this.set("toDate", js.undefined)
    
    @scala.inline
    def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = this.set("toFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToFloat: Self = this.set("toFloat", js.undefined)
    
    @scala.inline
    def setToInt(value: SanitizerSchemaOptions[toInt]): Self = this.set("toInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToInt: Self = this.set("toInt", js.undefined)
    
    @scala.inline
    def setTrim(value: SanitizerSchemaOptions[trim]): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = this.set("unescape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnescape: Self = this.set("unescape", js.undefined)
    
    @scala.inline
    def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
    
    @scala.inline
    def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = this.set("withMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithMessage: Self = this.set("withMessage", js.undefined)
  }
}
