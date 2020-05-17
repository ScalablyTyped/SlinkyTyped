package typingsSlinky.k6.cryptoMod

import typingsSlinky.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.k6.mod.bytes
  - java.lang.String
*/
trait Output[OE /* <: OutputEncoding */] extends js.Object

object Output {
  @scala.inline
  implicit def apply[OE](value: String): Output[OE] = value.asInstanceOf[Output[OE]]
  @scala.inline
  implicit def apply[OE](value: bytes): Output[OE] = value.asInstanceOf[Output[OE]]
}

