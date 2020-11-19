package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeParameterGroupsRequest extends js.Object {
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The names of the parameter groups.
    */
  var ParameterGroupNames: js.UndefOr[ParameterGroupNameList] = js.native
}
object DescribeParameterGroupsRequest {
  
  @scala.inline
  def apply(): DescribeParameterGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParameterGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeParameterGroupsRequestOps[Self <: DescribeParameterGroupsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: IntegerOptional): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setParameterGroupNamesVarargs(value: String*): Self = this.set("ParameterGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setParameterGroupNames(value: ParameterGroupNameList): Self = this.set("ParameterGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupNames: Self = this.set("ParameterGroupNames", js.undefined)
  }
}
