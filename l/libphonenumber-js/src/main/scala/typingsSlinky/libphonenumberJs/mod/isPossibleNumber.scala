package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "isPossibleNumber")
@js.native
object isPossibleNumber extends js.Object {
  
  def apply(parsedNumber: ParsedNumber): Boolean = js.native
  def apply(phone: NationalNumber): Boolean = js.native
  def apply(phone: NationalNumber, country: CountryCode): Boolean = js.native
}
