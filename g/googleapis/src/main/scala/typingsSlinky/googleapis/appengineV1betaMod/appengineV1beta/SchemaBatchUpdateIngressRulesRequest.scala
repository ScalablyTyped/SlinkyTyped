package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for Firewall.BatchUpdateIngressRules.
  */
@js.native
trait SchemaBatchUpdateIngressRulesRequest extends js.Object {
  /**
    * A list of FirewallRules to replace the existing set.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
}

object SchemaBatchUpdateIngressRulesRequest {
  @scala.inline
  def apply(): SchemaBatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesRequest]
  }
  @scala.inline
  implicit class SchemaBatchUpdateIngressRulesRequestOps[Self <: SchemaBatchUpdateIngressRulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIngressRules(value: js.Array[SchemaFirewallRule]): Self = {
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

