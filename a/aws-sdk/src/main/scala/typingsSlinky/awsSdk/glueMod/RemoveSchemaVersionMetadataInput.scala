package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSchemaVersionMetadataInput extends js.Object {
  
  /**
    * The value of the metadata key.
    */
  var MetadataKeyValue: MetadataKeyValuePair = js.native
  
  /**
    * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: js.UndefOr[typingsSlinky.awsSdk.glueMod.SchemaId] = js.native
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[typingsSlinky.awsSdk.glueMod.SchemaVersionNumber] = js.native
}
object RemoveSchemaVersionMetadataInput {
  
  @scala.inline
  def apply(MetadataKeyValue: MetadataKeyValuePair): RemoveSchemaVersionMetadataInput = {
    val __obj = js.Dynamic.literal(MetadataKeyValue = MetadataKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSchemaVersionMetadataInput]
  }
  
  @scala.inline
  implicit class RemoveSchemaVersionMetadataInputOps[Self <: RemoveSchemaVersionMetadataInput] (val x: Self) extends AnyVal {
    
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
    def setMetadataKeyValue(value: MetadataKeyValuePair): Self = this.set("MetadataKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = this.set("SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaId: Self = this.set("SchemaId", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionId: Self = this.set("SchemaVersionId", js.undefined)
    
    @scala.inline
    def setSchemaVersionNumber(value: SchemaVersionNumber): Self = this.set("SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionNumber: Self = this.set("SchemaVersionNumber", js.undefined)
  }
}
