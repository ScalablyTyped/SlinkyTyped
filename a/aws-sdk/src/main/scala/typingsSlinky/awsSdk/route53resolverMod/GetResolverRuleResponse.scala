package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleResponse extends js.Object {
  /**
    * Information about the resolver rule that you specified in a GetResolverRule request.
    */
  var ResolverRule: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverRule] = js.native
}

object GetResolverRuleResponse {
  @scala.inline
  def apply(): GetResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleResponse]
  }
  @scala.inline
  implicit class GetResolverRuleResponseOps[Self <: GetResolverRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolverRule(value: ResolverRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRule")(js.undefined)
        ret
    }
  }
  
}

