package typingsSlinky.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonArraySchemaObject
  extends BaseSchemaObject
     with SchemaObject {
  
  var `type`: js.UndefOr[NonArraySchemaObjectType] = js.native
}
object NonArraySchemaObject {
  
  @scala.inline
  def apply(): NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonArraySchemaObject]
  }
  
  @scala.inline
  implicit class NonArraySchemaObjectOps[Self <: NonArraySchemaObject] (val x: Self) extends AnyVal {
    
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
    def setType(value: NonArraySchemaObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
