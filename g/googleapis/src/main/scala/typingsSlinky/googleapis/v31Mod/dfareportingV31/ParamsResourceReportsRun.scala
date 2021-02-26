package typingsSlinky.googleapis.v31Mod.dfareportingV31

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceReportsRun extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The DFA profile ID.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[String] = js.native
  
  /**
    * If set and true, tries to run the report synchronously.
    */
  var synchronous: js.UndefOr[Boolean] = js.native
}
object ParamsResourceReportsRun {
  
  @scala.inline
  def apply(): ParamsResourceReportsRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsRun]
  }
  
  @scala.inline
  implicit class ParamsResourceReportsRunMutableBuilder[Self <: ParamsResourceReportsRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    @scala.inline
    def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}
