package typingsSlinky.reactImgpro

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactImgpro.anon.Blue
import typingsSlinky.reactImgpro.anon.Degree
import typingsSlinky.reactImgpro.anon.Height
import typingsSlinky.reactImgpro.anon.Horizontal
import typingsSlinky.reactImgpro.mod.ReactImgpro.ProcessImageProps
import typingsSlinky.reactImgpro.reactImgproStrings.horizontal_center
import typingsSlinky.reactImgpro.reactImgproStrings.horizontal_left
import typingsSlinky.reactImgpro.reactImgproStrings.horizontal_right
import typingsSlinky.reactImgpro.reactImgproStrings.vertical_bottom
import typingsSlinky.reactImgpro.reactImgproStrings.vertical_middle
import typingsSlinky.reactImgpro.reactImgproStrings.vertical_top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-imgpro", JSImport.Default)
  @js.native
  class default ()
    extends Component[ProcessImageProps, js.Object, js.Any]
  
  object ReactImgpro {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.reactImgpro.reactImgproStrings.neighbor
      - typingsSlinky.reactImgpro.reactImgproStrings.bilinear
      - typingsSlinky.reactImgpro.reactImgproStrings.bicubic
      - typingsSlinky.reactImgpro.reactImgproStrings.hermite
      - typingsSlinky.reactImgpro.reactImgproStrings.bezier
    */
    trait Mode extends StObject
    object Mode {
      
      @scala.inline
      def bezier: typingsSlinky.reactImgpro.reactImgproStrings.bezier = "bezier".asInstanceOf[typingsSlinky.reactImgpro.reactImgproStrings.bezier]
      
      @scala.inline
      def bicubic: typingsSlinky.reactImgpro.reactImgproStrings.bicubic = "bicubic".asInstanceOf[typingsSlinky.reactImgpro.reactImgproStrings.bicubic]
      
      @scala.inline
      def bilinear: typingsSlinky.reactImgpro.reactImgproStrings.bilinear = "bilinear".asInstanceOf[typingsSlinky.reactImgpro.reactImgproStrings.bilinear]
      
      @scala.inline
      def hermite: typingsSlinky.reactImgpro.reactImgproStrings.hermite = "hermite".asInstanceOf[typingsSlinky.reactImgpro.reactImgproStrings.hermite]
      
      @scala.inline
      def neighbor: typingsSlinky.reactImgpro.reactImgproStrings.neighbor = "neighbor".asInstanceOf[typingsSlinky.reactImgpro.reactImgproStrings.neighbor]
    }
    
    type ProcessImage = ReactComponentClass[ProcessImageProps]
    
    @js.native
    trait ProcessImageProps extends StObject {
      
      /* should be 0 - 1 */
      var blur: js.UndefOr[Double] = js.native
      
      var brightness: js.UndefOr[Double] = js.native
      
      var colors: js.UndefOr[Blue] = js.native
      
      var contain: js.UndefOr[Size] = js.native
      
      /* should be -1 to 1 */
      var contrast: js.UndefOr[Double] = js.native
      
      /* should be 0 - 100 */
      var cover: js.UndefOr[Size] = js.native
      
      var customCdn: js.UndefOr[String] = js.native
      
      var disableRerender: js.UndefOr[Boolean] = js.native
      
      var disableWebWorker: js.UndefOr[Boolean] = js.native
      
      var dither565: js.UndefOr[Boolean] = js.native
      
      /* should be -1 to 1 */
      var fade: js.UndefOr[Double] = js.native
      
      var flip: js.UndefOr[Horizontal] = js.native
      
      var greyscale: js.UndefOr[Boolean] = js.native
      
      var image: String = js.native
      
      var invert: js.UndefOr[Boolean] = js.native
      
      var normalize: js.UndefOr[Boolean] = js.native
      
      def onProcessFinish(): Unit = js.native
      
      /* should be 0 - 1 */
      var opacity: js.UndefOr[Double] = js.native
      
      var opaque: js.UndefOr[Boolean] = js.native
      
      /* should be 0 - 100 */
      var posterize: js.UndefOr[Double] = js.native
      
      var quality: js.UndefOr[Double] = js.native
      
      var resize: js.UndefOr[Shape] = js.native
      
      var rotate: js.UndefOr[Degree] = js.native
      
      var scale: js.UndefOr[Boolean] = js.native
      
      var scaleToFitImage: js.UndefOr[Height] = js.native
      
      var sepia: js.UndefOr[Boolean] = js.native
      
      var storage: js.UndefOr[Boolean] = js.native
    }
    object ProcessImageProps {
      
      @scala.inline
      def apply(image: String, onProcessFinish: () => Unit): ProcessImageProps = {
        val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
        __obj.asInstanceOf[ProcessImageProps]
      }
      
      @scala.inline
      implicit class ProcessImagePropsMutableBuilder[Self <: ProcessImageProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
        
        @scala.inline
        def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
        
        @scala.inline
        def setColors(value: Blue): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        @scala.inline
        def setContain(value: Size): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
        
        @scala.inline
        def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
        
        @scala.inline
        def setCover(value: Size): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
        
        @scala.inline
        def setCustomCdn(value: String): Self = StObject.set(x, "customCdn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomCdnUndefined: Self = StObject.set(x, "customCdn", js.undefined)
        
        @scala.inline
        def setDisableRerender(value: Boolean): Self = StObject.set(x, "disableRerender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableRerenderUndefined: Self = StObject.set(x, "disableRerender", js.undefined)
        
        @scala.inline
        def setDisableWebWorker(value: Boolean): Self = StObject.set(x, "disableWebWorker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableWebWorkerUndefined: Self = StObject.set(x, "disableWebWorker", js.undefined)
        
        @scala.inline
        def setDither565(value: Boolean): Self = StObject.set(x, "dither565", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDither565Undefined: Self = StObject.set(x, "dither565", js.undefined)
        
        @scala.inline
        def setFade(value: Double): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
        
        @scala.inline
        def setFlip(value: Horizontal): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
        
        @scala.inline
        def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
        
        @scala.inline
        def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
        
        @scala.inline
        def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
        
        @scala.inline
        def setOnProcessFinish(value: () => Unit): Self = StObject.set(x, "onProcessFinish", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        @scala.inline
        def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
        
        @scala.inline
        def setPosterize(value: Double): Self = StObject.set(x, "posterize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosterizeUndefined: Self = StObject.set(x, "posterize", js.undefined)
        
        @scala.inline
        def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
        
        @scala.inline
        def setResize(value: Shape): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
        
        @scala.inline
        def setRotate(value: Degree): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        @scala.inline
        def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleToFitImage(value: Height): Self = StObject.set(x, "scaleToFitImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleToFitImageUndefined: Self = StObject.set(x, "scaleToFitImage", js.undefined)
        
        @scala.inline
        def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        @scala.inline
        def setSepia(value: Boolean): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSepiaUndefined: Self = StObject.set(x, "sepia", js.undefined)
        
        @scala.inline
        def setStorage(value: Boolean): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
    
    @js.native
    trait Shape extends StObject {
      
      var height: js.UndefOr[Double] = js.native
      
      var mode: js.UndefOr[Mode] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object Shape {
      
      @scala.inline
      def apply(): Shape = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Shape]
      }
      
      @scala.inline
      implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait Size extends StObject {
      
      var height: Double = js.native
      
      var mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle = js.native
      
      var width: Double = js.native
    }
    object Size {
      
      @scala.inline
      def apply(
        height: Double,
        mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle,
        width: Double
      ): Size = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Size]
      }
      
      @scala.inline
      implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMode(
          value: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
        ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
  }
}
