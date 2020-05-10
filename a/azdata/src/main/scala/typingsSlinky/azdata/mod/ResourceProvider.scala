package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceProvider extends js.Object {
  def createFirewallRule(account: Account, firewallruleInfo: FirewallRuleInfo): Thenable[CreateFirewallRuleResponse] = js.native
  def handleFirewallRule(errorCode: Double, errorMessage: String, connectionTypeId: String): Thenable[HandleFirewallRuleResponse] = js.native
}

object ResourceProvider {
  @scala.inline
  def apply(
    createFirewallRule: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse],
    handleFirewallRule: (Double, String, String) => Thenable[HandleFirewallRuleResponse]
  ): ResourceProvider = {
    val __obj = js.Dynamic.literal(createFirewallRule = js.Any.fromFunction2(createFirewallRule), handleFirewallRule = js.Any.fromFunction3(handleFirewallRule))
    __obj.asInstanceOf[ResourceProvider]
  }
  @scala.inline
  implicit class ResourceProviderOps[Self <: ResourceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFirewallRule(value: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFirewallRule")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleFirewallRule(value: (Double, String, String) => Thenable[HandleFirewallRuleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFirewallRule")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

