package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePostsInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of the blog to add the post to.
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
    * Whether to create the post as a draft (default: false).
    */
  var isDraft: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPost] = js.native
}
object ParamsResourcePostsInsert {
  
  @scala.inline
  def apply(): ParamsResourcePostsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePostsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourcePostsInsertOps[Self <: ParamsResourcePostsInsert] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = this.set("blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogId: Self = this.set("blogId", js.undefined)
    
    @scala.inline
    def setFetchBody(value: Boolean): Self = this.set("fetchBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchBody: Self = this.set("fetchBody", js.undefined)
    
    @scala.inline
    def setFetchImages(value: Boolean): Self = this.set("fetchImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchImages: Self = this.set("fetchImages", js.undefined)
    
    @scala.inline
    def setIsDraft(value: Boolean): Self = this.set("isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDraft: Self = this.set("isDraft", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPost): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
}
