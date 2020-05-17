package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.cryptoMod.KeyObject
*/
trait KeyLike extends js.Object

object KeyLike {
  @scala.inline
  implicit def apply(value: Buffer): KeyLike = value.asInstanceOf[KeyLike]
  @scala.inline
  implicit def apply(value: KeyObject): KeyLike = value.asInstanceOf[KeyLike]
  @scala.inline
  implicit def apply(value: String): KeyLike = value.asInstanceOf[KeyLike]
}

