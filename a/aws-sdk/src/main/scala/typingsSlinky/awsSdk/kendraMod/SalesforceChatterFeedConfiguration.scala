package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceChatterFeedConfiguration extends StObject {
  
  /**
    * The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this is the Body column.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  
  /**
    * The name of the column in the Salesforce FeedItem table that contains the title of the document. This is typically the Title collumn.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  
  /**
    * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  
  /**
    * Filters the documents in the feed based on status of the user. When you specify ACTIVE_USERS only documents from users who have an active account are indexed. When you specify STANDARD_USER only documents for Salesforce standard users are documented. You can specify both.
    */
  var IncludeFilterTypes: js.UndefOr[SalesforceChatterFeedIncludeFilterTypes] = js.native
}
object SalesforceChatterFeedConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName): SalesforceChatterFeedConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceChatterFeedConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceChatterFeedConfigurationMutableBuilder[Self <: SalesforceChatterFeedConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentDataFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFilterTypes(value: SalesforceChatterFeedIncludeFilterTypes): Self = StObject.set(x, "IncludeFilterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFilterTypesUndefined: Self = StObject.set(x, "IncludeFilterTypes", js.undefined)
    
    @scala.inline
    def setIncludeFilterTypesVarargs(value: SalesforceChatterFeedIncludeFilterType*): Self = StObject.set(x, "IncludeFilterTypes", js.Array(value :_*))
  }
}
