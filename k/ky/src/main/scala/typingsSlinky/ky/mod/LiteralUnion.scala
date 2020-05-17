package typingsSlinky.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - LiteralType
  - BaseType with js.Object
*/
trait LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] extends js.Object

object LiteralUnion {
  @scala.inline
  implicit def apply[LiteralType, BaseType](value: (BaseType with js.Object) | LiteralType): LiteralUnion[LiteralType, BaseType] = value.asInstanceOf[LiteralUnion[LiteralType, BaseType]]
}

