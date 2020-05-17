package typingsSlinky.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - O with P
  - P
*/
trait Valid[O /* <: js.UndefOr[js.Object] */, P /* <: js.Object */] extends js.Object

object Valid {
  @scala.inline
  implicit def apply[O, P](value: (O with P) | P): Valid[O, P] = value.asInstanceOf[Valid[O, P]]
}

