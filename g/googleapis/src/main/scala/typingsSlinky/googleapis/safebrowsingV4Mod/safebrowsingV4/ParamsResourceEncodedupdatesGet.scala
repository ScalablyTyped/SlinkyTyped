package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEncodedupdatesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A client ID that uniquely identifies the client implementation of the
    * Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.native
  
  /**
    * A serialized FetchThreatListUpdatesRequest proto.
    */
  var encodedRequest: js.UndefOr[String] = js.native
}
object ParamsResourceEncodedupdatesGet {
  
  @scala.inline
  def apply(): ParamsResourceEncodedupdatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEncodedupdatesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceEncodedupdatesGetMutableBuilder[Self <: ParamsResourceEncodedupdatesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    @scala.inline
    def setEncodedRequest(value: String): Self = StObject.set(x, "encodedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedRequestUndefined: Self = StObject.set(x, "encodedRequest", js.undefined)
  }
}
