package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateIngressRulesRequest extends js.Object {
  /** A list of FirewallRules to replace the existing set. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.native
}

object BatchUpdateIngressRulesRequest {
  @scala.inline
  def apply(): BatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateIngressRulesRequest]
  }
  @scala.inline
  implicit class BatchUpdateIngressRulesRequestOps[Self <: BatchUpdateIngressRulesRequest] (val x: Self) extends AnyVal {
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

