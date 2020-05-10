package typingsSlinky.expressValidator.schemaMod

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
import typingsSlinky.expressValidator.expressValidatorStrings.isByteLength
import typingsSlinky.expressValidator.expressValidatorStrings.isCreditCard
import typingsSlinky.expressValidator.expressValidatorStrings.isCurrency
import typingsSlinky.expressValidator.expressValidatorStrings.isDataURI
import typingsSlinky.expressValidator.expressValidatorStrings.isDecimal
import typingsSlinky.expressValidator.expressValidatorStrings.isDivisibleBy
import typingsSlinky.expressValidator.expressValidatorStrings.isEmail
import typingsSlinky.expressValidator.expressValidatorStrings.isEmpty
import typingsSlinky.expressValidator.expressValidatorStrings.isFQDN
import typingsSlinky.expressValidator.expressValidatorStrings.isFloat
import typingsSlinky.expressValidator.expressValidatorStrings.isFullWidth
import typingsSlinky.expressValidator.expressValidatorStrings.isHalfWidth
import typingsSlinky.expressValidator.expressValidatorStrings.isHash
import typingsSlinky.expressValidator.expressValidatorStrings.isHexColor
import typingsSlinky.expressValidator.expressValidatorStrings.isHexadecimal
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
import typingsSlinky.expressValidator.expressValidatorStrings.isPort
import typingsSlinky.expressValidator.expressValidatorStrings.isPostalCode
import typingsSlinky.expressValidator.expressValidatorStrings.isRFC3339
import typingsSlinky.expressValidator.expressValidatorStrings.isSlug
import typingsSlinky.expressValidator.expressValidatorStrings.isString
import typingsSlinky.expressValidator.expressValidatorStrings.isSurrogatePair
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
import scala.scalajs.js.annotation._

