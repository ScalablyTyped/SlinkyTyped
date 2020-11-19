package typingsSlinky.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ArraySchemaObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject
*/
trait SchemaObject extends js.Object
object SchemaObject {
  
  @scala.inline
  def ArraySchemaObject(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): SchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
  
  @scala.inline
  def NonArraySchemaObject(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
}
