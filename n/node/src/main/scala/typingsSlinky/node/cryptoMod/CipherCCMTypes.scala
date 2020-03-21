package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.`aes-128-ccm`
  - typingsSlinky.node.nodeStrings.`aes-192-ccm`
  - typingsSlinky.node.nodeStrings.`aes-256-ccm`
  - typingsSlinky.node.nodeStrings.`chacha20-poly1305`
*/
trait CipherCCMTypes extends js.Object

object CipherCCMTypes {
  @scala.inline
  def `aes-128-ccm`: typingsSlinky.node.nodeStrings.`aes-128-ccm` = this.cast("aes-128-ccm")
  @scala.inline
  def `aes-192-ccm`: typingsSlinky.node.nodeStrings.`aes-192-ccm` = this.cast("aes-192-ccm")
  @scala.inline
  def `aes-256-ccm`: typingsSlinky.node.nodeStrings.`aes-256-ccm` = this.cast("aes-256-ccm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `chacha20-poly1305`: typingsSlinky.node.nodeStrings.`chacha20-poly1305` = this.cast("chacha20-poly1305")
}

