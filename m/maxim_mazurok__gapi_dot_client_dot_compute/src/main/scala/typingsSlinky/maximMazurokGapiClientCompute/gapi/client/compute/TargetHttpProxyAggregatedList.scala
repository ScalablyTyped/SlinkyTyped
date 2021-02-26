package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHttpProxyAggregatedList extends StObject {
  
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** A list of TargetHttpProxiesScopedList resources. */
  var items: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.TargetHttpProxiesScopedList}
    */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.TargetHttpProxyAggregatedList with TopLevel[js.Any]
  ] = js.native
  
  /** [Output Only] Type of resource. Always compute#targetHttpProxyAggregatedList for lists of Target HTTP Proxies. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the
    * query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output Only] Unreachable resources. */
  var unreachables: js.UndefOr[js.Array[String]] = js.native
}
object TargetHttpProxyAggregatedList {
  
  @scala.inline
  def apply(): TargetHttpProxyAggregatedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHttpProxyAggregatedList]
  }
  
  @scala.inline
  implicit class TargetHttpProxyAggregatedListMutableBuilder[Self <: TargetHttpProxyAggregatedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.TargetHttpProxiesScopedList}
      */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.TargetHttpProxyAggregatedList with TopLevel[js.Any]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
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
    def setUnreachables(value: js.Array[String]): Self = StObject.set(x, "unreachables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachablesUndefined: Self = StObject.set(x, "unreachables", js.undefined)
    
    @scala.inline
    def setUnreachablesVarargs(value: String*): Self = StObject.set(x, "unreachables", js.Array(value :_*))
  }
}
