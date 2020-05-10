package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResolverRuleResponse extends js.Object {
  /**
    * Information about the AssociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}

object AssociateResolverRuleResponse {
  @scala.inline
  def apply(): AssociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResolverRuleResponse]
  }
  @scala.inline
  implicit class AssociateResolverRuleResponseOps[Self <: AssociateResolverRuleResponse] (val x: Self) extends AnyVal {
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

