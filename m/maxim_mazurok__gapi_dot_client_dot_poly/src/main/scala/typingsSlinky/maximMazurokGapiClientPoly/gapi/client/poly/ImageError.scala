package typingsSlinky.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageError extends StObject {
  
  /** The type of image error encountered. Optional for older image errors. */
  var code: js.UndefOr[String] = js.native
  
  /** The file path in the import of the image that was rejected. */
  var filePath: js.UndefOr[String] = js.native
}
object ImageError {
  
  @scala.inline
  def apply(): ImageError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageError]
  }
  
  @scala.inline
  implicit class ImageErrorMutableBuilder[Self <: ImageError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
