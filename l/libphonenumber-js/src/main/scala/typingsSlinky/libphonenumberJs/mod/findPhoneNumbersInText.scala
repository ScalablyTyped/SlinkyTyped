package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.anon.DefaultCallingCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NumberFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findPhoneNumbersInText")
@js.native
object findPhoneNumbersInText extends js.Object {
  def apply(text: String): js.Array[NumberFound] = js.native
  def apply(text: String, options: DefaultCallingCode): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFound] = js.native
}

