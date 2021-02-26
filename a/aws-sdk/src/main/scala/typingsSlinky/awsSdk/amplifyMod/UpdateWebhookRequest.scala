package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWebhookRequest extends StObject {
  
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  
  /**
    *  The description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId = js.native
}
object UpdateWebhookRequest {
  
  @scala.inline
  def apply(webhookId: WebhookId): UpdateWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookRequest]
  }
  
  @scala.inline
  implicit class UpdateWebhookRequestMutableBuilder[Self <: UpdateWebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
  }
}
