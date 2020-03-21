package typingsSlinky.qrcodeGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Numeric
  - typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Alphanumeric
  - typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Byte
  - typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Kanji
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def Alphanumeric: typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Alphanumeric = this.cast("Alphanumeric")
  @scala.inline
  def Byte: typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Byte = this.cast("Byte")
  @scala.inline
  def Kanji: typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Kanji = this.cast("Kanji")
  @scala.inline
  def Numeric: typingsSlinky.qrcodeGenerator.qrcodeGeneratorStrings.Numeric = this.cast("Numeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

