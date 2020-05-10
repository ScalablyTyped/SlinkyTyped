package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsList extends StandardParameters {
  /**
    * A comma-separated list of file extensions for open with filtering. All
    * apps within the given app query scope which can open any of the given
    * file extensions will be included in the response. If appFilterMimeTypes
    * are provided as well, the result is a union of the two resulting app
    * lists.
    */
  var appFilterExtensions: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of MIME types for open with filtering. All apps
    * within the given app query scope which can open any of the given MIME
    * types will be included in the response. If appFilterExtensions are
    * provided as well, the result is a union of the two resulting app lists.
    */
  var appFilterMimeTypes: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A language or locale code, as defined by BCP 47, with some extensions
    * from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.native
}

object ParamsResourceAppsList {
  @scala.inline
  def apply(): ParamsResourceAppsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsList]
  }
  @scala.inline
  implicit class ParamsResourceAppsListOps[Self <: ParamsResourceAppsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppFilterExtensions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFilterExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppFilterExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFilterExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withAppFilterMimeTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFilterMimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppFilterMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appFilterMimeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
  }
  
}

