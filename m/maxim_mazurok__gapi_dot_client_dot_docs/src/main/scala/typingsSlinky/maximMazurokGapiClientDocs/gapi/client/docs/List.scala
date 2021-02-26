package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  /** The properties of the list. */
  var listProperties: js.UndefOr[ListProperties] = js.native
  
  /** The suggested deletion IDs. If empty, then there are no suggested deletions of this list. */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The suggested insertion ID. If empty, then this is not a suggested insertion. */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  
  /** The suggested changes to the list properties, keyed by suggestion ID. */
  var suggestedListPropertiesChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedListProperties}
    */ typingsSlinky.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.List with TopLevel[js.Any]
  ] = js.native
}
object List {
  
  @scala.inline
  def apply(): List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListProperties(value: ListProperties): Self = StObject.set(x, "listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPropertiesUndefined: Self = StObject.set(x, "listProperties", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = StObject.set(x, "suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdUndefined: Self = StObject.set(x, "suggestedInsertionId", js.undefined)
    
    @scala.inline
    def setSuggestedListPropertiesChanges(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedListProperties}
      */ typingsSlinky.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.List with TopLevel[js.Any]
    ): Self = StObject.set(x, "suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedListPropertiesChangesUndefined: Self = StObject.set(x, "suggestedListPropertiesChanges", js.undefined)
  }
}
