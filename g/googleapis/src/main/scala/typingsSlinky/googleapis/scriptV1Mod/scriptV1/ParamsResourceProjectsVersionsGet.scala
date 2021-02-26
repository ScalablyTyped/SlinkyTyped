package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsVersionsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  
  /**
    * The version number.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}
object ParamsResourceProjectsVersionsGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsVersionsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsVersionsGetMutableBuilder[Self <: ParamsResourceProjectsVersionsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Double): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
