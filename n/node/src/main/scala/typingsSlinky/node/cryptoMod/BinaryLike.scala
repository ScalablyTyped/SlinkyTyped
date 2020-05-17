package typingsSlinky.node.cryptoMod

import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.NodeJS.ArrayBufferView
*/
trait BinaryLike extends CipherKey

object BinaryLike {
  @scala.inline
  implicit def apply(value: ArrayBufferView): BinaryLike = value.asInstanceOf[BinaryLike]
  @scala.inline
  implicit def apply(value: String): BinaryLike = value.asInstanceOf[BinaryLike]
}

