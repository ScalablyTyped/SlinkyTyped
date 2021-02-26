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
  implicit class ParamsResourcePostsInsertMutableBuilder[Self <: ParamsResourcePostsInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setFetchBody(value: Boolean): Self = StObject.set(x, "fetchBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchBodyUndefined: Self = StObject.set(x, "fetchBody", js.undefined)
    
    @scala.inline
    def setFetchImages(value: Boolean): Self = StObject.set(x, "fetchImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchImagesUndefined: Self = StObject.set(x, "fetchImages", js.undefined)
    
    @scala.inline
    def setIsDraft(value: Boolean): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPost): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
