package typingsSlinky.jimpPluginCrop

import typingsSlinky.jimpCore.etcMod.ImageCallback
import typingsSlinky.jimpPluginCrop.anon.CropOnlyFrames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-crop", JSImport.Default)
  @js.native
  def default(): Crop = js.native
  
  @js.native
  trait Crop extends StObject {
    
    var `class`: CropClass = js.native
  }
  object Crop {
    
    @scala.inline
    def apply(`class`: CropClass): Crop = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crop]
    }
    
    @scala.inline
    implicit class CropMutableBuilder[Self <: Crop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: CropClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CropClass extends StObject {
    
    def autocrop(): this.type = js.native
    def autocrop(cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(options: CropOnlyFrames): this.type = js.native
    def autocrop(options: CropOnlyFrames, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(
      tolerance: js.UndefOr[scala.Nothing],
      cropOnlyFrames: js.UndefOr[scala.Nothing],
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def autocrop(tolerance: js.UndefOr[scala.Nothing], cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(tolerance: js.UndefOr[scala.Nothing], cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Double): this.type = js.native
    def autocrop(tolerance: Double, cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Boolean): this.type = js.native
    def autocrop(tolerance: Double, cropOnlyFrames: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    
    def crop(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def crop(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def cropQuiet(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def cropQuiet(x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
