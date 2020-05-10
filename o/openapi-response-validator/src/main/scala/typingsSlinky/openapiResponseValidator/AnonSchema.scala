package typingsSlinky.openapiResponseValidator

import typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema
import typingsSlinky.openapiTypes.mod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSchema extends js.Object {
  var schema: Schema | SchemaObject = js.native
}

object AnonSchema {
  @scala.inline
  def apply(schema: Schema | SchemaObject): AnonSchema = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchema]
  }
  @scala.inline
  implicit class AnonSchemaOps[Self <: AnonSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: Schema | SchemaObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

