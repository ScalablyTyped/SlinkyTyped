package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSavedadstylesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Saved ad style to retrieve.
    */
  var savedAdStyleId: js.UndefOr[String] = js.native
}
object ParamsResourceSavedadstylesGet {
  
  @scala.inline
  def apply(): ParamsResourceSavedadstylesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSavedadstylesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSavedadstylesGetMutableBuilder[Self <: ParamsResourceSavedadstylesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setSavedAdStyleId(value: String): Self = StObject.set(x, "savedAdStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedAdStyleIdUndefined: Self = StObject.set(x, "savedAdStyleId", js.undefined)
  }
}
