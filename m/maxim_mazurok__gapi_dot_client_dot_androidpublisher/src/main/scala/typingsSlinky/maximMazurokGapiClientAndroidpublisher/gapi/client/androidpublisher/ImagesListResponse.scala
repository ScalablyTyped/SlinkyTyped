package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagesListResponse extends StObject {
  
  /** All listed Images. */
  var images: js.UndefOr[js.Array[Image]] = js.native
}
object ImagesListResponse {
  
  @scala.inline
  def apply(): ImagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesListResponse]
  }
  
  @scala.inline
  implicit class ImagesListResponseMutableBuilder[Self <: ImagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
  }
}
