package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withIngressRules(value: js.Array[FirewallRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingressRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngressRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingressRules")(js.undefined)
        ret
    }
  }
  
}

