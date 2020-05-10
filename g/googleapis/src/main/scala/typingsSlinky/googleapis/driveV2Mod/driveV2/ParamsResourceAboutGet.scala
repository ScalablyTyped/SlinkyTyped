package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAboutGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to count changes outside the My Drive hierarchy. When set to
    * false, changes to files such as those in the Application Data folder or
    * shared files which have not been added to My Drive will be omitted from
    * the maxChangeIdCount.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of remaining change IDs to count
    */
  var maxChangeIdCount: js.UndefOr[String] = js.native
  /**
    * Change ID to start counting from when calculating number of remaining
    * change IDs
    */
  var startChangeId: js.UndefOr[String] = js.native
}

object ParamsResourceAboutGet {
  @scala.inline
  def apply(): ParamsResourceAboutGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAboutGet]
  }
  @scala.inline
  implicit class ParamsResourceAboutGetOps[Self <: ParamsResourceAboutGet] (val x: Self) extends AnyVal {
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
    def withIncludeSubscribed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubscribed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSubscribed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubscribed")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChangeIdCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChangeIdCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChangeIdCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChangeIdCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStartChangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartChangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChangeId")(js.undefined)
        ret
    }
  }
  
}

