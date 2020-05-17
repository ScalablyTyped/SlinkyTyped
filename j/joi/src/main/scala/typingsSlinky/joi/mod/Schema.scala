package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.joi.mod.AnySchema
  - typingsSlinky.joi.mod.ArraySchema
  - typingsSlinky.joi.mod.AlternativesSchema
  - typingsSlinky.joi.mod.BinarySchema
  - typingsSlinky.joi.mod.BooleanSchema
  - typingsSlinky.joi.mod.DateSchema
  - typingsSlinky.joi.mod.FunctionSchema
  - typingsSlinky.joi.mod.NumberSchema
  - typingsSlinky.joi.mod.ObjectSchema
  - typingsSlinky.joi.mod.StringSchema
  - typingsSlinky.joi.mod.LazySchema
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

