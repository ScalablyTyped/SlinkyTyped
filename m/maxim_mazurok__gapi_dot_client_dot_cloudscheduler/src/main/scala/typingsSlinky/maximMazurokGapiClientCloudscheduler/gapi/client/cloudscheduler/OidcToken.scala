package typingsSlinky.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcToken extends js.Object {
  
  /** Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used. */
  var audience: js.UndefOr[String] = js.native
  
  /**
    * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the job. The
    * caller must have iam.serviceAccounts.actAs permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}
object OidcToken {
  
  @scala.inline
  def apply(): OidcToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcToken]
  }
  
  @scala.inline
  implicit class OidcTokenOps[Self <: OidcToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
  }
}
