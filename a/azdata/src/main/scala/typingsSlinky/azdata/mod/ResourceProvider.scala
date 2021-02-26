package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceProvider extends StObject {
  
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
  implicit class ResourceProviderMutableBuilder[Self <: ResourceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFirewallRule(value: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse]): Self = StObject.set(x, "createFirewallRule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandleFirewallRule(value: (Double, String, String) => Thenable[HandleFirewallRuleResponse]): Self = StObject.set(x, "handleFirewallRule", js.Any.fromFunction3(value))
  }
}
