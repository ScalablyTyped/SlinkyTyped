package typingsSlinky.libphonenumberJs

import typingsSlinky.libphonenumberJs.anon.DefaultCallingCode
import typingsSlinky.libphonenumberJs.anon.DefaultCountry
import typingsSlinky.libphonenumberJs.anon.countryinCountryCodeNatio
import typingsSlinky.libphonenumberJs.typesMod.CountryCallingCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.Metadata
import typingsSlinky.libphonenumberJs.typesMod.NationalNumber
import typingsSlinky.libphonenumberJs.typesMod.NumberFound
import typingsSlinky.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js/min", JSImport.Namespace)
@js.native
object minMod extends js.Object {
  @js.native
  class AsYouType () extends js.Object {
    def this(defaultCountryCode: DefaultCallingCode) = this()
    def this(defaultCountryCode: CountryCode) = this()
    def getNumber(): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
    def getTemplate(): js.UndefOr[String] = js.native
    def input(text: String): String = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  class ParseError ()
    extends typingsSlinky.libphonenumberJs.typesMod.ParseError
  
  @js.native
  class PhoneNumber protected ()
    extends typingsSlinky.libphonenumberJs.typesMod.PhoneNumber {
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
    def this(text: String, options: DefaultCountry) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  def findNumbers(text: String): js.Array[NumberFoundLegacy] = js.native
  def findNumbers(text: String, options: DefaultCountry): js.Array[NumberFound] = js.native
  def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
  def findPhoneNumbersInText(text: String): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, options: DefaultCallingCode): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, options: CountryCode): js.Array[NumberFound] = js.native
  def formatIncompletePhoneNumber(number: String): String = js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = js.native
  def getCountries(): js.Array[CountryCode] = js.native
  def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = js.native
  def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def getExtPrefix(countryCode: CountryCode): String = js.native
  def isSupportedCountry(countryCode: CountryCode): Boolean = js.native
  def parseDigits(character: String): String = js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  def parsePhoneNumber(text: String): typingsSlinky.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode): typingsSlinky.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  def parsePhoneNumberFromString(text: String): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def searchNumbers(text: String, options: DefaultCountry): IterableIterator[NumberFound] = js.native
  def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
  def searchPhoneNumbersInText(text: String): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, options: DefaultCallingCode): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, options: CountryCode): IterableIterator[NumberFound] = js.native
}

