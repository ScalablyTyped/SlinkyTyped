package typingsSlinky.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterVpcConfig extends js.Object {
  
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: String = js.native
  
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled.
    */
  var endpointPrivateAccess: Boolean = js.native
  
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled.
    */
  var endpointPublicAccess: Boolean = js.native
  
  /**
    * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint.
    */
  var publicAccessCidrs: js.Array[String] = js.native
  
  /**
    * List of security group IDs
    */
  var securityGroupIds: js.Array[String] = js.native
  
  /**
    * List of subnet IDs
    */
  var subnetIds: js.Array[String] = js.native
  
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: String = js.native
}
object GetClusterVpcConfig {
  
  @scala.inline
  def apply(
    clusterSecurityGroupId: String,
    endpointPrivateAccess: Boolean,
    endpointPublicAccess: Boolean,
    publicAccessCidrs: js.Array[String],
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetClusterVpcConfig = {
    val __obj = js.Dynamic.literal(clusterSecurityGroupId = clusterSecurityGroupId.asInstanceOf[js.Any], endpointPrivateAccess = endpointPrivateAccess.asInstanceOf[js.Any], endpointPublicAccess = endpointPublicAccess.asInstanceOf[js.Any], publicAccessCidrs = publicAccessCidrs.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterVpcConfig]
  }
  
  @scala.inline
  implicit class GetClusterVpcConfigOps[Self <: GetClusterVpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterSecurityGroupId(value: String): Self = this.set("clusterSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPrivateAccess(value: Boolean): Self = this.set("endpointPrivateAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPublicAccess(value: Boolean): Self = this.set("endpointPublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessCidrsVarargs(value: String*): Self = this.set("publicAccessCidrs", js.Array(value :_*))
    
    @scala.inline
    def setPublicAccessCidrs(value: js.Array[String]): Self = this.set("publicAccessCidrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
}
