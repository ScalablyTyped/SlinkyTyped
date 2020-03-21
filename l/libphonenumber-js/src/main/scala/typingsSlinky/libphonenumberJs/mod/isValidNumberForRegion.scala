package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "isValidNumberForRegion")
@js.native
object isValidNumberForRegion extends js.Object {
  def apply(phone: NationalNumber, country: CountryCode): Boolean = js.native
}

