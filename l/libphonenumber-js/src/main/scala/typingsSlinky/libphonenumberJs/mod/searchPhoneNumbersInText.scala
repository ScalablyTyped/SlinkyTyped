package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.AnonDefaultCallingCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NumberFound
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchPhoneNumbersInText")
@js.native
object searchPhoneNumbersInText extends js.Object {
  def apply(text: String): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: AnonDefaultCallingCode): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFound] = js.native
}

