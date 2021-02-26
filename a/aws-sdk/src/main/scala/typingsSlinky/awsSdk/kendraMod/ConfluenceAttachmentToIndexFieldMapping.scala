package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceAttachmentToIndexFieldMapping extends StObject {
  
  /**
    * The name of the field in the data source.  You must first create the index field using the operation. 
    */
  var DataSourceFieldName: js.UndefOr[ConfluenceAttachmentFieldName] = js.native
  
  /**
    * The format for date fields in the data source. If the field specified in DataSourceFieldName is a date field you must specify the date format. If the field is not a date field, an exception is thrown.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.native
  
  /**
    * The name of the index field to map to the Confluence data source field. The index field type must match the Confluence field type.
    */
  var IndexFieldName: js.UndefOr[typingsSlinky.awsSdk.kendraMod.IndexFieldName] = js.native
}
object ConfluenceAttachmentToIndexFieldMapping {
  
  @scala.inline
  def apply(): ConfluenceAttachmentToIndexFieldMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceAttachmentToIndexFieldMapping]
  }
  
  @scala.inline
  implicit class ConfluenceAttachmentToIndexFieldMappingMutableBuilder[Self <: ConfluenceAttachmentToIndexFieldMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceFieldName(value: ConfluenceAttachmentFieldName): Self = StObject.set(x, "DataSourceFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceFieldNameUndefined: Self = StObject.set(x, "DataSourceFieldName", js.undefined)
    
    @scala.inline
    def setDateFieldFormat(value: DataSourceDateFieldFormat): Self = StObject.set(x, "DateFieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldFormatUndefined: Self = StObject.set(x, "DateFieldFormat", js.undefined)
    
    @scala.inline
    def setIndexFieldName(value: IndexFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldNameUndefined: Self = StObject.set(x, "IndexFieldName", js.undefined)
  }
}
