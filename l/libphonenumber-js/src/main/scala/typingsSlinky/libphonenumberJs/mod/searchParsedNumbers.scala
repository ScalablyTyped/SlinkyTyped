package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.AnonDefaultCountryCountryCode
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchParsedNumbers")
@js.native
object searchParsedNumbers extends js.Object {
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: AnonDefaultCountryCountryCode): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

