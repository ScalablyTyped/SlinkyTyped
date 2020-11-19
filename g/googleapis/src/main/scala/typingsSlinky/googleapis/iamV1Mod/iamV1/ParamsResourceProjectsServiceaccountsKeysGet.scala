package typingsSlinky.googleapis.iamV1Mod.iamV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsServiceaccountsKeysGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The resource name of the service account key in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.  Using `-`
    * as a wildcard for the `PROJECT_ID` will infer the project from the
    * account. The `ACCOUNT` value can be the `email` address or the
    * `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The output format of the public key requested. X509_PEM is the default
    * output format.
    */
  var publicKeyType: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsServiceaccountsKeysGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsServiceaccountsKeysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsKeysGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsServiceaccountsKeysGetOps[Self <: ParamsResourceProjectsServiceaccountsKeysGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublicKeyType(value: String): Self = this.set("publicKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyType: Self = this.set("publicKeyType", js.undefined)
  }
}
