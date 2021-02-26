package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSchemaResponse extends StObject {
  
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[string] = js.native
  
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Tags] = js.native
  
  /**
    * The type of the schema.
    */
  var Type: js.UndefOr[string] = js.native
  
  /**
    * The date the schema version was created.
    */
  var VersionCreatedDate: js.UndefOr[js.Date] = js.native
}
object DescribeSchemaResponse {
  
  @scala.inline
  def apply(): DescribeSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSchemaResponse]
  }
  
  @scala.inline
  implicit class DescribeSchemaResponseMutableBuilder[Self <: DescribeSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: string): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVersionCreatedDate(value: js.Date): Self = StObject.set(x, "VersionCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCreatedDateUndefined: Self = StObject.set(x, "VersionCreatedDate", js.undefined)
  }
}
