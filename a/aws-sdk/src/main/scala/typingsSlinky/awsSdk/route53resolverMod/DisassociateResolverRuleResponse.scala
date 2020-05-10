package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResolverRuleResponse extends js.Object {
  /**
    * Information about the DisassociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}

object DisassociateResolverRuleResponse {
  @scala.inline
  def apply(): DisassociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResolverRuleResponse]
  }
  @scala.inline
  implicit class DisassociateResolverRuleResponseOps[Self <: DisassociateResolverRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolverRuleAssociation(value: ResolverRuleAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverRuleAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleAssociation")(js.undefined)
        ret
    }
  }
  
}

