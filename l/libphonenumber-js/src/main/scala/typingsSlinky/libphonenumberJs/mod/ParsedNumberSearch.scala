package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.AnonDefaultCountryCountryCode
import typingsSlinky.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "ParsedNumberSearch")
@js.native
class ParsedNumberSearch protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: AnonDefaultCountryCountryCode) = this()
  def hasNext(): Boolean = js.native
  def next(): js.UndefOr[NumberFoundLegacy] = js.native
}

