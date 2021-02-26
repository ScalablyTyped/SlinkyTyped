package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCarrierGatewaysResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateways: js.UndefOr[CarrierGatewaySet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeCarrierGatewaysResult {
  
  @scala.inline
  def apply(): DescribeCarrierGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCarrierGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeCarrierGatewaysResultMutableBuilder[Self <: DescribeCarrierGatewaysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierGateways(value: CarrierGatewaySet): Self = StObject.set(x, "CarrierGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierGatewaysUndefined: Self = StObject.set(x, "CarrierGateways", js.undefined)
    
    @scala.inline
    def setCarrierGatewaysVarargs(value: CarrierGateway*): Self = StObject.set(x, "CarrierGateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
