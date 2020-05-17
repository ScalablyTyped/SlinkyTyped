package typingsSlinky.antd.formItemMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactElement
  - typingsSlinky.antd.formItemMod.RenderChildren
  - js.Array[typingsSlinky.react.mod.ReactElement]
  - scala.Null
*/
trait ChildrenType extends js.Object

object ChildrenType {
  @scala.inline
  implicit def apply(value: js.Array[ReactElement]): ChildrenType = value.asInstanceOf[ChildrenType]
  @scala.inline
  implicit def apply(value: Null): ChildrenType = value.asInstanceOf[ChildrenType]
  @scala.inline
  implicit def apply(value: ReactElement): ChildrenType = value.asInstanceOf[ChildrenType]
  @scala.inline
  implicit def apply(value: RenderChildren): ChildrenType = value.asInstanceOf[ChildrenType]
}

