package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeSpec describes the attributes that a node is created with.
  */
@js.native
trait NodeSpec extends js.Object {
  
  /**
    * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field
    */
  var configSource: js.UndefOr[Input[NodeConfigSource]] = js.native
  
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
    */
  var externalID: js.UndefOr[Input[String]] = js.native
  
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: js.UndefOr[Input[String]] = js.native
  
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: js.UndefOr[Input[String]] = js.native
  
  /**
    * If specified, the node's taints.
    */
  var taints: js.UndefOr[Input[js.Array[Input[Taint]]]] = js.native
  
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigSource(value: Input[NodeConfigSource]): Self = this.set("configSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigSource: Self = this.set("configSource", js.undefined)
    
    @scala.inline
    def setExternalID(value: Input[String]): Self = this.set("externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalID: Self = this.set("externalID", js.undefined)
    
    @scala.inline
    def setPodCIDR(value: Input[String]): Self = this.set("podCIDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodCIDR: Self = this.set("podCIDR", js.undefined)
    
    @scala.inline
    def setPodCIDRsVarargs(value: Input[String]*): Self = this.set("podCIDRs", js.Array(value :_*))
    
    @scala.inline
    def setPodCIDRs(value: Input[js.Array[Input[String]]]): Self = this.set("podCIDRs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodCIDRs: Self = this.set("podCIDRs", js.undefined)
    
    @scala.inline
    def setProviderID(value: Input[String]): Self = this.set("providerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderID: Self = this.set("providerID", js.undefined)
    
    @scala.inline
    def setTaintsVarargs(value: Input[Taint]*): Self = this.set("taints", js.Array(value :_*))
    
    @scala.inline
    def setTaints(value: Input[js.Array[Input[Taint]]]): Self = this.set("taints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaints: Self = this.set("taints", js.undefined)
    
    @scala.inline
    def setUnschedulable(value: Input[Boolean]): Self = this.set("unschedulable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnschedulable: Self = this.set("unschedulable", js.undefined)
  }
}
