package typingsSlinky.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpnGatewayFilter extends StObject {
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnGateways.html).
    */
  var name: String = js.native
  
  /**
    * Set of values that are accepted for the given field.
    * A VPN Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}
object GetVpnGatewayFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpnGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnGatewayFilter]
  }
  
  @scala.inline
  implicit class GetVpnGatewayFilterMutableBuilder[Self <: GetVpnGatewayFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
