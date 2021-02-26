package typingsSlinky.imageminMozjpeg

import typingsSlinky.imagemin.mod.Plugin
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.`hvs-psnr`
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.`ms-ssim`
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.fast
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.float
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.int
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.psnr
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.ssim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemin-mozjpeg", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("imagemin-mozjpeg", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Use arithmetic coding.
      * @default false
      */
    var arithmetic: js.UndefOr[Boolean] = js.native
    
    /**
      * Set DC scan optimization mode.
      *  0 One scan for all components
      *  1 One scan per component
      *  2 Optimize between one scan for all components and one scan for 1st component plus one scan for remaining components
      * @default 1
      */
    var dcScanOpt: js.UndefOr[Double] = js.native
    
    /**
      * Set DCT method:
      * int Use integer DCT
      * fast Use fast integer DCT (less accurate)
      * float Use floating-point DCT
      * @default 'int'
      */
    var dct: js.UndefOr[int | fast | float] = js.native
    
    /**
      * Disable progressive scan optimization.
      * @default false
      */
    var fastCrush: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the maximum memory to use in kilobytes.
      */
    var maxMemory: js.UndefOr[Double] = js.native
    
    /**
      * Black-on-white deringing via overshoot.
      * @default true
      */
    var overshoot: js.UndefOr[Boolean] = js.native
    
    /**
      * false creates baseline JPEG file.
      * @default true
      */
    var progressive: js.UndefOr[Boolean] = js.native
    
    /** Compression quality, in range 0 (worst) to 100 (perfect). */
    var quality: js.UndefOr[Double] = js.native
    
    /**
      * Use 8-bit quantization table entries for baseline JPEG compatibility.
      * @default false
      */
    var quantBaseline: js.UndefOr[Boolean] = js.native
    
    /**
      * Use predefined quantization table.
      * 0 JPEG Annex K
      * 1 Flat
      * 2 Custom, tuned for MS-SSIM
      * 3 ImageMagick table by N. Robidoux
      * 4 Custom, tuned for PSNR-HVS
      * 5 Table from paper by Klein, Silverstein and Carney
      */
    var quantTable: js.UndefOr[Double] = js.native
    
    /**
      * Revert to standard defaults instead of mozjpeg defaults.
      * @default false
      */
    var revert: js.UndefOr[Boolean] = js.native
    
    /**
      * Set component sampling factors. Each item should be in the format HxV, for example 2x1.
      */
    var sample: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Set the strength of smooth dithered input. (1...100)
      */
    var smooth: js.UndefOr[Double] = js.native
    
    /**
      * Input file is Targa format (usually not needed).
      * @default false
      */
    var targa: js.UndefOr[Boolean] = js.native
    
    /**
      * Trellis optimization.
      * @default true
      *
      */
    var trellis: js.UndefOr[Boolean] = js.native
    
    /**
      * Trellis optimization of DC coefficients.
      * @default true
      */
    var trellisDC: js.UndefOr[Boolean] = js.native
    
    /**
      * Set Trellis optimization method. Available methods: psnr, hvs-psnr, ssim, ms-ssim
      * @default 'hvs-psnr'
      */
    var tune: js.UndefOr[psnr | `hvs-psnr` | ssim | `ms-ssim`] = js.native
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
      def setArithmetic(value: Boolean): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArithmeticUndefined: Self = StObject.set(x, "arithmetic", js.undefined)
      
      @scala.inline
      def setDcScanOpt(value: Double): Self = StObject.set(x, "dcScanOpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDcScanOptUndefined: Self = StObject.set(x, "dcScanOpt", js.undefined)
      
      @scala.inline
      def setDct(value: int | fast | float): Self = StObject.set(x, "dct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDctUndefined: Self = StObject.set(x, "dct", js.undefined)
      
      @scala.inline
      def setFastCrush(value: Boolean): Self = StObject.set(x, "fastCrush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastCrushUndefined: Self = StObject.set(x, "fastCrush", js.undefined)
      
      @scala.inline
      def setMaxMemory(value: Double): Self = StObject.set(x, "maxMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMemoryUndefined: Self = StObject.set(x, "maxMemory", js.undefined)
      
      @scala.inline
      def setOvershoot(value: Boolean): Self = StObject.set(x, "overshoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOvershootUndefined: Self = StObject.set(x, "overshoot", js.undefined)
      
      @scala.inline
      def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setQuantBaseline(value: Boolean): Self = StObject.set(x, "quantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantBaselineUndefined: Self = StObject.set(x, "quantBaseline", js.undefined)
      
      @scala.inline
      def setQuantTable(value: Double): Self = StObject.set(x, "quantTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantTableUndefined: Self = StObject.set(x, "quantTable", js.undefined)
      
      @scala.inline
      def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
      
      @scala.inline
      def setSample(value: js.Array[String]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
      
      @scala.inline
      def setSampleVarargs(value: String*): Self = StObject.set(x, "sample", js.Array(value :_*))
      
      @scala.inline
      def setSmooth(value: Double): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setTarga(value: Boolean): Self = StObject.set(x, "targa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargaUndefined: Self = StObject.set(x, "targa", js.undefined)
      
      @scala.inline
      def setTrellis(value: Boolean): Self = StObject.set(x, "trellis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrellisDC(value: Boolean): Self = StObject.set(x, "trellisDC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrellisDCUndefined: Self = StObject.set(x, "trellisDC", js.undefined)
      
      @scala.inline
      def setTrellisUndefined: Self = StObject.set(x, "trellis", js.undefined)
      
      @scala.inline
      def setTune(value: psnr | `hvs-psnr` | ssim | `ms-ssim`): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTuneUndefined: Self = StObject.set(x, "tune", js.undefined)
    }
  }
}
