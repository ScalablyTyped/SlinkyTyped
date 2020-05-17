package typingsSlinky.playerframework.PlayerFramework.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlPanel extends js.Object {
  var element: HTMLElement = js.native
  var flyoutContainerElement: HTMLElement = js.native
  var hidden: Boolean = js.native
  var isAudioHidden: Boolean = js.native
  var isCaptionsHidden: Boolean = js.native
  var isElapsedTimeHidden: Boolean = js.native
  var isFastForwardHidden: Boolean = js.native
  var isFullScreenHidden: Boolean = js.native
  var isGoLiveHidden: Boolean = js.native
  var isInfoHidden: Boolean = js.native
  var isMediaQualityHidden: Boolean = js.native
  var isMoreHidden: Boolean = js.native
  var isMuteHidden: Boolean = js.native
  var isPauseHidden: Boolean = js.native
  var isPlayPauseHidden: Boolean = js.native
  var isPlayResumeHidden: Boolean = js.native
  var isRemainingTimeHidden: Boolean = js.native
  var isReplayHidden: Boolean = js.native
  var isRewindHidden: Boolean = js.native
  var isSignalStrengthHidden: Boolean = js.native
  var isSkipAheadHidden: Boolean = js.native
  var isSkipBackHidden: Boolean = js.native
  var isSkipNextHidden: Boolean = js.native
  var isSkipPreviousHidden: Boolean = js.native
  var isSlowMotionHidden: Boolean = js.native
  var isStopHidden: Boolean = js.native
  var isTimelineHidden: Boolean = js.native
  var isTotalTimeHidden: Boolean = js.native
  var isVolumeHidden: Boolean = js.native
  var isVolumeMuteHidden: Boolean = js.native
  var isZoomHidden: Boolean = js.native
}

object ControlPanel {
  @scala.inline
  def apply(
    element: HTMLElement,
    flyoutContainerElement: HTMLElement,
    hidden: Boolean,
    isAudioHidden: Boolean,
    isCaptionsHidden: Boolean,
    isElapsedTimeHidden: Boolean,
    isFastForwardHidden: Boolean,
    isFullScreenHidden: Boolean,
    isGoLiveHidden: Boolean,
    isInfoHidden: Boolean,
    isMediaQualityHidden: Boolean,
    isMoreHidden: Boolean,
    isMuteHidden: Boolean,
    isPauseHidden: Boolean,
    isPlayPauseHidden: Boolean,
    isPlayResumeHidden: Boolean,
    isRemainingTimeHidden: Boolean,
    isReplayHidden: Boolean,
    isRewindHidden: Boolean,
    isSignalStrengthHidden: Boolean,
    isSkipAheadHidden: Boolean,
    isSkipBackHidden: Boolean,
    isSkipNextHidden: Boolean,
    isSkipPreviousHidden: Boolean,
    isSlowMotionHidden: Boolean,
    isStopHidden: Boolean,
    isTimelineHidden: Boolean,
    isTotalTimeHidden: Boolean,
    isVolumeHidden: Boolean,
    isVolumeMuteHidden: Boolean,
    isZoomHidden: Boolean
  ): ControlPanel = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], flyoutContainerElement = flyoutContainerElement.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], isAudioHidden = isAudioHidden.asInstanceOf[js.Any], isCaptionsHidden = isCaptionsHidden.asInstanceOf[js.Any], isElapsedTimeHidden = isElapsedTimeHidden.asInstanceOf[js.Any], isFastForwardHidden = isFastForwardHidden.asInstanceOf[js.Any], isFullScreenHidden = isFullScreenHidden.asInstanceOf[js.Any], isGoLiveHidden = isGoLiveHidden.asInstanceOf[js.Any], isInfoHidden = isInfoHidden.asInstanceOf[js.Any], isMediaQualityHidden = isMediaQualityHidden.asInstanceOf[js.Any], isMoreHidden = isMoreHidden.asInstanceOf[js.Any], isMuteHidden = isMuteHidden.asInstanceOf[js.Any], isPauseHidden = isPauseHidden.asInstanceOf[js.Any], isPlayPauseHidden = isPlayPauseHidden.asInstanceOf[js.Any], isPlayResumeHidden = isPlayResumeHidden.asInstanceOf[js.Any], isRemainingTimeHidden = isRemainingTimeHidden.asInstanceOf[js.Any], isReplayHidden = isReplayHidden.asInstanceOf[js.Any], isRewindHidden = isRewindHidden.asInstanceOf[js.Any], isSignalStrengthHidden = isSignalStrengthHidden.asInstanceOf[js.Any], isSkipAheadHidden = isSkipAheadHidden.asInstanceOf[js.Any], isSkipBackHidden = isSkipBackHidden.asInstanceOf[js.Any], isSkipNextHidden = isSkipNextHidden.asInstanceOf[js.Any], isSkipPreviousHidden = isSkipPreviousHidden.asInstanceOf[js.Any], isSlowMotionHidden = isSlowMotionHidden.asInstanceOf[js.Any], isStopHidden = isStopHidden.asInstanceOf[js.Any], isTimelineHidden = isTimelineHidden.asInstanceOf[js.Any], isTotalTimeHidden = isTotalTimeHidden.asInstanceOf[js.Any], isVolumeHidden = isVolumeHidden.asInstanceOf[js.Any], isVolumeMuteHidden = isVolumeMuteHidden.asInstanceOf[js.Any], isZoomHidden = isZoomHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlPanel]
  }
  @scala.inline
  implicit class ControlPanelOps[Self <: ControlPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlyoutContainerElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyoutContainerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAudioHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAudioHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCaptionsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCaptionsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsElapsedTimeHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isElapsedTimeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFastForwardHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFastForwardHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFullScreenHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreenHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGoLiveHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGoLiveHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInfoHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInfoHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMediaQualityHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMediaQualityHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMoreHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoreHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMuteHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuteHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPauseHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPauseHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlayPauseHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlayPauseHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlayResumeHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlayResumeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRemainingTimeHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemainingTimeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReplayHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReplayHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRewindHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRewindHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSignalStrengthHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSignalStrengthHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkipAheadHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkipAheadHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkipBackHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkipBackHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkipNextHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkipNextHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkipPreviousHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkipPreviousHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSlowMotionHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSlowMotionHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStopHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStopHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTimelineHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTimelineHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTotalTimeHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTotalTimeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVolumeHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVolumeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVolumeMuteHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVolumeMuteHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsZoomHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomHidden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

