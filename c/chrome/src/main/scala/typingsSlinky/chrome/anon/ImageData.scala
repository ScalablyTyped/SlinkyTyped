package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageData extends StObject {
  
  var imageData: js.UndefOr[org.scalajs.dom.raw.ImageData | StringDictionary[org.scalajs.dom.raw.ImageData]] = js.native
}
object ImageData {
  
  @scala.inline
  def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  
  @scala.inline
  implicit class ImageDataMutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageData(value: org.scalajs.dom.raw.ImageData | StringDictionary[org.scalajs.dom.raw.ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataImageData(value: org.scalajs.dom.raw.ImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
