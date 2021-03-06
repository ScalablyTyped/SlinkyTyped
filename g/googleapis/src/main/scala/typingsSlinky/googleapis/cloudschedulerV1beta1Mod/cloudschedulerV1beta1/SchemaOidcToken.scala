package typingsSlinky.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information needed for generating an [OpenID Connect
  * token](https://developers.google.com/identity/protocols/OpenIDConnect).
  * This type of authorization should be used when sending requests to third
  * party endpoints.
  */
@js.native
trait SchemaOidcToken extends StObject {
  
  /**
    * Audience to be used when generating OIDC token. If not specified, the URI
    * specified in target will be used.
    */
  var audience: js.UndefOr[String] = js.native
  
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating OIDC token. The service account must be within the same
    * project as the job. The caller must have iam.serviceAccounts.actAs
    * permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}
object SchemaOidcToken {
  
  @scala.inline
  def apply(): SchemaOidcToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOidcToken]
  }
  
  @scala.inline
  implicit class SchemaOidcTokenMutableBuilder[Self <: SchemaOidcToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
  }
}