/* Inlined express-validator.express-validator/src/middlewares/schema.ValidatorsSchema & express-validator.express-validator/src/middlewares/schema.SanitizersSchema */
@js.native
trait InternalParamSchema extends js.Object {
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
  var isDecimal: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isDecimal]
  ] = js.native
  var isDivisibleBy: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isDivisibleBy]
  ] = js.native
  var isEmail: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isEmail]
  ] = js.native
  var isEmpty: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isEmpty]
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
  var isPort: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isPort]
  ] = js.native
  var isPostalCode: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isPostalCode]
  ] = js.native
  var isRFC3339: js.UndefOr[
    ValidatorSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.isRFC3339]
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
  implicit class InternalParamSchemaOps[Self <: InternalParamSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: ValidatorSchemaOptions[contains]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: ValidatorSchemaOptions[custom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: ValidatorSchemaOptions[equals]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: SanitizerSchemaOptions[escape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withExists(value: ValidatorSchemaOptions[exists]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAfter(value: ValidatorSchemaOptions[isAfter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlpha(value: ValidatorSchemaOptions[isAlpha]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlphanumeric(value: ValidatorSchemaOptions[isAlphanumeric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlphanumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlphanumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlphanumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArray(value: ValidatorSchemaOptions[isArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isArray")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAscii(value: ValidatorSchemaOptions[isAscii]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAscii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAscii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAscii")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBIC(value: ValidatorSchemaOptions[isBIC]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBIC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBIC")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBase32(value: ValidatorSchemaOptions[isBase32]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBase32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase32")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBase64(value: ValidatorSchemaOptions[isBase64]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBase64")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBefore(value: ValidatorSchemaOptions[isBefore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBoolean(value: ValidatorSchemaOptions[isBoolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withIsByteLength(value: ValidatorSchemaOptions[isByteLength]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isByteLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsByteLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isByteLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCreditCard(value: ValidatorSchemaOptions[isCreditCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCreditCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCreditCard")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCurrency(value: ValidatorSchemaOptions[isCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataURI(value: ValidatorSchemaOptions[isDataURI]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataURI")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDecimal(value: ValidatorSchemaOptions[isDecimal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDivisibleBy(value: ValidatorSchemaOptions[isDivisibleBy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDivisibleBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDivisibleBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDivisibleBy")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmail(value: ValidatorSchemaOptions[isEmail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmpty(value: ValidatorSchemaOptions[isEmpty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFQDN(value: ValidatorSchemaOptions[isFQDN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFQDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFQDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFQDN")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFloat(value: ValidatorSchemaOptions[isFloat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFullWidth(value: ValidatorSchemaOptions[isFullWidth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHalfWidth(value: ValidatorSchemaOptions[isHalfWidth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHalfWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHalfWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHalfWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHash(value: ValidatorSchemaOptions[isHash]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHash")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHexColor(value: ValidatorSchemaOptions[isHexColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHexColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHexadecimal(value: ValidatorSchemaOptions[isHexadecimal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexadecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHexadecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHexadecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIP(value: ValidatorSchemaOptions[isIP]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIP")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIPRange(value: ValidatorSchemaOptions[isIPRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIPRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIPRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIPRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISBN(value: ValidatorSchemaOptions[isISBN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISBN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISBN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISBN")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISIN(value: ValidatorSchemaOptions[isISIN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISIN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISIN")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISO31661Alpha2(value: ValidatorSchemaOptions[isISO31661Alpha2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISO31661Alpha2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISO31661Alpha2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISO31661Alpha2")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISO31661Alpha3(value: ValidatorSchemaOptions[isISO31661Alpha3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISO31661Alpha3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISO31661Alpha3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISO31661Alpha3")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISO8601(value: ValidatorSchemaOptions[isISO8601]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISO8601")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISO8601: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISO8601")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISRC(value: ValidatorSchemaOptions[isISRC]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISRC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISRC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISRC")(js.undefined)
        ret
    }
    @scala.inline
    def withIsISSN(value: ValidatorSchemaOptions[isISSN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISSN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsISSN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isISSN")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdentityCard(value: ValidatorSchemaOptions[isIdentityCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentityCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIdentityCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentityCard")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIn(value: ValidatorSchemaOptions[isIn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInt(value: ValidatorSchemaOptions[isInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInt")(js.undefined)
        ret
    }
    @scala.inline
    def withIsJSON(value: ValidatorSchemaOptions[isJSON]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withIsJWT(value: ValidatorSchemaOptions[isJWT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJWT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsJWT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJWT")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLatLong(value: ValidatorSchemaOptions[isLatLong]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLatLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLatLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLatLong")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLength(value: ValidatorSchemaOptions[isLength]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLength")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLowercase(value: ValidatorSchemaOptions[isLowercase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMACAddress(value: ValidatorSchemaOptions[isMACAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMACAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMACAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMACAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMD5(value: ValidatorSchemaOptions[isMD5]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMagnetURI(value: ValidatorSchemaOptions[isMagnetURI]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMagnetURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMagnetURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMagnetURI")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMimeType(value: ValidatorSchemaOptions[isMimeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobilePhone(value: ValidatorSchemaOptions[isMobilePhone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobilePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobilePhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobilePhone")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMongoId(value: ValidatorSchemaOptions[isMongoId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMongoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMongoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMongoId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultibyte(value: ValidatorSchemaOptions[isMultibyte]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultibyte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultibyte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultibyte")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNumeric(value: ValidatorSchemaOptions[isNumeric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOctal(value: ValidatorSchemaOptions[isOctal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOctal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOctal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOctal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPort(value: ValidatorSchemaOptions[isPort]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPort")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPostalCode(value: ValidatorSchemaOptions[isPostalCode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRFC3339(value: ValidatorSchemaOptions[isRFC3339]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRFC3339")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRFC3339: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRFC3339")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSlug(value: ValidatorSchemaOptions[isSlug]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSlug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSlug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSlug")(js.undefined)
        ret
    }
    @scala.inline
    def withIsString(value: ValidatorSchemaOptions[isString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isString")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSurrogatePair(value: ValidatorSchemaOptions[isSurrogatePair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurrogatePair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSurrogatePair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSurrogatePair")(js.undefined)
        ret
    }
    @scala.inline
    def withIsURL(value: ValidatorSchemaOptions[isURL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isURL")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUUID(value: ValidatorSchemaOptions[isUUID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUUID")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUppercase(value: ValidatorSchemaOptions[isUppercase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVariableWidth(value: ValidatorSchemaOptions[isVariableWidth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVariableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsVariableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVariableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWhitelisted(value: ValidatorSchemaOptions[isWhitelisted]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWhitelisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWhitelisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWhitelisted")(js.undefined)
        ret
    }
    @scala.inline
    def withLtrim(value: SanitizerSchemaOptions[ltrim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLtrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltrim")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: ValidatorSchemaOptions[matches]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withNot(value: ValidatorSchemaOptions[not]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
    @scala.inline
    def withNotEmpty(value: ValidatorSchemaOptions[notEmpty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withRtrim(value: SanitizerSchemaOptions[rtrim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(js.undefined)
        ret
    }
    @scala.inline
    def withStripLow(value: SanitizerSchemaOptions[stripLow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLow")(js.undefined)
        ret
    }
    @scala.inline
    def withToArray(value: SanitizerSchemaOptions[toArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.undefined)
        ret
    }
    @scala.inline
    def withToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withToDate(value: SanitizerSchemaOptions[toDate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.undefined)
        ret
    }
    @scala.inline
    def withToFloat(value: SanitizerSchemaOptions[toFloat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withToInt(value: SanitizerSchemaOptions[toInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInt")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: SanitizerSchemaOptions[trim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescape(value: SanitizerSchemaOptions[unescape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withWithMessage(value: ValidatorSchemaOptions[withMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMessage")(js.undefined)
        ret
    }
  }
  
}

