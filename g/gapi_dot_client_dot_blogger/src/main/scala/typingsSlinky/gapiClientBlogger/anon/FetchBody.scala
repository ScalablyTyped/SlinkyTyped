package typingsSlinky.gapiClientBlogger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchBody extends js.Object {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** ID of the blog to fetch the post from. */
  var blogId: String = js.native
  
  /**
    * Whether the body content of the post is included (default: true). This should be set to false when the post bodies are not required, to help minimize
    * traffic.
    */
  var fetchBody: js.UndefOr[Boolean] = js.native
  
  /** Whether image URL metadata for each post is included (default: false). */
  var fetchImages: js.UndefOr[Boolean] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Maximum number of comments to pull back on a post. */
  var maxComments: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** The ID of the post */
  var postId: String = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  
  /** Access level with which to view the returned result. Note that some fields require elevated access. */
  var view: js.UndefOr[String] = js.native
}
object FetchBody {
  
  @scala.inline
  def apply(blogId: String, postId: String): FetchBody = {
    val __obj = js.Dynamic.literal(blogId = blogId.asInstanceOf[js.Any], postId = postId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchBody]
  }
  
  @scala.inline
  implicit class FetchBodyOps[Self <: FetchBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlogId(value: String): Self = this.set("blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostId(value: String): Self = this.set("postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setFetchBody(value: Boolean): Self = this.set("fetchBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchBody: Self = this.set("fetchBody", js.undefined)
    
    @scala.inline
    def setFetchImages(value: Boolean): Self = this.set("fetchImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchImages: Self = this.set("fetchImages", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxComments(value: Double): Self = this.set("maxComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxComments: Self = this.set("maxComments", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
