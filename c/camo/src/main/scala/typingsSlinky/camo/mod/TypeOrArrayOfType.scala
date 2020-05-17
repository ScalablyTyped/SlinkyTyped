package typingsSlinky.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Type
  - js.Array[Type]
*/
trait TypeOrArrayOfType[Type] extends js.Object

object TypeOrArrayOfType {
  @scala.inline
  implicit def apply[Type](value: js.Array[Type]): TypeOrArrayOfType[Type] = value.asInstanceOf[TypeOrArrayOfType[Type]]
  @scala.inline
  implicit def apply[Type](value: Type): TypeOrArrayOfType[Type] = value.asInstanceOf[TypeOrArrayOfType[Type]]
}

