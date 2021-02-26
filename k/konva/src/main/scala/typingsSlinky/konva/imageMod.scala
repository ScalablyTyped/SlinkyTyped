package typingsSlinky.konva

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGImageElement
import typingsSlinky.konva.contextMod.Context
import typingsSlinky.konva.shapeMod.Shape
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.typesMod.GetSet
import typingsSlinky.konva.typesMod.IRect
import typingsSlinky.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("konva/types/shapes/Image", "Image")
  @js.native
  class Image () extends Shape[ImageConfig] {
    def this(config: ImageConfig) = this()
    
    def _hitFunc(context: js.Any): Unit = js.native
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def crop(): IRect = js.native
    def crop(v: IRect): this.type = js.native
    
    def cropHeight(): Double = js.native
    def cropHeight(v: Double): this.type = js.native
    @JSName("cropHeight")
    var cropHeight_Original: GetSet[Double, this.type] = js.native
    
    def cropWidth(): Double = js.native
    def cropWidth(v: Double): this.type = js.native
    @JSName("cropWidth")
    var cropWidth_Original: GetSet[Double, this.type] = js.native
    
    def cropX(): Double = js.native
    def cropX(v: Double): this.type = js.native
    @JSName("cropX")
    var cropX_Original: GetSet[Double, this.type] = js.native
    
    def cropY(): Double = js.native
    def cropY(v: Double): this.type = js.native
    @JSName("cropY")
    var cropY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("crop")
    var crop_Original: GetSet[IRect, this.type] = js.native
    
    def getHeight(): js.Any = js.native
    
    def getWidth(): js.Any = js.native
    
    def image(): this.type = js.native
    def image(v: CanvasImageSource): this.type = js.native
    @JSName("image")
    var image_Original: GetSet[js.UndefOr[CanvasImageSource], this.type] = js.native
    @JSName("image")
    def image_Union(): js.UndefOr[CanvasImageSource] = js.native
  }
  /* static members */
  object Image {
    
    @JSImport("konva/types/shapes/Image", "Image.fromURL")
    @js.native
    def fromURL(url: js.Any, callback: js.Any): Unit = js.native
  }
  
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
    implicit class ImageConfigMutableBuilder[Self <: ImageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrop(value: IRect): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setImage(value: CanvasImageSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageHTMLVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSVGImageElement(value: SVGImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
}
