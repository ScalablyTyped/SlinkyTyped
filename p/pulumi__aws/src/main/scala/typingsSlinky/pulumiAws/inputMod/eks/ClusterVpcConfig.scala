package typingsSlinky.pulumiAws.inputMod.eks

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterVpcConfig extends js.Object {
  /**
    * The cluster security group that was created by Amazon EKS for the cluster.
    */
  var clusterSecurityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
    */
  var endpointPrivateAccess: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
    */
  var endpointPublicAccess: js.UndefOr[Input[Boolean]] = js.native
  var publicAccessCidrs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: js.UndefOr[Input[String]] = js.native
}

object ClusterVpcConfig {
  @scala.inline
  def apply(subnetIds: Input[js.Array[Input[String]]]): ClusterVpcConfig = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVpcConfig]
  }
  @scala.inline
  implicit class ClusterVpcConfigOps[Self <: ClusterVpcConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointPrivateAccess(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointPrivateAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointPrivateAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointPrivateAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointPublicAccess(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointPublicAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointPublicAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointPublicAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicAccessCidrs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAccessCidrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicAccessCidrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAccessCidrs")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

