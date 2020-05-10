package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to delete.
    */
  var ResolverRuleId: ResourceId = js.native
}

object DeleteResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId): DeleteResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverRuleRequest]
  }
  @scala.inline
  implicit class DeleteResolverRuleRequestOps[Self <: DeleteResolverRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolverRuleId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

