package typingsSlinky.amapJsSdk.anon

import typingsSlinky.amapJsSdk.AMap.Pixel
import typingsSlinky.amapJsSdk.AMap.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  var image: js.UndefOr[String] = js.native
  
  var imageOffset: js.UndefOr[Pixel] = js.native
  
  var imageSize: js.UndefOr[Size] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object Image {
  
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOffset(value: Pixel): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOffsetUndefined: Self = StObject.set(x, "imageOffset", js.undefined)
    
    @scala.inline
    def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
