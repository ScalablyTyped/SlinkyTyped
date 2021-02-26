package typingsSlinky.expressValidator

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
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("express-validator/src/middlewares/schema", "checkSchema")
  @js.native
  def checkSchema(schema: Schema): js.Array[ValidationChain] = js.native
  @JSImport("express-validator/src/middlewares/schema", "checkSchema")
  @js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
  
  /* Inlined express-validator.express-validator/src/middlewares/schema.ValidatorsSchema & express-validator.express-validator/src/middlewares/schema.SanitizersSchema */
  @js.native
  trait InternalParamSchema extends StObject {
    
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
    var equals_FInternalParamSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.native
    
    var escape: js.UndefOr[
        SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.escape]
      ] = js.native
    
    var exists: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.exists]
      ] = js.native
    
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
  object InternalParamSchema {
    
    @scala.inline
    def apply(): InternalParamSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalParamSchema]
    }
    
    @scala.inline
    implicit class InternalParamSchemaMutableBuilder[Self <: InternalParamSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      @scala.inline
      def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      @scala.inline
      def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      @scala.inline
      def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      @scala.inline
      def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      @scala.inline
      def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      @scala.inline
      def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      @scala.inline
      def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      @scala.inline
      def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      @scala.inline
      def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      @scala.inline
      def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      @scala.inline
      def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      @scala.inline
      def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      @scala.inline
      def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      @scala.inline
      def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      @scala.inline
      def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      @scala.inline
      def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      @scala.inline
      def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      @scala.inline
      def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      @scala.inline
      def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      @scala.inline
      def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      @scala.inline
      def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      @scala.inline
      def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      @scala.inline
      def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      @scala.inline
      def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      @scala.inline
      def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      @scala.inline
      def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      @scala.inline
      def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      @scala.inline
      def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      @scala.inline
      def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      @scala.inline
      def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      @scala.inline
      def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      @scala.inline
      def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      @scala.inline
      def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      @scala.inline
      def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      @scala.inline
      def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      @scala.inline
      def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      @scala.inline
      def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      @scala.inline
      def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      @scala.inline
      def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      @scala.inline
      def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      @scala.inline
      def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      @scala.inline
      def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      @scala.inline
      def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      @scala.inline
      def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      @scala.inline
      def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      @scala.inline
      def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      @scala.inline
      def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      @scala.inline
      def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      @scala.inline
      def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      @scala.inline
      def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      @scala.inline
      def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      @scala.inline
      def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      @scala.inline
      def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      @scala.inline
      def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      @scala.inline
      def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      @scala.inline
      def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      @scala.inline
      def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      @scala.inline
      def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      @scala.inline
      def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      @scala.inline
      def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      @scala.inline
      def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      @scala.inline
      def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      @scala.inline
      def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      @scala.inline
      def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      @scala.inline
      def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      @scala.inline
      def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      @scala.inline
      def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      @scala.inline
      def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      @scala.inline
      def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      @scala.inline
      def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      @scala.inline
      def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      @scala.inline
      def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      @scala.inline
      def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      @scala.inline
      def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      @scala.inline
      def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      @scala.inline
      def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      @scala.inline
      def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      @scala.inline
      def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      @scala.inline
      def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      @scala.inline
      def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
  
  /* Inlined express-validator.express-validator/src/middlewares/schema.InternalParamSchema & {  in :express-validator.express-validator/src/base.Location | std.Array<express-validator.express-validator/src/base.Location> | undefined,   errorMessage :express-validator.express-validator/src/base.DynamicMessageCreator | any | undefined,   optional :true | {  options :std.Partial<express-validator.express-validator/src/context.Optional> | undefined} | undefined} */
  @js.native
  trait ParamSchema extends StObject {
    
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
    var equals_FParamSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.native
    
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
  object ParamSchema {
    
    @scala.inline
    def apply(): ParamSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParamSchema]
    }
    
    @scala.inline
    implicit class ParamSchemaMutableBuilder[Self <: ParamSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: DynamicMessageCreator | js.Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageFunction2(value: (/* value */ js.Any, /* meta */ Meta) => js.Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setIn(value: Location | js.Array[Location]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setInVarargs(value: Location*): Self = StObject.set(x, "in", js.Array(value :_*))
      
      @scala.inline
      def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      @scala.inline
      def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      @scala.inline
      def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      @scala.inline
      def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      @scala.inline
      def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      @scala.inline
      def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      @scala.inline
      def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      @scala.inline
      def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      @scala.inline
      def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      @scala.inline
      def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      @scala.inline
      def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      @scala.inline
      def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      @scala.inline
      def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      @scala.inline
      def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      @scala.inline
      def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      @scala.inline
      def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      @scala.inline
      def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      @scala.inline
      def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      @scala.inline
      def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      @scala.inline
      def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      @scala.inline
      def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      @scala.inline
      def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      @scala.inline
      def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      @scala.inline
      def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      @scala.inline
      def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      @scala.inline
      def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      @scala.inline
      def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      @scala.inline
      def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      @scala.inline
      def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      @scala.inline
      def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      @scala.inline
      def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      @scala.inline
      def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      @scala.inline
      def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      @scala.inline
      def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      @scala.inline
      def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      @scala.inline
      def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      @scala.inline
      def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      @scala.inline
      def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      @scala.inline
      def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      @scala.inline
      def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      @scala.inline
      def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      @scala.inline
      def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      @scala.inline
      def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      @scala.inline
      def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      @scala.inline
      def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      @scala.inline
      def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      @scala.inline
      def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      @scala.inline
      def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      @scala.inline
      def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      @scala.inline
      def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      @scala.inline
      def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      @scala.inline
      def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      @scala.inline
      def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      @scala.inline
      def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      @scala.inline
      def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      @scala.inline
      def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      @scala.inline
      def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      @scala.inline
      def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      @scala.inline
      def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      @scala.inline
      def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      @scala.inline
      def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      @scala.inline
      def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      @scala.inline
      def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      @scala.inline
      def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      @scala.inline
      def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      @scala.inline
      def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      @scala.inline
      def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      @scala.inline
      def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      @scala.inline
      def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      @scala.inline
      def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      @scala.inline
      def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      @scala.inline
      def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      @scala.inline
      def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      @scala.inline
      def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      @scala.inline
      def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOptional(value: `true` | `0`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      @scala.inline
      def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      @scala.inline
      def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      @scala.inline
      def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      @scala.inline
      def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      @scala.inline
      def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      @scala.inline
      def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressValidator.expressValidatorBooleans.`true`
    - typingsSlinky.expressValidator.anon.Options[K]
  */
  trait SanitizerSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */] extends StObject
  
  /* Inlined {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>} */
  @js.native
  trait SanitizersSchema extends StObject {
    
    var blacklist: js.UndefOr[
        SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.blacklist]
      ] = js.native
    
    var customSanitizer: js.UndefOr[
        SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer]
      ] = js.native
    
    var escape: js.UndefOr[
        SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.escape]
      ] = js.native
    
    var ltrim: js.UndefOr[
        SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.ltrim]
      ] = js.native
    
    var normalizeEmail: js.UndefOr[
        SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail]
      ] = js.native
    
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
  }
  object SanitizersSchema {
    
    @scala.inline
    def apply(): SanitizersSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SanitizersSchema]
    }
    
    @scala.inline
    implicit class SanitizersSchemaMutableBuilder[Self <: SanitizersSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      @scala.inline
      def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      @scala.inline
      def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      @scala.inline
      def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      @scala.inline
      def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      @scala.inline
      def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      @scala.inline
      def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      @scala.inline
      def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      @scala.inline
      def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    }
  }
  
  type Schema = Record[String, ParamSchema]
  
  /* Inlined express-validator.express-validator/src/middlewares/schema.ParamSchema */
  @js.native
  trait ValidationParamSchema extends StObject {
    
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
    implicit class ValidationParamSchemaMutableBuilder[Self <: ValidationParamSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = StObject.set(x, "customSanitizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSanitizerUndefined: Self = StObject.set(x, "customSanitizer", js.undefined)
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: DynamicMessageCreator | js.Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageFunction2(value: (/* value */ js.Any, /* meta */ Meta) => js.Any): Self = StObject.set(x, "errorMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setEscape(value: SanitizerSchemaOptions[escape]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setIn(value: Location | js.Array[Location]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setInVarargs(value: Location*): Self = StObject.set(x, "in", js.Array(value :_*))
      
      @scala.inline
      def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      @scala.inline
      def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      @scala.inline
      def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      @scala.inline
      def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      @scala.inline
      def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      @scala.inline
      def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      @scala.inline
      def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      @scala.inline
      def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      @scala.inline
      def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      @scala.inline
      def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      @scala.inline
      def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      @scala.inline
      def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      @scala.inline
      def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      @scala.inline
      def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      @scala.inline
      def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      @scala.inline
      def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      @scala.inline
      def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      @scala.inline
      def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      @scala.inline
      def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      @scala.inline
      def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      @scala.inline
      def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      @scala.inline
      def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      @scala.inline
      def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      @scala.inline
      def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      @scala.inline
      def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      @scala.inline
      def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      @scala.inline
      def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      @scala.inline
      def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      @scala.inline
      def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      @scala.inline
      def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      @scala.inline
      def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      @scala.inline
      def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      @scala.inline
      def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      @scala.inline
      def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      @scala.inline
      def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      @scala.inline
      def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      @scala.inline
      def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      @scala.inline
      def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      @scala.inline
      def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      @scala.inline
      def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      @scala.inline
      def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      @scala.inline
      def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      @scala.inline
      def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      @scala.inline
      def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      @scala.inline
      def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      @scala.inline
      def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      @scala.inline
      def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      @scala.inline
      def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      @scala.inline
      def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      @scala.inline
      def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      @scala.inline
      def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      @scala.inline
      def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      @scala.inline
      def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      @scala.inline
      def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      @scala.inline
      def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      @scala.inline
      def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      @scala.inline
      def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      @scala.inline
      def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      @scala.inline
      def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      @scala.inline
      def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      @scala.inline
      def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      @scala.inline
      def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      @scala.inline
      def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      @scala.inline
      def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      @scala.inline
      def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      @scala.inline
      def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      @scala.inline
      def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      @scala.inline
      def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      @scala.inline
      def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      @scala.inline
      def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      @scala.inline
      def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      @scala.inline
      def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      @scala.inline
      def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
      
      @scala.inline
      def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      @scala.inline
      def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = StObject.set(x, "normalizeEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeEmailUndefined: Self = StObject.set(x, "normalizeEmail", js.undefined)
      
      @scala.inline
      def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOptional(value: `true` | `0`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
      
      @scala.inline
      def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = StObject.set(x, "stripLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLowUndefined: Self = StObject.set(x, "stripLow", js.undefined)
      
      @scala.inline
      def setToArray(value: SanitizerSchemaOptions[toArray]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      @scala.inline
      def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = StObject.set(x, "toBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBooleanUndefined: Self = StObject.set(x, "toBoolean", js.undefined)
      
      @scala.inline
      def setToDate(value: SanitizerSchemaOptions[toDate]): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      @scala.inline
      def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = StObject.set(x, "toFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFloatUndefined: Self = StObject.set(x, "toFloat", js.undefined)
      
      @scala.inline
      def setToInt(value: SanitizerSchemaOptions[toInt]): Self = StObject.set(x, "toInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToIntUndefined: Self = StObject.set(x, "toInt", js.undefined)
      
      @scala.inline
      def setTrim(value: SanitizerSchemaOptions[trim]): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
  
  type ValidationSchema = Schema
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressValidator.expressValidatorBooleans.`true`
    - typingsSlinky.expressValidator.anon.ErrorMessage[K]
  */
  trait ValidatorSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any */] extends StObject
  
  /* Inlined {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>} */
  @js.native
  trait ValidatorsSchema extends StObject {
    
    var contains: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.contains]
      ] = js.native
    
    var custom: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.custom]
      ] = js.native
    
    @JSName("equals")
    var equals_FValidatorsSchema: js.UndefOr[ValidatorSchemaOptions[equals]] = js.native
    
    var exists: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.exists]
      ] = js.native
    
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
    
    var matches: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.matches]
      ] = js.native
    
    var not: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.not]
      ] = js.native
    
    var notEmpty: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.notEmpty]
      ] = js.native
    
    var withMessage: js.UndefOr[
        ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.withMessage]
      ] = js.native
  }
  object ValidatorsSchema {
    
    @scala.inline
    def apply(): ValidatorsSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatorsSchema]
    }
    
    @scala.inline
    implicit class ValidatorsSchemaMutableBuilder[Self <: ValidatorsSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: ValidatorSchemaOptions[contains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCustom(value: ValidatorSchemaOptions[custom]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEquals_(value: ValidatorSchemaOptions[equals]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setExists(value: ValidatorSchemaOptions[exists]): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
      
      @scala.inline
      def setIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
      
      @scala.inline
      def setIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
      
      @scala.inline
      def setIsArray(value: ValidatorSchemaOptions[isArray]): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      @scala.inline
      def setIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = StObject.set(x, "isAscii", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsciiUndefined: Self = StObject.set(x, "isAscii", js.undefined)
      
      @scala.inline
      def setIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = StObject.set(x, "isBIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBICUndefined: Self = StObject.set(x, "isBIC", js.undefined)
      
      @scala.inline
      def setIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = StObject.set(x, "isBase32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase32Undefined: Self = StObject.set(x, "isBase32", js.undefined)
      
      @scala.inline
      def setIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = StObject.set(x, "isBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Undefined: Self = StObject.set(x, "isBase64", js.undefined)
      
      @scala.inline
      def setIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
      
      @scala.inline
      def setIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      @scala.inline
      def setIsBtcAddress(value: ValidatorSchemaOptions[isBtcAddress]): Self = StObject.set(x, "isBtcAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBtcAddressUndefined: Self = StObject.set(x, "isBtcAddress", js.undefined)
      
      @scala.inline
      def setIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = StObject.set(x, "isByteLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsByteLengthUndefined: Self = StObject.set(x, "isByteLength", js.undefined)
      
      @scala.inline
      def setIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
      
      @scala.inline
      def setIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
      
      @scala.inline
      def setIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = StObject.set(x, "isDataURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDataURIUndefined: Self = StObject.set(x, "isDataURI", js.undefined)
      
      @scala.inline
      def setIsDate(value: ValidatorSchemaOptions[isDate]): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      @scala.inline
      def setIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
      
      @scala.inline
      def setIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = StObject.set(x, "isDivisibleBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDivisibleByUndefined: Self = StObject.set(x, "isDivisibleBy", js.undefined)
      
      @scala.inline
      def setIsEAN(value: ValidatorSchemaOptions[isEAN]): Self = StObject.set(x, "isEAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEANUndefined: Self = StObject.set(x, "isEAN", js.undefined)
      
      @scala.inline
      def setIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
      
      @scala.inline
      def setIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      @scala.inline
      def setIsEthereumAddress(value: ValidatorSchemaOptions[isEthereumAddress]): Self = StObject.set(x, "isEthereumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEthereumAddressUndefined: Self = StObject.set(x, "isEthereumAddress", js.undefined)
      
      @scala.inline
      def setIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = StObject.set(x, "isFQDN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFQDNUndefined: Self = StObject.set(x, "isFQDN", js.undefined)
      
      @scala.inline
      def setIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
      
      @scala.inline
      def setIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = StObject.set(x, "isFullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullWidthUndefined: Self = StObject.set(x, "isFullWidth", js.undefined)
      
      @scala.inline
      def setIsHSL(value: ValidatorSchemaOptions[isHSL]): Self = StObject.set(x, "isHSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHSLUndefined: Self = StObject.set(x, "isHSL", js.undefined)
      
      @scala.inline
      def setIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = StObject.set(x, "isHalfWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHalfWidthUndefined: Self = StObject.set(x, "isHalfWidth", js.undefined)
      
      @scala.inline
      def setIsHash(value: ValidatorSchemaOptions[isHash]): Self = StObject.set(x, "isHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHashUndefined: Self = StObject.set(x, "isHash", js.undefined)
      
      @scala.inline
      def setIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
      
      @scala.inline
      def setIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = StObject.set(x, "isHexadecimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHexadecimalUndefined: Self = StObject.set(x, "isHexadecimal", js.undefined)
      
      @scala.inline
      def setIsIBAN(value: ValidatorSchemaOptions[isIBAN]): Self = StObject.set(x, "isIBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIBANUndefined: Self = StObject.set(x, "isIBAN", js.undefined)
      
      @scala.inline
      def setIsIMEI(value: ValidatorSchemaOptions[isIMEI]): Self = StObject.set(x, "isIMEI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIMEIUndefined: Self = StObject.set(x, "isIMEI", js.undefined)
      
      @scala.inline
      def setIsIP(value: ValidatorSchemaOptions[isIP]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = StObject.set(x, "isIPRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIPRangeUndefined: Self = StObject.set(x, "isIPRange", js.undefined)
      
      @scala.inline
      def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
      
      @scala.inline
      def setIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = StObject.set(x, "isISBN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISBNUndefined: Self = StObject.set(x, "isISBN", js.undefined)
      
      @scala.inline
      def setIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = StObject.set(x, "isISIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISINUndefined: Self = StObject.set(x, "isISIN", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = StObject.set(x, "isISO31661Alpha2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha2Undefined: Self = StObject.set(x, "isISO31661Alpha2", js.undefined)
      
      @scala.inline
      def setIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = StObject.set(x, "isISO31661Alpha3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO31661Alpha3Undefined: Self = StObject.set(x, "isISO31661Alpha3", js.undefined)
      
      @scala.inline
      def setIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = StObject.set(x, "isISO8601", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISO8601Undefined: Self = StObject.set(x, "isISO8601", js.undefined)
      
      @scala.inline
      def setIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = StObject.set(x, "isISRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISRCUndefined: Self = StObject.set(x, "isISRC", js.undefined)
      
      @scala.inline
      def setIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = StObject.set(x, "isISSN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsISSNUndefined: Self = StObject.set(x, "isISSN", js.undefined)
      
      @scala.inline
      def setIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = StObject.set(x, "isIdentityCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIdentityCardUndefined: Self = StObject.set(x, "isIdentityCard", js.undefined)
      
      @scala.inline
      def setIsIn(value: ValidatorSchemaOptions[isIn]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
      
      @scala.inline
      def setIsInt(value: ValidatorSchemaOptions[isInt]): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
      
      @scala.inline
      def setIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      @scala.inline
      def setIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = StObject.set(x, "isJWT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJWTUndefined: Self = StObject.set(x, "isJWT", js.undefined)
      
      @scala.inline
      def setIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = StObject.set(x, "isLatLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLatLongUndefined: Self = StObject.set(x, "isLatLong", js.undefined)
      
      @scala.inline
      def setIsLength(value: ValidatorSchemaOptions[isLength]): Self = StObject.set(x, "isLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLengthUndefined: Self = StObject.set(x, "isLength", js.undefined)
      
      @scala.inline
      def setIsLocale(value: ValidatorSchemaOptions[isLocale]): Self = StObject.set(x, "isLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLocaleUndefined: Self = StObject.set(x, "isLocale", js.undefined)
      
      @scala.inline
      def setIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
      
      @scala.inline
      def setIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = StObject.set(x, "isMACAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMACAddressUndefined: Self = StObject.set(x, "isMACAddress", js.undefined)
      
      @scala.inline
      def setIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = StObject.set(x, "isMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMD5Undefined: Self = StObject.set(x, "isMD5", js.undefined)
      
      @scala.inline
      def setIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = StObject.set(x, "isMagnetURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMagnetURIUndefined: Self = StObject.set(x, "isMagnetURI", js.undefined)
      
      @scala.inline
      def setIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = StObject.set(x, "isMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMimeTypeUndefined: Self = StObject.set(x, "isMimeType", js.undefined)
      
      @scala.inline
      def setIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = StObject.set(x, "isMobilePhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobilePhoneUndefined: Self = StObject.set(x, "isMobilePhone", js.undefined)
      
      @scala.inline
      def setIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = StObject.set(x, "isMongoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMongoIdUndefined: Self = StObject.set(x, "isMongoId", js.undefined)
      
      @scala.inline
      def setIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = StObject.set(x, "isMultibyte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultibyteUndefined: Self = StObject.set(x, "isMultibyte", js.undefined)
      
      @scala.inline
      def setIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
      
      @scala.inline
      def setIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = StObject.set(x, "isOctal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOctalUndefined: Self = StObject.set(x, "isOctal", js.undefined)
      
      @scala.inline
      def setIsPassportNumber(value: ValidatorSchemaOptions[isPassportNumber]): Self = StObject.set(x, "isPassportNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPassportNumberUndefined: Self = StObject.set(x, "isPassportNumber", js.undefined)
      
      @scala.inline
      def setIsPort(value: ValidatorSchemaOptions[isPort]): Self = StObject.set(x, "isPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPortUndefined: Self = StObject.set(x, "isPort", js.undefined)
      
      @scala.inline
      def setIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = StObject.set(x, "isPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPostalCodeUndefined: Self = StObject.set(x, "isPostalCode", js.undefined)
      
      @scala.inline
      def setIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = StObject.set(x, "isRFC3339", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRFC3339Undefined: Self = StObject.set(x, "isRFC3339", js.undefined)
      
      @scala.inline
      def setIsRgbColor(value: ValidatorSchemaOptions[isRgbColor]): Self = StObject.set(x, "isRgbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRgbColorUndefined: Self = StObject.set(x, "isRgbColor", js.undefined)
      
      @scala.inline
      def setIsSemVer(value: ValidatorSchemaOptions[isSemVer]): Self = StObject.set(x, "isSemVer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSemVerUndefined: Self = StObject.set(x, "isSemVer", js.undefined)
      
      @scala.inline
      def setIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = StObject.set(x, "isSlug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSlugUndefined: Self = StObject.set(x, "isSlug", js.undefined)
      
      @scala.inline
      def setIsString(value: ValidatorSchemaOptions[isString]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
      
      @scala.inline
      def setIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = StObject.set(x, "isSurrogatePair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSurrogatePairUndefined: Self = StObject.set(x, "isSurrogatePair", js.undefined)
      
      @scala.inline
      def setIsTaxID(value: ValidatorSchemaOptions[isTaxID]): Self = StObject.set(x, "isTaxID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTaxIDUndefined: Self = StObject.set(x, "isTaxID", js.undefined)
      
      @scala.inline
      def setIsURL(value: ValidatorSchemaOptions[isURL]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
      
      @scala.inline
      def setIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
      
      @scala.inline
      def setIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
      
      @scala.inline
      def setIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = StObject.set(x, "isVariableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVariableWidthUndefined: Self = StObject.set(x, "isVariableWidth", js.undefined)
      
      @scala.inline
      def setIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
      
      @scala.inline
      def setMatches(value: ValidatorSchemaOptions[matches]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      @scala.inline
      def setNot(value: ValidatorSchemaOptions[not]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = StObject.set(x, "withMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithMessageUndefined: Self = StObject.set(x, "withMessage", js.undefined)
    }
  }
}
