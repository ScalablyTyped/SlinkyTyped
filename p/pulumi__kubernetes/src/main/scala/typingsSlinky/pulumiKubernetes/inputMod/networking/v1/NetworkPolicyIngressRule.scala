package typingsSlinky.pulumiKubernetes.inputMod.networking.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods
  * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
  */
@js.native
trait NetworkPolicyIngressRule extends js.Object {
  /**
    * List of sources which should be able to access the pods selected for this rule. Items in
    * this list are combined using a logical OR operation. If this field is empty or missing,
    * this rule matches all sources (traffic not restricted by source). If this field is present
    * and contains at least one item, this rule allows traffic only if the traffic matches at
    * least one item in the from list.
    */
  var from: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.native
  /**
    * List of ports which should be made accessible on the pods selected for this rule. Each item
    * in this list is combined using a logical OR. If this field is empty or missing, this rule
    * matches all ports (traffic not restricted by port). If this field is present and contains
    * at least one item, then this rule allows traffic only if the traffic matches at least one
    * port in the list.
    */
  var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.native
}

object NetworkPolicyIngressRule {
  @scala.inline
  def apply(): NetworkPolicyIngressRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyIngressRule]
  }
  @scala.inline
  implicit class NetworkPolicyIngressRuleOps[Self <: NetworkPolicyIngressRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Input[js.Array[Input[NetworkPolicyPeer]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: Input[js.Array[Input[NetworkPolicyPort]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
  }
  
}

