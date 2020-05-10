package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock.
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
  * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
  * not be included within this rule.
  */
@js.native
trait IPBlock extends js.Object {
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
    */
  var cidr: Input[String] = js.native
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
    * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
    */
  var except: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object IPBlock {
  @scala.inline
  def apply(cidr: Input[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBlock]
  }
  @scala.inline
  implicit class IPBlockOps[Self <: IPBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcept(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(js.undefined)
        ret
    }
  }
  
}

