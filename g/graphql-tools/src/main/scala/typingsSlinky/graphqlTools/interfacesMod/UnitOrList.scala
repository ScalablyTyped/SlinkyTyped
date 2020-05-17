package typingsSlinky.graphqlTools.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Type
  - js.Array[Type]
*/
trait UnitOrList[Type] extends js.Object

object UnitOrList {
  @scala.inline
  implicit def apply[Type](value: js.Array[Type]): UnitOrList[Type] = value.asInstanceOf[UnitOrList[Type]]
  @scala.inline
  implicit def apply[Type](value: Type): UnitOrList[Type] = value.asInstanceOf[UnitOrList[Type]]
}

