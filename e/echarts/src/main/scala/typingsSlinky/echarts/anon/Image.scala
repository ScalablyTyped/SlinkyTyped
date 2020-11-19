package typingsSlinky.echarts.anon

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.echarts.echarts.EChartOption._Color
import typingsSlinky.echarts.echartsStrings.`no-repeat`
import typingsSlinky.echarts.echartsStrings.`repeat-x`
import typingsSlinky.echarts.echartsStrings.`repeat-y`
import typingsSlinky.echarts.echartsStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends _Color {
  
  /**
    * HTMLImageElement, and HTMLCanvasElement are supported, while string path is not supported
    */
  var image: HTMLImageElement | HTMLCanvasElement = js.native
  
  var repeat: js.UndefOr[
    typingsSlinky.echarts.echartsStrings.repeat | `repeat-x` | `repeat-y` | `no-repeat`
  ] = js.native
}
object Image {
  
  @scala.inline
  def apply(image: HTMLImageElement | HTMLCanvasElement): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setImageHTMLImageElement(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: HTMLImageElement | HTMLCanvasElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: repeat | `repeat-x` | `repeat-y` | `no-repeat`): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
}
