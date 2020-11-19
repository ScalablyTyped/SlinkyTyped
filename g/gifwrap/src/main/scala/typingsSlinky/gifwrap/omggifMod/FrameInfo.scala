package typingsSlinky.gifwrap.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameInfo extends js.Object {
  
  var data_length: Double = js.native
  
  var data_offset: Double = js.native
  
  var delay: Double = js.native
  
   // 100ths of a second
  var disposal: Double = js.native
  
  var has_local_palette: Boolean = js.native
  
  var height: Double = js.native
  
  var interlaced: Boolean = js.native
  
  var palette_offset: Double = js.native
  
  var transparent_index: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object FrameInfo {
  
  @scala.inline
  def apply(
    data_length: Double,
    data_offset: Double,
    delay: Double,
    disposal: Double,
    has_local_palette: Boolean,
    height: Double,
    interlaced: Boolean,
    palette_offset: Double,
    transparent_index: Double,
    width: Double,
    x: Double,
    y: Double
  ): FrameInfo = {
    val __obj = js.Dynamic.literal(data_length = data_length.asInstanceOf[js.Any], data_offset = data_offset.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], disposal = disposal.asInstanceOf[js.Any], has_local_palette = has_local_palette.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlaced = interlaced.asInstanceOf[js.Any], palette_offset = palette_offset.asInstanceOf[js.Any], transparent_index = transparent_index.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameInfo]
  }
  
  @scala.inline
  implicit class FrameInfoOps[Self <: FrameInfo] (val x: Self) extends AnyVal {
    
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
    def setData_length(value: Double): Self = this.set("data_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_offset(value: Double): Self = this.set("data_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposal(value: Double): Self = this.set("disposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_local_palette(value: Boolean): Self = this.set("has_local_palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlaced(value: Boolean): Self = this.set("interlaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPalette_offset(value: Double): Self = this.set("palette_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparent_index(value: Double): Self = this.set("transparent_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
