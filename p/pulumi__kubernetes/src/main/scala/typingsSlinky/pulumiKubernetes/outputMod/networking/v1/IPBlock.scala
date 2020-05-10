package typingsSlinky.pulumiKubernetes.outputMod.networking.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
  * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
  * not be included within this rule.
  */
@js.native
trait IPBlock extends js.Object {
  /**
    * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
    */
  val cidr: String = js.native
  /**
    * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
    * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
    */
  val except: js.Array[String] = js.native
}

object IPBlock {
  @scala.inline
  def apply(cidr: String, except: js.Array[String]): IPBlock = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], except = except.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBlock]
  }
  @scala.inline
  implicit class IPBlockOps[Self <: IPBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcept(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

