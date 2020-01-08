package typingsSlinky.libphonenumberDashJs.libphonenumberDashJsMod

import typingsSlinky.libphonenumberDashJs.typesMod.CountryCallingCode
import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.Metadata
import typingsSlinky.libphonenumberDashJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "PhoneNumber")
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

