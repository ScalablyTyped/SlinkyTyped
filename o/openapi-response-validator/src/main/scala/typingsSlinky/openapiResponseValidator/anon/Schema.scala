package typingsSlinky.openapiResponseValidator.anon

import typingsSlinky.openapiTypes.mod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  var schema: typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject = js.native
}

object Schema {
  @scala.inline
  def apply(schema: typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Schema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

