package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcesInput extends js.Object {
  
  /**
    * Specifies whether to exclude resources that are compliant with the tag policy. Set this to true if you are interested in retrieving information on noncompliant resources only. You can use this parameter only if the IncludeComplianceDetails parameter is also set to true.
    */
  var ExcludeCompliantResources: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ExcludeCompliantResources] = js.native
  
  /**
    * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to true to determine whether resources are compliant with the tag policy and to get details.
    */
  var IncludeComplianceDetails: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.IncludeComplianceDetails] = js.native
  
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  
  /**
    * The constraints on the resources that you want returned. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the AWS General Reference for the following:   For a list of service name strings, see AWS Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.   You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the length constraint requirement applies to each resource type filter. 
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.native
  
  /**
    * A limit that restricts the number of resources returned by GetResources in paginated output. You can set ResourcesPerPage to a minimum of 1 item and the maximum of 100 items. 
    */
  var ResourcesPerPage: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourcesPerPage] = js.native
  
  /**
    * A list of TagFilters (keys and values). Each TagFilter specified must contain a key with values as optional. A request can include up to 50 keys, and each key can include up to 20 values.  Note the following when deciding how to use TagFilters:   If you do specify a TagFilter, the response returns only those resources that are currently associated with the specified tag.    If you don't specify a TagFilter, the response includes all resources that were ever associated with tags. Resources that currently don't have associated tags are shown with an empty tag set, like this: "Tags": [].   If you specify more than one filter in a single request, the response returns only those resources that satisfy all specified filters.   If you specify a filter that contains more than one value for a key, the response returns resources that match any of the specified values for that key.   If you don't specify any values for a key, the response returns resources that are tagged with that key irrespective of the value. For example, for filters: filter1 = {key1, {value1}}, filter2 = {key2, {value2,value3,value4}} , filter3 = {key3}:   GetResources( {filter1} ) returns resources tagged with key1=value1   GetResources( {filter2} ) returns resources tagged with key2=value2 or key2=value3 or key2=value4   GetResources( {filter3} ) returns resources tagged with any tag containing key3 as its tag key, irrespective of its value   GetResources( {filter1,filter2,filter3} ) returns resources tagged with ( key1=value1) and ( key2=value2 or key2=value3 or key2=value4) and (key3, irrespective of the value)    
    */
  var TagFilters: js.UndefOr[TagFilterList] = js.native
  
  /**
    * AWS recommends using ResourcesPerPage instead of this parameter. A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A resource with no tags is counted as having one tag (one key and value pair).  GetResources does not split a resource and its associated tags across pages. If the specified TagsPerPage would cause such a break, a PaginationToken is returned in place of the affected resource and its tags. Use that token in another request to get the remaining data. For example, if you specify a TagsPerPage of 100 and the account has 22 resources with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of three pages. The first page displays the first 10 resources, each with its 10 tags. The second page displays the next 10 resources, each with its 10 tags. The third page displays the remaining 2 resources, each with its 10 tags. You can set TagsPerPage to a minimum of 100 items and the maximum of 500 items.
    */
  var TagsPerPage: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.TagsPerPage] = js.native
}
object GetResourcesInput {
  
  @scala.inline
  def apply(): GetResourcesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesInput]
  }
  
  @scala.inline
  implicit class GetResourcesInputOps[Self <: GetResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludeCompliantResources(value: ExcludeCompliantResources): Self = this.set("ExcludeCompliantResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeCompliantResources: Self = this.set("ExcludeCompliantResources", js.undefined)
    
    @scala.inline
    def setIncludeComplianceDetails(value: IncludeComplianceDetails): Self = this.set("IncludeComplianceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeComplianceDetails: Self = this.set("IncludeComplianceDetails", js.undefined)
    
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
    
    @scala.inline
    def setResourceTypeFiltersVarargs(value: AmazonResourceType*): Self = this.set("ResourceTypeFilters", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypeFilters(value: ResourceTypeFilterList): Self = this.set("ResourceTypeFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypeFilters: Self = this.set("ResourceTypeFilters", js.undefined)
    
    @scala.inline
    def setResourcesPerPage(value: ResourcesPerPage): Self = this.set("ResourcesPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcesPerPage: Self = this.set("ResourcesPerPage", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: TagFilter*): Self = this.set("TagFilters", js.Array(value :_*))
    
    @scala.inline
    def setTagFilters(value: TagFilterList): Self = this.set("TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFilters: Self = this.set("TagFilters", js.undefined)
    
    @scala.inline
    def setTagsPerPage(value: TagsPerPage): Self = this.set("TagsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsPerPage: Self = this.set("TagsPerPage", js.undefined)
  }
}
