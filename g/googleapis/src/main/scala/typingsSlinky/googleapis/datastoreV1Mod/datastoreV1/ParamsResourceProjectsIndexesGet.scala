package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsIndexesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The resource ID of the index to get.
    */
  var indexId: js.UndefOr[String] = js.native
  
  /**
    * Project ID against which to make the request.
    */
  var projectId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsIndexesGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsIndexesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsIndexesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsIndexesGetMutableBuilder[Self <: ParamsResourceProjectsIndexesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIndexId(value: String): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
