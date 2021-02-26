package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePresentationsPagesGetthumbnail extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The object ID of the page whose thumbnail to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.native
  
  /**
    * The optional mime type of the thumbnail image.  If you don't specify the
    * mime type, the default mime type will be PNG.
    */
  @JSName("thumbnailProperties.mimeType")
  var thumbnailPropertiesDotmimeType: js.UndefOr[String] = js.native
  
  /**
    * The optional thumbnail image size.  If you don't specify the size, the
    * server chooses a default size of the image.
    */
  @JSName("thumbnailProperties.thumbnailSize")
  var thumbnailPropertiesDotthumbnailSize: js.UndefOr[String] = js.native
}
object ParamsResourcePresentationsPagesGetthumbnail {
  
  @scala.inline
  def apply(): ParamsResourcePresentationsPagesGetthumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGetthumbnail]
  }
  
  @scala.inline
  implicit class ParamsResourcePresentationsPagesGetthumbnailMutableBuilder[Self <: ParamsResourcePresentationsPagesGetthumbnail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    @scala.inline
    def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    @scala.inline
    def setThumbnailPropertiesDotmimeType(value: String): Self = StObject.set(x, "thumbnailProperties.mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailPropertiesDotmimeTypeUndefined: Self = StObject.set(x, "thumbnailProperties.mimeType", js.undefined)
    
    @scala.inline
    def setThumbnailPropertiesDotthumbnailSize(value: String): Self = StObject.set(x, "thumbnailProperties.thumbnailSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailPropertiesDotthumbnailSizeUndefined: Self = StObject.set(x, "thumbnailProperties.thumbnailSize", js.undefined)
  }
}
