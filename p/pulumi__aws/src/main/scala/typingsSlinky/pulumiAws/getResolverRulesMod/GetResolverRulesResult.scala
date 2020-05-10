package typingsSlinky.pulumiAws.getResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val ownerId: js.UndefOr[String] = js.native
  val resolverEndpointId: js.UndefOr[String] = js.native
  /**
    * The IDs of the matched resolver rules.
    */
  val resolverRuleIds: js.Array[String] = js.native
  val ruleType: js.UndefOr[String] = js.native
  val shareStatus: js.UndefOr[String] = js.native
}

object GetResolverRulesResult {
  @scala.inline
  def apply(id: String, resolverRuleIds: js.Array[String]): GetResolverRulesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resolverRuleIds = resolverRuleIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulesResult]
  }
  @scala.inline
  implicit class GetResolverRulesResultOps[Self <: GetResolverRulesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolverRuleIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverRuleIds")(value.asInstanceOf[js.Any])
        ret
    }
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

