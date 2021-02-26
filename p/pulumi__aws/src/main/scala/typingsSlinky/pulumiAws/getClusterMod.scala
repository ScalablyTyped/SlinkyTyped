package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.cloudhsmv2.GetClusterClusterCertificates
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClusterMod {
  
  @JSImport("@pulumi/aws/cloudhsmv2/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/cloudhsmv2/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @js.native
  trait GetClusterArgs extends StObject {
    
    /**
      * The id of Cloud HSM v2 cluster.
      */
    val clusterId: String = js.native
    
    /**
      * The state of the cluster to be found.
      */
    val clusterState: js.UndefOr[String] = js.native
  }
  object GetClusterArgs {
    
    @scala.inline
    def apply(clusterId: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    @scala.inline
    implicit class GetClusterArgsMutableBuilder[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterState(value: String): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterStateUndefined: Self = StObject.set(x, "clusterState", js.undefined)
    }
  }
  
  @js.native
  trait GetClusterResult extends StObject {
    
    /**
      * The list of cluster certificates.
      * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
      * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state.
      * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
      * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
      * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
      * The number of available cluster certificates may vary depending on state of the cluster.
      */
    val clusterCertificates: GetClusterClusterCertificates = js.native
    
    val clusterId: String = js.native
    
    val clusterState: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ID of the security group associated with the CloudHSM cluster.
      */
    val securityGroupId: String = js.native
    
    /**
      * The IDs of subnets in which cluster operates.
      */
    val subnetIds: js.Array[String] = js.native
    
    /**
      * The id of the VPC that the CloudHSM cluster resides in.
      */
    val vpcId: String = js.native
  }
  object GetClusterResult {
    
    @scala.inline
    def apply(
      clusterCertificates: GetClusterClusterCertificates,
      clusterId: String,
      clusterState: String,
      id: String,
      securityGroupId: String,
      subnetIds: js.Array[String],
      vpcId: String
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(clusterCertificates = clusterCertificates.asInstanceOf[js.Any], clusterId = clusterId.asInstanceOf[js.Any], clusterState = clusterState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    @scala.inline
    implicit class GetClusterResultMutableBuilder[Self <: GetClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterCertificates(value: GetClusterClusterCertificates): Self = StObject.set(x, "clusterCertificates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterState(value: String): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupId(value: String): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
