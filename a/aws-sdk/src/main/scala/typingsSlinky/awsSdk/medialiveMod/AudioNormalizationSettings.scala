package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNormalizationSettings extends js.Object {
  /**
    * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the EBU R-128 specification.
    */
  var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.native
  /**
    * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the audio will be measured but not adjusted.
    */
  var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.native
  /**
    * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the chosen algorithm.  The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
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

