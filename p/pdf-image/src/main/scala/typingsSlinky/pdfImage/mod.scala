package typingsSlinky.pdfImage

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pdfImage.anon.CombinedImageCombinedImage
import typingsSlinky.pdfImage.anon.ReadonlyConvertOptions
import typingsSlinky.pdfImage.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-image", "PDFImage")
  @js.native
  class PDFImage[CombinedImage /* <: Boolean */] protected () extends StObject {
    def this(
      path: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type OptionalSpread<CombinedImage> is not an array type */ options: OptionalSpread[CombinedImage]
    ) = this()
    
    def combineImages(imagePaths: js.Array[String]): js.Promise[String] = js.native
    
    def constructCombineCommandForFile(imagePaths: js.Array[String]): String = js.native
    
    def constructConvertCommandForPage(pageNumber: Double): String = js.native
    
    def constructConvertOptions(): String = js.native
    
    def constructGetInfoCommand(): String = js.native
    
    def convertFile(): js.Promise[js.Array[String] | String] = js.native
    
    def convertPage(pageNumber: Double): js.Promise[String] = js.native
    
    def getInfo(): js.Promise[PDFInfo] = js.native
    
    def getOutputImagePathForFile(): String = js.native
    
    def getOutputImagePathForPage(pageNumber: Double): String = js.native
    
    def parseGetInfoCommandOutput(output: String): StringDictionary[String] = js.native
    
    def setConvertExtension(): Unit = js.native
    def setConvertExtension(convertExtension: String): Unit = js.native
    
    def setConvertOptions(): Unit = js.native
    def setConvertOptions(convertOptions: ReadonlyConvertOptions): Unit = js.native
    
    def setPdfFileBaseName(): Unit = js.native
    def setPdfFileBaseName(pdfFileBaseName: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-blur`
    - typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-resize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-sharpen`
    - typingsSlinky.pdfImage.pdfImageStrings.`-adjoin`
    - typingsSlinky.pdfImage.pdfImageStrings.`-affine`
    - typingsSlinky.pdfImage.pdfImageStrings.`-alpha`
    - typingsSlinky.pdfImage.pdfImageStrings.`-annotate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-antialias`
    - typingsSlinky.pdfImage.pdfImageStrings.`-append`
    - typingsSlinky.pdfImage.pdfImageStrings.`-authenticate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-auto-gamma`
    - typingsSlinky.pdfImage.pdfImageStrings.`-auto-level`
    - typingsSlinky.pdfImage.pdfImageStrings.`-auto-orient`
    - typingsSlinky.pdfImage.pdfImageStrings.`-auto-threshold`
    - typingsSlinky.pdfImage.pdfImageStrings.`-background`
    - typingsSlinky.pdfImage.pdfImageStrings.`-bench`
    - typingsSlinky.pdfImage.pdfImageStrings.`-bias`
    - typingsSlinky.pdfImage.pdfImageStrings.`-black-threshold`
    - typingsSlinky.pdfImage.pdfImageStrings.`-blue-primary`
    - typingsSlinky.pdfImage.pdfImageStrings.`-blue-shift`
    - typingsSlinky.pdfImage.pdfImageStrings.`-blur`
    - typingsSlinky.pdfImage.pdfImageStrings.`-border`
    - typingsSlinky.pdfImage.pdfImageStrings.`-bordercolor`
    - typingsSlinky.pdfImage.pdfImageStrings.`-brightness-contrast`
    - typingsSlinky.pdfImage.pdfImageStrings.`-canny`
    - typingsSlinky.pdfImage.pdfImageStrings.`-caption`
    - typingsSlinky.pdfImage.pdfImageStrings.`-cdl`
    - typingsSlinky.pdfImage.pdfImageStrings.`-channel`
    - typingsSlinky.pdfImage.pdfImageStrings.`-charcoal`
    - typingsSlinky.pdfImage.pdfImageStrings.`-chop`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clahe`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clamp`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clip`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clip-mask`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clip-path`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clone`
    - typingsSlinky.pdfImage.pdfImageStrings.`-clut`
    - typingsSlinky.pdfImage.pdfImageStrings.`-connected-components`
    - typingsSlinky.pdfImage.pdfImageStrings.`-contrast-stretch`
    - typingsSlinky.pdfImage.pdfImageStrings.`-coalesce`
    - typingsSlinky.pdfImage.pdfImageStrings.`-colorize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-color-matrix`
    - typingsSlinky.pdfImage.pdfImageStrings.`-colors`
    - typingsSlinky.pdfImage.pdfImageStrings.`-colorspace`
    - typingsSlinky.pdfImage.pdfImageStrings.`-combine`
    - typingsSlinky.pdfImage.pdfImageStrings.`-comment`
    - typingsSlinky.pdfImage.pdfImageStrings.`-compare`
    - typingsSlinky.pdfImage.pdfImageStrings.`-complexoperator`
    - typingsSlinky.pdfImage.pdfImageStrings.`-compose`
    - typingsSlinky.pdfImage.pdfImageStrings.`-composite`
    - typingsSlinky.pdfImage.pdfImageStrings.`-compress`
    - typingsSlinky.pdfImage.pdfImageStrings.`-contrast`
    - typingsSlinky.pdfImage.pdfImageStrings.`-convolve`
    - typingsSlinky.pdfImage.pdfImageStrings.`-copy`
    - typingsSlinky.pdfImage.pdfImageStrings.`-crop`
    - typingsSlinky.pdfImage.pdfImageStrings.`-cycle`
    - typingsSlinky.pdfImage.pdfImageStrings.`-decipher`
    - typingsSlinky.pdfImage.pdfImageStrings.`-debug`
    - typingsSlinky.pdfImage.pdfImageStrings.`-define`
    - typingsSlinky.pdfImage.pdfImageStrings.`-deconstruct`
    - typingsSlinky.pdfImage.pdfImageStrings.`-delay`
    - typingsSlinky.pdfImage.pdfImageStrings.`-delete`
    - typingsSlinky.pdfImage.pdfImageStrings.`-density`
    - typingsSlinky.pdfImage.pdfImageStrings.`-depth`
    - typingsSlinky.pdfImage.pdfImageStrings.`-despeckle`
    - typingsSlinky.pdfImage.pdfImageStrings.`-direction`
    - typingsSlinky.pdfImage.pdfImageStrings.`-display`
    - typingsSlinky.pdfImage.pdfImageStrings.`-dispose`
    - typingsSlinky.pdfImage.pdfImageStrings.`-distribute-cache`
    - typingsSlinky.pdfImage.pdfImageStrings.`-distort`
    - typingsSlinky.pdfImage.pdfImageStrings.`-dither`
    - typingsSlinky.pdfImage.pdfImageStrings.`-draw`
    - typingsSlinky.pdfImage.pdfImageStrings.`-duplicate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-edge`
    - typingsSlinky.pdfImage.pdfImageStrings.`-emboss`
    - typingsSlinky.pdfImage.pdfImageStrings.`-encipher`
    - typingsSlinky.pdfImage.pdfImageStrings.`-encoding`
    - typingsSlinky.pdfImage.pdfImageStrings.`-endian`
    - typingsSlinky.pdfImage.pdfImageStrings.`-enhance`
    - typingsSlinky.pdfImage.pdfImageStrings.`-equalize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-evaluate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-evaluate-sequence`
    - typingsSlinky.pdfImage.pdfImageStrings.`-extent`
    - typingsSlinky.pdfImage.pdfImageStrings.`-extract`
    - typingsSlinky.pdfImage.pdfImageStrings.`-family`
    - typingsSlinky.pdfImage.pdfImageStrings.`-features`
    - typingsSlinky.pdfImage.pdfImageStrings.`-fft`
    - typingsSlinky.pdfImage.pdfImageStrings.`-fill`
    - typingsSlinky.pdfImage.pdfImageStrings.`-filter`
    - typingsSlinky.pdfImage.pdfImageStrings.`-flatten`
    - typingsSlinky.pdfImage.pdfImageStrings.`-flip`
    - typingsSlinky.pdfImage.pdfImageStrings.`-floodfill`
    - typingsSlinky.pdfImage.pdfImageStrings.`-flop`
    - typingsSlinky.pdfImage.pdfImageStrings.`-font`
    - typingsSlinky.pdfImage.pdfImageStrings.`-format`
    - typingsSlinky.pdfImage.pdfImageStrings.`-frame`
    - typingsSlinky.pdfImage.pdfImageStrings.`-function`
    - typingsSlinky.pdfImage.pdfImageStrings.`-fuzz`
    - typingsSlinky.pdfImage.pdfImageStrings.`-fx`
    - typingsSlinky.pdfImage.pdfImageStrings.`-gamma`
    - typingsSlinky.pdfImage.pdfImageStrings.`-gaussian-blur`
    - typingsSlinky.pdfImage.pdfImageStrings.`-geometry`
    - typingsSlinky.pdfImage.pdfImageStrings.`-gravity`
    - typingsSlinky.pdfImage.pdfImageStrings.`-grayscale`
    - typingsSlinky.pdfImage.pdfImageStrings.`-green-primary`
    - typingsSlinky.pdfImage.pdfImageStrings.`-help`
    - typingsSlinky.pdfImage.pdfImageStrings.`-hough-lines`
    - typingsSlinky.pdfImage.pdfImageStrings.`-identify`
    - typingsSlinky.pdfImage.pdfImageStrings.`-ift`
    - typingsSlinky.pdfImage.pdfImageStrings.`-implode`
    - typingsSlinky.pdfImage.pdfImageStrings.`-insert`
    - typingsSlinky.pdfImage.pdfImageStrings.`-intensity`
    - typingsSlinky.pdfImage.pdfImageStrings.`-intent`
    - typingsSlinky.pdfImage.pdfImageStrings.`-interlace`
    - typingsSlinky.pdfImage.pdfImageStrings.`-interline-spacing`
    - typingsSlinky.pdfImage.pdfImageStrings.`-interpolate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-interword-spacing`
    - typingsSlinky.pdfImage.pdfImageStrings.`-kerning`
    - typingsSlinky.pdfImage.pdfImageStrings.`-kmeans`
    - typingsSlinky.pdfImage.pdfImageStrings.`-kuwahara`
    - typingsSlinky.pdfImage.pdfImageStrings.`-label`
    - typingsSlinky.pdfImage.pdfImageStrings.`-lat`
    - typingsSlinky.pdfImage.pdfImageStrings.`-layers`
    - typingsSlinky.pdfImage.pdfImageStrings.`-level`
    - typingsSlinky.pdfImage.pdfImageStrings.`-limit`
    - typingsSlinky.pdfImage.pdfImageStrings.`-linear-stretch`
    - typingsSlinky.pdfImage.pdfImageStrings.`-liquid-rescale`
    - typingsSlinky.pdfImage.pdfImageStrings.`-list`
    - typingsSlinky.pdfImage.pdfImageStrings.`-log`
    - typingsSlinky.pdfImage.pdfImageStrings.`-loop`
    - typingsSlinky.pdfImage.pdfImageStrings.`-mattecolor`
    - typingsSlinky.pdfImage.pdfImageStrings.`-median`
    - typingsSlinky.pdfImage.pdfImageStrings.`-mean-shift`
    - typingsSlinky.pdfImage.pdfImageStrings.`-metric`
    - typingsSlinky.pdfImage.pdfImageStrings.`-mode`
    - typingsSlinky.pdfImage.pdfImageStrings.`-modulate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-moments`
    - typingsSlinky.pdfImage.pdfImageStrings.`-monitor`
    - typingsSlinky.pdfImage.pdfImageStrings.`-monochrome`
    - typingsSlinky.pdfImage.pdfImageStrings.`-morph`
    - typingsSlinky.pdfImage.pdfImageStrings.`-morphology`
    - typingsSlinky.pdfImage.pdfImageStrings.`-motion-blur`
    - typingsSlinky.pdfImage.pdfImageStrings.`-negate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-noise`
    - typingsSlinky.pdfImage.pdfImageStrings.`-normalize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-opaque`
    - typingsSlinky.pdfImage.pdfImageStrings.`-ordered-dither`
    - typingsSlinky.pdfImage.pdfImageStrings.`-orient`
    - typingsSlinky.pdfImage.pdfImageStrings.`-page`
    - typingsSlinky.pdfImage.pdfImageStrings.`-paint`
    - typingsSlinky.pdfImage.pdfImageStrings.`-perceptible`
    - typingsSlinky.pdfImage.pdfImageStrings.`-ping`
    - typingsSlinky.pdfImage.pdfImageStrings.`-pointsize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-polaroid`
    - typingsSlinky.pdfImage.pdfImageStrings.`-poly`
    - typingsSlinky.pdfImage.pdfImageStrings.`-posterize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-precision`
    - typingsSlinky.pdfImage.pdfImageStrings.`-preview`
    - typingsSlinky.pdfImage.pdfImageStrings.`-print`
    - typingsSlinky.pdfImage.pdfImageStrings.`-process`
    - typingsSlinky.pdfImage.pdfImageStrings.`-profile`
    - typingsSlinky.pdfImage.pdfImageStrings.`-quality`
    - typingsSlinky.pdfImage.pdfImageStrings.`-quantize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-quiet`
    - typingsSlinky.pdfImage.pdfImageStrings.`-radial-blur`
    - typingsSlinky.pdfImage.pdfImageStrings.`-raise`
    - typingsSlinky.pdfImage.pdfImageStrings.`-random-threshold`
    - typingsSlinky.pdfImage.pdfImageStrings.`-range-threshold`
    - typingsSlinky.pdfImage.pdfImageStrings.`-read-mask`
    - typingsSlinky.pdfImage.pdfImageStrings.`-red-primary`
    - typingsSlinky.pdfImage.pdfImageStrings.`-regard-warnings`
    - typingsSlinky.pdfImage.pdfImageStrings.`-region`
    - typingsSlinky.pdfImage.pdfImageStrings.`-remap`
    - typingsSlinky.pdfImage.pdfImageStrings.`-render`
    - typingsSlinky.pdfImage.pdfImageStrings.`-repage`
    - typingsSlinky.pdfImage.pdfImageStrings.`-resample`
    - typingsSlinky.pdfImage.pdfImageStrings.`-resize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-respect-parentheses`
    - typingsSlinky.pdfImage.pdfImageStrings.`-roll`
    - typingsSlinky.pdfImage.pdfImageStrings.`-rotate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-sample`
    - typingsSlinky.pdfImage.pdfImageStrings.`-sampling-factor`
    - typingsSlinky.pdfImage.pdfImageStrings.`-scale`
    - typingsSlinky.pdfImage.pdfImageStrings.`-scene`
    - typingsSlinky.pdfImage.pdfImageStrings.`-seed`
    - typingsSlinky.pdfImage.pdfImageStrings.`-segment`
    - typingsSlinky.pdfImage.pdfImageStrings.`-selective-blur`
    - typingsSlinky.pdfImage.pdfImageStrings.`-separate`
    - typingsSlinky.pdfImage.pdfImageStrings.`-sepia-tone`
    - typingsSlinky.pdfImage.pdfImageStrings.`-set`
    - typingsSlinky.pdfImage.pdfImageStrings.`-shade`
    - typingsSlinky.pdfImage.pdfImageStrings.`-shadow`
    - typingsSlinky.pdfImage.pdfImageStrings.`-sharpen`
    - typingsSlinky.pdfImage.pdfImageStrings.`-shave`
    - typingsSlinky.pdfImage.pdfImageStrings.`-shear`
    - typingsSlinky.pdfImage.pdfImageStrings.`-sigmoidal-contrast`
    - typingsSlinky.pdfImage.pdfImageStrings.`-smush`
    - typingsSlinky.pdfImage.pdfImageStrings.`-size`
    - typingsSlinky.pdfImage.pdfImageStrings.`-sketch`
    - typingsSlinky.pdfImage.pdfImageStrings.`-solarize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-splice`
    - typingsSlinky.pdfImage.pdfImageStrings.`-spread`
    - typingsSlinky.pdfImage.pdfImageStrings.`-statistic`
    - typingsSlinky.pdfImage.pdfImageStrings.`-strip`
    - typingsSlinky.pdfImage.pdfImageStrings.`-stroke`
    - typingsSlinky.pdfImage.pdfImageStrings.`-strokewidth`
    - typingsSlinky.pdfImage.pdfImageStrings.`-stretch`
    - typingsSlinky.pdfImage.pdfImageStrings.`-style`
    - typingsSlinky.pdfImage.pdfImageStrings.`-swap`
    - typingsSlinky.pdfImage.pdfImageStrings.`-swirl`
    - typingsSlinky.pdfImage.pdfImageStrings.`-synchronize`
    - typingsSlinky.pdfImage.pdfImageStrings.`-taint`
    - typingsSlinky.pdfImage.pdfImageStrings.`-texture`
    - typingsSlinky.pdfImage.pdfImageStrings.`-threshold`
    - typingsSlinky.pdfImage.pdfImageStrings.`-thumbnail`
    - typingsSlinky.pdfImage.pdfImageStrings.`-tile`
    - typingsSlinky.pdfImage.pdfImageStrings.`-tile-offset`
    - typingsSlinky.pdfImage.pdfImageStrings.`-tint`
    - typingsSlinky.pdfImage.pdfImageStrings.`-transform`
    - typingsSlinky.pdfImage.pdfImageStrings.`-transparent`
    - typingsSlinky.pdfImage.pdfImageStrings.`-transparent-color`
    - typingsSlinky.pdfImage.pdfImageStrings.`-transpose`
    - typingsSlinky.pdfImage.pdfImageStrings.`-transverse`
    - typingsSlinky.pdfImage.pdfImageStrings.`-treedepth`
    - typingsSlinky.pdfImage.pdfImageStrings.`-trim`
    - typingsSlinky.pdfImage.pdfImageStrings.`-type`
    - typingsSlinky.pdfImage.pdfImageStrings.`-undercolor`
    - typingsSlinky.pdfImage.pdfImageStrings.`-unique-colors`
    - typingsSlinky.pdfImage.pdfImageStrings.`-units`
    - typingsSlinky.pdfImage.pdfImageStrings.`-unsharp`
    - typingsSlinky.pdfImage.pdfImageStrings.`-verbose`
    - typingsSlinky.pdfImage.pdfImageStrings.`-version`
    - typingsSlinky.pdfImage.pdfImageStrings.`-view`
    - typingsSlinky.pdfImage.pdfImageStrings.`-vignette`
    - typingsSlinky.pdfImage.pdfImageStrings.`-virtual-pixel`
    - typingsSlinky.pdfImage.pdfImageStrings.`-wave`
    - typingsSlinky.pdfImage.pdfImageStrings.`-wavelet-denoise`
    - typingsSlinky.pdfImage.pdfImageStrings.`-weight`
    - typingsSlinky.pdfImage.pdfImageStrings.`-white-point`
    - typingsSlinky.pdfImage.pdfImageStrings.`-white-threshold`
    - typingsSlinky.pdfImage.pdfImageStrings.`-write`
    - typingsSlinky.pdfImage.pdfImageStrings.`-write-mask`
  */
  trait ConvertOptionKey extends StObject
  object ConvertOptionKey {
    
    @scala.inline
    def `-adaptive-blur`: typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-blur` = "-adaptive-blur".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-blur`]
    
    @scala.inline
    def `-adaptive-resize`: typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-resize` = "-adaptive-resize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-resize`]
    
    @scala.inline
    def `-adaptive-sharpen`: typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-sharpen` = "-adaptive-sharpen".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-adaptive-sharpen`]
    
    @scala.inline
    def `-adjoin`: typingsSlinky.pdfImage.pdfImageStrings.`-adjoin` = "-adjoin".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-adjoin`]
    
    @scala.inline
    def `-affine`: typingsSlinky.pdfImage.pdfImageStrings.`-affine` = "-affine".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-affine`]
    
    @scala.inline
    def `-alpha`: typingsSlinky.pdfImage.pdfImageStrings.`-alpha` = "-alpha".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-alpha`]
    
    @scala.inline
    def `-annotate`: typingsSlinky.pdfImage.pdfImageStrings.`-annotate` = "-annotate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-annotate`]
    
    @scala.inline
    def `-antialias`: typingsSlinky.pdfImage.pdfImageStrings.`-antialias` = "-antialias".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-antialias`]
    
    @scala.inline
    def `-append`: typingsSlinky.pdfImage.pdfImageStrings.`-append` = "-append".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-append`]
    
    @scala.inline
    def `-authenticate`: typingsSlinky.pdfImage.pdfImageStrings.`-authenticate` = "-authenticate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-authenticate`]
    
    @scala.inline
    def `-auto-gamma`: typingsSlinky.pdfImage.pdfImageStrings.`-auto-gamma` = "-auto-gamma".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-auto-gamma`]
    
    @scala.inline
    def `-auto-level`: typingsSlinky.pdfImage.pdfImageStrings.`-auto-level` = "-auto-level".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-auto-level`]
    
    @scala.inline
    def `-auto-orient`: typingsSlinky.pdfImage.pdfImageStrings.`-auto-orient` = "-auto-orient".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-auto-orient`]
    
    @scala.inline
    def `-auto-threshold`: typingsSlinky.pdfImage.pdfImageStrings.`-auto-threshold` = "-auto-threshold".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-auto-threshold`]
    
    @scala.inline
    def `-background`: typingsSlinky.pdfImage.pdfImageStrings.`-background` = "-background".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-background`]
    
    @scala.inline
    def `-bench`: typingsSlinky.pdfImage.pdfImageStrings.`-bench` = "-bench".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-bench`]
    
    @scala.inline
    def `-bias`: typingsSlinky.pdfImage.pdfImageStrings.`-bias` = "-bias".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-bias`]
    
    @scala.inline
    def `-black-threshold`: typingsSlinky.pdfImage.pdfImageStrings.`-black-threshold` = "-black-threshold".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-black-threshold`]
    
    @scala.inline
    def `-blue-primary`: typingsSlinky.pdfImage.pdfImageStrings.`-blue-primary` = "-blue-primary".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-blue-primary`]
    
    @scala.inline
    def `-blue-shift`: typingsSlinky.pdfImage.pdfImageStrings.`-blue-shift` = "-blue-shift".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-blue-shift`]
    
    @scala.inline
    def `-blur`: typingsSlinky.pdfImage.pdfImageStrings.`-blur` = "-blur".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-blur`]
    
    @scala.inline
    def `-border`: typingsSlinky.pdfImage.pdfImageStrings.`-border` = "-border".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-border`]
    
    @scala.inline
    def `-bordercolor`: typingsSlinky.pdfImage.pdfImageStrings.`-bordercolor` = "-bordercolor".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-bordercolor`]
    
    @scala.inline
    def `-brightness-contrast`: typingsSlinky.pdfImage.pdfImageStrings.`-brightness-contrast` = "-brightness-contrast".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-brightness-contrast`]
    
    @scala.inline
    def `-canny`: typingsSlinky.pdfImage.pdfImageStrings.`-canny` = "-canny".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-canny`]
    
    @scala.inline
    def `-caption`: typingsSlinky.pdfImage.pdfImageStrings.`-caption` = "-caption".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-caption`]
    
    @scala.inline
    def `-cdl`: typingsSlinky.pdfImage.pdfImageStrings.`-cdl` = "-cdl".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-cdl`]
    
    @scala.inline
    def `-channel`: typingsSlinky.pdfImage.pdfImageStrings.`-channel` = "-channel".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-channel`]
    
    @scala.inline
    def `-charcoal`: typingsSlinky.pdfImage.pdfImageStrings.`-charcoal` = "-charcoal".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-charcoal`]
    
    @scala.inline
    def `-chop`: typingsSlinky.pdfImage.pdfImageStrings.`-chop` = "-chop".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-chop`]
    
    @scala.inline
    def `-clahe`: typingsSlinky.pdfImage.pdfImageStrings.`-clahe` = "-clahe".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clahe`]
    
    @scala.inline
    def `-clamp`: typingsSlinky.pdfImage.pdfImageStrings.`-clamp` = "-clamp".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clamp`]
    
    @scala.inline
    def `-clip`: typingsSlinky.pdfImage.pdfImageStrings.`-clip` = "-clip".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clip`]
    
    @scala.inline
    def `-clip-mask`: typingsSlinky.pdfImage.pdfImageStrings.`-clip-mask` = "-clip-mask".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clip-mask`]
    
    @scala.inline
    def `-clip-path`: typingsSlinky.pdfImage.pdfImageStrings.`-clip-path` = "-clip-path".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clip-path`]
    
    @scala.inline
    def `-clone`: typingsSlinky.pdfImage.pdfImageStrings.`-clone` = "-clone".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clone`]
    
    @scala.inline
    def `-clut`: typingsSlinky.pdfImage.pdfImageStrings.`-clut` = "-clut".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-clut`]
    
    @scala.inline
    def `-coalesce`: typingsSlinky.pdfImage.pdfImageStrings.`-coalesce` = "-coalesce".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-coalesce`]
    
    @scala.inline
    def `-color-matrix`: typingsSlinky.pdfImage.pdfImageStrings.`-color-matrix` = "-color-matrix".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-color-matrix`]
    
    @scala.inline
    def `-colorize`: typingsSlinky.pdfImage.pdfImageStrings.`-colorize` = "-colorize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-colorize`]
    
    @scala.inline
    def `-colors`: typingsSlinky.pdfImage.pdfImageStrings.`-colors` = "-colors".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-colors`]
    
    @scala.inline
    def `-colorspace`: typingsSlinky.pdfImage.pdfImageStrings.`-colorspace` = "-colorspace".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-colorspace`]
    
    @scala.inline
    def `-combine`: typingsSlinky.pdfImage.pdfImageStrings.`-combine` = "-combine".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-combine`]
    
    @scala.inline
    def `-comment`: typingsSlinky.pdfImage.pdfImageStrings.`-comment` = "-comment".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-comment`]
    
    @scala.inline
    def `-compare`: typingsSlinky.pdfImage.pdfImageStrings.`-compare` = "-compare".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-compare`]
    
    @scala.inline
    def `-complexoperator`: typingsSlinky.pdfImage.pdfImageStrings.`-complexoperator` = "-complexoperator".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-complexoperator`]
    
    @scala.inline
    def `-compose`: typingsSlinky.pdfImage.pdfImageStrings.`-compose` = "-compose".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-compose`]
    
    @scala.inline
    def `-composite`: typingsSlinky.pdfImage.pdfImageStrings.`-composite` = "-composite".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-composite`]
    
    @scala.inline
    def `-compress`: typingsSlinky.pdfImage.pdfImageStrings.`-compress` = "-compress".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-compress`]
    
    @scala.inline
    def `-connected-components`: typingsSlinky.pdfImage.pdfImageStrings.`-connected-components` = "-connected-components".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-connected-components`]
    
    @scala.inline
    def `-contrast`: typingsSlinky.pdfImage.pdfImageStrings.`-contrast` = "-contrast".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-contrast`]
    
    @scala.inline
    def `-contrast-stretch`: typingsSlinky.pdfImage.pdfImageStrings.`-contrast-stretch` = "-contrast-stretch".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-contrast-stretch`]
    
    @scala.inline
    def `-convolve`: typingsSlinky.pdfImage.pdfImageStrings.`-convolve` = "-convolve".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-convolve`]
    
    @scala.inline
    def `-copy`: typingsSlinky.pdfImage.pdfImageStrings.`-copy` = "-copy".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-copy`]
    
    @scala.inline
    def `-crop`: typingsSlinky.pdfImage.pdfImageStrings.`-crop` = "-crop".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-crop`]
    
    @scala.inline
    def `-cycle`: typingsSlinky.pdfImage.pdfImageStrings.`-cycle` = "-cycle".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-cycle`]
    
    @scala.inline
    def `-debug`: typingsSlinky.pdfImage.pdfImageStrings.`-debug` = "-debug".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-debug`]
    
    @scala.inline
    def `-decipher`: typingsSlinky.pdfImage.pdfImageStrings.`-decipher` = "-decipher".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-decipher`]
    
    @scala.inline
    def `-deconstruct`: typingsSlinky.pdfImage.pdfImageStrings.`-deconstruct` = "-deconstruct".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-deconstruct`]
    
    @scala.inline
    def `-define`: typingsSlinky.pdfImage.pdfImageStrings.`-define` = "-define".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-define`]
    
    @scala.inline
    def `-delay`: typingsSlinky.pdfImage.pdfImageStrings.`-delay` = "-delay".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-delay`]
    
    @scala.inline
    def `-delete`: typingsSlinky.pdfImage.pdfImageStrings.`-delete` = "-delete".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-delete`]
    
    @scala.inline
    def `-density`: typingsSlinky.pdfImage.pdfImageStrings.`-density` = "-density".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-density`]
    
    @scala.inline
    def `-depth`: typingsSlinky.pdfImage.pdfImageStrings.`-depth` = "-depth".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-depth`]
    
    @scala.inline
    def `-despeckle`: typingsSlinky.pdfImage.pdfImageStrings.`-despeckle` = "-despeckle".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-despeckle`]
    
    @scala.inline
    def `-direction`: typingsSlinky.pdfImage.pdfImageStrings.`-direction` = "-direction".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-direction`]
    
    @scala.inline
    def `-display`: typingsSlinky.pdfImage.pdfImageStrings.`-display` = "-display".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-display`]
    
    @scala.inline
    def `-dispose`: typingsSlinky.pdfImage.pdfImageStrings.`-dispose` = "-dispose".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-dispose`]
    
    @scala.inline
    def `-distort`: typingsSlinky.pdfImage.pdfImageStrings.`-distort` = "-distort".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-distort`]
    
    @scala.inline
    def `-distribute-cache`: typingsSlinky.pdfImage.pdfImageStrings.`-distribute-cache` = "-distribute-cache".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-distribute-cache`]
    
    @scala.inline
    def `-dither`: typingsSlinky.pdfImage.pdfImageStrings.`-dither` = "-dither".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-dither`]
    
    @scala.inline
    def `-draw`: typingsSlinky.pdfImage.pdfImageStrings.`-draw` = "-draw".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-draw`]
    
    @scala.inline
    def `-duplicate`: typingsSlinky.pdfImage.pdfImageStrings.`-duplicate` = "-duplicate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-duplicate`]
    
    @scala.inline
    def `-edge`: typingsSlinky.pdfImage.pdfImageStrings.`-edge` = "-edge".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-edge`]
    
    @scala.inline
    def `-emboss`: typingsSlinky.pdfImage.pdfImageStrings.`-emboss` = "-emboss".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-emboss`]
    
    @scala.inline
    def `-encipher`: typingsSlinky.pdfImage.pdfImageStrings.`-encipher` = "-encipher".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-encipher`]
    
    @scala.inline
    def `-encoding`: typingsSlinky.pdfImage.pdfImageStrings.`-encoding` = "-encoding".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-encoding`]
    
    @scala.inline
    def `-endian`: typingsSlinky.pdfImage.pdfImageStrings.`-endian` = "-endian".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-endian`]
    
    @scala.inline
    def `-enhance`: typingsSlinky.pdfImage.pdfImageStrings.`-enhance` = "-enhance".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-enhance`]
    
    @scala.inline
    def `-equalize`: typingsSlinky.pdfImage.pdfImageStrings.`-equalize` = "-equalize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-equalize`]
    
    @scala.inline
    def `-evaluate`: typingsSlinky.pdfImage.pdfImageStrings.`-evaluate` = "-evaluate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-evaluate`]
    
    @scala.inline
    def `-evaluate-sequence`: typingsSlinky.pdfImage.pdfImageStrings.`-evaluate-sequence` = "-evaluate-sequence".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-evaluate-sequence`]
    
    @scala.inline
    def `-extent`: typingsSlinky.pdfImage.pdfImageStrings.`-extent` = "-extent".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-extent`]
    
    @scala.inline
    def `-extract`: typingsSlinky.pdfImage.pdfImageStrings.`-extract` = "-extract".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-extract`]
    
    @scala.inline
    def `-family`: typingsSlinky.pdfImage.pdfImageStrings.`-family` = "-family".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-family`]
    
    @scala.inline
    def `-features`: typingsSlinky.pdfImage.pdfImageStrings.`-features` = "-features".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-features`]
    
    @scala.inline
    def `-fft`: typingsSlinky.pdfImage.pdfImageStrings.`-fft` = "-fft".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-fft`]
    
    @scala.inline
    def `-fill`: typingsSlinky.pdfImage.pdfImageStrings.`-fill` = "-fill".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-fill`]
    
    @scala.inline
    def `-filter`: typingsSlinky.pdfImage.pdfImageStrings.`-filter` = "-filter".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-filter`]
    
    @scala.inline
    def `-flatten`: typingsSlinky.pdfImage.pdfImageStrings.`-flatten` = "-flatten".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-flatten`]
    
    @scala.inline
    def `-flip`: typingsSlinky.pdfImage.pdfImageStrings.`-flip` = "-flip".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-flip`]
    
    @scala.inline
    def `-floodfill`: typingsSlinky.pdfImage.pdfImageStrings.`-floodfill` = "-floodfill".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-floodfill`]
    
    @scala.inline
    def `-flop`: typingsSlinky.pdfImage.pdfImageStrings.`-flop` = "-flop".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-flop`]
    
    @scala.inline
    def `-font`: typingsSlinky.pdfImage.pdfImageStrings.`-font` = "-font".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-font`]
    
    @scala.inline
    def `-format`: typingsSlinky.pdfImage.pdfImageStrings.`-format` = "-format".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-format`]
    
    @scala.inline
    def `-frame`: typingsSlinky.pdfImage.pdfImageStrings.`-frame` = "-frame".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-frame`]
    
    @scala.inline
    def `-function`: typingsSlinky.pdfImage.pdfImageStrings.`-function` = "-function".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-function`]
    
    @scala.inline
    def `-fuzz`: typingsSlinky.pdfImage.pdfImageStrings.`-fuzz` = "-fuzz".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-fuzz`]
    
    @scala.inline
    def `-fx`: typingsSlinky.pdfImage.pdfImageStrings.`-fx` = "-fx".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-fx`]
    
    @scala.inline
    def `-gamma`: typingsSlinky.pdfImage.pdfImageStrings.`-gamma` = "-gamma".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-gamma`]
    
    @scala.inline
    def `-gaussian-blur`: typingsSlinky.pdfImage.pdfImageStrings.`-gaussian-blur` = "-gaussian-blur".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-gaussian-blur`]
    
    @scala.inline
    def `-geometry`: typingsSlinky.pdfImage.pdfImageStrings.`-geometry` = "-geometry".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-geometry`]
    
    @scala.inline
    def `-gravity`: typingsSlinky.pdfImage.pdfImageStrings.`-gravity` = "-gravity".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-gravity`]
    
    @scala.inline
    def `-grayscale`: typingsSlinky.pdfImage.pdfImageStrings.`-grayscale` = "-grayscale".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-grayscale`]
    
    @scala.inline
    def `-green-primary`: typingsSlinky.pdfImage.pdfImageStrings.`-green-primary` = "-green-primary".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-green-primary`]
    
    @scala.inline
    def `-help`: typingsSlinky.pdfImage.pdfImageStrings.`-help` = "-help".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-help`]
    
    @scala.inline
    def `-hough-lines`: typingsSlinky.pdfImage.pdfImageStrings.`-hough-lines` = "-hough-lines".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-hough-lines`]
    
    @scala.inline
    def `-identify`: typingsSlinky.pdfImage.pdfImageStrings.`-identify` = "-identify".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-identify`]
    
    @scala.inline
    def `-ift`: typingsSlinky.pdfImage.pdfImageStrings.`-ift` = "-ift".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-ift`]
    
    @scala.inline
    def `-implode`: typingsSlinky.pdfImage.pdfImageStrings.`-implode` = "-implode".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-implode`]
    
    @scala.inline
    def `-insert`: typingsSlinky.pdfImage.pdfImageStrings.`-insert` = "-insert".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-insert`]
    
    @scala.inline
    def `-intensity`: typingsSlinky.pdfImage.pdfImageStrings.`-intensity` = "-intensity".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-intensity`]
    
    @scala.inline
    def `-intent`: typingsSlinky.pdfImage.pdfImageStrings.`-intent` = "-intent".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-intent`]
    
    @scala.inline
    def `-interlace`: typingsSlinky.pdfImage.pdfImageStrings.`-interlace` = "-interlace".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-interlace`]
    
    @scala.inline
    def `-interline-spacing`: typingsSlinky.pdfImage.pdfImageStrings.`-interline-spacing` = "-interline-spacing".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-interline-spacing`]
    
    @scala.inline
    def `-interpolate`: typingsSlinky.pdfImage.pdfImageStrings.`-interpolate` = "-interpolate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-interpolate`]
    
    @scala.inline
    def `-interword-spacing`: typingsSlinky.pdfImage.pdfImageStrings.`-interword-spacing` = "-interword-spacing".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-interword-spacing`]
    
    @scala.inline
    def `-kerning`: typingsSlinky.pdfImage.pdfImageStrings.`-kerning` = "-kerning".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-kerning`]
    
    @scala.inline
    def `-kmeans`: typingsSlinky.pdfImage.pdfImageStrings.`-kmeans` = "-kmeans".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-kmeans`]
    
    @scala.inline
    def `-kuwahara`: typingsSlinky.pdfImage.pdfImageStrings.`-kuwahara` = "-kuwahara".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-kuwahara`]
    
    @scala.inline
    def `-label`: typingsSlinky.pdfImage.pdfImageStrings.`-label` = "-label".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-label`]
    
    @scala.inline
    def `-lat`: typingsSlinky.pdfImage.pdfImageStrings.`-lat` = "-lat".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-lat`]
    
    @scala.inline
    def `-layers`: typingsSlinky.pdfImage.pdfImageStrings.`-layers` = "-layers".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-layers`]
    
    @scala.inline
    def `-level`: typingsSlinky.pdfImage.pdfImageStrings.`-level` = "-level".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-level`]
    
    @scala.inline
    def `-limit`: typingsSlinky.pdfImage.pdfImageStrings.`-limit` = "-limit".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-limit`]
    
    @scala.inline
    def `-linear-stretch`: typingsSlinky.pdfImage.pdfImageStrings.`-linear-stretch` = "-linear-stretch".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-linear-stretch`]
    
    @scala.inline
    def `-liquid-rescale`: typingsSlinky.pdfImage.pdfImageStrings.`-liquid-rescale` = "-liquid-rescale".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-liquid-rescale`]
    
    @scala.inline
    def `-list`: typingsSlinky.pdfImage.pdfImageStrings.`-list` = "-list".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-list`]
    
    @scala.inline
    def `-log`: typingsSlinky.pdfImage.pdfImageStrings.`-log` = "-log".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-log`]
    
    @scala.inline
    def `-loop`: typingsSlinky.pdfImage.pdfImageStrings.`-loop` = "-loop".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-loop`]
    
    @scala.inline
    def `-mattecolor`: typingsSlinky.pdfImage.pdfImageStrings.`-mattecolor` = "-mattecolor".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-mattecolor`]
    
    @scala.inline
    def `-mean-shift`: typingsSlinky.pdfImage.pdfImageStrings.`-mean-shift` = "-mean-shift".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-mean-shift`]
    
    @scala.inline
    def `-median`: typingsSlinky.pdfImage.pdfImageStrings.`-median` = "-median".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-median`]
    
    @scala.inline
    def `-metric`: typingsSlinky.pdfImage.pdfImageStrings.`-metric` = "-metric".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-metric`]
    
    @scala.inline
    def `-mode`: typingsSlinky.pdfImage.pdfImageStrings.`-mode` = "-mode".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-mode`]
    
    @scala.inline
    def `-modulate`: typingsSlinky.pdfImage.pdfImageStrings.`-modulate` = "-modulate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-modulate`]
    
    @scala.inline
    def `-moments`: typingsSlinky.pdfImage.pdfImageStrings.`-moments` = "-moments".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-moments`]
    
    @scala.inline
    def `-monitor`: typingsSlinky.pdfImage.pdfImageStrings.`-monitor` = "-monitor".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-monitor`]
    
    @scala.inline
    def `-monochrome`: typingsSlinky.pdfImage.pdfImageStrings.`-monochrome` = "-monochrome".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-monochrome`]
    
    @scala.inline
    def `-morph`: typingsSlinky.pdfImage.pdfImageStrings.`-morph` = "-morph".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-morph`]
    
    @scala.inline
    def `-morphology`: typingsSlinky.pdfImage.pdfImageStrings.`-morphology` = "-morphology".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-morphology`]
    
    @scala.inline
    def `-motion-blur`: typingsSlinky.pdfImage.pdfImageStrings.`-motion-blur` = "-motion-blur".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-motion-blur`]
    
    @scala.inline
    def `-negate`: typingsSlinky.pdfImage.pdfImageStrings.`-negate` = "-negate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-negate`]
    
    @scala.inline
    def `-noise`: typingsSlinky.pdfImage.pdfImageStrings.`-noise` = "-noise".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-noise`]
    
    @scala.inline
    def `-normalize`: typingsSlinky.pdfImage.pdfImageStrings.`-normalize` = "-normalize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-normalize`]
    
    @scala.inline
    def `-opaque`: typingsSlinky.pdfImage.pdfImageStrings.`-opaque` = "-opaque".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-opaque`]
    
    @scala.inline
    def `-ordered-dither`: typingsSlinky.pdfImage.pdfImageStrings.`-ordered-dither` = "-ordered-dither".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-ordered-dither`]
    
    @scala.inline
    def `-orient`: typingsSlinky.pdfImage.pdfImageStrings.`-orient` = "-orient".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-orient`]
    
    @scala.inline
    def `-page`: typingsSlinky.pdfImage.pdfImageStrings.`-page` = "-page".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-page`]
    
    @scala.inline
    def `-paint`: typingsSlinky.pdfImage.pdfImageStrings.`-paint` = "-paint".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-paint`]
    
    @scala.inline
    def `-perceptible`: typingsSlinky.pdfImage.pdfImageStrings.`-perceptible` = "-perceptible".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-perceptible`]
    
    @scala.inline
    def `-ping`: typingsSlinky.pdfImage.pdfImageStrings.`-ping` = "-ping".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-ping`]
    
    @scala.inline
    def `-pointsize`: typingsSlinky.pdfImage.pdfImageStrings.`-pointsize` = "-pointsize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-pointsize`]
    
    @scala.inline
    def `-polaroid`: typingsSlinky.pdfImage.pdfImageStrings.`-polaroid` = "-polaroid".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-polaroid`]
    
    @scala.inline
    def `-poly`: typingsSlinky.pdfImage.pdfImageStrings.`-poly` = "-poly".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-poly`]
    
    @scala.inline
    def `-posterize`: typingsSlinky.pdfImage.pdfImageStrings.`-posterize` = "-posterize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-posterize`]
    
    @scala.inline
    def `-precision`: typingsSlinky.pdfImage.pdfImageStrings.`-precision` = "-precision".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-precision`]
    
    @scala.inline
    def `-preview`: typingsSlinky.pdfImage.pdfImageStrings.`-preview` = "-preview".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-preview`]
    
    @scala.inline
    def `-print`: typingsSlinky.pdfImage.pdfImageStrings.`-print` = "-print".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-print`]
    
    @scala.inline
    def `-process`: typingsSlinky.pdfImage.pdfImageStrings.`-process` = "-process".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-process`]
    
    @scala.inline
    def `-profile`: typingsSlinky.pdfImage.pdfImageStrings.`-profile` = "-profile".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-profile`]
    
    @scala.inline
    def `-quality`: typingsSlinky.pdfImage.pdfImageStrings.`-quality` = "-quality".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-quality`]
    
    @scala.inline
    def `-quantize`: typingsSlinky.pdfImage.pdfImageStrings.`-quantize` = "-quantize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-quantize`]
    
    @scala.inline
    def `-quiet`: typingsSlinky.pdfImage.pdfImageStrings.`-quiet` = "-quiet".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-quiet`]
    
    @scala.inline
    def `-radial-blur`: typingsSlinky.pdfImage.pdfImageStrings.`-radial-blur` = "-radial-blur".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-radial-blur`]
    
    @scala.inline
    def `-raise`: typingsSlinky.pdfImage.pdfImageStrings.`-raise` = "-raise".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-raise`]
    
    @scala.inline
    def `-random-threshold`: typingsSlinky.pdfImage.pdfImageStrings.`-random-threshold` = "-random-threshold".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-random-threshold`]
    
    @scala.inline
    def `-range-threshold`: typingsSlinky.pdfImage.pdfImageStrings.`-range-threshold` = "-range-threshold".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-range-threshold`]
    
    @scala.inline
    def `-read-mask`: typingsSlinky.pdfImage.pdfImageStrings.`-read-mask` = "-read-mask".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-read-mask`]
    
    @scala.inline
    def `-red-primary`: typingsSlinky.pdfImage.pdfImageStrings.`-red-primary` = "-red-primary".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-red-primary`]
    
    @scala.inline
    def `-regard-warnings`: typingsSlinky.pdfImage.pdfImageStrings.`-regard-warnings` = "-regard-warnings".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-regard-warnings`]
    
    @scala.inline
    def `-region`: typingsSlinky.pdfImage.pdfImageStrings.`-region` = "-region".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-region`]
    
    @scala.inline
    def `-remap`: typingsSlinky.pdfImage.pdfImageStrings.`-remap` = "-remap".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-remap`]
    
    @scala.inline
    def `-render`: typingsSlinky.pdfImage.pdfImageStrings.`-render` = "-render".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-render`]
    
    @scala.inline
    def `-repage`: typingsSlinky.pdfImage.pdfImageStrings.`-repage` = "-repage".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-repage`]
    
    @scala.inline
    def `-resample`: typingsSlinky.pdfImage.pdfImageStrings.`-resample` = "-resample".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-resample`]
    
    @scala.inline
    def `-resize`: typingsSlinky.pdfImage.pdfImageStrings.`-resize` = "-resize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-resize`]
    
    @scala.inline
    def `-respect-parentheses`: typingsSlinky.pdfImage.pdfImageStrings.`-respect-parentheses` = "-respect-parentheses".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-respect-parentheses`]
    
    @scala.inline
    def `-roll`: typingsSlinky.pdfImage.pdfImageStrings.`-roll` = "-roll".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-roll`]
    
    @scala.inline
    def `-rotate`: typingsSlinky.pdfImage.pdfImageStrings.`-rotate` = "-rotate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-rotate`]
    
    @scala.inline
    def `-sample`: typingsSlinky.pdfImage.pdfImageStrings.`-sample` = "-sample".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-sample`]
    
    @scala.inline
    def `-sampling-factor`: typingsSlinky.pdfImage.pdfImageStrings.`-sampling-factor` = "-sampling-factor".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-sampling-factor`]
    
    @scala.inline
    def `-scale`: typingsSlinky.pdfImage.pdfImageStrings.`-scale` = "-scale".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-scale`]
    
    @scala.inline
    def `-scene`: typingsSlinky.pdfImage.pdfImageStrings.`-scene` = "-scene".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-scene`]
    
    @scala.inline
    def `-seed`: typingsSlinky.pdfImage.pdfImageStrings.`-seed` = "-seed".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-seed`]
    
    @scala.inline
    def `-segment`: typingsSlinky.pdfImage.pdfImageStrings.`-segment` = "-segment".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-segment`]
    
    @scala.inline
    def `-selective-blur`: typingsSlinky.pdfImage.pdfImageStrings.`-selective-blur` = "-selective-blur".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-selective-blur`]
    
    @scala.inline
    def `-separate`: typingsSlinky.pdfImage.pdfImageStrings.`-separate` = "-separate".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-separate`]
    
    @scala.inline
    def `-sepia-tone`: typingsSlinky.pdfImage.pdfImageStrings.`-sepia-tone` = "-sepia-tone".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-sepia-tone`]
    
    @scala.inline
    def `-set`: typingsSlinky.pdfImage.pdfImageStrings.`-set` = "-set".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-set`]
    
    @scala.inline
    def `-shade`: typingsSlinky.pdfImage.pdfImageStrings.`-shade` = "-shade".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-shade`]
    
    @scala.inline
    def `-shadow`: typingsSlinky.pdfImage.pdfImageStrings.`-shadow` = "-shadow".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-shadow`]
    
    @scala.inline
    def `-sharpen`: typingsSlinky.pdfImage.pdfImageStrings.`-sharpen` = "-sharpen".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-sharpen`]
    
    @scala.inline
    def `-shave`: typingsSlinky.pdfImage.pdfImageStrings.`-shave` = "-shave".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-shave`]
    
    @scala.inline
    def `-shear`: typingsSlinky.pdfImage.pdfImageStrings.`-shear` = "-shear".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-shear`]
    
    @scala.inline
    def `-sigmoidal-contrast`: typingsSlinky.pdfImage.pdfImageStrings.`-sigmoidal-contrast` = "-sigmoidal-contrast".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-sigmoidal-contrast`]
    
    @scala.inline
    def `-size`: typingsSlinky.pdfImage.pdfImageStrings.`-size` = "-size".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-size`]
    
    @scala.inline
    def `-sketch`: typingsSlinky.pdfImage.pdfImageStrings.`-sketch` = "-sketch".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-sketch`]
    
    @scala.inline
    def `-smush`: typingsSlinky.pdfImage.pdfImageStrings.`-smush` = "-smush".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-smush`]
    
    @scala.inline
    def `-solarize`: typingsSlinky.pdfImage.pdfImageStrings.`-solarize` = "-solarize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-solarize`]
    
    @scala.inline
    def `-splice`: typingsSlinky.pdfImage.pdfImageStrings.`-splice` = "-splice".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-splice`]
    
    @scala.inline
    def `-spread`: typingsSlinky.pdfImage.pdfImageStrings.`-spread` = "-spread".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-spread`]
    
    @scala.inline
    def `-statistic`: typingsSlinky.pdfImage.pdfImageStrings.`-statistic` = "-statistic".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-statistic`]
    
    @scala.inline
    def `-stretch`: typingsSlinky.pdfImage.pdfImageStrings.`-stretch` = "-stretch".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-stretch`]
    
    @scala.inline
    def `-strip`: typingsSlinky.pdfImage.pdfImageStrings.`-strip` = "-strip".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-strip`]
    
    @scala.inline
    def `-stroke`: typingsSlinky.pdfImage.pdfImageStrings.`-stroke` = "-stroke".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-stroke`]
    
    @scala.inline
    def `-strokewidth`: typingsSlinky.pdfImage.pdfImageStrings.`-strokewidth` = "-strokewidth".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-strokewidth`]
    
    @scala.inline
    def `-style`: typingsSlinky.pdfImage.pdfImageStrings.`-style` = "-style".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-style`]
    
    @scala.inline
    def `-swap`: typingsSlinky.pdfImage.pdfImageStrings.`-swap` = "-swap".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-swap`]
    
    @scala.inline
    def `-swirl`: typingsSlinky.pdfImage.pdfImageStrings.`-swirl` = "-swirl".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-swirl`]
    
    @scala.inline
    def `-synchronize`: typingsSlinky.pdfImage.pdfImageStrings.`-synchronize` = "-synchronize".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-synchronize`]
    
    @scala.inline
    def `-taint`: typingsSlinky.pdfImage.pdfImageStrings.`-taint` = "-taint".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-taint`]
    
    @scala.inline
    def `-texture`: typingsSlinky.pdfImage.pdfImageStrings.`-texture` = "-texture".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-texture`]
    
    @scala.inline
    def `-threshold`: typingsSlinky.pdfImage.pdfImageStrings.`-threshold` = "-threshold".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-threshold`]
    
    @scala.inline
    def `-thumbnail`: typingsSlinky.pdfImage.pdfImageStrings.`-thumbnail` = "-thumbnail".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-thumbnail`]
    
    @scala.inline
    def `-tile`: typingsSlinky.pdfImage.pdfImageStrings.`-tile` = "-tile".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-tile`]
    
    @scala.inline
    def `-tile-offset`: typingsSlinky.pdfImage.pdfImageStrings.`-tile-offset` = "-tile-offset".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-tile-offset`]
    
    @scala.inline
    def `-tint`: typingsSlinky.pdfImage.pdfImageStrings.`-tint` = "-tint".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-tint`]
    
    @scala.inline
    def `-transform`: typingsSlinky.pdfImage.pdfImageStrings.`-transform` = "-transform".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-transform`]
    
    @scala.inline
    def `-transparent`: typingsSlinky.pdfImage.pdfImageStrings.`-transparent` = "-transparent".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-transparent`]
    
    @scala.inline
    def `-transparent-color`: typingsSlinky.pdfImage.pdfImageStrings.`-transparent-color` = "-transparent-color".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-transparent-color`]
    
    @scala.inline
    def `-transpose`: typingsSlinky.pdfImage.pdfImageStrings.`-transpose` = "-transpose".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-transpose`]
    
    @scala.inline
    def `-transverse`: typingsSlinky.pdfImage.pdfImageStrings.`-transverse` = "-transverse".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-transverse`]
    
    @scala.inline
    def `-treedepth`: typingsSlinky.pdfImage.pdfImageStrings.`-treedepth` = "-treedepth".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-treedepth`]
    
    @scala.inline
    def `-trim`: typingsSlinky.pdfImage.pdfImageStrings.`-trim` = "-trim".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-trim`]
    
    @scala.inline
    def `-type`: typingsSlinky.pdfImage.pdfImageStrings.`-type` = "-type".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-type`]
    
    @scala.inline
    def `-undercolor`: typingsSlinky.pdfImage.pdfImageStrings.`-undercolor` = "-undercolor".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-undercolor`]
    
    @scala.inline
    def `-unique-colors`: typingsSlinky.pdfImage.pdfImageStrings.`-unique-colors` = "-unique-colors".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-unique-colors`]
    
    @scala.inline
    def `-units`: typingsSlinky.pdfImage.pdfImageStrings.`-units` = "-units".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-units`]
    
    @scala.inline
    def `-unsharp`: typingsSlinky.pdfImage.pdfImageStrings.`-unsharp` = "-unsharp".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-unsharp`]
    
    @scala.inline
    def `-verbose`: typingsSlinky.pdfImage.pdfImageStrings.`-verbose` = "-verbose".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-verbose`]
    
    @scala.inline
    def `-version`: typingsSlinky.pdfImage.pdfImageStrings.`-version` = "-version".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-version`]
    
    @scala.inline
    def `-view`: typingsSlinky.pdfImage.pdfImageStrings.`-view` = "-view".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-view`]
    
    @scala.inline
    def `-vignette`: typingsSlinky.pdfImage.pdfImageStrings.`-vignette` = "-vignette".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-vignette`]
    
    @scala.inline
    def `-virtual-pixel`: typingsSlinky.pdfImage.pdfImageStrings.`-virtual-pixel` = "-virtual-pixel".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-virtual-pixel`]
    
    @scala.inline
    def `-wave`: typingsSlinky.pdfImage.pdfImageStrings.`-wave` = "-wave".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-wave`]
    
    @scala.inline
    def `-wavelet-denoise`: typingsSlinky.pdfImage.pdfImageStrings.`-wavelet-denoise` = "-wavelet-denoise".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-wavelet-denoise`]
    
    @scala.inline
    def `-weight`: typingsSlinky.pdfImage.pdfImageStrings.`-weight` = "-weight".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-weight`]
    
    @scala.inline
    def `-white-point`: typingsSlinky.pdfImage.pdfImageStrings.`-white-point` = "-white-point".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-white-point`]
    
    @scala.inline
    def `-white-threshold`: typingsSlinky.pdfImage.pdfImageStrings.`-white-threshold` = "-white-threshold".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-white-threshold`]
    
    @scala.inline
    def `-write`: typingsSlinky.pdfImage.pdfImageStrings.`-write` = "-write".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-write`]
    
    @scala.inline
    def `-write-mask`: typingsSlinky.pdfImage.pdfImageStrings.`-write-mask` = "-write-mask".asInstanceOf[typingsSlinky.pdfImage.pdfImageStrings.`-write-mask`]
  }
  
  /* Inlined {[ key in pdf-image.pdf-image.ConvertOptionKey ]:? string} */
  @js.native
  trait ConvertOptions extends StObject {
    
    var `-adaptive-blur`: js.UndefOr[String] = js.native
    
    var `-adaptive-resize`: js.UndefOr[String] = js.native
    
    var `-adaptive-sharpen`: js.UndefOr[String] = js.native
    
    var `-adjoin`: js.UndefOr[String] = js.native
    
    var `-affine`: js.UndefOr[String] = js.native
    
    var `-alpha`: js.UndefOr[String] = js.native
    
    var `-annotate`: js.UndefOr[String] = js.native
    
    var `-antialias`: js.UndefOr[String] = js.native
    
    var `-append`: js.UndefOr[String] = js.native
    
    var `-authenticate`: js.UndefOr[String] = js.native
    
    var `-auto-gamma`: js.UndefOr[String] = js.native
    
    var `-auto-level`: js.UndefOr[String] = js.native
    
    var `-auto-orient`: js.UndefOr[String] = js.native
    
    var `-auto-threshold`: js.UndefOr[String] = js.native
    
    var `-background`: js.UndefOr[String] = js.native
    
    var `-bench`: js.UndefOr[String] = js.native
    
    var `-bias`: js.UndefOr[String] = js.native
    
    var `-black-threshold`: js.UndefOr[String] = js.native
    
    var `-blue-primary`: js.UndefOr[String] = js.native
    
    var `-blue-shift`: js.UndefOr[String] = js.native
    
    var `-blur`: js.UndefOr[String] = js.native
    
    var `-border`: js.UndefOr[String] = js.native
    
    var `-bordercolor`: js.UndefOr[String] = js.native
    
    var `-brightness-contrast`: js.UndefOr[String] = js.native
    
    var `-canny`: js.UndefOr[String] = js.native
    
    var `-caption`: js.UndefOr[String] = js.native
    
    var `-cdl`: js.UndefOr[String] = js.native
    
    var `-channel`: js.UndefOr[String] = js.native
    
    var `-charcoal`: js.UndefOr[String] = js.native
    
    var `-chop`: js.UndefOr[String] = js.native
    
    var `-clahe`: js.UndefOr[String] = js.native
    
    var `-clamp`: js.UndefOr[String] = js.native
    
    var `-clip`: js.UndefOr[String] = js.native
    
    var `-clip-mask`: js.UndefOr[String] = js.native
    
    var `-clip-path`: js.UndefOr[String] = js.native
    
    var `-clone`: js.UndefOr[String] = js.native
    
    var `-clut`: js.UndefOr[String] = js.native
    
    var `-coalesce`: js.UndefOr[String] = js.native
    
    var `-color-matrix`: js.UndefOr[String] = js.native
    
    var `-colorize`: js.UndefOr[String] = js.native
    
    var `-colors`: js.UndefOr[String] = js.native
    
    var `-colorspace`: js.UndefOr[String] = js.native
    
    var `-combine`: js.UndefOr[String] = js.native
    
    var `-comment`: js.UndefOr[String] = js.native
    
    var `-compare`: js.UndefOr[String] = js.native
    
    var `-complexoperator`: js.UndefOr[String] = js.native
    
    var `-compose`: js.UndefOr[String] = js.native
    
    var `-composite`: js.UndefOr[String] = js.native
    
    var `-compress`: js.UndefOr[String] = js.native
    
    var `-connected-components`: js.UndefOr[String] = js.native
    
    var `-contrast`: js.UndefOr[String] = js.native
    
    var `-contrast-stretch`: js.UndefOr[String] = js.native
    
    var `-convolve`: js.UndefOr[String] = js.native
    
    var `-copy`: js.UndefOr[String] = js.native
    
    var `-crop`: js.UndefOr[String] = js.native
    
    var `-cycle`: js.UndefOr[String] = js.native
    
    var `-debug`: js.UndefOr[String] = js.native
    
    var `-decipher`: js.UndefOr[String] = js.native
    
    var `-deconstruct`: js.UndefOr[String] = js.native
    
    var `-define`: js.UndefOr[String] = js.native
    
    var `-delay`: js.UndefOr[String] = js.native
    
    var `-delete`: js.UndefOr[String] = js.native
    
    var `-density`: js.UndefOr[String] = js.native
    
    var `-depth`: js.UndefOr[String] = js.native
    
    var `-despeckle`: js.UndefOr[String] = js.native
    
    var `-direction`: js.UndefOr[String] = js.native
    
    var `-display`: js.UndefOr[String] = js.native
    
    var `-dispose`: js.UndefOr[String] = js.native
    
    var `-distort`: js.UndefOr[String] = js.native
    
    var `-distribute-cache`: js.UndefOr[String] = js.native
    
    var `-dither`: js.UndefOr[String] = js.native
    
    var `-draw`: js.UndefOr[String] = js.native
    
    var `-duplicate`: js.UndefOr[String] = js.native
    
    var `-edge`: js.UndefOr[String] = js.native
    
    var `-emboss`: js.UndefOr[String] = js.native
    
    var `-encipher`: js.UndefOr[String] = js.native
    
    var `-encoding`: js.UndefOr[String] = js.native
    
    var `-endian`: js.UndefOr[String] = js.native
    
    var `-enhance`: js.UndefOr[String] = js.native
    
    var `-equalize`: js.UndefOr[String] = js.native
    
    var `-evaluate`: js.UndefOr[String] = js.native
    
    var `-evaluate-sequence`: js.UndefOr[String] = js.native
    
    var `-extent`: js.UndefOr[String] = js.native
    
    var `-extract`: js.UndefOr[String] = js.native
    
    var `-family`: js.UndefOr[String] = js.native
    
    var `-features`: js.UndefOr[String] = js.native
    
    var `-fft`: js.UndefOr[String] = js.native
    
    var `-fill`: js.UndefOr[String] = js.native
    
    var `-filter`: js.UndefOr[String] = js.native
    
    var `-flatten`: js.UndefOr[String] = js.native
    
    var `-flip`: js.UndefOr[String] = js.native
    
    var `-floodfill`: js.UndefOr[String] = js.native
    
    var `-flop`: js.UndefOr[String] = js.native
    
    var `-font`: js.UndefOr[String] = js.native
    
    var `-format`: js.UndefOr[String] = js.native
    
    var `-frame`: js.UndefOr[String] = js.native
    
    var `-function`: js.UndefOr[String] = js.native
    
    var `-fuzz`: js.UndefOr[String] = js.native
    
    var `-fx`: js.UndefOr[String] = js.native
    
    var `-gamma`: js.UndefOr[String] = js.native
    
    var `-gaussian-blur`: js.UndefOr[String] = js.native
    
    var `-geometry`: js.UndefOr[String] = js.native
    
    var `-gravity`: js.UndefOr[String] = js.native
    
    var `-grayscale`: js.UndefOr[String] = js.native
    
    var `-green-primary`: js.UndefOr[String] = js.native
    
    var `-help`: js.UndefOr[String] = js.native
    
    var `-hough-lines`: js.UndefOr[String] = js.native
    
    var `-identify`: js.UndefOr[String] = js.native
    
    var `-ift`: js.UndefOr[String] = js.native
    
    var `-implode`: js.UndefOr[String] = js.native
    
    var `-insert`: js.UndefOr[String] = js.native
    
    var `-intensity`: js.UndefOr[String] = js.native
    
    var `-intent`: js.UndefOr[String] = js.native
    
    var `-interlace`: js.UndefOr[String] = js.native
    
    var `-interline-spacing`: js.UndefOr[String] = js.native
    
    var `-interpolate`: js.UndefOr[String] = js.native
    
    var `-interword-spacing`: js.UndefOr[String] = js.native
    
    var `-kerning`: js.UndefOr[String] = js.native
    
    var `-kmeans`: js.UndefOr[String] = js.native
    
    var `-kuwahara`: js.UndefOr[String] = js.native
    
    var `-label`: js.UndefOr[String] = js.native
    
    var `-lat`: js.UndefOr[String] = js.native
    
    var `-layers`: js.UndefOr[String] = js.native
    
    var `-level`: js.UndefOr[String] = js.native
    
    var `-limit`: js.UndefOr[String] = js.native
    
    var `-linear-stretch`: js.UndefOr[String] = js.native
    
    var `-liquid-rescale`: js.UndefOr[String] = js.native
    
    var `-list`: js.UndefOr[String] = js.native
    
    var `-log`: js.UndefOr[String] = js.native
    
    var `-loop`: js.UndefOr[String] = js.native
    
    var `-mattecolor`: js.UndefOr[String] = js.native
    
    var `-mean-shift`: js.UndefOr[String] = js.native
    
    var `-median`: js.UndefOr[String] = js.native
    
    var `-metric`: js.UndefOr[String] = js.native
    
    var `-mode`: js.UndefOr[String] = js.native
    
    var `-modulate`: js.UndefOr[String] = js.native
    
    var `-moments`: js.UndefOr[String] = js.native
    
    var `-monitor`: js.UndefOr[String] = js.native
    
    var `-monochrome`: js.UndefOr[String] = js.native
    
    var `-morph`: js.UndefOr[String] = js.native
    
    var `-morphology`: js.UndefOr[String] = js.native
    
    var `-motion-blur`: js.UndefOr[String] = js.native
    
    var `-negate`: js.UndefOr[String] = js.native
    
    var `-noise`: js.UndefOr[String] = js.native
    
    var `-normalize`: js.UndefOr[String] = js.native
    
    var `-opaque`: js.UndefOr[String] = js.native
    
    var `-ordered-dither`: js.UndefOr[String] = js.native
    
    var `-orient`: js.UndefOr[String] = js.native
    
    var `-page`: js.UndefOr[String] = js.native
    
    var `-paint`: js.UndefOr[String] = js.native
    
    var `-perceptible`: js.UndefOr[String] = js.native
    
    var `-ping`: js.UndefOr[String] = js.native
    
    var `-pointsize`: js.UndefOr[String] = js.native
    
    var `-polaroid`: js.UndefOr[String] = js.native
    
    var `-poly`: js.UndefOr[String] = js.native
    
    var `-posterize`: js.UndefOr[String] = js.native
    
    var `-precision`: js.UndefOr[String] = js.native
    
    var `-preview`: js.UndefOr[String] = js.native
    
    var `-print`: js.UndefOr[String] = js.native
    
    var `-process`: js.UndefOr[String] = js.native
    
    var `-profile`: js.UndefOr[String] = js.native
    
    var `-quality`: js.UndefOr[String] = js.native
    
    var `-quantize`: js.UndefOr[String] = js.native
    
    var `-quiet`: js.UndefOr[String] = js.native
    
    var `-radial-blur`: js.UndefOr[String] = js.native
    
    var `-raise`: js.UndefOr[String] = js.native
    
    var `-random-threshold`: js.UndefOr[String] = js.native
    
    var `-range-threshold`: js.UndefOr[String] = js.native
    
    var `-read-mask`: js.UndefOr[String] = js.native
    
    var `-red-primary`: js.UndefOr[String] = js.native
    
    var `-regard-warnings`: js.UndefOr[String] = js.native
    
    var `-region`: js.UndefOr[String] = js.native
    
    var `-remap`: js.UndefOr[String] = js.native
    
    var `-render`: js.UndefOr[String] = js.native
    
    var `-repage`: js.UndefOr[String] = js.native
    
    var `-resample`: js.UndefOr[String] = js.native
    
    var `-resize`: js.UndefOr[String] = js.native
    
    var `-respect-parentheses`: js.UndefOr[String] = js.native
    
    var `-roll`: js.UndefOr[String] = js.native
    
    var `-rotate`: js.UndefOr[String] = js.native
    
    var `-sample`: js.UndefOr[String] = js.native
    
    var `-sampling-factor`: js.UndefOr[String] = js.native
    
    var `-scale`: js.UndefOr[String] = js.native
    
    var `-scene`: js.UndefOr[String] = js.native
    
    var `-seed`: js.UndefOr[String] = js.native
    
    var `-segment`: js.UndefOr[String] = js.native
    
    var `-selective-blur`: js.UndefOr[String] = js.native
    
    var `-separate`: js.UndefOr[String] = js.native
    
    var `-sepia-tone`: js.UndefOr[String] = js.native
    
    var `-set`: js.UndefOr[String] = js.native
    
    var `-shade`: js.UndefOr[String] = js.native
    
    var `-shadow`: js.UndefOr[String] = js.native
    
    var `-sharpen`: js.UndefOr[String] = js.native
    
    var `-shave`: js.UndefOr[String] = js.native
    
    var `-shear`: js.UndefOr[String] = js.native
    
    var `-sigmoidal-contrast`: js.UndefOr[String] = js.native
    
    var `-size`: js.UndefOr[String] = js.native
    
    var `-sketch`: js.UndefOr[String] = js.native
    
    var `-smush`: js.UndefOr[String] = js.native
    
    var `-solarize`: js.UndefOr[String] = js.native
    
    var `-splice`: js.UndefOr[String] = js.native
    
    var `-spread`: js.UndefOr[String] = js.native
    
    var `-statistic`: js.UndefOr[String] = js.native
    
    var `-stretch`: js.UndefOr[String] = js.native
    
    var `-strip`: js.UndefOr[String] = js.native
    
    var `-stroke`: js.UndefOr[String] = js.native
    
    var `-strokewidth`: js.UndefOr[String] = js.native
    
    var `-style`: js.UndefOr[String] = js.native
    
    var `-swap`: js.UndefOr[String] = js.native
    
    var `-swirl`: js.UndefOr[String] = js.native
    
    var `-synchronize`: js.UndefOr[String] = js.native
    
    var `-taint`: js.UndefOr[String] = js.native
    
    var `-texture`: js.UndefOr[String] = js.native
    
    var `-threshold`: js.UndefOr[String] = js.native
    
    var `-thumbnail`: js.UndefOr[String] = js.native
    
    var `-tile`: js.UndefOr[String] = js.native
    
    var `-tile-offset`: js.UndefOr[String] = js.native
    
    var `-tint`: js.UndefOr[String] = js.native
    
    var `-transform`: js.UndefOr[String] = js.native
    
    var `-transparent`: js.UndefOr[String] = js.native
    
    var `-transparent-color`: js.UndefOr[String] = js.native
    
    var `-transpose`: js.UndefOr[String] = js.native
    
    var `-transverse`: js.UndefOr[String] = js.native
    
    var `-treedepth`: js.UndefOr[String] = js.native
    
    var `-trim`: js.UndefOr[String] = js.native
    
    var `-type`: js.UndefOr[String] = js.native
    
    var `-undercolor`: js.UndefOr[String] = js.native
    
    var `-unique-colors`: js.UndefOr[String] = js.native
    
    var `-units`: js.UndefOr[String] = js.native
    
    var `-unsharp`: js.UndefOr[String] = js.native
    
    var `-verbose`: js.UndefOr[String] = js.native
    
    var `-version`: js.UndefOr[String] = js.native
    
    var `-view`: js.UndefOr[String] = js.native
    
    var `-vignette`: js.UndefOr[String] = js.native
    
    var `-virtual-pixel`: js.UndefOr[String] = js.native
    
    var `-wave`: js.UndefOr[String] = js.native
    
    var `-wavelet-denoise`: js.UndefOr[String] = js.native
    
    var `-weight`: js.UndefOr[String] = js.native
    
    var `-white-point`: js.UndefOr[String] = js.native
    
    var `-white-threshold`: js.UndefOr[String] = js.native
    
    var `-write`: js.UndefOr[String] = js.native
    
    var `-write-mask`: js.UndefOr[String] = js.native
  }
  object ConvertOptions {
    
    @scala.inline
    def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    @scala.inline
    implicit class ConvertOptionsMutableBuilder[Self <: ConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set-adaptive-blur`(value: String): Self = StObject.set(x, "-adaptive-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adaptive-blurUndefined`: Self = StObject.set(x, "-adaptive-blur", js.undefined)
      
      @scala.inline
      def `set-adaptive-resize`(value: String): Self = StObject.set(x, "-adaptive-resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adaptive-resizeUndefined`: Self = StObject.set(x, "-adaptive-resize", js.undefined)
      
      @scala.inline
      def `set-adaptive-sharpen`(value: String): Self = StObject.set(x, "-adaptive-sharpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adaptive-sharpenUndefined`: Self = StObject.set(x, "-adaptive-sharpen", js.undefined)
      
      @scala.inline
      def `set-adjoin`(value: String): Self = StObject.set(x, "-adjoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adjoinUndefined`: Self = StObject.set(x, "-adjoin", js.undefined)
      
      @scala.inline
      def `set-affine`(value: String): Self = StObject.set(x, "-affine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-affineUndefined`: Self = StObject.set(x, "-affine", js.undefined)
      
      @scala.inline
      def `set-alpha`(value: String): Self = StObject.set(x, "-alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-alphaUndefined`: Self = StObject.set(x, "-alpha", js.undefined)
      
      @scala.inline
      def `set-annotate`(value: String): Self = StObject.set(x, "-annotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-annotateUndefined`: Self = StObject.set(x, "-annotate", js.undefined)
      
      @scala.inline
      def `set-antialias`(value: String): Self = StObject.set(x, "-antialias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-antialiasUndefined`: Self = StObject.set(x, "-antialias", js.undefined)
      
      @scala.inline
      def `set-append`(value: String): Self = StObject.set(x, "-append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-appendUndefined`: Self = StObject.set(x, "-append", js.undefined)
      
      @scala.inline
      def `set-authenticate`(value: String): Self = StObject.set(x, "-authenticate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-authenticateUndefined`: Self = StObject.set(x, "-authenticate", js.undefined)
      
      @scala.inline
      def `set-auto-gamma`(value: String): Self = StObject.set(x, "-auto-gamma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-gammaUndefined`: Self = StObject.set(x, "-auto-gamma", js.undefined)
      
      @scala.inline
      def `set-auto-level`(value: String): Self = StObject.set(x, "-auto-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-levelUndefined`: Self = StObject.set(x, "-auto-level", js.undefined)
      
      @scala.inline
      def `set-auto-orient`(value: String): Self = StObject.set(x, "-auto-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-orientUndefined`: Self = StObject.set(x, "-auto-orient", js.undefined)
      
      @scala.inline
      def `set-auto-threshold`(value: String): Self = StObject.set(x, "-auto-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-thresholdUndefined`: Self = StObject.set(x, "-auto-threshold", js.undefined)
      
      @scala.inline
      def `set-background`(value: String): Self = StObject.set(x, "-background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-backgroundUndefined`: Self = StObject.set(x, "-background", js.undefined)
      
      @scala.inline
      def `set-bench`(value: String): Self = StObject.set(x, "-bench", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-benchUndefined`: Self = StObject.set(x, "-bench", js.undefined)
      
      @scala.inline
      def `set-bias`(value: String): Self = StObject.set(x, "-bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-biasUndefined`: Self = StObject.set(x, "-bias", js.undefined)
      
      @scala.inline
      def `set-black-threshold`(value: String): Self = StObject.set(x, "-black-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-black-thresholdUndefined`: Self = StObject.set(x, "-black-threshold", js.undefined)
      
      @scala.inline
      def `set-blue-primary`(value: String): Self = StObject.set(x, "-blue-primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-blue-primaryUndefined`: Self = StObject.set(x, "-blue-primary", js.undefined)
      
      @scala.inline
      def `set-blue-shift`(value: String): Self = StObject.set(x, "-blue-shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-blue-shiftUndefined`: Self = StObject.set(x, "-blue-shift", js.undefined)
      
      @scala.inline
      def `set-blur`(value: String): Self = StObject.set(x, "-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-blurUndefined`: Self = StObject.set(x, "-blur", js.undefined)
      
      @scala.inline
      def `set-border`(value: String): Self = StObject.set(x, "-border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-borderUndefined`: Self = StObject.set(x, "-border", js.undefined)
      
      @scala.inline
      def `set-bordercolor`(value: String): Self = StObject.set(x, "-bordercolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-bordercolorUndefined`: Self = StObject.set(x, "-bordercolor", js.undefined)
      
      @scala.inline
      def `set-brightness-contrast`(value: String): Self = StObject.set(x, "-brightness-contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-brightness-contrastUndefined`: Self = StObject.set(x, "-brightness-contrast", js.undefined)
      
      @scala.inline
      def `set-canny`(value: String): Self = StObject.set(x, "-canny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cannyUndefined`: Self = StObject.set(x, "-canny", js.undefined)
      
      @scala.inline
      def `set-caption`(value: String): Self = StObject.set(x, "-caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-captionUndefined`: Self = StObject.set(x, "-caption", js.undefined)
      
      @scala.inline
      def `set-cdl`(value: String): Self = StObject.set(x, "-cdl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cdlUndefined`: Self = StObject.set(x, "-cdl", js.undefined)
      
      @scala.inline
      def `set-channel`(value: String): Self = StObject.set(x, "-channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-channelUndefined`: Self = StObject.set(x, "-channel", js.undefined)
      
      @scala.inline
      def `set-charcoal`(value: String): Self = StObject.set(x, "-charcoal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-charcoalUndefined`: Self = StObject.set(x, "-charcoal", js.undefined)
      
      @scala.inline
      def `set-chop`(value: String): Self = StObject.set(x, "-chop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-chopUndefined`: Self = StObject.set(x, "-chop", js.undefined)
      
      @scala.inline
      def `set-clahe`(value: String): Self = StObject.set(x, "-clahe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-claheUndefined`: Self = StObject.set(x, "-clahe", js.undefined)
      
      @scala.inline
      def `set-clamp`(value: String): Self = StObject.set(x, "-clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clampUndefined`: Self = StObject.set(x, "-clamp", js.undefined)
      
      @scala.inline
      def `set-clip`(value: String): Self = StObject.set(x, "-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clip-mask`(value: String): Self = StObject.set(x, "-clip-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clip-maskUndefined`: Self = StObject.set(x, "-clip-mask", js.undefined)
      
      @scala.inline
      def `set-clip-path`(value: String): Self = StObject.set(x, "-clip-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clip-pathUndefined`: Self = StObject.set(x, "-clip-path", js.undefined)
      
      @scala.inline
      def `set-clipUndefined`: Self = StObject.set(x, "-clip", js.undefined)
      
      @scala.inline
      def `set-clone`(value: String): Self = StObject.set(x, "-clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cloneUndefined`: Self = StObject.set(x, "-clone", js.undefined)
      
      @scala.inline
      def `set-clut`(value: String): Self = StObject.set(x, "-clut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clutUndefined`: Self = StObject.set(x, "-clut", js.undefined)
      
      @scala.inline
      def `set-coalesce`(value: String): Self = StObject.set(x, "-coalesce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-coalesceUndefined`: Self = StObject.set(x, "-coalesce", js.undefined)
      
      @scala.inline
      def `set-color-matrix`(value: String): Self = StObject.set(x, "-color-matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-color-matrixUndefined`: Self = StObject.set(x, "-color-matrix", js.undefined)
      
      @scala.inline
      def `set-colorize`(value: String): Self = StObject.set(x, "-colorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-colorizeUndefined`: Self = StObject.set(x, "-colorize", js.undefined)
      
      @scala.inline
      def `set-colors`(value: String): Self = StObject.set(x, "-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-colorsUndefined`: Self = StObject.set(x, "-colors", js.undefined)
      
      @scala.inline
      def `set-colorspace`(value: String): Self = StObject.set(x, "-colorspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-colorspaceUndefined`: Self = StObject.set(x, "-colorspace", js.undefined)
      
      @scala.inline
      def `set-combine`(value: String): Self = StObject.set(x, "-combine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-combineUndefined`: Self = StObject.set(x, "-combine", js.undefined)
      
      @scala.inline
      def `set-comment`(value: String): Self = StObject.set(x, "-comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-commentUndefined`: Self = StObject.set(x, "-comment", js.undefined)
      
      @scala.inline
      def `set-compare`(value: String): Self = StObject.set(x, "-compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-compareUndefined`: Self = StObject.set(x, "-compare", js.undefined)
      
      @scala.inline
      def `set-complexoperator`(value: String): Self = StObject.set(x, "-complexoperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-complexoperatorUndefined`: Self = StObject.set(x, "-complexoperator", js.undefined)
      
      @scala.inline
      def `set-compose`(value: String): Self = StObject.set(x, "-compose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-composeUndefined`: Self = StObject.set(x, "-compose", js.undefined)
      
      @scala.inline
      def `set-composite`(value: String): Self = StObject.set(x, "-composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-compositeUndefined`: Self = StObject.set(x, "-composite", js.undefined)
      
      @scala.inline
      def `set-compress`(value: String): Self = StObject.set(x, "-compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-compressUndefined`: Self = StObject.set(x, "-compress", js.undefined)
      
      @scala.inline
      def `set-connected-components`(value: String): Self = StObject.set(x, "-connected-components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-connected-componentsUndefined`: Self = StObject.set(x, "-connected-components", js.undefined)
      
      @scala.inline
      def `set-contrast`(value: String): Self = StObject.set(x, "-contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-contrast-stretch`(value: String): Self = StObject.set(x, "-contrast-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-contrast-stretchUndefined`: Self = StObject.set(x, "-contrast-stretch", js.undefined)
      
      @scala.inline
      def `set-contrastUndefined`: Self = StObject.set(x, "-contrast", js.undefined)
      
      @scala.inline
      def `set-convolve`(value: String): Self = StObject.set(x, "-convolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-convolveUndefined`: Self = StObject.set(x, "-convolve", js.undefined)
      
      @scala.inline
      def `set-copy`(value: String): Self = StObject.set(x, "-copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-copyUndefined`: Self = StObject.set(x, "-copy", js.undefined)
      
      @scala.inline
      def `set-crop`(value: String): Self = StObject.set(x, "-crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cropUndefined`: Self = StObject.set(x, "-crop", js.undefined)
      
      @scala.inline
      def `set-cycle`(value: String): Self = StObject.set(x, "-cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cycleUndefined`: Self = StObject.set(x, "-cycle", js.undefined)
      
      @scala.inline
      def `set-debug`(value: String): Self = StObject.set(x, "-debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-debugUndefined`: Self = StObject.set(x, "-debug", js.undefined)
      
      @scala.inline
      def `set-decipher`(value: String): Self = StObject.set(x, "-decipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-decipherUndefined`: Self = StObject.set(x, "-decipher", js.undefined)
      
      @scala.inline
      def `set-deconstruct`(value: String): Self = StObject.set(x, "-deconstruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-deconstructUndefined`: Self = StObject.set(x, "-deconstruct", js.undefined)
      
      @scala.inline
      def `set-define`(value: String): Self = StObject.set(x, "-define", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-defineUndefined`: Self = StObject.set(x, "-define", js.undefined)
      
      @scala.inline
      def `set-delay`(value: String): Self = StObject.set(x, "-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-delayUndefined`: Self = StObject.set(x, "-delay", js.undefined)
      
      @scala.inline
      def `set-delete`(value: String): Self = StObject.set(x, "-delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-deleteUndefined`: Self = StObject.set(x, "-delete", js.undefined)
      
      @scala.inline
      def `set-density`(value: String): Self = StObject.set(x, "-density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-densityUndefined`: Self = StObject.set(x, "-density", js.undefined)
      
      @scala.inline
      def `set-depth`(value: String): Self = StObject.set(x, "-depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-depthUndefined`: Self = StObject.set(x, "-depth", js.undefined)
      
      @scala.inline
      def `set-despeckle`(value: String): Self = StObject.set(x, "-despeckle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-despeckleUndefined`: Self = StObject.set(x, "-despeckle", js.undefined)
      
      @scala.inline
      def `set-direction`(value: String): Self = StObject.set(x, "-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-directionUndefined`: Self = StObject.set(x, "-direction", js.undefined)
      
      @scala.inline
      def `set-display`(value: String): Self = StObject.set(x, "-display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-displayUndefined`: Self = StObject.set(x, "-display", js.undefined)
      
      @scala.inline
      def `set-dispose`(value: String): Self = StObject.set(x, "-dispose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-disposeUndefined`: Self = StObject.set(x, "-dispose", js.undefined)
      
      @scala.inline
      def `set-distort`(value: String): Self = StObject.set(x, "-distort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-distortUndefined`: Self = StObject.set(x, "-distort", js.undefined)
      
      @scala.inline
      def `set-distribute-cache`(value: String): Self = StObject.set(x, "-distribute-cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-distribute-cacheUndefined`: Self = StObject.set(x, "-distribute-cache", js.undefined)
      
      @scala.inline
      def `set-dither`(value: String): Self = StObject.set(x, "-dither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ditherUndefined`: Self = StObject.set(x, "-dither", js.undefined)
      
      @scala.inline
      def `set-draw`(value: String): Self = StObject.set(x, "-draw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-drawUndefined`: Self = StObject.set(x, "-draw", js.undefined)
      
      @scala.inline
      def `set-duplicate`(value: String): Self = StObject.set(x, "-duplicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-duplicateUndefined`: Self = StObject.set(x, "-duplicate", js.undefined)
      
      @scala.inline
      def `set-edge`(value: String): Self = StObject.set(x, "-edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-edgeUndefined`: Self = StObject.set(x, "-edge", js.undefined)
      
      @scala.inline
      def `set-emboss`(value: String): Self = StObject.set(x, "-emboss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-embossUndefined`: Self = StObject.set(x, "-emboss", js.undefined)
      
      @scala.inline
      def `set-encipher`(value: String): Self = StObject.set(x, "-encipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-encipherUndefined`: Self = StObject.set(x, "-encipher", js.undefined)
      
      @scala.inline
      def `set-encoding`(value: String): Self = StObject.set(x, "-encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-encodingUndefined`: Self = StObject.set(x, "-encoding", js.undefined)
      
      @scala.inline
      def `set-endian`(value: String): Self = StObject.set(x, "-endian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-endianUndefined`: Self = StObject.set(x, "-endian", js.undefined)
      
      @scala.inline
      def `set-enhance`(value: String): Self = StObject.set(x, "-enhance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-enhanceUndefined`: Self = StObject.set(x, "-enhance", js.undefined)
      
      @scala.inline
      def `set-equalize`(value: String): Self = StObject.set(x, "-equalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-equalizeUndefined`: Self = StObject.set(x, "-equalize", js.undefined)
      
      @scala.inline
      def `set-evaluate`(value: String): Self = StObject.set(x, "-evaluate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-evaluate-sequence`(value: String): Self = StObject.set(x, "-evaluate-sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-evaluate-sequenceUndefined`: Self = StObject.set(x, "-evaluate-sequence", js.undefined)
      
      @scala.inline
      def `set-evaluateUndefined`: Self = StObject.set(x, "-evaluate", js.undefined)
      
      @scala.inline
      def `set-extent`(value: String): Self = StObject.set(x, "-extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-extentUndefined`: Self = StObject.set(x, "-extent", js.undefined)
      
      @scala.inline
      def `set-extract`(value: String): Self = StObject.set(x, "-extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-extractUndefined`: Self = StObject.set(x, "-extract", js.undefined)
      
      @scala.inline
      def `set-family`(value: String): Self = StObject.set(x, "-family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-familyUndefined`: Self = StObject.set(x, "-family", js.undefined)
      
      @scala.inline
      def `set-features`(value: String): Self = StObject.set(x, "-features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-featuresUndefined`: Self = StObject.set(x, "-features", js.undefined)
      
      @scala.inline
      def `set-fft`(value: String): Self = StObject.set(x, "-fft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fftUndefined`: Self = StObject.set(x, "-fft", js.undefined)
      
      @scala.inline
      def `set-fill`(value: String): Self = StObject.set(x, "-fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fillUndefined`: Self = StObject.set(x, "-fill", js.undefined)
      
      @scala.inline
      def `set-filter`(value: String): Self = StObject.set(x, "-filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-filterUndefined`: Self = StObject.set(x, "-filter", js.undefined)
      
      @scala.inline
      def `set-flatten`(value: String): Self = StObject.set(x, "-flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-flattenUndefined`: Self = StObject.set(x, "-flatten", js.undefined)
      
      @scala.inline
      def `set-flip`(value: String): Self = StObject.set(x, "-flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-flipUndefined`: Self = StObject.set(x, "-flip", js.undefined)
      
      @scala.inline
      def `set-floodfill`(value: String): Self = StObject.set(x, "-floodfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-floodfillUndefined`: Self = StObject.set(x, "-floodfill", js.undefined)
      
      @scala.inline
      def `set-flop`(value: String): Self = StObject.set(x, "-flop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-flopUndefined`: Self = StObject.set(x, "-flop", js.undefined)
      
      @scala.inline
      def `set-font`(value: String): Self = StObject.set(x, "-font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fontUndefined`: Self = StObject.set(x, "-font", js.undefined)
      
      @scala.inline
      def `set-format`(value: String): Self = StObject.set(x, "-format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-formatUndefined`: Self = StObject.set(x, "-format", js.undefined)
      
      @scala.inline
      def `set-frame`(value: String): Self = StObject.set(x, "-frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-frameUndefined`: Self = StObject.set(x, "-frame", js.undefined)
      
      @scala.inline
      def `set-function`(value: String): Self = StObject.set(x, "-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-functionUndefined`: Self = StObject.set(x, "-function", js.undefined)
      
      @scala.inline
      def `set-fuzz`(value: String): Self = StObject.set(x, "-fuzz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fuzzUndefined`: Self = StObject.set(x, "-fuzz", js.undefined)
      
      @scala.inline
      def `set-fx`(value: String): Self = StObject.set(x, "-fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fxUndefined`: Self = StObject.set(x, "-fx", js.undefined)
      
      @scala.inline
      def `set-gamma`(value: String): Self = StObject.set(x, "-gamma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-gammaUndefined`: Self = StObject.set(x, "-gamma", js.undefined)
      
      @scala.inline
      def `set-gaussian-blur`(value: String): Self = StObject.set(x, "-gaussian-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-gaussian-blurUndefined`: Self = StObject.set(x, "-gaussian-blur", js.undefined)
      
      @scala.inline
      def `set-geometry`(value: String): Self = StObject.set(x, "-geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-geometryUndefined`: Self = StObject.set(x, "-geometry", js.undefined)
      
      @scala.inline
      def `set-gravity`(value: String): Self = StObject.set(x, "-gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-gravityUndefined`: Self = StObject.set(x, "-gravity", js.undefined)
      
      @scala.inline
      def `set-grayscale`(value: String): Self = StObject.set(x, "-grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-grayscaleUndefined`: Self = StObject.set(x, "-grayscale", js.undefined)
      
      @scala.inline
      def `set-green-primary`(value: String): Self = StObject.set(x, "-green-primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-green-primaryUndefined`: Self = StObject.set(x, "-green-primary", js.undefined)
      
      @scala.inline
      def `set-help`(value: String): Self = StObject.set(x, "-help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-helpUndefined`: Self = StObject.set(x, "-help", js.undefined)
      
      @scala.inline
      def `set-hough-lines`(value: String): Self = StObject.set(x, "-hough-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-hough-linesUndefined`: Self = StObject.set(x, "-hough-lines", js.undefined)
      
      @scala.inline
      def `set-identify`(value: String): Self = StObject.set(x, "-identify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-identifyUndefined`: Self = StObject.set(x, "-identify", js.undefined)
      
      @scala.inline
      def `set-ift`(value: String): Self = StObject.set(x, "-ift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-iftUndefined`: Self = StObject.set(x, "-ift", js.undefined)
      
      @scala.inline
      def `set-implode`(value: String): Self = StObject.set(x, "-implode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-implodeUndefined`: Self = StObject.set(x, "-implode", js.undefined)
      
      @scala.inline
      def `set-insert`(value: String): Self = StObject.set(x, "-insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-insertUndefined`: Self = StObject.set(x, "-insert", js.undefined)
      
      @scala.inline
      def `set-intensity`(value: String): Self = StObject.set(x, "-intensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-intensityUndefined`: Self = StObject.set(x, "-intensity", js.undefined)
      
      @scala.inline
      def `set-intent`(value: String): Self = StObject.set(x, "-intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-intentUndefined`: Self = StObject.set(x, "-intent", js.undefined)
      
      @scala.inline
      def `set-interlace`(value: String): Self = StObject.set(x, "-interlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interlaceUndefined`: Self = StObject.set(x, "-interlace", js.undefined)
      
      @scala.inline
      def `set-interline-spacing`(value: String): Self = StObject.set(x, "-interline-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interline-spacingUndefined`: Self = StObject.set(x, "-interline-spacing", js.undefined)
      
      @scala.inline
      def `set-interpolate`(value: String): Self = StObject.set(x, "-interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interpolateUndefined`: Self = StObject.set(x, "-interpolate", js.undefined)
      
      @scala.inline
      def `set-interword-spacing`(value: String): Self = StObject.set(x, "-interword-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interword-spacingUndefined`: Self = StObject.set(x, "-interword-spacing", js.undefined)
      
      @scala.inline
      def `set-kerning`(value: String): Self = StObject.set(x, "-kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-kerningUndefined`: Self = StObject.set(x, "-kerning", js.undefined)
      
      @scala.inline
      def `set-kmeans`(value: String): Self = StObject.set(x, "-kmeans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-kmeansUndefined`: Self = StObject.set(x, "-kmeans", js.undefined)
      
      @scala.inline
      def `set-kuwahara`(value: String): Self = StObject.set(x, "-kuwahara", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-kuwaharaUndefined`: Self = StObject.set(x, "-kuwahara", js.undefined)
      
      @scala.inline
      def `set-label`(value: String): Self = StObject.set(x, "-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-labelUndefined`: Self = StObject.set(x, "-label", js.undefined)
      
      @scala.inline
      def `set-lat`(value: String): Self = StObject.set(x, "-lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-latUndefined`: Self = StObject.set(x, "-lat", js.undefined)
      
      @scala.inline
      def `set-layers`(value: String): Self = StObject.set(x, "-layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-layersUndefined`: Self = StObject.set(x, "-layers", js.undefined)
      
      @scala.inline
      def `set-level`(value: String): Self = StObject.set(x, "-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-levelUndefined`: Self = StObject.set(x, "-level", js.undefined)
      
      @scala.inline
      def `set-limit`(value: String): Self = StObject.set(x, "-limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-limitUndefined`: Self = StObject.set(x, "-limit", js.undefined)
      
      @scala.inline
      def `set-linear-stretch`(value: String): Self = StObject.set(x, "-linear-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-linear-stretchUndefined`: Self = StObject.set(x, "-linear-stretch", js.undefined)
      
      @scala.inline
      def `set-liquid-rescale`(value: String): Self = StObject.set(x, "-liquid-rescale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-liquid-rescaleUndefined`: Self = StObject.set(x, "-liquid-rescale", js.undefined)
      
      @scala.inline
      def `set-list`(value: String): Self = StObject.set(x, "-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-listUndefined`: Self = StObject.set(x, "-list", js.undefined)
      
      @scala.inline
      def `set-log`(value: String): Self = StObject.set(x, "-log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-logUndefined`: Self = StObject.set(x, "-log", js.undefined)
      
      @scala.inline
      def `set-loop`(value: String): Self = StObject.set(x, "-loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-loopUndefined`: Self = StObject.set(x, "-loop", js.undefined)
      
      @scala.inline
      def `set-mattecolor`(value: String): Self = StObject.set(x, "-mattecolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-mattecolorUndefined`: Self = StObject.set(x, "-mattecolor", js.undefined)
      
      @scala.inline
      def `set-mean-shift`(value: String): Self = StObject.set(x, "-mean-shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-mean-shiftUndefined`: Self = StObject.set(x, "-mean-shift", js.undefined)
      
      @scala.inline
      def `set-median`(value: String): Self = StObject.set(x, "-median", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-medianUndefined`: Self = StObject.set(x, "-median", js.undefined)
      
      @scala.inline
      def `set-metric`(value: String): Self = StObject.set(x, "-metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-metricUndefined`: Self = StObject.set(x, "-metric", js.undefined)
      
      @scala.inline
      def `set-mode`(value: String): Self = StObject.set(x, "-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-modeUndefined`: Self = StObject.set(x, "-mode", js.undefined)
      
      @scala.inline
      def `set-modulate`(value: String): Self = StObject.set(x, "-modulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-modulateUndefined`: Self = StObject.set(x, "-modulate", js.undefined)
      
      @scala.inline
      def `set-moments`(value: String): Self = StObject.set(x, "-moments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-momentsUndefined`: Self = StObject.set(x, "-moments", js.undefined)
      
      @scala.inline
      def `set-monitor`(value: String): Self = StObject.set(x, "-monitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-monitorUndefined`: Self = StObject.set(x, "-monitor", js.undefined)
      
      @scala.inline
      def `set-monochrome`(value: String): Self = StObject.set(x, "-monochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-monochromeUndefined`: Self = StObject.set(x, "-monochrome", js.undefined)
      
      @scala.inline
      def `set-morph`(value: String): Self = StObject.set(x, "-morph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-morphUndefined`: Self = StObject.set(x, "-morph", js.undefined)
      
      @scala.inline
      def `set-morphology`(value: String): Self = StObject.set(x, "-morphology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-morphologyUndefined`: Self = StObject.set(x, "-morphology", js.undefined)
      
      @scala.inline
      def `set-motion-blur`(value: String): Self = StObject.set(x, "-motion-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-motion-blurUndefined`: Self = StObject.set(x, "-motion-blur", js.undefined)
      
      @scala.inline
      def `set-negate`(value: String): Self = StObject.set(x, "-negate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-negateUndefined`: Self = StObject.set(x, "-negate", js.undefined)
      
      @scala.inline
      def `set-noise`(value: String): Self = StObject.set(x, "-noise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-noiseUndefined`: Self = StObject.set(x, "-noise", js.undefined)
      
      @scala.inline
      def `set-normalize`(value: String): Self = StObject.set(x, "-normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-normalizeUndefined`: Self = StObject.set(x, "-normalize", js.undefined)
      
      @scala.inline
      def `set-opaque`(value: String): Self = StObject.set(x, "-opaque", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-opaqueUndefined`: Self = StObject.set(x, "-opaque", js.undefined)
      
      @scala.inline
      def `set-ordered-dither`(value: String): Self = StObject.set(x, "-ordered-dither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ordered-ditherUndefined`: Self = StObject.set(x, "-ordered-dither", js.undefined)
      
      @scala.inline
      def `set-orient`(value: String): Self = StObject.set(x, "-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-orientUndefined`: Self = StObject.set(x, "-orient", js.undefined)
      
      @scala.inline
      def `set-page`(value: String): Self = StObject.set(x, "-page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-pageUndefined`: Self = StObject.set(x, "-page", js.undefined)
      
      @scala.inline
      def `set-paint`(value: String): Self = StObject.set(x, "-paint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-paintUndefined`: Self = StObject.set(x, "-paint", js.undefined)
      
      @scala.inline
      def `set-perceptible`(value: String): Self = StObject.set(x, "-perceptible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-perceptibleUndefined`: Self = StObject.set(x, "-perceptible", js.undefined)
      
      @scala.inline
      def `set-ping`(value: String): Self = StObject.set(x, "-ping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-pingUndefined`: Self = StObject.set(x, "-ping", js.undefined)
      
      @scala.inline
      def `set-pointsize`(value: String): Self = StObject.set(x, "-pointsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-pointsizeUndefined`: Self = StObject.set(x, "-pointsize", js.undefined)
      
      @scala.inline
      def `set-polaroid`(value: String): Self = StObject.set(x, "-polaroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-polaroidUndefined`: Self = StObject.set(x, "-polaroid", js.undefined)
      
      @scala.inline
      def `set-poly`(value: String): Self = StObject.set(x, "-poly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-polyUndefined`: Self = StObject.set(x, "-poly", js.undefined)
      
      @scala.inline
      def `set-posterize`(value: String): Self = StObject.set(x, "-posterize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-posterizeUndefined`: Self = StObject.set(x, "-posterize", js.undefined)
      
      @scala.inline
      def `set-precision`(value: String): Self = StObject.set(x, "-precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-precisionUndefined`: Self = StObject.set(x, "-precision", js.undefined)
      
      @scala.inline
      def `set-preview`(value: String): Self = StObject.set(x, "-preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-previewUndefined`: Self = StObject.set(x, "-preview", js.undefined)
      
      @scala.inline
      def `set-print`(value: String): Self = StObject.set(x, "-print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-printUndefined`: Self = StObject.set(x, "-print", js.undefined)
      
      @scala.inline
      def `set-process`(value: String): Self = StObject.set(x, "-process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-processUndefined`: Self = StObject.set(x, "-process", js.undefined)
      
      @scala.inline
      def `set-profile`(value: String): Self = StObject.set(x, "-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-profileUndefined`: Self = StObject.set(x, "-profile", js.undefined)
      
      @scala.inline
      def `set-quality`(value: String): Self = StObject.set(x, "-quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-qualityUndefined`: Self = StObject.set(x, "-quality", js.undefined)
      
      @scala.inline
      def `set-quantize`(value: String): Self = StObject.set(x, "-quantize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-quantizeUndefined`: Self = StObject.set(x, "-quantize", js.undefined)
      
      @scala.inline
      def `set-quiet`(value: String): Self = StObject.set(x, "-quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-quietUndefined`: Self = StObject.set(x, "-quiet", js.undefined)
      
      @scala.inline
      def `set-radial-blur`(value: String): Self = StObject.set(x, "-radial-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-radial-blurUndefined`: Self = StObject.set(x, "-radial-blur", js.undefined)
      
      @scala.inline
      def `set-raise`(value: String): Self = StObject.set(x, "-raise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-raiseUndefined`: Self = StObject.set(x, "-raise", js.undefined)
      
      @scala.inline
      def `set-random-threshold`(value: String): Self = StObject.set(x, "-random-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-random-thresholdUndefined`: Self = StObject.set(x, "-random-threshold", js.undefined)
      
      @scala.inline
      def `set-range-threshold`(value: String): Self = StObject.set(x, "-range-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-range-thresholdUndefined`: Self = StObject.set(x, "-range-threshold", js.undefined)
      
      @scala.inline
      def `set-read-mask`(value: String): Self = StObject.set(x, "-read-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-read-maskUndefined`: Self = StObject.set(x, "-read-mask", js.undefined)
      
      @scala.inline
      def `set-red-primary`(value: String): Self = StObject.set(x, "-red-primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-red-primaryUndefined`: Self = StObject.set(x, "-red-primary", js.undefined)
      
      @scala.inline
      def `set-regard-warnings`(value: String): Self = StObject.set(x, "-regard-warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-regard-warningsUndefined`: Self = StObject.set(x, "-regard-warnings", js.undefined)
      
      @scala.inline
      def `set-region`(value: String): Self = StObject.set(x, "-region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-regionUndefined`: Self = StObject.set(x, "-region", js.undefined)
      
      @scala.inline
      def `set-remap`(value: String): Self = StObject.set(x, "-remap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-remapUndefined`: Self = StObject.set(x, "-remap", js.undefined)
      
      @scala.inline
      def `set-render`(value: String): Self = StObject.set(x, "-render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-renderUndefined`: Self = StObject.set(x, "-render", js.undefined)
      
      @scala.inline
      def `set-repage`(value: String): Self = StObject.set(x, "-repage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-repageUndefined`: Self = StObject.set(x, "-repage", js.undefined)
      
      @scala.inline
      def `set-resample`(value: String): Self = StObject.set(x, "-resample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-resampleUndefined`: Self = StObject.set(x, "-resample", js.undefined)
      
      @scala.inline
      def `set-resize`(value: String): Self = StObject.set(x, "-resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-resizeUndefined`: Self = StObject.set(x, "-resize", js.undefined)
      
      @scala.inline
      def `set-respect-parentheses`(value: String): Self = StObject.set(x, "-respect-parentheses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-respect-parenthesesUndefined`: Self = StObject.set(x, "-respect-parentheses", js.undefined)
      
      @scala.inline
      def `set-roll`(value: String): Self = StObject.set(x, "-roll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-rollUndefined`: Self = StObject.set(x, "-roll", js.undefined)
      
      @scala.inline
      def `set-rotate`(value: String): Self = StObject.set(x, "-rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-rotateUndefined`: Self = StObject.set(x, "-rotate", js.undefined)
      
      @scala.inline
      def `set-sample`(value: String): Self = StObject.set(x, "-sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sampleUndefined`: Self = StObject.set(x, "-sample", js.undefined)
      
      @scala.inline
      def `set-sampling-factor`(value: String): Self = StObject.set(x, "-sampling-factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sampling-factorUndefined`: Self = StObject.set(x, "-sampling-factor", js.undefined)
      
      @scala.inline
      def `set-scale`(value: String): Self = StObject.set(x, "-scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-scaleUndefined`: Self = StObject.set(x, "-scale", js.undefined)
      
      @scala.inline
      def `set-scene`(value: String): Self = StObject.set(x, "-scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sceneUndefined`: Self = StObject.set(x, "-scene", js.undefined)
      
      @scala.inline
      def `set-seed`(value: String): Self = StObject.set(x, "-seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-seedUndefined`: Self = StObject.set(x, "-seed", js.undefined)
      
      @scala.inline
      def `set-segment`(value: String): Self = StObject.set(x, "-segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-segmentUndefined`: Self = StObject.set(x, "-segment", js.undefined)
      
      @scala.inline
      def `set-selective-blur`(value: String): Self = StObject.set(x, "-selective-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-selective-blurUndefined`: Self = StObject.set(x, "-selective-blur", js.undefined)
      
      @scala.inline
      def `set-separate`(value: String): Self = StObject.set(x, "-separate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-separateUndefined`: Self = StObject.set(x, "-separate", js.undefined)
      
      @scala.inline
      def `set-sepia-tone`(value: String): Self = StObject.set(x, "-sepia-tone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sepia-toneUndefined`: Self = StObject.set(x, "-sepia-tone", js.undefined)
      
      @scala.inline
      def `set-set`(value: String): Self = StObject.set(x, "-set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-setUndefined`: Self = StObject.set(x, "-set", js.undefined)
      
      @scala.inline
      def `set-shade`(value: String): Self = StObject.set(x, "-shade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shadeUndefined`: Self = StObject.set(x, "-shade", js.undefined)
      
      @scala.inline
      def `set-shadow`(value: String): Self = StObject.set(x, "-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shadowUndefined`: Self = StObject.set(x, "-shadow", js.undefined)
      
      @scala.inline
      def `set-sharpen`(value: String): Self = StObject.set(x, "-sharpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sharpenUndefined`: Self = StObject.set(x, "-sharpen", js.undefined)
      
      @scala.inline
      def `set-shave`(value: String): Self = StObject.set(x, "-shave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shaveUndefined`: Self = StObject.set(x, "-shave", js.undefined)
      
      @scala.inline
      def `set-shear`(value: String): Self = StObject.set(x, "-shear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shearUndefined`: Self = StObject.set(x, "-shear", js.undefined)
      
      @scala.inline
      def `set-sigmoidal-contrast`(value: String): Self = StObject.set(x, "-sigmoidal-contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sigmoidal-contrastUndefined`: Self = StObject.set(x, "-sigmoidal-contrast", js.undefined)
      
      @scala.inline
      def `set-size`(value: String): Self = StObject.set(x, "-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sizeUndefined`: Self = StObject.set(x, "-size", js.undefined)
      
      @scala.inline
      def `set-sketch`(value: String): Self = StObject.set(x, "-sketch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sketchUndefined`: Self = StObject.set(x, "-sketch", js.undefined)
      
      @scala.inline
      def `set-smush`(value: String): Self = StObject.set(x, "-smush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-smushUndefined`: Self = StObject.set(x, "-smush", js.undefined)
      
      @scala.inline
      def `set-solarize`(value: String): Self = StObject.set(x, "-solarize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-solarizeUndefined`: Self = StObject.set(x, "-solarize", js.undefined)
      
      @scala.inline
      def `set-splice`(value: String): Self = StObject.set(x, "-splice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-spliceUndefined`: Self = StObject.set(x, "-splice", js.undefined)
      
      @scala.inline
      def `set-spread`(value: String): Self = StObject.set(x, "-spread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-spreadUndefined`: Self = StObject.set(x, "-spread", js.undefined)
      
      @scala.inline
      def `set-statistic`(value: String): Self = StObject.set(x, "-statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-statisticUndefined`: Self = StObject.set(x, "-statistic", js.undefined)
      
      @scala.inline
      def `set-stretch`(value: String): Self = StObject.set(x, "-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-stretchUndefined`: Self = StObject.set(x, "-stretch", js.undefined)
      
      @scala.inline
      def `set-strip`(value: String): Self = StObject.set(x, "-strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-stripUndefined`: Self = StObject.set(x, "-strip", js.undefined)
      
      @scala.inline
      def `set-stroke`(value: String): Self = StObject.set(x, "-stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-strokeUndefined`: Self = StObject.set(x, "-stroke", js.undefined)
      
      @scala.inline
      def `set-strokewidth`(value: String): Self = StObject.set(x, "-strokewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-strokewidthUndefined`: Self = StObject.set(x, "-strokewidth", js.undefined)
      
      @scala.inline
      def `set-style`(value: String): Self = StObject.set(x, "-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-styleUndefined`: Self = StObject.set(x, "-style", js.undefined)
      
      @scala.inline
      def `set-swap`(value: String): Self = StObject.set(x, "-swap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-swapUndefined`: Self = StObject.set(x, "-swap", js.undefined)
      
      @scala.inline
      def `set-swirl`(value: String): Self = StObject.set(x, "-swirl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-swirlUndefined`: Self = StObject.set(x, "-swirl", js.undefined)
      
      @scala.inline
      def `set-synchronize`(value: String): Self = StObject.set(x, "-synchronize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-synchronizeUndefined`: Self = StObject.set(x, "-synchronize", js.undefined)
      
      @scala.inline
      def `set-taint`(value: String): Self = StObject.set(x, "-taint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-taintUndefined`: Self = StObject.set(x, "-taint", js.undefined)
      
      @scala.inline
      def `set-texture`(value: String): Self = StObject.set(x, "-texture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-textureUndefined`: Self = StObject.set(x, "-texture", js.undefined)
      
      @scala.inline
      def `set-threshold`(value: String): Self = StObject.set(x, "-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-thresholdUndefined`: Self = StObject.set(x, "-threshold", js.undefined)
      
      @scala.inline
      def `set-thumbnail`(value: String): Self = StObject.set(x, "-thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-thumbnailUndefined`: Self = StObject.set(x, "-thumbnail", js.undefined)
      
      @scala.inline
      def `set-tile`(value: String): Self = StObject.set(x, "-tile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-tile-offset`(value: String): Self = StObject.set(x, "-tile-offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-tile-offsetUndefined`: Self = StObject.set(x, "-tile-offset", js.undefined)
      
      @scala.inline
      def `set-tileUndefined`: Self = StObject.set(x, "-tile", js.undefined)
      
      @scala.inline
      def `set-tint`(value: String): Self = StObject.set(x, "-tint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-tintUndefined`: Self = StObject.set(x, "-tint", js.undefined)
      
      @scala.inline
      def `set-transform`(value: String): Self = StObject.set(x, "-transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transformUndefined`: Self = StObject.set(x, "-transform", js.undefined)
      
      @scala.inline
      def `set-transparent`(value: String): Self = StObject.set(x, "-transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transparent-color`(value: String): Self = StObject.set(x, "-transparent-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transparent-colorUndefined`: Self = StObject.set(x, "-transparent-color", js.undefined)
      
      @scala.inline
      def `set-transparentUndefined`: Self = StObject.set(x, "-transparent", js.undefined)
      
      @scala.inline
      def `set-transpose`(value: String): Self = StObject.set(x, "-transpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transposeUndefined`: Self = StObject.set(x, "-transpose", js.undefined)
      
      @scala.inline
      def `set-transverse`(value: String): Self = StObject.set(x, "-transverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transverseUndefined`: Self = StObject.set(x, "-transverse", js.undefined)
      
      @scala.inline
      def `set-treedepth`(value: String): Self = StObject.set(x, "-treedepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-treedepthUndefined`: Self = StObject.set(x, "-treedepth", js.undefined)
      
      @scala.inline
      def `set-trim`(value: String): Self = StObject.set(x, "-trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-trimUndefined`: Self = StObject.set(x, "-trim", js.undefined)
      
      @scala.inline
      def `set-type`(value: String): Self = StObject.set(x, "-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-typeUndefined`: Self = StObject.set(x, "-type", js.undefined)
      
      @scala.inline
      def `set-undercolor`(value: String): Self = StObject.set(x, "-undercolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-undercolorUndefined`: Self = StObject.set(x, "-undercolor", js.undefined)
      
      @scala.inline
      def `set-unique-colors`(value: String): Self = StObject.set(x, "-unique-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-unique-colorsUndefined`: Self = StObject.set(x, "-unique-colors", js.undefined)
      
      @scala.inline
      def `set-units`(value: String): Self = StObject.set(x, "-units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-unitsUndefined`: Self = StObject.set(x, "-units", js.undefined)
      
      @scala.inline
      def `set-unsharp`(value: String): Self = StObject.set(x, "-unsharp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-unsharpUndefined`: Self = StObject.set(x, "-unsharp", js.undefined)
      
      @scala.inline
      def `set-verbose`(value: String): Self = StObject.set(x, "-verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-verboseUndefined`: Self = StObject.set(x, "-verbose", js.undefined)
      
      @scala.inline
      def `set-version`(value: String): Self = StObject.set(x, "-version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-versionUndefined`: Self = StObject.set(x, "-version", js.undefined)
      
      @scala.inline
      def `set-view`(value: String): Self = StObject.set(x, "-view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-viewUndefined`: Self = StObject.set(x, "-view", js.undefined)
      
      @scala.inline
      def `set-vignette`(value: String): Self = StObject.set(x, "-vignette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-vignetteUndefined`: Self = StObject.set(x, "-vignette", js.undefined)
      
      @scala.inline
      def `set-virtual-pixel`(value: String): Self = StObject.set(x, "-virtual-pixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-virtual-pixelUndefined`: Self = StObject.set(x, "-virtual-pixel", js.undefined)
      
      @scala.inline
      def `set-wave`(value: String): Self = StObject.set(x, "-wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-waveUndefined`: Self = StObject.set(x, "-wave", js.undefined)
      
      @scala.inline
      def `set-wavelet-denoise`(value: String): Self = StObject.set(x, "-wavelet-denoise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-wavelet-denoiseUndefined`: Self = StObject.set(x, "-wavelet-denoise", js.undefined)
      
      @scala.inline
      def `set-weight`(value: String): Self = StObject.set(x, "-weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-weightUndefined`: Self = StObject.set(x, "-weight", js.undefined)
      
      @scala.inline
      def `set-white-point`(value: String): Self = StObject.set(x, "-white-point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-white-pointUndefined`: Self = StObject.set(x, "-white-point", js.undefined)
      
      @scala.inline
      def `set-white-threshold`(value: String): Self = StObject.set(x, "-white-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-white-thresholdUndefined`: Self = StObject.set(x, "-white-threshold", js.undefined)
      
      @scala.inline
      def `set-write`(value: String): Self = StObject.set(x, "-write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-write-mask`(value: String): Self = StObject.set(x, "-write-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-write-maskUndefined`: Self = StObject.set(x, "-write-mask", js.undefined)
      
      @scala.inline
      def `set-writeUndefined`: Self = StObject.set(x, "-write", js.undefined)
    }
  }
  
  type OptionalSpread[CombinedImage /* <: Boolean */] = js.Array[
    (Options with `0`[CombinedImage]) | (Options with CombinedImageCombinedImage[CombinedImage]) | js.Any
  ]
  
  @js.native
  trait Options extends StObject {
    
    var convertExtension: js.UndefOr[String] = js.native
    
    var convertOptions: js.UndefOr[ConvertOptions] = js.native
    
    var graphicsMagick: js.UndefOr[Boolean] = js.native
    
    var outputDirectory: js.UndefOr[String] = js.native
    
    var pdfFileBaseName: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvertExtension(value: String): Self = StObject.set(x, "convertExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertExtensionUndefined: Self = StObject.set(x, "convertExtension", js.undefined)
      
      @scala.inline
      def setConvertOptions(value: ConvertOptions): Self = StObject.set(x, "convertOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertOptionsUndefined: Self = StObject.set(x, "convertOptions", js.undefined)
      
      @scala.inline
      def setGraphicsMagick(value: Boolean): Self = StObject.set(x, "graphicsMagick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphicsMagickUndefined: Self = StObject.set(x, "graphicsMagick", js.undefined)
      
      @scala.inline
      def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      @scala.inline
      def setPdfFileBaseName(value: String): Self = StObject.set(x, "pdfFileBaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdfFileBaseNameUndefined: Self = StObject.set(x, "pdfFileBaseName", js.undefined)
    }
  }
  
  @js.native
  trait PDFInfo extends /* key */ StringDictionary[String] {
    
    var CreationDate: String = js.native
    
    var Creator: String = js.native
    
    var Encrypted: String = js.native
    
    var `File size`: String = js.native
    
    var Form: String = js.native
    
    var JavaScript: String = js.native
    
    var Optimized: String = js.native
    
    var `PDF version`: String = js.native
    
    var `Page rot`: String = js.native
    
    var `Page size`: String = js.native
    
    var Pages: String = js.native
    
    var Producer: String = js.native
    
    var Suspects: String = js.native
    
    var Tagged: String = js.native
    
    var UserProperties: String = js.native
  }
  object PDFInfo {
    
    @scala.inline
    def apply(
      CreationDate: String,
      Creator: String,
      Encrypted: String,
      `File size`: String,
      Form: String,
      JavaScript: String,
      Optimized: String,
      `PDF version`: String,
      `Page rot`: String,
      `Page size`: String,
      Pages: String,
      Producer: String,
      Suspects: String,
      Tagged: String,
      UserProperties: String
    ): PDFInfo = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encrypted = Encrypted.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], JavaScript = JavaScript.asInstanceOf[js.Any], Optimized = Optimized.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Producer = Producer.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], Tagged = Tagged.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
      __obj.updateDynamic("File size")((`File size`).asInstanceOf[js.Any])
      __obj.updateDynamic("PDF version")((`PDF version`).asInstanceOf[js.Any])
      __obj.updateDynamic("Page rot")((`Page rot`).asInstanceOf[js.Any])
      __obj.updateDynamic("Page size")((`Page size`).asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFInfo]
    }
    
    @scala.inline
    implicit class PDFInfoMutableBuilder[Self <: PDFInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: String): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFile size`(value: String): Self = StObject.set(x, "File size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaScript(value: String): Self = StObject.set(x, "JavaScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimized(value: String): Self = StObject.set(x, "Optimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPDF version`(value: String): Self = StObject.set(x, "PDF version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage rot`(value: String): Self = StObject.set(x, "Page rot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage size`(value: String): Self = StObject.set(x, "Page size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: String): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProducer(value: String): Self = StObject.set(x, "Producer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspects(value: String): Self = StObject.set(x, "Suspects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagged(value: String): Self = StObject.set(x, "Tagged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProperties(value: String): Self = StObject.set(x, "UserProperties", value.asInstanceOf[js.Any])
    }
  }
}
