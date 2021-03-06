package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeSpec describes the attributes that a node is created with.
  */
@js.native
trait NodeSpec extends StObject {
  
  /**
    * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field
    */
  var configSource: NodeConfigSource = js.native
  
  /**
    * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
    */
  var externalID: String = js.native
  
  /**
    * PodCIDR represents the pod IP range assigned to the node.
    */
  var podCIDR: String = js.native
  
  /**
    * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
    */
  var podCIDRs: js.Array[String] = js.native
  
  /**
    * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
    */
  var providerID: String = js.native
  
  /**
    * If specified, the node's taints.
    */
  var taints: js.Array[Taint] = js.native
  
  /**
    * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
    */
  var unschedulable: Boolean = js.native
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
  implicit class NodeSpecMutableBuilder[Self <: NodeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigSource(value: NodeConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalID(value: String): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodCIDR(value: String): Self = StObject.set(x, "podCIDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodCIDRs(value: js.Array[String]): Self = StObject.set(x, "podCIDRs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodCIDRsVarargs(value: String*): Self = StObject.set(x, "podCIDRs", js.Array(value :_*))
    
    @scala.inline
    def setProviderID(value: String): Self = StObject.set(x, "providerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaints(value: js.Array[Taint]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintsVarargs(value: Taint*): Self = StObject.set(x, "taints", js.Array(value :_*))
    
    @scala.inline
    def setUnschedulable(value: Boolean): Self = StObject.set(x, "unschedulable", value.asInstanceOf[js.Any])
  }
}
