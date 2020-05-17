package typingsSlinky.phosphorCoreutils.jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
  - typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
  - typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONArray
*/
trait ReadonlyJSONValue extends js.Object

object ReadonlyJSONValue {
  @scala.inline
  implicit def apply(value: JSONPrimitive): ReadonlyJSONValue = value.asInstanceOf[ReadonlyJSONValue]
  @scala.inline
  implicit def apply(value: ReadonlyJSONArray): ReadonlyJSONValue = value.asInstanceOf[ReadonlyJSONValue]
  @scala.inline
  implicit def apply(value: ReadonlyJSONObject): ReadonlyJSONValue = value.asInstanceOf[ReadonlyJSONValue]
}

