package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val addresses: js.Array[NodeAddress] = js.native
  /**
    * Allocatable represents the resources of a node that are available for scheduling. Defaults
    * to Capacity.
    */
  val allocatable: js.Object = js.native
  /**
    * Capacity represents the total resources of a node. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  val capacity: js.Object = js.native
  /**
    * Conditions is an array of current observed node conditions. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#condition
    */
  val conditions: js.Array[NodeCondition] = js.native
  /**
    * Status of the config assigned to the node via the dynamic Kubelet config feature.
    */
  val config: NodeConfigStatus = js.native
  /**
    * Endpoints of daemons running on the Node.
    */
  val daemonEndpoints: NodeDaemonEndpoints = js.native
  /**
    * List of container images on this node
    */
  val images: js.Array[ContainerImage] = js.native
  /**
    * Set of ids/uuids to uniquely identify the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#info
    */
  val nodeInfo: NodeSystemInfo = js.native
  /**
    * NodePhase is the recently observed lifecycle phase of the node. More info:
    * https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now
    * is deprecated.
    */
  val phase: String = js.native
  /**
    * List of volumes that are attached to the node.
    */
  val volumesAttached: js.Array[AttachedVolume] = js.native
  /**
    * List of attachable volumes in use (mounted) by the node.
    */
  val volumesInUse: js.Array[String] = js.native
}

object NodeStatus {
  @scala.inline
  def apply(
    addresses: js.Array[NodeAddress],
    allocatable: js.Object,
    capacity: js.Object,
    conditions: js.Array[NodeCondition],
    config: NodeConfigStatus,
    daemonEndpoints: NodeDaemonEndpoints,
    images: js.Array[ContainerImage],
    nodeInfo: NodeSystemInfo,
    phase: String,
    volumesAttached: js.Array[AttachedVolume],
    volumesInUse: js.Array[String]
  ): NodeStatus = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], allocatable = allocatable.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], daemonEndpoints = daemonEndpoints.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], nodeInfo = nodeInfo.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], volumesAttached = volumesAttached.asInstanceOf[js.Any], volumesInUse = volumesInUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatus]
  }
  @scala.inline
  implicit class NodeStatusOps[Self <: NodeStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[NodeAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocatable(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[NodeCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: NodeConfigStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaemonEndpoints(value: NodeDaemonEndpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daemonEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[ContainerImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeInfo(value: NodeSystemInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumesAttached(value: js.Array[AttachedVolume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesAttached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumesInUse(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesInUse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

