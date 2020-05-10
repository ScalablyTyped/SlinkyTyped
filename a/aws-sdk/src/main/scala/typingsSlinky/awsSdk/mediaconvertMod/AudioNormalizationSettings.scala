package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNormalizationSettings extends js.Object {
  /**
    * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
    */
  var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.native
  /**
    * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
    */
  var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.native
  /**
    * Content measuring above this level will be corrected to the target level. Content measuring below this level will not be corrected.
    */
  var CorrectionGateLevel: js.UndefOr[integerMinNegative70Max0] = js.native
  /**
    * If set to LOG, log each output's audio track loudness to a CSV file.
    */
  var LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging] = js.native
  /**
    * If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
    */
  var PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation] = js.native
  /**
    * When you use Audio normalization (AudioNormalizationSettings), optionally use this setting to specify a target loudness. If you don't specify a value here, the encoder chooses a value for you, based on the algorithm that you choose for Algorithm (algorithm). If you choose algorithm 1770-1, the encoder will choose -24 LKFS; otherwise, the encoder will choose -23 LKFS.
    */
  var TargetLkfs: js.UndefOr[doubleMinNegative59Max0] = js.native
}

object AudioNormalizationSettings {
  @scala.inline
  def apply(): AudioNormalizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNormalizationSettings]
  }
  @scala.inline
  implicit class AudioNormalizationSettingsOps[Self <: AudioNormalizationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: AudioNormalizationAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withAlgorithmControl(value: AudioNormalizationAlgorithmControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmControl")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrectionGateLevel(value: integerMinNegative70Max0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectionGateLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectionGateLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectionGateLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLoudnessLogging(value: AudioNormalizationLoudnessLogging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoudnessLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoudnessLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoudnessLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakCalculation(value: AudioNormalizationPeakCalculation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeakCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeakCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLkfs(value: doubleMinNegative59Max0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLkfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLkfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLkfs")(js.undefined)
        ret
    }
  }
  
}

