package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebhookRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: BranchName = js.native
  
  /**
    *  The description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.native
}
object CreateWebhookRequest {
  
  @scala.inline
  def apply(appId: AppId, branchName: BranchName): CreateWebhookRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookRequest]
  }
  
  @scala.inline
  implicit class CreateWebhookRequestMutableBuilder[Self <: CreateWebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
