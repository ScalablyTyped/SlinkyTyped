package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRemediationExecutionStatusResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of remediation execution statuses objects.
    */
  var RemediationExecutionStatuses: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.RemediationExecutionStatuses] = js.native
}
object DescribeRemediationExecutionStatusResponse {
  
  @scala.inline
  def apply(): DescribeRemediationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeRemediationExecutionStatusResponseMutableBuilder[Self <: DescribeRemediationExecutionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRemediationExecutionStatuses(value: RemediationExecutionStatuses): Self = StObject.set(x, "RemediationExecutionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationExecutionStatusesUndefined: Self = StObject.set(x, "RemediationExecutionStatuses", js.undefined)
    
    @scala.inline
    def setRemediationExecutionStatusesVarargs(value: RemediationExecutionStatus*): Self = StObject.set(x, "RemediationExecutionStatuses", js.Array(value :_*))
  }
}
