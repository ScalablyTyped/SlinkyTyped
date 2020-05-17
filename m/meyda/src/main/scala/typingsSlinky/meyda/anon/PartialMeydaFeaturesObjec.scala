package typingsSlinky.meyda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meyda.meyda.MeydaFeaturesObject> */
@js.native
trait PartialMeydaFeaturesObjec extends js.Object {
  var amplitudeSpectrum: js.UndefOr[js.typedarray.Float32Array] = js.native
  var buffer: js.UndefOr[js.Array[Double]] = js.native
  var chroma: js.UndefOr[js.Array[Double]] = js.native
  var complexSpectrum: js.UndefOr[Imag] = js.native
  var energy: js.UndefOr[Double] = js.native
  var loudness: js.UndefOr[Specific] = js.native
  var mfcc: js.UndefOr[js.Array[Double]] = js.native
  var perceptualSharpness: js.UndefOr[Double] = js.native
  var perceptualSpread: js.UndefOr[Double] = js.native
  var powerSpectrum: js.UndefOr[js.typedarray.Float32Array] = js.native
  var rms: js.UndefOr[Double] = js.native
  var spectralCentroid: js.UndefOr[Double] = js.native
  var spectralFlatness: js.UndefOr[Double] = js.native
  var spectralKurtosis: js.UndefOr[Double] = js.native
  var spectralRolloff: js.UndefOr[Double] = js.native
  var spectralSkewness: js.UndefOr[Double] = js.native
  var spectralSlope: js.UndefOr[Double] = js.native
  var spectralSpread: js.UndefOr[Double] = js.native
  var zcr: js.UndefOr[Double] = js.native
}

object PartialMeydaFeaturesObjec {
  @scala.inline
  def apply(): PartialMeydaFeaturesObjec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMeydaFeaturesObjec]
  }
  @scala.inline
  implicit class PartialMeydaFeaturesObjecOps[Self <: PartialMeydaFeaturesObjec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmplitudeSpectrum(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplitudeSpectrum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmplitudeSpectrum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplitudeSpectrum")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withChroma(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chroma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChroma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chroma")(js.undefined)
        ret
    }
    @scala.inline
    def withComplexSpectrum(value: Imag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexSpectrum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexSpectrum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexSpectrum")(js.undefined)
        ret
    }
    @scala.inline
    def withEnergy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnergy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(js.undefined)
        ret
    }
    @scala.inline
    def withLoudness(value: Specific): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoudness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loudness")(js.undefined)
        ret
    }
    @scala.inline
    def withMfcc(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMfcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfcc")(js.undefined)
        ret
    }
    @scala.inline
    def withPerceptualSharpness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perceptualSharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerceptualSharpness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perceptualSharpness")(js.undefined)
        ret
    }
    @scala.inline
    def withPerceptualSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perceptualSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerceptualSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perceptualSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withPowerSpectrum(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSpectrum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerSpectrum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSpectrum")(js.undefined)
        ret
    }
    @scala.inline
    def withRms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rms")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralCentroid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralCentroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralCentroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralCentroid")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralFlatness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralFlatness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralFlatness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralFlatness")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralKurtosis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralKurtosis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralKurtosis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralKurtosis")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralRolloff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralRolloff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralRolloff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralRolloff")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralSkewness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSkewness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralSkewness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSkewness")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralSlope(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralSlope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSlope")(js.undefined)
        ret
    }
    @scala.inline
    def withSpectralSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpectralSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSpread")(js.undefined)
        ret
    }
    @scala.inline
    def withZcr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zcr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZcr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zcr")(js.undefined)
        ret
    }
  }
  
}

