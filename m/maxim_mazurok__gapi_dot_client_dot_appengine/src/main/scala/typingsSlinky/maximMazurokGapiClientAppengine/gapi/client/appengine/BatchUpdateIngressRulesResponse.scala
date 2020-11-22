package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateIngressRulesResponse extends js.Object {
  
  /** The full list of ingress FirewallRules for this application. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.native
}
object BatchUpdateIngressRulesResponse {
  
  @scala.inline
  def apply(): BatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateIngressRulesResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateIngressRulesResponseOps[Self <: BatchUpdateIngressRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIngressRulesVarargs(value: FirewallRule*): Self = this.set("ingressRules", js.Array(value :_*))
    
    @scala.inline
    def setIngressRules(value: js.Array[FirewallRule]): Self = this.set("ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngressRules: Self = this.set("ingressRules", js.undefined)
  }
}
