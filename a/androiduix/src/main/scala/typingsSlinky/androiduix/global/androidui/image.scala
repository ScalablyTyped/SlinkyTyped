package typingsSlinky.androiduix.global.androidui

import typingsSlinky.androiduix.android.graphics.Paint
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("androidui.image")
@js.native
object image extends js.Object {
  
  @js.native
  class ChangeImageSizeDrawable protected ()
    extends typingsSlinky.androiduix.androidui.image.ChangeImageSizeDrawable {
    def this(drawable: Drawable, overrideWidth: Double) = this()
    def this(drawable: Drawable, overrideWidth: Double, overrideHeight: Double) = this()
  }
  
  @js.native
  class NetDrawable protected ()
    extends typingsSlinky.androiduix.androidui.image.NetDrawable {
    def this(src: String) = this()
    def this(src: typingsSlinky.androiduix.androidui.image.NetImage) = this()
    def this(src: String, paint: Paint) = this()
    def this(src: typingsSlinky.androiduix.androidui.image.NetImage, paint: Paint) = this()
    def this(src: String, paint: js.UndefOr[scala.Nothing], overrideImageRatio: Double) = this()
    def this(src: String, paint: Paint, overrideImageRatio: Double) = this()
    def this(
      src: typingsSlinky.androiduix.androidui.image.NetImage,
      paint: js.UndefOr[scala.Nothing],
      overrideImageRatio: Double
    ) = this()
    def this(src: typingsSlinky.androiduix.androidui.image.NetImage, paint: Paint, overrideImageRatio: Double) = this()
  }
  @js.native
  object NetDrawable extends js.Object {
    
    @js.native
    object TileMode extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.androiduix.androidui.image.NetDrawable.TileMode with Double] = js.native
      
      /* 0 */ val DEFAULT: typingsSlinky.androiduix.androidui.image.NetDrawable.TileMode.DEFAULT with Double = js.native
      
      /* 1 */ val REPEAT: typingsSlinky.androiduix.androidui.image.NetDrawable.TileMode.REPEAT with Double = js.native
    }
  }
  
  @js.native
  class NetImage protected ()
    extends typingsSlinky.androiduix.androidui.image.NetImage {
    def this(src: String) = this()
    def this(src: String, overrideImageRatio: Double) = this()
  }
  
  @js.native
  class NinePatchDrawable ()
    extends typingsSlinky.androiduix.androidui.image.NinePatchDrawable
  /* static members */
  @js.native
  object NinePatchDrawable extends js.Object {
    
    var GlobalBorderInfoCache: js.Any = js.native
  }
}
