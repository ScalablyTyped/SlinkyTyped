package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCallingCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.Metadata
import typingsSlinky.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "PhoneNumber")
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
