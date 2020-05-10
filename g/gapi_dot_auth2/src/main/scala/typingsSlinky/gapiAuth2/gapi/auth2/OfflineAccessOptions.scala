package typingsSlinky.gapiAuth2.gapi.auth2

import typingsSlinky.gapiAuth2.gapiAuth2Strings.consent
import typingsSlinky.gapiAuth2.gapiAuth2Strings.select_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definitions by: John <https://github.com/jhcao23>
  * Interface that represents the different configuration parameters for the GoogleAuth.grantOfflineAccess(options) method.
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2offlineaccessoptions
  */
@js.native
trait OfflineAccessOptions extends js.Object {
  var app_package_name: js.UndefOr[String] = js.native
  var prompt: js.UndefOr[select_account | consent] = js.native
  var scope: js.UndefOr[String] = js.native
}

object OfflineAccessOptions {
  @scala.inline
  def apply(): OfflineAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfflineAccessOptions]
  }
  @scala.inline
  implicit class OfflineAccessOptionsOps[Self <: OfflineAccessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_package_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_package_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_package_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_package_name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: select_account | consent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

