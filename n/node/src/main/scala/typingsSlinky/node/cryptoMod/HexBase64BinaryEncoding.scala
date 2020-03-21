package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.binary
  - typingsSlinky.node.nodeStrings.base64
  - typingsSlinky.node.nodeStrings.hex
*/
trait HexBase64BinaryEncoding extends js.Object

object HexBase64BinaryEncoding {
  @scala.inline
  def base64: typingsSlinky.node.nodeStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typingsSlinky.node.nodeStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.node.nodeStrings.hex = this.cast("hex")
}

