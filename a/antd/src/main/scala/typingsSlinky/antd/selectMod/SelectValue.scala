package typingsSlinky.antd.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antd.selectMod.RawValue
  - js.Array[
typingsSlinky.antd.selectMod.LabeledValue | typingsSlinky.antd.selectMod.RawValue]
  - typingsSlinky.antd.selectMod.LabeledValue
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

