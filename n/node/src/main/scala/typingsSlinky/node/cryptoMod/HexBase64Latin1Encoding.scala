package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.latin1
  - typingsSlinky.node.nodeStrings.hex
  - typingsSlinky.node.nodeStrings.base64
*/
trait HexBase64Latin1Encoding extends js.Object

object HexBase64Latin1Encoding {
  @scala.inline
  def base64: typingsSlinky.node.nodeStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.node.nodeStrings.hex = this.cast("hex")
  @scala.inline
  def latin1: typingsSlinky.node.nodeStrings.latin1 = this.cast("latin1")
}

