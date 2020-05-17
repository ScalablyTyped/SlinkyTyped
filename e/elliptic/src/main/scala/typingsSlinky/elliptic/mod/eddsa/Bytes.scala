package typingsSlinky.elliptic.mod.eddsa

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait Bytes extends js.Object

object Bytes {
  @scala.inline
  implicit def apply(value: Buffer): Bytes = value.asInstanceOf[Bytes]
  @scala.inline
  implicit def apply(value: String): Bytes = value.asInstanceOf[Bytes]
}

