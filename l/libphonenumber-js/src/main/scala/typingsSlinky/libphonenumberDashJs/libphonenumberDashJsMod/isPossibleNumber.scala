package typingsSlinky.libphonenumberDashJs.libphonenumberDashJsMod

import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "isPossibleNumber")
@js.native
object isPossibleNumber extends js.Object {
  def apply(parsedNumber: ParsedNumber): Boolean = js.native
  def apply(phone: NationalNumber): Boolean = js.native
  def apply(phone: NationalNumber, country: CountryCode): Boolean = js.native
}

