package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePostuserinfosGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the blog.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Maximum number of comments to pull back on a post.
    */
  var maxComments: js.UndefOr[Double] = js.native
  /**
    * The ID of the post to get.
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * ID of the user for the per-user information to be fetched. Either the
    * word 'self' (sans quote marks) or the user's profile identifier.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourcePostuserinfosGet {
  @scala.inline
  def apply(): ParamsResourcePostuserinfosGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostuserinfosGet]
  }
  @scala.inline
  implicit class ParamsResourcePostuserinfosGetOps[Self <: ParamsResourcePostuserinfosGet] (val x: Self) extends AnyVal {
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
    def withBlogId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxComments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxComments")(js.undefined)
        ret
    }
    @scala.inline
    def withPostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postId")(js.undefined)
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
  }
  
}

