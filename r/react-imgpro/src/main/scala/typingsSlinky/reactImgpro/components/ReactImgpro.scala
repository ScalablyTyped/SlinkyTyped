package typingsSlinky.reactImgpro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactImgpro.anon.Blue
import typingsSlinky.reactImgpro.anon.Degree
import typingsSlinky.reactImgpro.anon.Height
import typingsSlinky.reactImgpro.anon.Horizontal
import typingsSlinky.reactImgpro.mod.ReactImgpro.ProcessImageProps
import typingsSlinky.reactImgpro.mod.ReactImgpro.Shape
import typingsSlinky.reactImgpro.mod.ReactImgpro.Size
import typingsSlinky.reactImgpro.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImgpro {
  
  @JSImport("react-imgpro", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def blur(value: Double): this.type = set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brightness(value: Double): this.type = set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colors(value: Blue): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contain(value: Size): this.type = set("contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contrast(value: Double): this.type = set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cover(value: Size): this.type = set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customCdn(value: String): this.type = set("customCdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableRerender(value: Boolean): this.type = set("disableRerender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableWebWorker(value: Boolean): this.type = set("disableWebWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dither565(value: Boolean): this.type = set("dither565", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fade(value: Double): this.type = set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: Horizontal): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def greyscale(value: Boolean): this.type = set("greyscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invert(value: Boolean): this.type = set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def normalize(value: Boolean): this.type = set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opaque(value: Boolean): this.type = set("opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def posterize(value: Double): this.type = set("posterize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def quality(value: Double): this.type = set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resize(value: Shape): this.type = set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: Degree): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: Boolean): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scaleToFitImage(value: Height): this.type = set("scaleToFitImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sepia(value: Boolean): this.type = set("sepia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def storage(value: Boolean): this.type = set("storage", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProcessImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(image: String, onProcessFinish: () => Unit): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
    new Builder(js.Array(this.component, __props.asInstanceOf[ProcessImageProps]))
  }
}
