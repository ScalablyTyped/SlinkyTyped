package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageFormatEnumValues extends EmbindEnum {
  
  var JPEG: EncodedImageFormat = js.native
  
  // TODO(kjlubick) When these are compiled in depending on the availability of the codecs,
  //   be sure to make these nullable.
  var PNG: EncodedImageFormat = js.native
  
  var WEBP: EncodedImageFormat = js.native
}
object ImageFormatEnumValues {
  
  @scala.inline
  def apply(
    JPEG: EncodedImageFormat,
    PNG: EncodedImageFormat,
    WEBP: EncodedImageFormat,
    values: js.Array[Double]
  ): ImageFormatEnumValues = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any], WEBP = WEBP.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFormatEnumValues]
  }
  
  @scala.inline
  implicit class ImageFormatEnumValuesMutableBuilder[Self <: ImageFormatEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPEG(value: EncodedImageFormat): Self = StObject.set(x, "JPEG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG(value: EncodedImageFormat): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBP(value: EncodedImageFormat): Self = StObject.set(x, "WEBP", value.asInstanceOf[js.Any])
  }
}
