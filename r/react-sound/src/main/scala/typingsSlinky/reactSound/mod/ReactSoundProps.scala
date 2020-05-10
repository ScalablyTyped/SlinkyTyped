package typingsSlinky.reactSound.mod

import typingsSlinky.reactSound.reactSoundStrings.PAUSED
import typingsSlinky.reactSound.reactSoundStrings.PLAYING
import typingsSlinky.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSoundProps extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoading: js.UndefOr[js.Function0[Unit]] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlaying: js.UndefOr[js.Function0[Unit]] = js.native
  var onResume: js.UndefOr[js.Function0[Unit]] = js.native
  var onStop: js.UndefOr[js.Function0[Unit]] = js.native
  var playFromPosition: js.UndefOr[Double] = js.native
  var playStatus: PLAYING | STOPPED | PAUSED = js.native
  var playbackRate: js.UndefOr[Double] = js.native
  var position: js.UndefOr[Double] = js.native
  var url: String = js.native
  var volume: js.UndefOr[Double] = js.native
}

object ReactSoundProps {
  @scala.inline
  def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): ReactSoundProps = {
    val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSoundProps]
  }
  @scala.inline
  implicit class ReactSoundPropsOps[Self <: ReactSoundProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayStatus(value: PLAYING | STOPPED | PAUSED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBufferChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBufferChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBufferChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBufferChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishedPlaying(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishedPlaying")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFinishedPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishedPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoading(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResume")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayFromPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playFromPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayFromPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playFromPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

