package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePresentationsPagesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The object ID of the page to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.native
}

object ParamsResourcePresentationsPagesGet {
  @scala.inline
  def apply(): ParamsResourcePresentationsPagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGet]
  }
  @scala.inline
  implicit class ParamsResourcePresentationsPagesGetOps[Self <: ParamsResourcePresentationsPagesGet] (val x: Self) extends AnyVal {
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
    def withPageObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(js.undefined)
        ret
    }
  }
  
}

