package typingsSlinky.libphonenumberDashJs.libphonenumberDashJsMod

import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.NationalNumber
import typingsSlinky.libphonenumberDashJs.typesMod.NumberType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "getNumberType")
@js.native
object getNumberType extends js.Object {
  def apply(parsedNumber: ParsedNumber): NumberType = js.native
  def apply(phone: NationalNumber): NumberType = js.native
  def apply(phone: NationalNumber, country: CountryCode): NumberType = js.native
}

