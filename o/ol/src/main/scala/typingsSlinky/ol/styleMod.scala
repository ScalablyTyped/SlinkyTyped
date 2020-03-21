package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.ol.colorMod.Color
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.styleCircleMod.Options
import typingsSlinky.ol.styleCircleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  @js.native
  class Circle () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Fill ()
    extends typingsSlinky.ol.fillMod.default {
    def this(opt_options: typingsSlinky.ol.fillMod.Options) = this()
  }
  
  @js.native
  class Icon ()
    extends typingsSlinky.ol.iconMod.default {
    def this(opt_options: typingsSlinky.ol.iconMod.Options) = this()
  }
  
  @js.native
  class IconImage protected ()
    extends typingsSlinky.ol.iconImageMod.default {
    def this(
      image: HTMLCanvasElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: js.UndefOr[scala.Nothing],
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  @js.native
  abstract class Image protected ()
    extends typingsSlinky.ol.styleImageMod.default {
    def this(options: typingsSlinky.ol.styleImageMod.Options) = this()
  }
  
  @js.native
  class RegularShape protected ()
    extends typingsSlinky.ol.regularShapeMod.default {
    def this(options: typingsSlinky.ol.regularShapeMod.Options) = this()
  }
  
  @js.native
  class Stroke ()
    extends typingsSlinky.ol.strokeMod.default {
    def this(opt_options: typingsSlinky.ol.strokeMod.Options) = this()
  }
  
  @js.native
  class Style ()
    extends typingsSlinky.ol.styleStyleMod.default {
    def this(opt_options: typingsSlinky.ol.styleStyleMod.Options) = this()
  }
  
  @js.native
  class Text ()
    extends typingsSlinky.ol.textMod.default {
    def this(opt_options: typingsSlinky.ol.textMod.Options) = this()
  }
  
}

