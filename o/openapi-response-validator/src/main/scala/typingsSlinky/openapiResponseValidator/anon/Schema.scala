package typingsSlinky.openapiResponseValidator.anon

import typingsSlinky.openapiTypes.mod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var schema: typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject
}

object Schema {
  @scala.inline
  def apply(schema: typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

