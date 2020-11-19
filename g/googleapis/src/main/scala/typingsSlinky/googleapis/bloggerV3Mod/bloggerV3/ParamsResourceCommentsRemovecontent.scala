package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCommentsRemovecontent extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the comment to delete content from.
    */
  var commentId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Post.
    */
  var postId: js.UndefOr[String] = js.native
}
object ParamsResourceCommentsRemovecontent {
  
  @scala.inline
  def apply(): ParamsResourceCommentsRemovecontent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsRemovecontent]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentsRemovecontentOps[Self <: ParamsResourceCommentsRemovecontent] (val x: Self) extends AnyVal {
    
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
    def setCommentId(value: String): Self = this.set("commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentId: Self = this.set("commentId", js.undefined)
    
    @scala.inline
    def setPostId(value: String): Self = this.set("postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostId: Self = this.set("postId", js.undefined)
  }
}
