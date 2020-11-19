package typingsSlinky.openapiResponseValidator.anon

import typingsSlinky.openapiTypes.mod.OpenAPIV3.SchemaObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSchema(value: typingsSlinky.openapiTypes.mod.OpenAPIV2.Schema | SchemaObject): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
