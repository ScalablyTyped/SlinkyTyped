package typingsSlinky.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ArraySchemaObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject
*/
trait SchemaObject extends StObject
object SchemaObject {
  
  @scala.inline
  def ArraySchemaObject(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): typingsSlinky.openapiTypes.mod.OpenAPIV3.ArraySchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV3.ArraySchemaObject]
  }
  
  @scala.inline
  def NonArraySchemaObject(): typingsSlinky.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject]
  }
}
