package typingsSlinky.konva.imageMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGImageElement
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.typesMod.IRect
import typingsSlinky.std.CanvasImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageConfig extends ShapeConfig {
  
  var crop: js.UndefOr[IRect] = js.native
  
  var image: js.UndefOr[CanvasImageSource] = js.native
}
object ImageConfig {
  
  @scala.inline
  def apply(): ImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfig]
  }
  
  @scala.inline
  implicit class ImageConfigOps[Self <: ImageConfig] (val x: Self) extends AnyVal {
    
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
    def setCrop(value: IRect): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setImageHTMLImageElement(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHTMLVideoElement(value: HTMLVideoElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: CanvasImageSource): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSVGImageElement(value: SVGImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
