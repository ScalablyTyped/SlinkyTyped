package typingsSlinky.bufferhelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bufferhelper.bufferhelperStrings.ascii
  - typingsSlinky.bufferhelper.bufferhelperStrings.utf8
  - typingsSlinky.bufferhelper.bufferhelperStrings.utf16le
  - typingsSlinky.bufferhelper.bufferhelperStrings.ucs2
  - typingsSlinky.bufferhelper.bufferhelperStrings.base64
  - typingsSlinky.bufferhelper.bufferhelperStrings.binary
  - typingsSlinky.bufferhelper.bufferhelperStrings.hex
*/
trait encoding extends js.Object

object encoding {
  @scala.inline
  def ascii: typingsSlinky.bufferhelper.bufferhelperStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typingsSlinky.bufferhelper.bufferhelperStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typingsSlinky.bufferhelper.bufferhelperStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.bufferhelper.bufferhelperStrings.hex = this.cast("hex")
  @scala.inline
  def ucs2: typingsSlinky.bufferhelper.bufferhelperStrings.ucs2 = this.cast("ucs2")
  @scala.inline
  def utf16le: typingsSlinky.bufferhelper.bufferhelperStrings.utf16le = this.cast("utf16le")
  @scala.inline
  def utf8: typingsSlinky.bufferhelper.bufferhelperStrings.utf8 = this.cast("utf8")
}

