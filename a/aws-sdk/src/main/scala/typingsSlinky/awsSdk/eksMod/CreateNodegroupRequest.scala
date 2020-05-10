package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodegroupRequest extends js.Object {
  /**
    * The AMI type for your node group. GPU instance types should use the AL2_x86_64_GPU AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the AL2_x86_64 AMI type, which uses the Amazon EKS-optimized Linux AMI.
    */
  var amiType: js.UndefOr[AMITypes] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the cluster to create the node group in.
    */
  var clusterName: String = js.native
  /**
    * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.native
  /**
    * The instance type to use for your node group. Currently, you can specify a single instance type for a node group. The default value for this parameter is t3.medium. If you choose a GPU instance type, be sure to specify the AL2_x86_64_GPU with the amiType parameter.
    */
  var instanceTypes: js.UndefOr[StringList] = js.native
  /**
    * The Kubernetes labels to be applied to the nodes in the node group when they are created.
    */
  var labels: js.UndefOr[labelsMap] = js.native
  /**
    * The IAM role associated with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an IAM role for those worker nodes to use when they are launched. For more information, see Amazon EKS Worker Node IAM Role in the  Amazon EKS User Guide .
    */
  var nodeRole: String = js.native
  /**
    * The unique name to give your node group.
    */
  var nodegroupName: String = js.native
  /**
    * The AMI version of the Amazon EKS-optimized AMI to use with your node group. By default, the latest available AMI version for the node group's current Kubernetes version is used. For more information, see Amazon EKS-Optimized Linux AMI Versions in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * The remote access (SSH) configuration to use with your node group.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.native
  /**
    * The scaling configuration details for the Auto Scaling group that is created for your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
  /**
    * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the tag key kubernetes.io/cluster/CLUSTER_NAME with a value of shared, where CLUSTER_NAME is replaced with the name of your cluster.
    */
  var subnets: StringList = js.native
  /**
    * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used, and this is the only accepted specified value.
    */
  var version: js.UndefOr[String] = js.native
}

object CreateNodegroupRequest {
  @scala.inline
  def apply(clusterName: String, nodeRole: String, nodegroupName: String, subnets: StringList): CreateNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodeRole = nodeRole.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodegroupRequest]
  }
  @scala.inline
  implicit class CreateNodegroupRequestOps[Self <: CreateNodegroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodegroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnets(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmiType(value: AMITypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiType")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSize(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTypes(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: labelsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteAccess(value: RemoteAccessConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingConfig(value: NodegroupScalingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

