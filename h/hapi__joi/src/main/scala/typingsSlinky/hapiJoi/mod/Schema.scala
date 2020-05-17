package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiJoi.mod.AnySchema
  - typingsSlinky.hapiJoi.mod.ArraySchema
  - typingsSlinky.hapiJoi.mod.AlternativesSchema
  - typingsSlinky.hapiJoi.mod.BinarySchema
  - typingsSlinky.hapiJoi.mod.BooleanSchema
  - typingsSlinky.hapiJoi.mod.DateSchema
  - typingsSlinky.hapiJoi.mod.FunctionSchema
  - typingsSlinky.hapiJoi.mod.NumberSchema
  - typingsSlinky.hapiJoi.mod.ObjectSchema[js.Any]
  - typingsSlinky.hapiJoi.mod.StringSchema
  - typingsSlinky.hapiJoi.mod.LinkSchema
  - typingsSlinky.hapiJoi.mod.SymbolSchema
*/
trait Schema extends SchemaLike

object Schema {
  @scala.inline
  implicit def apply(value: AlternativesSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: AnySchema): Schema = value.asInstanceOf[Schema]
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
  implicit def apply(value: LinkSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: NumberSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: ObjectSchema[js.Any]): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: StringSchema): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: SymbolSchema): Schema = value.asInstanceOf[Schema]
}

