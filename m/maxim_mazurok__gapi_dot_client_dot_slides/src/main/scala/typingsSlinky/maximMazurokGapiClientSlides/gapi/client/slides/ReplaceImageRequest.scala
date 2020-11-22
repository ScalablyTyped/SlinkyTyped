package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceImageRequest extends js.Object {
  
  /** The ID of the existing image that will be replaced. */
  var imageObjectId: js.UndefOr[String] = js.native
  
  /** The replacement method. */
  var imageReplaceMethod: js.UndefOr[String] = js.native
  
  /**
    * The image URL. The image is fetched once at insertion time and a copy is stored for display inside the presentation. Images must be less than 50MB in size, cannot exceed 25
    * megapixels, and must be in one of PNG, JPEG, or GIF format. The provided URL can be at most 2 kB in length. The URL itself is saved with the image, and exposed via the
    * Image.source_url field.
    */
  var url: js.UndefOr[String] = js.native
}
object ReplaceImageRequest {
  
  @scala.inline
  def apply(): ReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceImageRequest]
  }
  
  @scala.inline
  implicit class ReplaceImageRequestOps[Self <: ReplaceImageRequest] (val x: Self) extends AnyVal {
    
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
    def setImageObjectId(value: String): Self = this.set("imageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageObjectId: Self = this.set("imageObjectId", js.undefined)
    
    @scala.inline
    def setImageReplaceMethod(value: String): Self = this.set("imageReplaceMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageReplaceMethod: Self = this.set("imageReplaceMethod", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
