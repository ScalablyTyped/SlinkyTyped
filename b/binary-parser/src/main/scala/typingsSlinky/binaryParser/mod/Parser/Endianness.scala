package typingsSlinky.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.binaryParser.binaryParserStrings.little
  - typingsSlinky.binaryParser.binaryParserStrings.big
*/
trait Endianness extends js.Object

object Endianness {
  @scala.inline
  def big: typingsSlinky.binaryParser.binaryParserStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def little: typingsSlinky.binaryParser.binaryParserStrings.little = this.cast("little")
}

