package typingsSlinky.libphonenumberDashJs.libphonenumberDashJsMod

import typingsSlinky.libphonenumberDashJs.Anon_DefaultCountry
import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFound
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findNumbers")
@js.native
object findNumbers extends js.Object {
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: Anon_DefaultCountry): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}

