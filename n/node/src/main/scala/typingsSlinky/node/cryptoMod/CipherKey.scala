package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.cryptoMod.BinaryLike
  - typingsSlinky.node.cryptoMod.KeyObject
*/
trait CipherKey extends js.Object

object CipherKey {
  @scala.inline
  implicit def apply(value: BinaryLike): CipherKey = value.asInstanceOf[CipherKey]
  @scala.inline
  implicit def apply(value: KeyObject): CipherKey = value.asInstanceOf[CipherKey]
}

