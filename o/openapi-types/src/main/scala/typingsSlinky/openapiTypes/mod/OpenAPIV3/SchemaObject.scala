package typingsSlinky.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ArraySchemaObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject
*/
trait SchemaObject extends js.Object

object SchemaObject {
  @scala.inline
  implicit def apply(value: ArraySchemaObject): SchemaObject = value.asInstanceOf[SchemaObject]
  @scala.inline
  implicit def apply(value: NonArraySchemaObject): SchemaObject = value.asInstanceOf[SchemaObject]
}

