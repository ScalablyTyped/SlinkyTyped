package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.anon.CheckFalsy
import typingsSlinky.expressValidator.anon.Max
import typingsSlinky.expressValidator.baseMod.CustomValidator
import typingsSlinky.expressValidator.baseMod.DynamicMessageCreator
import typingsSlinky.expressValidator.optionsMod.AlphaLocale
import typingsSlinky.expressValidator.optionsMod.AlphanumericLocale
import typingsSlinky.expressValidator.optionsMod.ContainsOptions
import typingsSlinky.expressValidator.optionsMod.HashAlgorithm
import typingsSlinky.expressValidator.optionsMod.IPVersion
import typingsSlinky.expressValidator.optionsMod.IdentityCard
import typingsSlinky.expressValidator.optionsMod.IsBase64Options
import typingsSlinky.expressValidator.optionsMod.IsCurrencyOptions
import typingsSlinky.expressValidator.optionsMod.IsDecimalOptions
import typingsSlinky.expressValidator.optionsMod.IsEmailOptions
import typingsSlinky.expressValidator.optionsMod.IsEmptyOptions
import typingsSlinky.expressValidator.optionsMod.IsFQDNOptions
import typingsSlinky.expressValidator.optionsMod.IsFloatOptions
import typingsSlinky.expressValidator.optionsMod.IsIMEIOptions
import typingsSlinky.expressValidator.optionsMod.IsISO8601Options
import typingsSlinky.expressValidator.optionsMod.IsISSNOptions
import typingsSlinky.expressValidator.optionsMod.IsIntOptions
import typingsSlinky.expressValidator.optionsMod.IsJSONOptions
import typingsSlinky.expressValidator.optionsMod.IsLatLongOptions
import typingsSlinky.expressValidator.optionsMod.IsMACAddressOptions
import typingsSlinky.expressValidator.optionsMod.IsMobilePhoneOptions
import typingsSlinky.expressValidator.optionsMod.IsNumericOptions
import typingsSlinky.expressValidator.optionsMod.IsURLOptions
import typingsSlinky.expressValidator.optionsMod.MinMaxExtendedOptions
import typingsSlinky.expressValidator.optionsMod.MinMaxOptions
import typingsSlinky.expressValidator.optionsMod.MobilePhoneLocale
import typingsSlinky.expressValidator.optionsMod.PassportCountryCode
import typingsSlinky.expressValidator.optionsMod.PostalCodeLocale
import typingsSlinky.expressValidator.optionsMod.TaxIDLocale
import typingsSlinky.expressValidator.optionsMod.UUIDVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @js.native
  trait Validators[Return] extends StObject {
    
    def contains(elem: js.Any): Return = js.native
    def contains(elem: js.Any, options: ContainsOptions): Return = js.native
    
    def custom(validator: CustomValidator): Return = js.native
    
    def equals(comparison: String): Return = js.native
    
    def exists(): Return = js.native
    def exists(options: CheckFalsy): Return = js.native
    
    def isAfter(): Return = js.native
    def isAfter(date: String): Return = js.native
    
    def isAlpha(): Return = js.native
    def isAlpha(locale: AlphaLocale): Return = js.native
    
    def isAlphanumeric(): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale): Return = js.native
    
    def isArray(): Return = js.native
    def isArray(options: Max): Return = js.native
    
    def isAscii(): Return = js.native
    
    def isBIC(): Return = js.native
    
    def isBase32(): Return = js.native
    
    def isBase64(): Return = js.native
    def isBase64(options: IsBase64Options): Return = js.native
    
    def isBefore(): Return = js.native
    def isBefore(date: String): Return = js.native
    
    def isBoolean(): Return = js.native
    
    def isBtcAddress(): Return = js.native
    
    def isByteLength(options: MinMaxExtendedOptions): Return = js.native
    
    def isCreditCard(): Return = js.native
    
    def isCurrency(): Return = js.native
    def isCurrency(options: IsCurrencyOptions): Return = js.native
    
    def isDataURI(): Return = js.native
    
    def isDate(): Return = js.native
    
    def isDecimal(): Return = js.native
    def isDecimal(options: IsDecimalOptions): Return = js.native
    
    def isDivisibleBy(number: Double): Return = js.native
    
    def isEAN(): Return = js.native
    
    def isEmail(): Return = js.native
    def isEmail(options: IsEmailOptions): Return = js.native
    
    def isEmpty(): Return = js.native
    def isEmpty(options: IsEmptyOptions): Return = js.native
    
    def isEthereumAddress(): Return = js.native
    
    def isFQDN(): Return = js.native
    def isFQDN(options: IsFQDNOptions): Return = js.native
    
    def isFloat(): Return = js.native
    def isFloat(options: IsFloatOptions): Return = js.native
    
    def isFullWidth(): Return = js.native
    
    def isHSL(): Return = js.native
    
    def isHalfWidth(): Return = js.native
    
    def isHash(algorithm: HashAlgorithm): Return = js.native
    
    def isHexColor(): Return = js.native
    
    def isHexadecimal(): Return = js.native
    
    def isIBAN(): Return = js.native
    
    def isIMEI(): Return = js.native
    def isIMEI(options: IsIMEIOptions): Return = js.native
    
    def isIP(): Return = js.native
    def isIP(version: IPVersion): Return = js.native
    
    def isIPRange(): Return = js.native
    
    def isISBN(): Return = js.native
    def isISBN(version: Double): Return = js.native
    
    def isISIN(): Return = js.native
    
    def isISO31661Alpha2(): Return = js.native
    
    def isISO31661Alpha3(): Return = js.native
    
    def isISO8601(): Return = js.native
    def isISO8601(options: IsISO8601Options): Return = js.native
    
    def isISRC(): Return = js.native
    
    def isISSN(): Return = js.native
    def isISSN(options: IsISSNOptions): Return = js.native
    
    def isIdentityCard(): Return = js.native
    def isIdentityCard(locale: IdentityCard): Return = js.native
    
    def isIn(values: js.Array[_]): Return = js.native
    
    def isInt(): Return = js.native
    def isInt(options: IsIntOptions): Return = js.native
    
    def isJSON(): Return = js.native
    def isJSON(options: IsJSONOptions): Return = js.native
    
    def isJWT(): Return = js.native
    
    def isLatLong(): Return = js.native
    def isLatLong(options: IsLatLongOptions): Return = js.native
    
    def isLength(options: MinMaxOptions): Return = js.native
    
    def isLocale(): Return = js.native
    
    def isLowercase(): Return = js.native
    
    def isMACAddress(): Return = js.native
    def isMACAddress(options: IsMACAddressOptions): Return = js.native
    
    def isMD5(): Return = js.native
    
    def isMagnetURI(): Return = js.native
    
    def isMimeType(): Return = js.native
    
    def isMobilePhone(locale: js.Array[MobilePhoneLocale]): Return = js.native
    def isMobilePhone(locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Return = js.native
    
    def isMongoId(): Return = js.native
    
    def isMultibyte(): Return = js.native
    
    def isNumeric(): Return = js.native
    def isNumeric(options: IsNumericOptions): Return = js.native
    
    def isOctal(): Return = js.native
    
    def isPassportNumber(): Return = js.native
    def isPassportNumber(countryCode: PassportCountryCode): Return = js.native
    
    def isPort(): Return = js.native
    
    def isPostalCode(locale: PostalCodeLocale): Return = js.native
    
    def isRFC3339(): Return = js.native
    
    def isRgbColor(): Return = js.native
    def isRgbColor(includePercentValues: Boolean): Return = js.native
    
    def isSemVer(): Return = js.native
    
    def isSlug(): Return = js.native
    
    def isString(): Return = js.native
    
    def isSurrogatePair(): Return = js.native
    
    def isTaxID(locale: TaxIDLocale): Return = js.native
    
    def isURL(): Return = js.native
    def isURL(options: IsURLOptions): Return = js.native
    
    def isUUID(): Return = js.native
    def isUUID(version: UUIDVersion): Return = js.native
    
    def isUppercase(): Return = js.native
    
    def isVariableWidth(): Return = js.native
    
    def isWhitelisted(chars: String): Return = js.native
    def isWhitelisted(chars: js.Array[String]): Return = js.native
    
    def matches(pattern: String): Return = js.native
    def matches(pattern: String, modifiers: String): Return = js.native
    def matches(pattern: js.RegExp): Return = js.native
    def matches(pattern: js.RegExp, modifiers: String): Return = js.native
    
    def not(): Return = js.native
    
    def notEmpty(): Return = js.native
    def notEmpty(options: IsEmptyOptions): Return = js.native
    
    def withMessage(message: js.Any): Return = js.native
    def withMessage(message: DynamicMessageCreator): Return = js.native
  }
}
