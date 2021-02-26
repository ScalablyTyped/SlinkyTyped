package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticLoadBalancersRequest extends StObject {
  
  /**
    * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  
  /**
    * A stack ID. The action describes the stack's Elastic Load Balancing instances.
    */
  var StackId: js.UndefOr[String] = js.native
}
object DescribeElasticLoadBalancersRequest {
  
  @scala.inline
  def apply(): DescribeElasticLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticLoadBalancersRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticLoadBalancersRequestMutableBuilder[Self <: DescribeElasticLoadBalancersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "LayerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
