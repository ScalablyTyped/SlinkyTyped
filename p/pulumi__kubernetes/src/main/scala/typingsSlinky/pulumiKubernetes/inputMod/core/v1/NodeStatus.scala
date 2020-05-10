package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeStatus is information about the current status of a node.
  */
@js.native
trait NodeStatus extends js.Object {
  /**
    * List of addresses reachable to the node. Queried from cloud provider, if available. More
    * info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is
    * declared as mergeable, but the merge key is not sufficiently unique, which can cause data
    * corruption when it is merged. Callers should instead use a full-replacement patch. See
    * http://pr.k8s.io/79391 for an example.
    */
  var addresses: js.UndefOr[Input[js.Array[Input[NodeAddress]]]] = js.native
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults
    * to Capacity.
    */
  var allocatable: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Capacity represents the total resources of a node. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Conditions is an array of current observed node conditions. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NodeCondition]]]] = js.native
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  var config: js.UndefOr[Input[NodeConfigStatus]] = js.native
  /**
    * Endpoints of daemons running on the Node.
    */
  var daemonEndpoints: js.UndefOr[Input[NodeDaemonEndpoints]] = js.native
  /**
    * List of container images on this node
    */
  var images: js.UndefOr[Input[js.Array[Input[ContainerImage]]]] = js.native
  /**
    * Set of ids/uuids to uniquely identify the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  var nodeInfo: js.UndefOr[Input[NodeSystemInfo]] = js.native
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now
    * is deprecated.
    */
  var phase: js.UndefOr[Input[String]] = js.native
  /**
    * List of volumes that are attached to the node.
    */
  var volumesAttached: js.UndefOr[Input[js.Array[Input[AttachedVolume]]]] = js.native
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  var volumesInUse: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object NodeStatus {
  @scala.inline
  def apply(): NodeStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeStatus]
  }
  @scala.inline
  implicit class NodeStatusOps[Self <: NodeStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: Input[js.Array[Input[NodeAddress]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withAllocatable(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatable")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacity(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[NodeCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: Input[NodeConfigStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDaemonEndpoints(value: Input[NodeDaemonEndpoints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daemonEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaemonEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daemonEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: Input[js.Array[Input[ContainerImage]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeInfo(value: Input[NodeSystemInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumesAttached(value: Input[js.Array[Input[AttachedVolume]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesAttached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesAttached")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumesInUse(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesInUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesInUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesInUse")(js.undefined)
        ret
    }
  }
  
}

