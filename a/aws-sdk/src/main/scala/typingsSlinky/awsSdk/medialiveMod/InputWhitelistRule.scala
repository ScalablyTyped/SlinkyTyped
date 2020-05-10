package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputWhitelistRule extends js.Object {
  /**
    * The IPv4 CIDR that's whitelisted.
    */
  var Cidr: js.UndefOr[string] = js.native
}

object InputWhitelistRule {
  @scala.inline
  def apply(): InputWhitelistRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputWhitelistRule]
  }
  @scala.inline
  implicit class InputWhitelistRuleOps[Self <: InputWhitelistRule] (val x: Self) extends AnyVal {
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

