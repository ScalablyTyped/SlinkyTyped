package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableManagedRuleGroupsResponse extends StObject {
  
  /**
    * 
    */
  var ManagedRuleGroups: js.UndefOr[ManagedRuleGroupSummaries] = js.native
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.NextMarker] = js.native
}
object ListAvailableManagedRuleGroupsResponse {
  
  @scala.inline
  def apply(): ListAvailableManagedRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagedRuleGroupsResponse]
  }
  
  @scala.inline
  implicit class ListAvailableManagedRuleGroupsResponseMutableBuilder[Self <: ListAvailableManagedRuleGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedRuleGroups(value: ManagedRuleGroupSummaries): Self = StObject.set(x, "ManagedRuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedRuleGroupsUndefined: Self = StObject.set(x, "ManagedRuleGroups", js.undefined)
    
    @scala.inline
    def setManagedRuleGroupsVarargs(value: ManagedRuleGroupSummary*): Self = StObject.set(x, "ManagedRuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
