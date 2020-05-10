package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by
  * networking/v1/NetworkPolicyPeer.
  */
@js.native
trait NetworkPolicyPeer extends js.Object {
  /**
    * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the
    * other fields can be.
    */
  var ipBlock: js.UndefOr[Input[IPBlock]] = js.native
  /**
    * Selects Namespaces using cluster-scoped labels. This field follows standard label selector
    * semantics; if present but empty, it selects all namespaces.
    *
    * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
    * PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods
    * in the Namespaces selected by NamespaceSelector.
    */
  var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * This is a label selector which selects Pods. This field follows standard label selector
    * semantics; if present but empty, it selects all pods.
    *
    * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
    * matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects
    * the Pods matching PodSelector in the policy's own Namespace.
    */
  var podSelector: js.UndefOr[Input[LabelSelector]] = js.native
}

object NetworkPolicyPeer {
  @scala.inline
  def apply(): NetworkPolicyPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyPeer]
  }
  @scala.inline
  implicit class NetworkPolicyPeerOps[Self <: NetworkPolicyPeer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpBlock(value: Input[IPBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPodSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podSelector")(js.undefined)
        ret
    }
  }
  
}

