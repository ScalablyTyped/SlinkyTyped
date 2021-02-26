package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSchemaVersionMetadataResponse extends StObject {
  
  /**
    * The latest version of the schema.
    */
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.native
  
  /**
    * The metadata key.
    */
  var MetadataKey: js.UndefOr[MetadataKeyString] = js.native
  
  /**
    * The value of the metadata key.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.native
  
  /**
    * The name for the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name for the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object PutSchemaVersionMetadataResponse {
  
  @scala.inline
  def apply(): PutSchemaVersionMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaVersionMetadataResponse]
  }
  
  @scala.inline
  implicit class PutSchemaVersionMetadataResponseMutableBuilder[Self <: PutSchemaVersionMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestVersion(value: LatestSchemaVersionBoolean): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: MetadataKeyString): Self = StObject.set(x, "MetadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataKeyUndefined: Self = StObject.set(x, "MetadataKey", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
