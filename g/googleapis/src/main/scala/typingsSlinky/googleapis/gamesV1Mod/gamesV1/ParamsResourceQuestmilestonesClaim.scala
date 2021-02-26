package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceQuestmilestonesClaim extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the milestone.
    */
  var milestoneId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the quest.
    */
  var questId: js.UndefOr[String] = js.native
  
  /**
    * A numeric ID to ensure that the request is handled correctly across
    * retries. Your client application must generate this ID randomly.
    */
  var requestId: js.UndefOr[String] = js.native
}
object ParamsResourceQuestmilestonesClaim {
  
  @scala.inline
  def apply(): ParamsResourceQuestmilestonesClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuestmilestonesClaim]
  }
  
  @scala.inline
  implicit class ParamsResourceQuestmilestonesClaimMutableBuilder[Self <: ParamsResourceQuestmilestonesClaim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMilestoneId(value: String): Self = StObject.set(x, "milestoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneIdUndefined: Self = StObject.set(x, "milestoneId", js.undefined)
    
    @scala.inline
    def setQuestId(value: String): Self = StObject.set(x, "questId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestIdUndefined: Self = StObject.set(x, "questId", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
