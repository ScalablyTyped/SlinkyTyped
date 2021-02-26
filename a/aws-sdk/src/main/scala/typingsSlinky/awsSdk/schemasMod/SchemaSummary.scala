package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSummary extends StObject {
  
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
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Tags] = js.native
  
  /**
    * The number of versions available for the schema.
    */
  var VersionCount: js.UndefOr[long] = js.native
}
object SchemaSummary {
  
  @scala.inline
  def apply(): SchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSummary]
  }
  
  @scala.inline
  implicit class SchemaSummaryMutableBuilder[Self <: SchemaSummary] (val x: Self) extends AnyVal {
    
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
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setVersionCount(value: long): Self = StObject.set(x, "VersionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCountUndefined: Self = StObject.set(x, "VersionCount", js.undefined)
  }
}
