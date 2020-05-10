package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleAssociationRequest extends js.Object {
  /**
    * The ID of the resolver rule association that you want to get information about.
    */
  var ResolverRuleAssociationId: ResourceId = js.native
}

object GetResolverRuleAssociationRequest {
  @scala.inline
  def apply(ResolverRuleAssociationId: ResourceId): GetResolverRuleAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleAssociationId = ResolverRuleAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleAssociationRequest]
  }
  @scala.inline
  implicit class GetResolverRuleAssociationRequestOps[Self <: GetResolverRuleAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolverRuleAssociationId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

