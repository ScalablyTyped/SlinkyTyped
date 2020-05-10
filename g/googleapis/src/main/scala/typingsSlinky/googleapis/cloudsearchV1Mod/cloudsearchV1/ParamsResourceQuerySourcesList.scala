package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceQuerySourcesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of sources to return in the response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("requestOptions.debugOptions.enableDebugging")
  var requestOptionsDotdebugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  @JSName("requestOptions.languageCode")
  var requestOptionsDotlanguageCode: js.UndefOr[String] = js.native
  /**
    * Id of the application created using SearchApplicationsService.
    */
  @JSName("requestOptions.searchApplicationId")
  var requestOptionsDotsearchApplicationId: js.UndefOr[String] = js.native
  /**
    * Current user's time zone id, such as "America/Los_Angeles" or
    * "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data
    * Repository (CLDR)](http://cldr.unicode.org/) project, and currently
    * available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  @JSName("requestOptions.timeZone")
  var requestOptionsDottimeZone: js.UndefOr[String] = js.native
}

object ParamsResourceQuerySourcesList {
  @scala.inline
  def apply(): ParamsResourceQuerySourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySourcesList]
  }
  @scala.inline
  implicit class ParamsResourceQuerySourcesListOps[Self <: ParamsResourceQuerySourcesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptionsDotdebugOptionsDotenableDebugging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.debugOptions.enableDebugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptionsDotdebugOptionsDotenableDebugging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.debugOptions.enableDebugging")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptionsDotlanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptionsDotlanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptionsDotsearchApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.searchApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptionsDotsearchApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.searchApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOptionsDottimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptionsDottimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions.timeZone")(js.undefined)
        ret
    }
  }
  
}

