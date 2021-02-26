package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComplianceByResourceResponse extends StObject {
  
  /**
    * Indicates whether the specified AWS resource complies with all of the AWS Config rules that evaluate it.
    */
  var ComplianceByResources: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceByResources] = js.native
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeComplianceByResourceResponse {
  
  @scala.inline
  def apply(): DescribeComplianceByResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByResourceResponse]
  }
  
  @scala.inline
  implicit class DescribeComplianceByResourceResponseMutableBuilder[Self <: DescribeComplianceByResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceByResources(value: ComplianceByResources): Self = StObject.set(x, "ComplianceByResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceByResourcesUndefined: Self = StObject.set(x, "ComplianceByResources", js.undefined)
    
    @scala.inline
    def setComplianceByResourcesVarargs(value: ComplianceByResource*): Self = StObject.set(x, "ComplianceByResources", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
