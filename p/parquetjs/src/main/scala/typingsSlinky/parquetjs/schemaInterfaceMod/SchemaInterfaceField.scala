package typingsSlinky.parquetjs.schemaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parquetjs.schemaInterfaceMod.SingleFieldInterface
  - typingsSlinky.parquetjs.schemaInterfaceMod.NestedFieldsInterface
*/
trait SchemaInterfaceField extends js.Object

object SchemaInterfaceField {
  @scala.inline
  implicit def apply(value: NestedFieldsInterface): SchemaInterfaceField = value.asInstanceOf[SchemaInterfaceField]
  @scala.inline
  implicit def apply(value: SingleFieldInterface): SchemaInterfaceField = value.asInstanceOf[SchemaInterfaceField]
}

