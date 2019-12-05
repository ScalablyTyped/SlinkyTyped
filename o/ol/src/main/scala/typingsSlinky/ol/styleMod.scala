package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.ol.colorMod.Color
import typingsSlinky.ol.imageStateMod.ImageState
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.styleAtlasManagerMod.Options
import typingsSlinky.ol.styleAtlasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  @js.native
  class Atlas protected () extends default {
    def this(size: Double, space: Double) = this()
  }
  
  @js.native
  class AtlasManager ()
    extends typingsSlinky.ol.styleAtlasManagerMod.default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Circle ()
    extends typingsSlinky.ol.styleCircleMod.default {
    def this(opt_options: typingsSlinky.ol.styleCircleMod.Options) = this()
  }
  
  @js.native
  class Fill ()
    extends typingsSlinky.ol.styleFillMod.default {
    def this(opt_options: typingsSlinky.ol.styleFillMod.Options) = this()
  }
  
  @js.native
  class Icon ()
    extends typingsSlinky.ol.styleIconMod.default {
    def this(opt_options: typingsSlinky.ol.styleIconMod.Options) = this()
  }
  
  @js.native
  class IconImage protected ()
    extends typingsSlinky.ol.styleIconImageMod.default {
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
  class Image protected ()
    extends typingsSlinky.ol.styleImageMod.default {
    def this(options: typingsSlinky.ol.styleImageMod.Options) = this()
  }
  
  @js.native
  class RegularShape protected ()
    extends typingsSlinky.ol.styleRegularShapeMod.default {
    def this(options: typingsSlinky.ol.styleRegularShapeMod.Options) = this()
  }
  
  @js.native
  class Stroke ()
    extends typingsSlinky.ol.styleStrokeMod.default {
    def this(opt_options: typingsSlinky.ol.styleStrokeMod.Options) = this()
  }
  
  @js.native
  class Style ()
    extends typingsSlinky.ol.styleStyleMod.default {
    def this(opt_options: typingsSlinky.ol.styleStyleMod.Options) = this()
  }
  
  @js.native
  class Text ()
    extends typingsSlinky.ol.styleTextMod.default {
    def this(opt_options: typingsSlinky.ol.styleTextMod.Options) = this()
  }
  
}

