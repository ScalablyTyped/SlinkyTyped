package typingsSlinky.pulumiAws.nodeGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.eks.NodeGroupRemoteAccess
import typingsSlinky.pulumiAws.inputMod.eks.NodeGroupScalingConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupArgs extends js.Object {
  val amiType: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: Input[String] = js.native
  val diskSize: js.UndefOr[Input[Double]] = js.native
  val instanceTypes: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
    */
  val labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Name of the EKS Node Group.
    */
  val nodeGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
    */
  val nodeRoleArn: Input[String] = js.native
  /**
    * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
    */
  val releaseVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block with remote access settings. Detailed below.
    */
  val remoteAccess: js.UndefOr[Input[NodeGroupRemoteAccess]] = js.native
  /**
    * Configuration block with scaling settings. Detailed below.
    */
  val scalingConfig: Input[NodeGroupScalingConfig] = js.native
  /**
    * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val version: js.UndefOr[Input[String]] = js.native
}

object NodeGroupArgs {
  @scala.inline
  def apply(
    clusterName: Input[String],
    nodeRoleArn: Input[String],
    scalingConfig: Input[NodeGroupScalingConfig],
    subnetIds: Input[js.Array[Input[String]]]
  ): NodeGroupArgs = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodeRoleArn = nodeRoleArn.asInstanceOf[js.Any], scalingConfig = scalingConfig.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupArgs]
  }
  @scala.inline
  implicit class NodeGroupArgsOps[Self <: NodeGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingConfig(value: Input[NodeGroupScalingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmiType(value: Input[String]): Self = {
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
    def withDiskSize(value: Input[Double]): Self = {
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
    def withInstanceTypes(value: Input[String]): Self = {
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
    def withLabels(value: Input[StringDictionary[Input[String]]]): Self = {
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
    def withNodeGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseVersion(value: Input[String]): Self = {
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
    def withRemoteAccess(value: Input[NodeGroupRemoteAccess]): Self = {
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withVersion(value: Input[String]): Self = {
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

