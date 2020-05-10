package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleAssociationResponse extends js.Object {
  /**
    * Information about the resolver rule association that you specified in a GetResolverRuleAssociation request.
    */
  var ResolverRuleAssociation: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}

object GetResolverRuleAssociationResponse {
  @scala.inline
  def apply(): GetResolverRuleAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleAssociationResponse]
  }
  @scala.inline
  implicit class GetResolverRuleAssociationResponseOps[Self <: GetResolverRuleAssociationResponse] (val x: Self) extends AnyVal {
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

