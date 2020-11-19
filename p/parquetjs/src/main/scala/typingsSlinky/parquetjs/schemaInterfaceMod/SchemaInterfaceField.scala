package typingsSlinky.parquetjs.schemaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parquetjs.schemaInterfaceMod.SingleFieldInterface
  - typingsSlinky.parquetjs.schemaInterfaceMod.NestedFieldsInterface
*/
trait SchemaInterfaceField extends js.Object
object SchemaInterfaceField {
  
  @scala.inline
  def SingleFieldInterface(`type`: String): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
  
  @scala.inline
  def NestedFieldsInterface(fields: SchemaInterface): SchemaInterfaceField = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterfaceField]
  }
}
