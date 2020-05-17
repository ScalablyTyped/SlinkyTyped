package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dndCore.interfacesMod.Identifier
  - js.Array[typingsSlinky.dndCore.interfacesMod.Identifier]
*/
trait TargetType extends js.Object

object TargetType {
  @scala.inline
  implicit def apply(value: js.Array[Identifier]): TargetType = value.asInstanceOf[TargetType]
  @scala.inline
  implicit def apply(value: Identifier): TargetType = value.asInstanceOf[TargetType]
}

