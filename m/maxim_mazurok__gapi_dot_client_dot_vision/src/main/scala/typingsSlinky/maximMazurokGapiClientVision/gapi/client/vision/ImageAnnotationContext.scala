package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAnnotationContext extends StObject {
  
  /** If the file was a PDF or TIFF, this field gives the page number within the file used to produce the image. */
  var pageNumber: js.UndefOr[Double] = js.native
  
  /** The URI of the file used to produce the image. */
  var uri: js.UndefOr[String] = js.native
}
object ImageAnnotationContext {
  
  @scala.inline
  def apply(): ImageAnnotationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAnnotationContext]
  }
  
  @scala.inline
  implicit class ImageAnnotationContextMutableBuilder[Self <: ImageAnnotationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
