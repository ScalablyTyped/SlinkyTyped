package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWebACLRequest extends StObject {
  
  /**
    * The action to perform if none of the Rules contained in the WebACL match. 
    */
  var DefaultAction: typingsSlinky.awsSdk.wafv2Mod.DefaultAction = js.native
  
  /**
    * A description of the Web ACL that helps with identification. You cannot change the description of a Web ACL after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId = js.native
  
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: typingsSlinky.awsSdk.wafv2Mod.LockToken = js.native
  
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var Name: EntityName = js.native
  
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them. 
    */
  var Rules: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.Rules] = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsSlinky.awsSdk.wafv2Mod.Scope = js.native
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typingsSlinky.awsSdk.wafv2Mod.VisibilityConfig = js.native
}
object UpdateWebACLRequest {
  
  @scala.inline
  def apply(
    DefaultAction: DefaultAction,
    Id: EntityId,
    LockToken: LockToken,
    Name: EntityName,
    Scope: Scope,
    VisibilityConfig: VisibilityConfig
  ): UpdateWebACLRequest = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebACLRequest]
  }
  
  @scala.inline
  implicit class UpdateWebACLRequestMutableBuilder[Self <: UpdateWebACLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAction(value: DefaultAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: VisibilityConfig): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
  }
}
