package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePostsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.native
  /**
    * Whether the body content of the post is included with the result
    * (default: true).
    */
  var fetchBody: js.UndefOr[Boolean] = js.native
  /**
    * Whether image URL metadata for each post is included in the returned
    * result (default: false).
    */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of comments to retrieve with the returned post.
    */
  var maxComments: js.UndefOr[Double] = js.native
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.native
  /**
    * Whether a publish action should be performed when the post is updated
    * (default: false).
    */
  var publish: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPost] = js.native
  /**
    * Whether a revert action should be performed when the post is updated
    * (default: false).
    */
  var revert: js.UndefOr[Boolean] = js.native
}

object ParamsResourcePostsUpdate {
  @scala.inline
  def apply(): ParamsResourcePostsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsUpdate]
  }
  @scala.inline
  implicit class ParamsResourcePostsUpdateOps[Self <: ParamsResourcePostsUpdate] (val x: Self) extends AnyVal {
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
    def withFetchBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchBody")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchImages")(js.undefined)
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
    def withPublish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaPost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.undefined)
        ret
    }
  }
  
}

