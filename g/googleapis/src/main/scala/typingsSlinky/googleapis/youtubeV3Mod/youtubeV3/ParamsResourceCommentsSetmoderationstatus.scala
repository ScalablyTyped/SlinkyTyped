package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCommentsSetmoderationstatus extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The banAuthor parameter lets you indicate that you want to automatically
    * reject any additional comments written by the comment's author. Set the
    * parameter value to true to ban the author.  Note: This parameter is only
    * valid if the moderationStatus parameter is also set to rejected.
    */
  var banAuthor: js.UndefOr[Boolean] = js.native
  /**
    * The id parameter specifies a comma-separated list of IDs that identify
    * the comments for which you are updating the moderation status.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the new moderation status of the specified comments.
    */
  var moderationStatus: js.UndefOr[String] = js.native
}

object ParamsResourceCommentsSetmoderationstatus {
  @scala.inline
  def apply(): ParamsResourceCommentsSetmoderationstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsSetmoderationstatus]
  }
  @scala.inline
  implicit class ParamsResourceCommentsSetmoderationstatusOps[Self <: ParamsResourceCommentsSetmoderationstatus] (val x: Self) extends AnyVal {
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
    def withBanAuthor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withModerationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderationStatus")(js.undefined)
        ret
    }
  }
  
}

