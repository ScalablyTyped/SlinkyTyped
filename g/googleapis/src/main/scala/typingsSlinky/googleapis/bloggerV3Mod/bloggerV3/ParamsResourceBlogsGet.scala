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
trait ParamsResourceBlogsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the blog to get.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of posts to pull back with the blog.
    */
  var maxPosts: js.UndefOr[Double] = js.native
  
  /**
    * Access level with which to view the blog. Note that some fields require
    * elevated access.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceBlogsGet {
  
  @scala.inline
  def apply(): ParamsResourceBlogsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceBlogsGetMutableBuilder[Self <: ParamsResourceBlogsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setMaxPosts(value: Double): Self = StObject.set(x, "maxPosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPostsUndefined: Self = StObject.set(x, "maxPosts", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
