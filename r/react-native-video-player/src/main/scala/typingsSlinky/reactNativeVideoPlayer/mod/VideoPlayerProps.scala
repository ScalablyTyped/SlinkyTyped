package typingsSlinky.reactNativeVideoPlayer.mod

import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeVideoPlayer.anon.ControlButton
import typingsSlinky.reactNativeVideoPlayer.anon.Uri
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPlayerProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var controlsTimeout: js.UndefOr[Double] = js.native
  var customStyles: js.UndefOr[ControlButton] = js.native
  var defaultMuted: js.UndefOr[Boolean] = js.native
  var disableControlsAutoHide: js.UndefOr[Boolean] = js.native
  var disableFullscreen: js.UndefOr[Boolean] = js.native
  var disableSeek: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var endThumbnail: js.UndefOr[ImageSourcePropType] = js.native
  var endWithThumbnail: js.UndefOr[Boolean] = js.native
  var fullScreenOnLongPress: js.UndefOr[Boolean] = js.native
  var hideControlsOnStart: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  var onHideControls: js.UndefOr[js.Function0[_]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  var onMutePress: js.UndefOr[js.Function0[_]] = js.native
  var onPlayPress: js.UndefOr[js.Function0[_]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  var onShowControls: js.UndefOr[js.Function0[_]] = js.native
  var onStart: js.UndefOr[js.Function0[_]] = js.native
  var pauseOnPress: js.UndefOr[Boolean] = js.native
  var paused: js.UndefOr[Boolean] = js.native
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var thumbnail: js.UndefOr[ImageSourcePropType] = js.native
  var video: js.UndefOr[Uri | Double] = js.native
  var videoHeight: js.UndefOr[Double] = js.native
  var videoWidth: js.UndefOr[Double] = js.native
}

object VideoPlayerProps {
  @scala.inline
  def apply(): VideoPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerProps]
  }
  @scala.inline
  implicit class VideoPlayerPropsOps[Self <: VideoPlayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyles(value: ControlButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMuted")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableControlsAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableControlsAutoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableControlsAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableControlsAutoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSeek")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEndThumbnail(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withEndWithThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWithThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndWithThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWithThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreenOnLongPress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreenOnLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreenOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreenOnLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withHideControlsOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideControlsOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideControlsOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideControlsOnStart")(js.undefined)
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
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideControls(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHideControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideControls")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMutePress(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMutePress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMutePress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMutePress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayPress(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlayPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* event */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowControls(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShowControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowControls")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnPress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnPress")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMode(value: stretch | contain | cover | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withThumbnail(value: ImageSourcePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Uri | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWidth")(js.undefined)
        ret
    }
  }
  
}

