package typingsSlinky.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.standard
  - typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.scientific
  - typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.engineering
  - typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.compact
*/
trait NumberFormatNotation extends js.Object

object NumberFormatNotation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compact: typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.compact = this.cast("compact")
  @scala.inline
  def engineering: typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.engineering = this.cast("engineering")
  @scala.inline
  def scientific: typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.scientific = this.cast("scientific")
  @scala.inline
  def standard: typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.standard = this.cast("standard")
}

