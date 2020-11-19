package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.anon.DefaultCountry
import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NumberFound
import typingsSlinky.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "findNumbers")
@js.native
object findNumbers extends js.Object {
  
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: DefaultCountry): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}
