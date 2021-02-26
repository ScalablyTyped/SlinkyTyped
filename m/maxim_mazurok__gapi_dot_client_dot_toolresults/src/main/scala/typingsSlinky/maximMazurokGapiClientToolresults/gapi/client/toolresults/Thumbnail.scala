package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thumbnail extends StObject {
  
  /** The thumbnail's content type, i.e. "image/png". Always set. */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The thumbnail file itself. That is, the bytes here are precisely the bytes that make up the thumbnail file; they can be served as an image as-is (with the appropriate content type.)
    * Always set.
    */
  var data: js.UndefOr[String] = js.native
  
  /** The height of the thumbnail, in pixels. Always set. */
  var heightPx: js.UndefOr[Double] = js.native
  
  /** The width of the thumbnail, in pixels. Always set. */
  var widthPx: js.UndefOr[Double] = js.native
}
object Thumbnail {
  
  @scala.inline
  def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  @scala.inline
  implicit class ThumbnailMutableBuilder[Self <: Thumbnail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeightPx(value: Double): Self = StObject.set(x, "heightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPxUndefined: Self = StObject.set(x, "heightPx", js.undefined)
    
    @scala.inline
    def setWidthPx(value: Double): Self = StObject.set(x, "widthPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPxUndefined: Self = StObject.set(x, "widthPx", js.undefined)
  }
}
