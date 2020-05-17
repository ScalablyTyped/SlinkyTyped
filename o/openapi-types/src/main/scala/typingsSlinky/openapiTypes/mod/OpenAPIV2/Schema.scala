package typingsSlinky.openapiTypes.mod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SchemaObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.ReferenceObject
*/
trait Schema extends js.Object

object Schema {
  @scala.inline
  implicit def apply(value: ReferenceObject): Schema = value.asInstanceOf[Schema]
  @scala.inline
  implicit def apply(value: SchemaObject): Schema = value.asInstanceOf[Schema]
}

