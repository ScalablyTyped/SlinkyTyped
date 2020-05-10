package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeSpec describes the attributes that a node is created with.
  */
@js.native
trait NodeSpec extends js.Object {
  /**
    * If specified, the source to get node configuration from The DynamicKubeletConfig feature
    * gate must be enabled for the Kubelet to use this field
    */
  val configSource: NodeConfigSource = js.native
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see:
    * https://issues.k8s.io/61966
    */
  val externalID: String = js.native
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  val podCIDR: String = js.native
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If
    * this field is specified, the 0th entry must match the podCIDR field. It may contain at most
    * 1 value for each of IPv4 and IPv6.
    */
  val podCIDRs: js.Array[String] = js.native
  /**
    * ID of the node assigned by the cloud provider in the format:
    * <ProviderName>://<ProviderSpecificNodeID>
    */
  val providerID: String = js.native
  /**
    * If specified, the node's taints.
    */
  val taints: js.Array[Taint] = js.native
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable.
    * More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  val unschedulable: Boolean = js.native
}

object NodeSpec {
  @scala.inline
  def apply(
    configSource: NodeConfigSource,
    externalID: String,
    podCIDR: String,
    podCIDRs: js.Array[String],
    providerID: String,
    taints: js.Array[Taint],
    unschedulable: Boolean
  ): NodeSpec = {
    val __obj = js.Dynamic.literal(configSource = configSource.asInstanceOf[js.Any], externalID = externalID.asInstanceOf[js.Any], podCIDR = podCIDR.asInstanceOf[js.Any], podCIDRs = podCIDRs.asInstanceOf[js.Any], providerID = providerID.asInstanceOf[js.Any], taints = taints.asInstanceOf[js.Any], unschedulable = unschedulable.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSpec]
  }
  @scala.inline
  implicit class NodeSpecOps[Self <: NodeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigSource(value: NodeConfigSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPodCIDR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podCIDR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPodCIDRs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podCIDRs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaints(value: js.Array[Taint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnschedulable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unschedulable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

