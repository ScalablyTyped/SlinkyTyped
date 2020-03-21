package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCallingCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "getPhoneCode")
@js.native
object getPhoneCode extends js.Object {
  def apply(countryCode: CountryCode): CountryCallingCode = js.native
}

