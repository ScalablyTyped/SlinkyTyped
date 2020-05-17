package typingsSlinky.antd.treeSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.treeSelectMod.RawValue
  - js.Array[
typingsSlinky.antd.treeSelectMod.LabeledValue | typingsSlinky.antd.treeSelectMod.RawValue]
  - typingsSlinky.antd.treeSelectMod.LabeledValue
*/
trait SelectValue extends js.Object

object SelectValue {
  @scala.inline
  implicit def apply(value: js.Array[LabeledValue | RawValue]): SelectValue = value.asInstanceOf[SelectValue]
  @scala.inline
  implicit def apply(value: LabeledValue): SelectValue = value.asInstanceOf[SelectValue]
  @scala.inline
  implicit def apply(value: RawValue): SelectValue = value.asInstanceOf[SelectValue]
}

