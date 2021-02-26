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
trait ParamsResourceUserprofilesGuardiansGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The `id` field from a `Guardian`.
    */
  var guardianId: js.UndefOr[String] = js.native
  
  /**
    * The student whose guardian is being requested. One of the following:  *
    * the numeric identifier for the user * the email address of the user * the
    * string literal `"me"`, indicating the requesting user
    */
  var studentId: js.UndefOr[String] = js.native
}
object ParamsResourceUserprofilesGuardiansGet {
  
  @scala.inline
  def apply(): ParamsResourceUserprofilesGuardiansGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUserprofilesGuardiansGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUserprofilesGuardiansGetMutableBuilder[Self <: ParamsResourceUserprofilesGuardiansGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
    
    @scala.inline
    def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
  }
}
