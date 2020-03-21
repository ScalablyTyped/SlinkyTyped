package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.rsa
  - typingsSlinky.node.nodeStrings.dsa
  - typingsSlinky.node.nodeStrings.ec
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dsa: typingsSlinky.node.nodeStrings.dsa = this.cast("dsa")
  @scala.inline
  def ec: typingsSlinky.node.nodeStrings.ec = this.cast("ec")
  @scala.inline
  def rsa: typingsSlinky.node.nodeStrings.rsa = this.cast("rsa")
}

