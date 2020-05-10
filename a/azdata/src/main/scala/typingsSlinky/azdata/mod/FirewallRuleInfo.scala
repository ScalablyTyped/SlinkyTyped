package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallRuleInfo extends js.Object {
  var endIpAddress: String = js.native
  var serverName: String = js.native
  var startIpAddress: String = js.native
}

object FirewallRuleInfo {
  @scala.inline
  def apply(endIpAddress: String, serverName: String, startIpAddress: String): FirewallRuleInfo = {
    val __obj = js.Dynamic.literal(endIpAddress = endIpAddress.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], startIpAddress = startIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallRuleInfo]
  }
  @scala.inline
  implicit class FirewallRuleInfoOps[Self <: FirewallRuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

