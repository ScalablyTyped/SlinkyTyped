package typingsSlinky.libphonenumberDashJs.libphonenumberDashJsMod

import typingsSlinky.libphonenumberDashJs.typesMod.CountryCode
import typingsSlinky.libphonenumberDashJs.typesMod.NationalNumber
import typingsSlinky.libphonenumberDashJs.typesMod.NumberFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "formatNumber")
@js.native
object formatNumber extends js.Object {
  def apply(parsedNumber: ParsedNumber, format: NumberFormat): String = js.native
  def apply(parsedNumber: ParsedNumber, format: NumberFormat, options: FormatNumberOptions): String = js.native
  def apply(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = js.native
  def apply(phone: NationalNumber, country: CountryCode, format: NumberFormat, options: FormatNumberOptions): String = js.native
  def apply(phone: NationalNumber, format: NumberFormat): String = js.native
  def apply(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions): String = js.native
}

