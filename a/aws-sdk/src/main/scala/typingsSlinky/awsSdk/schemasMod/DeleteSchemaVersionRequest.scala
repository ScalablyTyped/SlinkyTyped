package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaVersionRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: string = js.native
}
object DeleteSchemaVersionRequest {
  
  @scala.inline
  def apply(RegistryName: string, SchemaName: string, SchemaVersion: string): DeleteSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteSchemaVersionRequestMutableBuilder[Self <: DeleteSchemaVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
  }
}
