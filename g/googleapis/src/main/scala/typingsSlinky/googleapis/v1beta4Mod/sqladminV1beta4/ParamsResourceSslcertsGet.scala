package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSslcertsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Cloud SQL instance ID. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * Project ID of the project that contains the instance.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Sha1 FingerPrint.
    */
  var sha1Fingerprint: js.UndefOr[String] = js.native
}
object ParamsResourceSslcertsGet {
  
  @scala.inline
  def apply(): ParamsResourceSslcertsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSslcertsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSslcertsGetMutableBuilder[Self <: ParamsResourceSslcertsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSha1Fingerprint(value: String): Self = StObject.set(x, "sha1Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1FingerprintUndefined: Self = StObject.set(x, "sha1Fingerprint", js.undefined)
  }
}
