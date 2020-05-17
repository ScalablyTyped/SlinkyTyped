package typingsSlinky.jsonSchemaTyped.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonSchemaTyped.mod.JSONSchemaTypeName
  - typingsSlinky.jsonSchemaTyped.mod.JSONSchemaType
  - js.Array[
typingsSlinky.jsonSchemaTyped.mod.JSONSchemaType | typingsSlinky.jsonSchemaTyped.mod.JSONSchemaTypeName]
*/
trait JSONSchemaTypeValue extends js.Object

object JSONSchemaTypeValue {
  @scala.inline
  implicit def apply(value: js.Array[JSONSchemaType | JSONSchemaTypeName]): JSONSchemaTypeValue = value.asInstanceOf[JSONSchemaTypeValue]
  @scala.inline
  implicit def apply(value: JSONSchemaType): JSONSchemaTypeValue = value.asInstanceOf[JSONSchemaTypeValue]
  @scala.inline
  implicit def apply(value: JSONSchemaTypeName): JSONSchemaTypeValue = value.asInstanceOf[JSONSchemaTypeValue]
}

