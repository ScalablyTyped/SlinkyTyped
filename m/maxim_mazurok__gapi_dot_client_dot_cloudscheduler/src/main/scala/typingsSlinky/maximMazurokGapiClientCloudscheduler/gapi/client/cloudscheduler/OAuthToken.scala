package typingsSlinky.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthToken extends StObject {
  
  /** OAuth scope to be used for generating OAuth access token. If not specified, "https://www.googleapis.com/auth/cloud-platform" will be used. */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the job.
    * The caller must have iam.serviceAccounts.actAs permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}
object OAuthToken {
  
  @scala.inline
  def apply(): OAuthToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthToken]
  }
  
  @scala.inline
  implicit class OAuthTokenMutableBuilder[Self <: OAuthToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
  }
}
