package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.
  */
@js.native
trait NetworkPolicyPeer extends StObject {
  
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
    */
  var ipBlock: IPBlock = js.native
  
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
    */
  var namespaceSelector: LabelSelector = js.native
  
  /**
    * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
    */
  var podSelector: LabelSelector = js.native
}
object NetworkPolicyPeer {
  
  @scala.inline
  def apply(ipBlock: IPBlock, namespaceSelector: LabelSelector, podSelector: LabelSelector): NetworkPolicyPeer = {
    val __obj = js.Dynamic.literal(ipBlock = ipBlock.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], podSelector = podSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPeer]
  }
  
  @scala.inline
  implicit class NetworkPolicyPeerMutableBuilder[Self <: NetworkPolicyPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpBlock(value: IPBlock): Self = StObject.set(x, "ipBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceSelector(value: LabelSelector): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodSelector(value: LabelSelector): Self = StObject.set(x, "podSelector", value.asInstanceOf[js.Any])
  }
}
