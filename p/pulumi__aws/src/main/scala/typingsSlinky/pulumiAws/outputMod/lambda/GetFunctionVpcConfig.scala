package typingsSlinky.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionVpcConfig extends StObject {
  
  var securityGroupIds: js.Array[String] = js.native
  
  var subnetIds: js.Array[String] = js.native
  
  var vpcId: String = js.native
}
object GetFunctionVpcConfig {
  
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): GetFunctionVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionVpcConfig]
  }
  
  @scala.inline
  implicit class GetFunctionVpcConfigMutableBuilder[Self <: GetFunctionVpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
