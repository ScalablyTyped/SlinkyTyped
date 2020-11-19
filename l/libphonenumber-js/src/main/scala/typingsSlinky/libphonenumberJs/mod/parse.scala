package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "parse")
@js.native
object parse extends js.Object {
  
  def apply(text: String): ParsedNumber = js.native
  def apply(text: String, options: ParseNumberOptions): ParsedNumber = js.native
  def apply(text: String, options: CountryCode): ParsedNumber = js.native
}
