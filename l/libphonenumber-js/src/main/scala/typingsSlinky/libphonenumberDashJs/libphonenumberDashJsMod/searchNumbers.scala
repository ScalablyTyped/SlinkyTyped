package typingsSlinky.libphonenumberDashJs.libphonenumberDashJsMod

import typingsSlinky.libphonenumberDashJs.Anon_DefaultCountry
import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFound
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFoundLegacy
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchNumbers")
@js.native
object searchNumbers extends js.Object {
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: Anon_DefaultCountry): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

