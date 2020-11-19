package typingsSlinky.pulumiAws.getResolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRuleResult extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: String = js.native
  
  val domainName: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val name: String = js.native
  
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: String = js.native
  
  val resolverEndpointId: String = js.native
  
  val resolverRuleId: String = js.native
  
  val ruleType: String = js.native
  
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: String = js.native
  
  /**
    * A map of tags assigned to the resolver rule.
    */
  val tags: StringDictionary[String] = js.native
}
object GetResolverRuleResult {
  
  @scala.inline
  def apply(
    arn: String,
    domainName: String,
    id: String,
    name: String,
    ownerId: String,
    resolverEndpointId: String,
    resolverRuleId: String,
    ruleType: String,
    shareStatus: String,
    tags: StringDictionary[String]
  ): GetResolverRuleResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], resolverEndpointId = resolverEndpointId.asInstanceOf[js.Any], resolverRuleId = resolverRuleId.asInstanceOf[js.Any], ruleType = ruleType.asInstanceOf[js.Any], shareStatus = shareStatus.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleResult]
  }
  
  @scala.inline
  implicit class GetResolverRuleResultOps[Self <: GetResolverRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointId(value: String): Self = this.set("resolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleId(value: String): Self = this.set("resolverRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleType(value: String): Self = this.set("ruleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareStatus(value: String): Self = this.set("shareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
