package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageResizeModeStatic extends StObject {
  
  /**
    * center - The image will be scaled down such that it is completely visible,
    * if bigger than the area of the view.
    * The image will not be scaled up.
    */
  var center: ImageResizeMode = js.native
  
  /**
    * contain - The image will be resized such that it will be completely
    * visible, contained within the frame of the View.
    */
  var contain: ImageResizeMode = js.native
  
  /**
    * cover - The image will be resized such that the entire area of the view
    * is covered by the image, potentially clipping parts of the image.
    */
  var cover: ImageResizeMode = js.native
  
  /**
    * repeat - The image will be repeated to cover the frame of the View. The
    * image will keep it's size and aspect ratio.
    */
  var repeat: ImageResizeMode = js.native
  
  /**
    * stretch - The image will be stretched to fill the entire frame of the
    * view without clipping.  This may change the aspect ratio of the image,
    * distoring it.  Only supported on iOS.
    */
  var stretch: ImageResizeMode = js.native
}
object ImageResizeModeStatic {
  
  @scala.inline
  def apply(
    center: ImageResizeMode,
    contain: ImageResizeMode,
    cover: ImageResizeMode,
    repeat: ImageResizeMode,
    stretch: ImageResizeMode
  ): ImageResizeModeStatic = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResizeModeStatic]
  }
  
  @scala.inline
  implicit class ImageResizeModeStaticMutableBuilder[Self <: ImageResizeModeStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: ImageResizeMode): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContain(value: ImageResizeMode): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover(value: ImageResizeMode): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: ImageResizeMode): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretch(value: ImageResizeMode): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
  }
}
