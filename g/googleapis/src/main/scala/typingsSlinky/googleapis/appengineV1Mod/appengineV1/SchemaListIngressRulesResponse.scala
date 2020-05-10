package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Firewall.ListIngressRules.
  */
@js.native
trait SchemaListIngressRulesResponse extends js.Object {
  /**
    * The ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListIngressRulesResponse {
  @scala.inline
  def apply(): SchemaListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListIngressRulesResponse]
  }
  @scala.inline
  implicit class SchemaListIngressRulesResponseOps[Self <: SchemaListIngressRulesResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

