package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.AnonDefaultCountry
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NumberFound
import typingsSlinky.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchNumbers")
@js.native
object searchNumbers extends js.Object {
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: AnonDefaultCountry): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

