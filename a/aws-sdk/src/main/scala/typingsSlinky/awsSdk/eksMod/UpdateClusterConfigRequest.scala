package typingsSlinky.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String = js.native
  
  var resourcesVpcConfig: js.UndefOr[VpcConfigRequest] = js.native
}
object UpdateClusterConfigRequest {
  
  @scala.inline
  def apply(name: String): UpdateClusterConfigRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterConfigRequest]
  }
  
  @scala.inline
  implicit class UpdateClusterConfigRequestMutableBuilder[Self <: UpdateClusterConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVpcConfig(value: VpcConfigRequest): Self = StObject.set(x, "resourcesVpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVpcConfigUndefined: Self = StObject.set(x, "resourcesVpcConfig", js.undefined)
  }
}
