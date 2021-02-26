package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagementGoalsGet extends StandardParameters {
  
  /**
    * Account ID to retrieve the goal for.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Goal ID to retrieve the goal for.
    */
  var goalId: js.UndefOr[String] = js.native
  
  /**
    * View (Profile) ID to retrieve the goal for.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Web property ID to retrieve the goal for.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object ParamsResourceManagementGoalsGet {
  
  @scala.inline
  def apply(): ParamsResourceManagementGoalsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementGoalsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementGoalsGetMutableBuilder[Self <: ParamsResourceManagementGoalsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGoalId(value: String): Self = StObject.set(x, "goalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalIdUndefined: Self = StObject.set(x, "goalId", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
