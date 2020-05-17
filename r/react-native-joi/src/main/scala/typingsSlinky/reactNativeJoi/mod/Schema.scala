package typingsSlinky.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeJoi.mod.AnySchema
  - typingsSlinky.reactNativeJoi.mod.ArraySchema
  - typingsSlinky.reactNativeJoi.mod.AlternativesSchema
  - typingsSlinky.reactNativeJoi.mod.BinarySchema
  - typingsSlinky.reactNativeJoi.mod.BooleanSchema
  - typingsSlinky.reactNativeJoi.mod.DateSchema
  - typingsSlinky.reactNativeJoi.mod.FunctionSchema
  - typingsSlinky.reactNativeJoi.mod.NumberSchema
  - typingsSlinky.reactNativeJoi.mod.ObjectSchema
  - typingsSlinky.reactNativeJoi.mod.StringSchema
  - typingsSlinky.reactNativeJoi.mod.LazySchema
*/
trait Schema extends SchemaLike

object Schema {
  @scala.inline
  implicit def apply(value: AnySchema | LazySchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: AlternativesSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: ArraySchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: BinarySchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: BooleanSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: DateSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: FunctionSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: NumberSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: ObjectSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: StringSchema): Schema = value.asInstanceOf[Schema]
}

