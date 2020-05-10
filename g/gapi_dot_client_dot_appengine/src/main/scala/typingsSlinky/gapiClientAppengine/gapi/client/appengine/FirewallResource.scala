package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirewallResource extends js.Object {
  var ingressRules: IngressRulesResource = js.native
}

object FirewallResource {
  @scala.inline
  def apply(ingressRules: IngressRulesResource): FirewallResource = {
    val __obj = js.Dynamic.literal(ingressRules = ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallResource]
  }
  @scala.inline
  implicit class FirewallResourceOps[Self <: FirewallResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIngressRules(value: IngressRulesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingressRules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

