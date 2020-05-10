package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthFileOptions extends js.Object {
  /**
    * @prop {string} [filePath] Absolute file path to the auth file. If not provided 
    * then please set the environment variable 'AZURE_AUTH_LOCATION'.
    */
  var filePath: js.UndefOr[String] = js.native
  /**
    * @prop {string} [subscriptionEnvVariableName] The subscriptionId environment variable 
    * name. Default is 'AZURE_SUBSCRIPTION_ID'.
    */
  var subscriptionEnvVariableName: js.UndefOr[String] = js.native
}

object AuthFileOptions {
  @scala.inline
  def apply(): AuthFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthFileOptions]
  }
  @scala.inline
  implicit class AuthFileOptionsOps[Self <: AuthFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionEnvVariableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionEnvVariableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionEnvVariableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionEnvVariableName")(js.undefined)
        ret
    }
  }
  
}

