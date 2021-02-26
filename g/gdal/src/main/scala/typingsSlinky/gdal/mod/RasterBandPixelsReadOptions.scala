package typingsSlinky.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandPixelsReadOptions extends StObject {
  
  var buffer_height: js.UndefOr[Double] = js.native
  
  var buffer_width: js.UndefOr[Double] = js.native
  
  var data_type: js.UndefOr[String] = js.native
  
  var line_space: js.UndefOr[Double] = js.native
  
  var pixel_space: js.UndefOr[Double] = js.native
}
object RasterBandPixelsReadOptions {
  
  @scala.inline
  def apply(): RasterBandPixelsReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterBandPixelsReadOptions]
  }
  
  @scala.inline
  implicit class RasterBandPixelsReadOptionsMutableBuilder[Self <: RasterBandPixelsReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer_height(value: Double): Self = StObject.set(x, "buffer_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer_heightUndefined: Self = StObject.set(x, "buffer_height", js.undefined)
    
    @scala.inline
    def setBuffer_width(value: Double): Self = StObject.set(x, "buffer_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer_widthUndefined: Self = StObject.set(x, "buffer_width", js.undefined)
    
    @scala.inline
    def setData_type(value: String): Self = StObject.set(x, "data_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_typeUndefined: Self = StObject.set(x, "data_type", js.undefined)
    
    @scala.inline
    def setLine_space(value: Double): Self = StObject.set(x, "line_space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine_spaceUndefined: Self = StObject.set(x, "line_space", js.undefined)
    
    @scala.inline
    def setPixel_space(value: Double): Self = StObject.set(x, "pixel_space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixel_spaceUndefined: Self = StObject.set(x, "pixel_space", js.undefined)
  }
}
