package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlatformBranchesRequest extends js.Object {
  
  /**
    * Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical conjunction (AND) of the separate SearchFilter terms. The following list shows valid attribute values for each of the SearchFilter terms. Most operators take a single value. The in and not_in operators can take multiple values.    Attribute = BranchName:    Operator: = | != | begins_with | ends_with | contains | in | not_in       Attribute = LifecycleState:    Operator: = | != | in | not_in     Values: beta | supported | deprecated | retired       Attribute = PlatformName:    Operator: = | != | begins_with | ends_with | contains | in | not_in       Attribute = TierType:    Operator: = | !=     Values: WebServer/Standard | Worker/SQS/HTTP      Array size: limited to 10 SearchFilter objects. Within each SearchFilter item, the Values array is limited to 10 items.
    */
  var Filters: js.UndefOr[SearchFilters] = js.native
  
  /**
    * The maximum number of platform branch values returned in one call.
    */
  var MaxRecords: js.UndefOr[PlatformBranchMaxRecords] = js.native
  
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListPlatformBranchesRequest {
  
  @scala.inline
  def apply(): ListPlatformBranchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformBranchesRequest]
  }
  
  @scala.inline
  implicit class ListPlatformBranchesRequestOps[Self <: ListPlatformBranchesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiltersVarargs(value: SearchFilter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SearchFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: PlatformBranchMaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
