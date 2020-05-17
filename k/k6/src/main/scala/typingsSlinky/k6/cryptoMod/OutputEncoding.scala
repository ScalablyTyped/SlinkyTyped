package typingsSlinky.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.k6.cryptoMod.StringEncoding
  - typingsSlinky.k6.cryptoMod.BinaryEncoding
*/
trait OutputEncoding extends js.Object

object OutputEncoding {
  @scala.inline
  implicit def apply(value: BinaryEncoding): OutputEncoding = value.asInstanceOf[OutputEncoding]
  @scala.inline
  implicit def apply(value: StringEncoding): OutputEncoding = value.asInstanceOf[OutputEncoding]
}

