package typingsSlinky.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - O
  - js.Object
*/
trait Parsed[O /* <: js.UndefOr[js.Object] */] extends js.Object

object Parsed {
  @scala.inline
  implicit def apply[O](value: O): Parsed[O] = value.asInstanceOf[Parsed[O]]
  @scala.inline
  implicit def apply[O](value: js.Object): Parsed[O] = value.asInstanceOf[Parsed[O]]
}

