package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePostsPublish extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * Optional date and time to schedule the publishing of the Blog. If no
    * publishDate parameter is given, the post is either published at the a
    * previously saved schedule date (if present), or the current time. If a
    * future date is given, the post will be scheduled to be published.
    */
  var publishDate: js.UndefOr[String] = js.native
}

object ParamsResourcePostsPublish {
  @scala.inline
  def apply(): ParamsResourcePostsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsPublish]
  }
  @scala.inline
  implicit class ParamsResourcePostsPublishOps[Self <: ParamsResourcePostsPublish] (val x: Self) extends AnyVal {
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
    def withPublishDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDate")(js.undefined)
        ret
    }
  }
  
}

