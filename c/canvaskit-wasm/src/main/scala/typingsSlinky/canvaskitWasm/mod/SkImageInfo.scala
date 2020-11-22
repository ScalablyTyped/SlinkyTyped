package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkImageInfo extends js.Object {
  
  var alphaType: AlphaType = js.native
  
  var colorSpace: ColorSpace = js.native
  
  var colorType: ColorType = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object SkImageInfo {
  
  @scala.inline
  def apply(alphaType: AlphaType, colorSpace: ColorSpace, colorType: ColorType, height: Double, width: Double): SkImageInfo = {
    val __obj = js.Dynamic.literal(alphaType = alphaType.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkImageInfo]
  }
  
  @scala.inline
  implicit class SkImageInfoOps[Self <: SkImageInfo] (val x: Self) extends AnyVal {
    
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
    def setAlphaType(value: AlphaType): Self = this.set("alphaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpace(value: ColorSpace): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: ColorType): Self = this.set("colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
