package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.anon.DefaultCallingCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "parsePhoneNumberFromString")
@js.native
object parsePhoneNumberFromString extends js.Object {
  def apply(text: String): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def apply(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def apply(text: String, defaultCountry: CountryCode): js.UndefOr[typingsSlinky.libphonenumberJs.typesMod.PhoneNumber] = js.native
}

