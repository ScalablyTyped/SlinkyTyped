package typingsSlinky.pulumiKubernetes.outputMod.networking.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields
  * are allowed
  */
@js.native
trait NetworkPolicyPeer extends js.Object {
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the
    * other fields can be.
    */
  val ipBlock: IPBlock = js.native
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector
    * semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
    * PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods
    * in the Namespaces selected by NamespaceSelector.
    */
  val namespaceSelector: LabelSelector = js.native
  /**
    * This is a label selector which selects Pods. This field follows standard label selector
    * semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
    * matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects
    * the Pods matching PodSelector in the policy's own Namespace.
    */
  val podSelector: LabelSelector = js.native
}

object NetworkPolicyPeer {
  @scala.inline
  def apply(ipBlock: IPBlock, namespaceSelector: LabelSelector, podSelector: LabelSelector): NetworkPolicyPeer = {
    val __obj = js.Dynamic.literal(ipBlock = ipBlock.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], podSelector = podSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPeer]
  }
  @scala.inline
  implicit class NetworkPolicyPeerOps[Self <: NetworkPolicyPeer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpBlock(value: IPBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPodSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podSelector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

