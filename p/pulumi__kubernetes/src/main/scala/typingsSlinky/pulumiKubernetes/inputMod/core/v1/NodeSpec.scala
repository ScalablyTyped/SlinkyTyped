package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var configSource: js.UndefOr[Input[NodeConfigSource]] = js.native
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see:
    * https://issues.k8s.io/61966
    */
  var externalID: js.UndefOr[Input[String]] = js.native
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: js.UndefOr[Input[String]] = js.native
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If
    * this field is specified, the 0th entry must match the podCIDR field. It may contain at most
    * 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * ID of the node assigned by the cloud provider in the format:
    * <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, the node's taints.
    */
  var taints: js.UndefOr[Input[js.Array[Input[Taint]]]] = js.native
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable.
    * More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  var unschedulable: js.UndefOr[Input[Boolean]] = js.native
}

object NodeSpec {
  @scala.inline
  def apply(): NodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSpec]
  }
  @scala.inline
  implicit class NodeSpecOps[Self <: NodeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigSource(value: Input[NodeConfigSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalID(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalID")(js.undefined)
        ret
    }
    @scala.inline
    def withPodCIDR(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podCIDR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodCIDR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podCIDR")(js.undefined)
        ret
    }
    @scala.inline
    def withPodCIDRs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podCIDRs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodCIDRs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podCIDRs")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderID(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerID")(js.undefined)
        ret
    }
    @scala.inline
    def withTaints(value: Input[js.Array[Input[Taint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taints")(js.undefined)
        ret
    }
    @scala.inline
    def withUnschedulable(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unschedulable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnschedulable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unschedulable")(js.undefined)
        ret
    }
  }
  
}

