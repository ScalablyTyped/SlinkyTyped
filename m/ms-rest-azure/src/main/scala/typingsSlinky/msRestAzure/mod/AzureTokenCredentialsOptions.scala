package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRestAzure.msRestAzureStrings.batch
import typingsSlinky.msRestAzure.msRestAzureStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureTokenCredentialsOptions extends js.Object {
  /**
    * The authorization scheme. Default value is 'Bearer'.
    */
  var authorizationScheme: js.UndefOr[String] = js.native
  /**
    * The Azure environment to authenticate with.
    */
  var environment: js.UndefOr[AzureEnvironment] = js.native
  /**
    * The audience for which the token is requested. Valid values are 'graph', 'batch' or any other resource like 'https://vault.azure.com'.
    * If tokenAudience is 'graph' then domain should also be provided and its value should not be the default 'common' tenant. 
    * It must be a string (preferrably in a guid format).
    */
  var tokenAudience: js.UndefOr[graph | batch | String] = js.native
  /**
    * The token cache. Default value is MemoryCache from adal.
    */
  var tokenCache: js.UndefOr[js.Any] = js.native
}

object AzureTokenCredentialsOptions {
  @scala.inline
  def apply(): AzureTokenCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureTokenCredentialsOptions]
  }
  @scala.inline
  implicit class AzureTokenCredentialsOptionsOps[Self <: AzureTokenCredentialsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: AzureEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenAudience(value: graph | batch | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenAudience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenAudience")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenCache")(js.undefined)
        ret
    }
  }
  
}

