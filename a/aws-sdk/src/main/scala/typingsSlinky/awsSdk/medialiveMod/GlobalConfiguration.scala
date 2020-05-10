package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalConfiguration extends js.Object {
  /**
    * Value to set the initial audio gain for the Live Event.
    */
  var InitialAudioGain: js.UndefOr[integerMinNegative60Max60] = js.native
  /**
    * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is configured the encoder will restart at the beginning of the first input.  When "none" is configured the encoder will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
    */
  var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.native
  /**
    * Settings for system actions when input is lost.
    */
  var InputLossBehavior: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.InputLossBehavior] = js.native
  /**
    * Indicates how MediaLive pipelines are synchronized.
  PIPELINELOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
  EPOCHLOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
    */
  var OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode] = js.native
  /**
    * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which optionally may be locked to another source via NTP) or should be locked to the clock of the source that is providing the input stream.
    */
  var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.native
  /**
    * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music channels with less than one video frame per second.
    */
  var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.native
}

object GlobalConfiguration {
  @scala.inline
  def apply(): GlobalConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalConfiguration]
  }
  @scala.inline
  implicit class GlobalConfigurationOps[Self <: GlobalConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialAudioGain(value: integerMinNegative60Max60): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialAudioGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialAudioGain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialAudioGain")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEndAction(value: GlobalConfigurationInputEndAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputEndAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEndAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputEndAction")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLossBehavior(value: InputLossBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLockingMode(value: GlobalConfigurationOutputLockingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLockingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLockingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLockingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputTimingSource(value: GlobalConfigurationOutputTimingSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputTimingSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputTimingSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputTimingSource")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportLowFramerateInputs(value: GlobalConfigurationLowFramerateInputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportLowFramerateInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportLowFramerateInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportLowFramerateInputs")(js.undefined)
        ret
    }
  }
  
}

