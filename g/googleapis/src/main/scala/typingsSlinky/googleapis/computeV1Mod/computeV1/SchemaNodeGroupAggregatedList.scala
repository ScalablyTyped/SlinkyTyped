package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeGroupAggregatedList extends StObject {
  
  /**
    * [Output Only] Unique identifier for the resource; defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A list of NodeGroupsScopedList resources.
    */
  var items: js.UndefOr[StringDictionary[SchemaNodeGroupsScopedList]] = js.native
  
  /**
    * [Output Only] Type of resource.Always compute#nodeGroupAggregatedList for
    * aggregated lists of node groups.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Informational warning message.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaNodeGroupAggregatedList {
  
  @scala.inline
  def apply(): SchemaNodeGroupAggregatedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupAggregatedList]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupAggregatedListMutableBuilder[Self <: SchemaNodeGroupAggregatedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: StringDictionary[SchemaNodeGroupsScopedList]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
