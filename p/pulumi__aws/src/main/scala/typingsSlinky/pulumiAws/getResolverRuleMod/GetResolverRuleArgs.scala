package typingsSlinky.pulumiAws.getResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleArgs extends js.Object {
  /**
    * The domain name the desired resolver rule forwards DNS queries for. Conflicts with `resolverRuleId`.
    */
  val domainName: js.UndefOr[String] = js.native
  /**
    * The friendly name of the desired resolver rule. Conflicts with `resolverRuleId`.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * The ID of the outbound resolver endpoint of the desired resolver rule. Conflicts with `resolverRuleId`.
    */
  val resolverEndpointId: js.UndefOr[String] = js.native
  /**
    * The ID of the desired resolver rule. Conflicts with `domainName`, `name`, `resolverEndpointId` and `ruleType`.
    */
  val resolverRuleId: js.UndefOr[String] = js.native
  /**
    * The rule type of the desired resolver rule. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`. Conflicts with `resolverRuleId`.
    */
  val ruleType: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetResolverRuleArgs {
  @scala.inline
  def apply(): GetResolverRuleArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleArgs]
  }
  @scala.inline
  implicit class GetResolverRuleArgsOps[Self <: GetResolverRuleArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withResolverRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverRuleId")(js.undefined)
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
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

