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
trait ParamsResourcePagesUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the Blog.
    */
  var blogId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Page.
    */
  var pageId: js.UndefOr[String] = js.native
  
  /**
    * Whether a publish action should be performed when the page is updated
    * (default: false).
    */
  var publish: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPage] = js.native
  
  /**
    * Whether a revert action should be performed when the page is updated
    * (default: false).
    */
  var revert: js.UndefOr[Boolean] = js.native
}
object ParamsResourcePagesUpdate {
  
  @scala.inline
  def apply(): ParamsResourcePagesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourcePagesUpdateMutableBuilder[Self <: ParamsResourcePagesUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBlogId(value: String): Self = StObject.set(x, "blogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogIdUndefined: Self = StObject.set(x, "blogId", js.undefined)
    
    @scala.inline
    def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    @scala.inline
    def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
  }
}
