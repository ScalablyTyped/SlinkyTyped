package typingsSlinky.pulumiAws.getResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulesArgs extends js.Object {
  /**
    * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
    */
  val ownerId: js.UndefOr[String] = js.native
  /**
    * The ID of the outbound resolver endpoint for the desired resolver rules.
    */
  val resolverEndpointId: js.UndefOr[String] = js.native
  /**
    * The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: js.UndefOr[String] = js.native
  /**
    * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: js.UndefOr[String] = js.native
}

object GetResolverRulesArgs {
  @scala.inline
  def apply(): GetResolverRulesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRulesArgs]
  }
  @scala.inline
  implicit class GetResolverRulesArgsOps[Self <: GetResolverRulesArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleType")(js.undefined)
        ret
    }
    @scala.inline
    def withShareStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareStatus")(js.undefined)
        ret
    }
  }
  
}

