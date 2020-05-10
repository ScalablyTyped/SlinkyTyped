package typingsSlinky.meyda.mod

import typingsSlinky.meyda.AnonImag
import typingsSlinky.meyda.AnonSpecific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeydaFeaturesObject extends js.Object {
  var amplitudeSpectrum: js.typedarray.Float32Array = js.native
  var buffer: js.Array[Double] = js.native
  var chroma: js.Array[Double] = js.native
  var complexSpectrum: AnonImag = js.native
  var energy: Double = js.native
  var loudness: AnonSpecific = js.native
  var mfcc: js.Array[Double] = js.native
  var perceptualSharpness: Double = js.native
  var perceptualSpread: Double = js.native
  var powerSpectrum: js.typedarray.Float32Array = js.native
  var rms: Double = js.native
  var spectralCentroid: Double = js.native
  var spectralFlatness: Double = js.native
  var spectralKurtosis: Double = js.native
  var spectralRolloff: Double = js.native
  var spectralSkewness: Double = js.native
  var spectralSlope: Double = js.native
  var spectralSpread: Double = js.native
  var zcr: Double = js.native
}

object MeydaFeaturesObject {
  @scala.inline
  def apply(
    amplitudeSpectrum: js.typedarray.Float32Array,
    buffer: js.Array[Double],
    chroma: js.Array[Double],
    complexSpectrum: AnonImag,
    energy: Double,
    loudness: AnonSpecific,
    mfcc: js.Array[Double],
    perceptualSharpness: Double,
    perceptualSpread: Double,
    powerSpectrum: js.typedarray.Float32Array,
    rms: Double,
    spectralCentroid: Double,
    spectralFlatness: Double,
    spectralKurtosis: Double,
    spectralRolloff: Double,
    spectralSkewness: Double,
    spectralSlope: Double,
    spectralSpread: Double,
    zcr: Double
  ): MeydaFeaturesObject = {
    val __obj = js.Dynamic.literal(amplitudeSpectrum = amplitudeSpectrum.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], chroma = chroma.asInstanceOf[js.Any], complexSpectrum = complexSpectrum.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mfcc = mfcc.asInstanceOf[js.Any], perceptualSharpness = perceptualSharpness.asInstanceOf[js.Any], perceptualSpread = perceptualSpread.asInstanceOf[js.Any], powerSpectrum = powerSpectrum.asInstanceOf[js.Any], rms = rms.asInstanceOf[js.Any], spectralCentroid = spectralCentroid.asInstanceOf[js.Any], spectralFlatness = spectralFlatness.asInstanceOf[js.Any], spectralKurtosis = spectralKurtosis.asInstanceOf[js.Any], spectralRolloff = spectralRolloff.asInstanceOf[js.Any], spectralSkewness = spectralSkewness.asInstanceOf[js.Any], spectralSlope = spectralSlope.asInstanceOf[js.Any], spectralSpread = spectralSpread.asInstanceOf[js.Any], zcr = zcr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeydaFeaturesObject]
  }
  @scala.inline
  implicit class MeydaFeaturesObjectOps[Self <: MeydaFeaturesObject] (val x: Self) extends AnyVal {
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
    def withBuffer(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChroma(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chroma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplexSpectrum(value: AnonImag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexSpectrum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoudness(value: AnonSpecific): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loudness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMfcc(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerceptualSharpness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perceptualSharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerceptualSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perceptualSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerSpectrum(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSpectrum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralCentroid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralCentroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralFlatness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralFlatness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralKurtosis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralKurtosis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralRolloff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralRolloff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralSkewness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSkewness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralSlope(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpectralSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectralSpread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZcr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zcr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

