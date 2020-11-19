package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.typesMod.CountryCode
import typingsSlinky.libphonenumberJs.typesMod.NationalNumber
import typingsSlinky.libphonenumberJs.typesMod.NumberType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "getNumberType")
@js.native
object getNumberType extends js.Object {
  
  def apply(parsedNumber: ParsedNumber): NumberType = js.native
  def apply(phone: NationalNumber): NumberType = js.native
  def apply(phone: NationalNumber, country: CountryCode): NumberType = js.native
}
