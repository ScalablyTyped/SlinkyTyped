package typingsSlinky.qrcodeDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Numeric
  - typings.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Alphanumeric
  - typings.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Byte
  - typings.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Kanji
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def Alphanumeric: typingsSlinky.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Alphanumeric = this.cast("Alphanumeric")
  @scala.inline
  def Byte: typingsSlinky.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Byte = this.cast("Byte")
  @scala.inline
  def Kanji: typingsSlinky.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Kanji = this.cast("Kanji")
  @scala.inline
  def Numeric: typingsSlinky.qrcodeDashGenerator.qrcodeDashGeneratorStrings.Numeric = this.cast("Numeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

