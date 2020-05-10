package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBlogsListbyuser extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether the response is a list of blogs with per-user information instead
    * of just blogs.
    */
  var fetchUserInfo: js.UndefOr[Boolean] = js.native
  /**
    * User access types for blogs to include in the results, e.g. AUTHOR will
    * return blogs where the user has author level access. If no roles are
    * specified, defaults to ADMIN and AUTHOR roles.
    */
  var role: js.UndefOr[js.Array[String]] = js.native
  /**
    * Blog statuses to include in the result (default: Live blogs only). Note
    * that ADMIN access is required to view deleted blogs.
    */
  var status: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the user whose blogs are to be fetched. Either the word 'self'
    * (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.native
  /**
    * Access level with which to view the blogs. Note that some fields require
    * elevated access.
    */
  var view: js.UndefOr[String] = js.native
}

object ParamsResourceBlogsListbyuser {
  @scala.inline
  def apply(): ParamsResourceBlogsListbyuser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsListbyuser]
  }
  @scala.inline
  implicit class ParamsResourceBlogsListbyuserOps[Self <: ParamsResourceBlogsListbyuser] (val x: Self) extends AnyVal {
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
    def withFetchUserInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchUserInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchUserInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

