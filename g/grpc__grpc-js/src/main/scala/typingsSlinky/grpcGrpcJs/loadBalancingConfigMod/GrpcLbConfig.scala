package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcLbConfig extends StObject {
  
  var childPolicy: js.Array[LoadBalancingConfig] = js.native
}
object GrpcLbConfig {
  
  @scala.inline
  def apply(childPolicy: js.Array[LoadBalancingConfig]): GrpcLbConfig = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcLbConfig]
  }
  
  @scala.inline
  implicit class GrpcLbConfigMutableBuilder[Self <: GrpcLbConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildPolicy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildPolicyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "childPolicy", js.Array(value :_*))
  }
}
