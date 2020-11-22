package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSchemaResponse extends js.Object {
  
  /**
    * The schema compatibility mode.
    */
  var Compatibility: js.UndefOr[typingsSlinky.awsSdk.glueMod.Compatibility] = js.native
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: js.UndefOr[typingsSlinky.awsSdk.glueMod.DataFormat] = js.native
  
  /**
    * A description of the schema if specified when created.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The latest version of the schema associated with the returned schema definition.
    */
  var LatestSchemaVersion: js.UndefOr[VersionLongNumber] = js.native
  
  /**
    * The next version of the schema associated with the returned schema definition.
    */
  var NextSchemaVersion: js.UndefOr[VersionLongNumber] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The version number of the checkpoint (the last time the compatibility mode was changed).
    */
  var SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The status of the schema. 
    */
  var SchemaStatus: js.UndefOr[typingsSlinky.awsSdk.glueMod.SchemaStatus] = js.native
  
  /**
    * The unique identifier of the first schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The status of the first schema version created.
    */
  var SchemaVersionStatus: js.UndefOr[typingsSlinky.awsSdk.glueMod.SchemaVersionStatus] = js.native
  
  /**
    * The tags for the schema.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}
object CreateSchemaResponse {
  
  @scala.inline
  def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  
  @scala.inline
  implicit class CreateSchemaResponseOps[Self <: CreateSchemaResponse] (val x: Self) extends AnyVal {
    
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
    def setCompatibility(value: Compatibility): Self = this.set("Compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("Compatibility", js.undefined)
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("DataFormat", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLatestSchemaVersion(value: VersionLongNumber): Self = this.set("LatestSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestSchemaVersion: Self = this.set("LatestSchemaVersion", js.undefined)
    
    @scala.inline
    def setNextSchemaVersion(value: VersionLongNumber): Self = this.set("NextSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSchemaVersion: Self = this.set("NextSchemaVersion", js.undefined)
    
    @scala.inline
    def setRegistryArn(value: GlueResourceArn): Self = this.set("RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryArn: Self = this.set("RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaCheckpoint(value: SchemaCheckpointNumber): Self = this.set("SchemaCheckpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaCheckpoint: Self = this.set("SchemaCheckpoint", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaStatus(value: SchemaStatus): Self = this.set("SchemaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaStatus: Self = this.set("SchemaStatus", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionId: Self = this.set("SchemaVersionId", js.undefined)
    
    @scala.inline
    def setSchemaVersionStatus(value: SchemaVersionStatus): Self = this.set("SchemaVersionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionStatus: Self = this.set("SchemaVersionStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
