package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEnterprisesAcknowledgenotificationset extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The notification set ID as returned by Enterprises.PullNotificationSet.
    * This must be provided.
    */
  var notificationSetId: js.UndefOr[String] = js.native
}
object ParamsResourceEnterprisesAcknowledgenotificationset {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesAcknowledgenotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesAcknowledgenotificationset]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesAcknowledgenotificationsetMutableBuilder[Self <: ParamsResourceEnterprisesAcknowledgenotificationset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setNotificationSetId(value: String): Self = StObject.set(x, "notificationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSetIdUndefined: Self = StObject.set(x, "notificationSetId", js.undefined)
  }
}
