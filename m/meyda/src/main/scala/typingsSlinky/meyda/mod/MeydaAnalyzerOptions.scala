package typingsSlinky.meyda.mod

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.AudioNode
import typingsSlinky.meyda.PartialMeydaFeaturesObjec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeydaAnalyzerOptions extends js.Object {
  var audioContext: AudioContext = js.native
  var bufferSize: Double = js.native
  var callback: js.UndefOr[js.Function1[/* features */ PartialMeydaFeaturesObjec, Unit]] = js.native
  var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.native
  var hopSize: js.UndefOr[Double] = js.native
  var numberOfMFCCCoefficients: js.UndefOr[Double] = js.native
  var source: AudioNode = js.native
  var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.native
}

object MeydaAnalyzerOptions {
  @scala.inline
  def apply(audioContext: AudioContext, bufferSize: Double, source: AudioNode): MeydaAnalyzerOptions = {
    val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeydaAnalyzerOptions]
  }
  @scala.inline
  implicit class MeydaAnalyzerOptionsOps[Self <: MeydaAnalyzerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioContext(value: AudioContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: AudioNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: /* features */ PartialMeydaFeaturesObjec => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureExtractors(value: MeydaAudioFeature | js.Array[MeydaAudioFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureExtractors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureExtractors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureExtractors")(js.undefined)
        ret
    }
    @scala.inline
    def withHopSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hopSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHopSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hopSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfMFCCCoefficients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMFCCCoefficients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfMFCCCoefficients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMFCCCoefficients")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowingFunction(value: MeydaWindowingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowingFunction")(js.undefined)
        ret
    }
  }
  
}

