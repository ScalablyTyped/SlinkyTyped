package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodegroup extends js.Object {
  /**
    * The AMI type associated with your node group. GPU instance types should use the AL2_x86_64_GPU AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the AL2_x86_64 AMI type, which uses the Amazon EKS-optimized Linux AMI.
    */
  var amiType: js.UndefOr[AMITypes] = js.native
  /**
    * The name of the cluster that the managed node group resides in.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.native
  /**
    * The health status of the node group. If there are issues with your node group's health, they are listed here.
    */
  var health: js.UndefOr[NodegroupHealth] = js.native
  /**
    * The instance types associated with your node group.
    */
  var instanceTypes: js.UndefOr[StringList] = js.native
  /**
    * The Kubernetes labels applied to the nodes in the node group.  Only labels that are applied with the Amazon EKS API are shown here. There may be other Kubernetes labels applied to the nodes in this group. 
    */
  var labels: js.UndefOr[labelsMap] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the managed node group was last modified.
    */
  var modifiedAt: js.UndefOr[js.Date] = js.native
  /**
    * The IAM role associated with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an IAM role for those worker nodes to use when they are launched. For more information, see Amazon EKS Worker Node IAM Role in the  Amazon EKS User Guide .
    */
  var nodeRole: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) associated with the managed node group.
    */
  var nodegroupArn: js.UndefOr[String] = js.native
  /**
    * The name associated with an Amazon EKS managed node group.
    */
  var nodegroupName: js.UndefOr[String] = js.native
  /**
    * The AMI version of the managed node group. For more information, see Amazon EKS-Optimized Linux AMI Versions  in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * The remote access (SSH) configuration that is associated with the node group.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.native
  /**
    * The resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
    */
  var resources: js.UndefOr[NodegroupResources] = js.native
  /**
    * The scaling configuration details for the Auto Scaling group that is associated with your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
  /**
    * The current status of the managed node group.
    */
  var status: js.UndefOr[NodegroupStatus] = js.native
  /**
    * The subnets allowed for the Auto Scaling group that is associated with your node group. These subnets must have the following tag: kubernetes.io/cluster/CLUSTER_NAME, where CLUSTER_NAME is replaced with the name of your cluster.
    */
  var subnets: js.UndefOr[StringList] = js.native
  /**
    * The metadata applied to the node group to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The Kubernetes version of the managed node group.
    */
  var version: js.UndefOr[String] = js.native
}

object Nodegroup {
  @scala.inline
  def apply(): Nodegroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nodegroup]
  }
  @scala.inline
  implicit class NodegroupOps[Self <: Nodegroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
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
    def withHealth(value: NodegroupHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(js.undefined)
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
    def withModifiedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRole")(js.undefined)
        ret
    }
    @scala.inline
    def withNodegroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodegroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNodegroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodegroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodegroupName")(js.undefined)
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
    def withResources(value: NodegroupResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
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
    def withStatus(value: NodegroupStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnets(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(js.undefined)
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

