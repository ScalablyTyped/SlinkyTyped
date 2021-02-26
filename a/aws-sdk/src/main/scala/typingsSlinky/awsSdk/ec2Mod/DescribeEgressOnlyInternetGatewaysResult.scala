package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEgressOnlyInternetGatewaysResult extends StObject {
  
  /**
    * Information about the egress-only internet gateways.
    */
  var EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeEgressOnlyInternetGatewaysResult {
  
  @scala.inline
  def apply(): DescribeEgressOnlyInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEgressOnlyInternetGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeEgressOnlyInternetGatewaysResultMutableBuilder[Self <: DescribeEgressOnlyInternetGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEgressOnlyInternetGateways(value: EgressOnlyInternetGatewayList): Self = StObject.set(x, "EgressOnlyInternetGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyInternetGatewaysUndefined: Self = StObject.set(x, "EgressOnlyInternetGateways", js.undefined)
    
    @scala.inline
    def setEgressOnlyInternetGatewaysVarargs(value: EgressOnlyInternetGateway*): Self = StObject.set(x, "EgressOnlyInternetGateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
