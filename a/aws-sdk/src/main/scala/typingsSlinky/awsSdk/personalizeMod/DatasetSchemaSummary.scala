package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetSchemaSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that the schema was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The date and time (in Unix time) that the schema was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the schema.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
}
object DatasetSchemaSummary {
  
  @scala.inline
  def apply(): DatasetSchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSchemaSummary]
  }
  
  @scala.inline
  implicit class DatasetSchemaSummaryMutableBuilder[Self <: DatasetSchemaSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "schemaArn", js.undefined)
  }
}
