package typingsSlinky.libphonenumberDashJs

import typingsSlinky.libphonenumberDashJs.typesMod.CountryCallingCode
import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.Metadata
import typingsSlinky.libphonenumberDashJs.typesMod.NationalNumber
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFound
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFoundLegacy
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js/min", JSImport.Namespace)
@js.native
object minMod extends js.Object {
  @js.native
  class AsYouType () extends js.Object {
    def this(defaultCountryCode: CountryCode) = this()
    def getNumber(): js.UndefOr[typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
    def getTemplate(): js.UndefOr[String] = js.native
    def input(text: String): String = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  class ParseError ()
    extends typingsSlinky.libphonenumberDashJs.typesMod.ParseError
  
  @js.native
  class PhoneNumber protected ()
    extends typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: Metadata
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
  }
  
  @js.native
  class PhoneNumberMatcher protected () extends js.Object {
    def this(text: String) = this()
    def this(text: String, options: Anon_DefaultCountry) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  def findNumbers(text: String): js.Array[NumberFoundLegacy] = js.native
  def findNumbers(text: String, options: Anon_DefaultCountry): js.Array[NumberFound] = js.native
  def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
  def formatIncompletePhoneNumber(number: String): String = js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = js.native
  def getCountries(): js.Array[CountryCode] = js.native
  def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = js.native
  def getExampleNumber(
    country: CountryCode,
    examples: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: libphonenumber-js.libphonenumber-js/types.NationalNumber}
    */ typingsSlinky.libphonenumberDashJs.libphonenumberDashJsStrings.getExampleNumber with js.Any
  ): js.UndefOr[typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
  def getExtPrefix(countryCode: CountryCode): String = js.native
  def isSupportedCountry(countryCode: CountryCode): Boolean = js.native
  def parseDigits(character: String): String = js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  def parsePhoneNumber(text: String): typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode): typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  def parsePhoneNumberFromString(text: String): js.UndefOr[typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typingsSlinky.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
  def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def searchNumbers(text: String, options: Anon_DefaultCountry): IterableIterator[NumberFound] = js.native
  def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

