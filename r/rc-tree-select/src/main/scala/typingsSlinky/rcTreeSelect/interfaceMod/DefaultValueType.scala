package typingsSlinky.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
  - js.Array[
typingsSlinky.rcTreeSelect.interfaceMod.LabelValueType | typingsSlinky.rcTreeSelect.interfaceMod.RawValueType]
  - typingsSlinky.rcTreeSelect.interfaceMod.LabelValueType
*/
trait DefaultValueType extends js.Object

object DefaultValueType {
  @scala.inline
  implicit def apply(value: js.Array[LabelValueType | RawValueType]): DefaultValueType = value.asInstanceOf[DefaultValueType]
  @scala.inline
  implicit def apply(value: LabelValueType): DefaultValueType = value.asInstanceOf[DefaultValueType]
  @scala.inline
  implicit def apply(value: RawValueType): DefaultValueType = value.asInstanceOf[DefaultValueType]
}

