package typingsSlinky.reactNativeVideoPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPlayerState extends js.Object {
  var duration: Double = js.native
  var hasEnded: Boolean = js.native
  var isControlsVisible: Boolean = js.native
  var isMuted: Boolean = js.native
  var isPlaying: Boolean = js.native
  var isSeeking: Boolean = js.native
  var isStarted: Boolean = js.native
  var progress: Double = js.native
  var width: Double = js.native
}

object VideoPlayerState {
  @scala.inline
  def apply(
    duration: Double,
    hasEnded: Boolean,
    isControlsVisible: Boolean,
    isMuted: Boolean,
    isPlaying: Boolean,
    isSeeking: Boolean,
    isStarted: Boolean,
    progress: Double,
    width: Double
  ): VideoPlayerState = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hasEnded = hasEnded.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], isSeeking = isSeeking.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerState]
  }
  @scala.inline
  implicit class VideoPlayerStateOps[Self <: VideoPlayerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEnded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsControlsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSeeking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSeeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

