package typingsSlinky.googleapis.bloggerV3Mod.bloggerV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourcePostuserinfosGetMutableBuilder[Self <: ParamsResourcePostuserinfosGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setMaxComments(value: Double): Self = StObject.set(x, "maxComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCommentsUndefined: Self = StObject.set(x, "maxComments", js.undefined)
    
    @scala.inline
    def setPostId(value: String): Self = StObject.set(x, "postId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostIdUndefined: Self = StObject.set(x, "postId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
