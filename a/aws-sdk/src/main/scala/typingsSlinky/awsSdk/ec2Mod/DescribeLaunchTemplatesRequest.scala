package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLaunchTemplatesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    create-time - The time the launch template was created.    launch-template-name - The name of the launch template.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * One or more launch template IDs.
    */
  var LaunchTemplateIds: js.UndefOr[LaunchTemplateIdStringList] = js.native
  
  /**
    * One or more launch template names.
    */
  var LaunchTemplateNames: js.UndefOr[LaunchTemplateNameStringList] = js.native
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[DescribeLaunchTemplatesMaxResults] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeLaunchTemplatesRequest {
  
  @scala.inline
  def apply(): DescribeLaunchTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplatesRequest]
  }
  
  @scala.inline
  implicit class DescribeLaunchTemplatesRequestMutableBuilder[Self <: DescribeLaunchTemplatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateIds(value: LaunchTemplateIdStringList): Self = StObject.set(x, "LaunchTemplateIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdsUndefined: Self = StObject.set(x, "LaunchTemplateIds", js.undefined)
    
    @scala.inline
    def setLaunchTemplateIdsVarargs(value: LaunchTemplateId*): Self = StObject.set(x, "LaunchTemplateIds", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateNames(value: LaunchTemplateNameStringList): Self = StObject.set(x, "LaunchTemplateNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNamesUndefined: Self = StObject.set(x, "LaunchTemplateNames", js.undefined)
    
    @scala.inline
    def setLaunchTemplateNamesVarargs(value: LaunchTemplateName*): Self = StObject.set(x, "LaunchTemplateNames", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeLaunchTemplatesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
