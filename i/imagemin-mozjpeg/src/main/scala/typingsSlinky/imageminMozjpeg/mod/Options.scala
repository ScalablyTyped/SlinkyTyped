package typingsSlinky.imageminMozjpeg.mod

import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.`hvs-psnr`
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.`ms-ssim`
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.fast
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.float
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.int
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.psnr
import typingsSlinky.imageminMozjpeg.imageminMozjpegStrings.ssim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArithmetic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arithmetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArithmetic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arithmetic")(js.undefined)
        ret
    }
    @scala.inline
    def withDcScanOpt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dcScanOpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDcScanOpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dcScanOpt")(js.undefined)
        ret
    }
    @scala.inline
    def withDct(value: int | fast | float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dct")(js.undefined)
        ret
    }
    @scala.inline
    def withFastCrush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastCrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastCrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastCrush")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withOvershoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOvershoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshoot")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantBaseline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantTable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantTable")(js.undefined)
        ret
    }
    @scala.inline
    def withRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.undefined)
        ret
    }
    @scala.inline
    def withSample(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(js.undefined)
        ret
    }
    @scala.inline
    def withSmooth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(js.undefined)
        ret
    }
    @scala.inline
    def withTarga(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarga: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targa")(js.undefined)
        ret
    }
    @scala.inline
    def withTrellis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trellis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrellis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trellis")(js.undefined)
        ret
    }
    @scala.inline
    def withTrellisDC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trellisDC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrellisDC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trellisDC")(js.undefined)
        ret
    }
    @scala.inline
    def withTune(value: psnr | `hvs-psnr` | ssim | `ms-ssim`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tune")(js.undefined)
        ret
    }
  }
  
}

