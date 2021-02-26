package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRegistrationsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The `registration_id` of the `Registration` to be deleted.
    */
  var registrationId: js.UndefOr[String] = js.native
}
object ParamsResourceRegistrationsDelete {
  
  @scala.inline
  def apply(): ParamsResourceRegistrationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegistrationsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceRegistrationsDeleteMutableBuilder[Self <: ParamsResourceRegistrationsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
  }
}
