package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyEgressRule is deprecated by
  * networking/v1/NetworkPolicyEgressRule. NetworkPolicyEgressRule describes a particular set of
  * traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic
  * must match both ports and to. This type is beta-level in 1.8
  */
@js.native
trait NetworkPolicyEgressRule extends js.Object {
  /**
    * List of destination ports for outgoing traffic. Each item in this list is combined using a
    * logical OR. If this field is empty or missing, this rule matches all ports (traffic not
    * restricted by port). If this field is present and contains at least one item, then this
    * rule allows traffic only if the traffic matches at least one port in the list.
    */
  var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.native
  /**
    * List of destinations for outgoing traffic of pods selected for this rule. Items in this
    * list are combined using a logical OR operation. If this field is empty or missing, this
    * rule matches all destinations (traffic not restricted by destination). If this field is
    * present and contains at least one item, this rule allows traffic only if the traffic
    * matches at least one item in the to list.
    */
  var to: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.native
}

object NetworkPolicyEgressRule {
  @scala.inline
  def apply(): NetworkPolicyEgressRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyEgressRule]
  }
  @scala.inline
  implicit class NetworkPolicyEgressRuleOps[Self <: NetworkPolicyEgressRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTo(value: Input[js.Array[Input[NetworkPolicyPeer]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

