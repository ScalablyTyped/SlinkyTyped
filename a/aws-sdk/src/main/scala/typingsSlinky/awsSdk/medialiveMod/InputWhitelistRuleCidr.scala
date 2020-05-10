package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputWhitelistRuleCidr extends js.Object {
  /**
    * The IPv4 CIDR to whitelist.
    */
  var Cidr: js.UndefOr[string] = js.native
}

object InputWhitelistRuleCidr {
  @scala.inline
  def apply(): InputWhitelistRuleCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputWhitelistRuleCidr]
  }
  @scala.inline
  implicit class InputWhitelistRuleCidrOps[Self <: InputWhitelistRuleCidr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(js.undefined)
        ret
    }
  }
  
}

