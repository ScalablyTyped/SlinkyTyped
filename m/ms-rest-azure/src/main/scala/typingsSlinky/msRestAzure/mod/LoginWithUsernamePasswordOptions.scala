package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginWithUsernamePasswordOptions extends AzureTokenCredentialsOptions {
  /** 
    * The active directory application client id. 
    * See {@link https://azure.microsoft.com/en-us/documentation/articles/active-directory-devquickstarts-dotnet/ Active Directory Quickstart for .Net} 
    * for an example.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The domain or tenant id containing this application. Default value is 'common'.
    */
  var domain: js.UndefOr[String] = js.native
}

object LoginWithUsernamePasswordOptions {
  @scala.inline
  def apply(): LoginWithUsernamePasswordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginWithUsernamePasswordOptions]
  }
  @scala.inline
  implicit class LoginWithUsernamePasswordOptionsOps[Self <: LoginWithUsernamePasswordOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
  }
  
}

