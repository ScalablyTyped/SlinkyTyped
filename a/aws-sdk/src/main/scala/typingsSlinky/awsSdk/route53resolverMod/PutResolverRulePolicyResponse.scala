package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResolverRulePolicyResponse extends js.Object {
  /**
    * Whether the PutResolverRulePolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}

object PutResolverRulePolicyResponse {
  @scala.inline
  def apply(): PutResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResolverRulePolicyResponse]
  }
  @scala.inline
  implicit class PutResolverRulePolicyResponseOps[Self <: PutResolverRulePolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnValue")(js.undefined)
        ret
    }
  }
  
}

