package typingsSlinky.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaUser extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The ID of the Blog. */
  var blogId: String = js.native
  /** Whether the body content of the post is included with the result (default: true). */
  var fetchBody: js.UndefOr[Boolean] = js.native
  /** Whether image URL metadata for each post is included in the returned result (default: false). */
  var fetchImages: js.UndefOr[Boolean] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Maximum number of comments to retrieve with the returned post. */
  var maxComments: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** The ID of the Post. */
  var postId: String = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Whether a publish action should be performed when the post is updated (default: false). */
  var publish: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** Whether a revert action should be performed when the post is updated (default: false). */
  var revert: js.UndefOr[Boolean] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object QuotaUser {
  @scala.inline
  def apply(blogId: String, postId: String): QuotaUser = {
    val __obj = js.Dynamic.literal(blogId = blogId.asInstanceOf[js.Any], postId = postId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaUser]
  }
  @scala.inline
  implicit class QuotaUserOps[Self <: QuotaUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlogId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
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
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
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
    def withOauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth_token")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
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
    def withQuotaUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaUser")(js.undefined)
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
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
  }
  
}

