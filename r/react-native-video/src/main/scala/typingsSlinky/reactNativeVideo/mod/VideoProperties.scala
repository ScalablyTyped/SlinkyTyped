package typingsSlinky.reactNativeVideo.mod

import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeVideo.AnonBufferForPlaybackAfterRebufferMs
import typingsSlinky.reactNativeVideo.AnonLanguage
import typingsSlinky.reactNativeVideo.AnonType
import typingsSlinky.reactNativeVideo.AnonUri
import typingsSlinky.reactNativeVideo.AnonValue
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.all
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.contain
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.cover
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.ignore
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.landscape
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.none
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.obey
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.portrait
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProperties extends ViewProps {
  var allowsExternalPlayback: js.UndefOr[Boolean] = js.native
  var audioOnly: js.UndefOr[Boolean] = js.native
  var automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.native
  var bufferConfig: js.UndefOr[AnonBufferForPlaybackAfterRebufferMs] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var currentTime: js.UndefOr[Double] = js.native
  var disableFocus: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[FilterType] = js.native
  var filterEnable: js.UndefOr[Boolean] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
  var fullscreenAutorotate: js.UndefOr[Boolean] = js.native
  var fullscreenOrientation: js.UndefOr[all | landscape | portrait] = js.native
  var hideShutterView: js.UndefOr[Boolean] = js.native
  var ignoreSilentSwitch: js.UndefOr[ignore | obey] = js.native
  var maxBitRate: js.UndefOr[Double] = js.native
  var minLoadRetryCount: js.UndefOr[Double] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onAudioBecomingNoisy: js.UndefOr[js.Function0[Unit]] = js.native
  var onAudioFocusChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var onBandwidthUpdate: js.UndefOr[js.Function1[/* data */ OnBandwidthUpdateData, Unit]] = js.native
  var onBuffer: js.UndefOr[js.Function1[/* data */ OnBufferData, Unit]] = js.native
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ LoadError, Unit]] = js.native
  var onExternalPlaybackChange: js.UndefOr[js.Function1[/* data */ OnExternalPlaybackChangeData, Unit]] = js.native
  var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.native
  var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, Unit]] = js.native
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onPictureInPictureStatusChanged: js.UndefOr[js.Function1[/* data */ OnPictureInPictureStatusData, Unit]] = js.native
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* data */ OnPlaybackRateData, Unit]] = js.native
  var onPlaybackResume: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlaybackStalled: js.UndefOr[js.Function0[Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* data */ OnProgressData, Unit]] = js.native
  var onReadyForDisplay: js.UndefOr[js.Function0[Unit]] = js.native
  var onRestoreUserInterfaceForPictureInPictureStop: js.UndefOr[js.Function0[Unit]] = js.native
  var onSeek: js.UndefOr[js.Function1[/* data */ OnSeekData, Unit]] = js.native
  var onTimedMetadata: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoBuffer: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoError: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoProgress: js.UndefOr[js.Function0[Unit]] = js.native
  var onVideoSeek: js.UndefOr[js.Function0[Unit]] = js.native
  var paused: js.UndefOr[Boolean] = js.native
  var pictureInPicture: js.UndefOr[Boolean] = js.native
  var playInBackground: js.UndefOr[Boolean] = js.native
  var playWhenInactive: js.UndefOr[Boolean] = js.native
   // via Image#resizeMode
  var poster: js.UndefOr[String] = js.native
   // via Image#resizeMode
  var posterResizeMode: js.UndefOr[stretch | contain | cover | none] = js.native
  var progressUpdateInterval: js.UndefOr[Double] = js.native
  var rate: js.UndefOr[Double] = js.native
  var repeat: js.UndefOr[Boolean] = js.native
  var reportBandwidth: js.UndefOr[Boolean] = js.native
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.native
  var rotation: js.UndefOr[Double] = js.native
  /* Required by react-native */
  var scaleX: js.UndefOr[Double] = js.native
  var scaleY: js.UndefOr[Double] = js.native
  var seek: js.UndefOr[Double] = js.native
  var selectedAudioTrack: js.UndefOr[AnonType] = js.native
  var selectedTextTrack: js.UndefOr[AnonType] = js.native
  var selectedVideoTrack: js.UndefOr[AnonValue] = js.native
  /* Wrapper component */
  // Opaque type returned by require('./video.mp4')
  var source: AnonUri | Double = js.native
  /* Native only */
  var src: js.UndefOr[js.Any] = js.native
  var stereoPan: js.UndefOr[Double] = js.native
  var textTracks: js.UndefOr[js.Array[AnonLanguage]] = js.native
  var translateX: js.UndefOr[Double] = js.native
  var translateY: js.UndefOr[Double] = js.native
  var useTextureView: js.UndefOr[Boolean] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object VideoProperties {
  @scala.inline
  def apply(source: AnonUri | Double): VideoProperties = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
  @scala.inline
  implicit class VideoPropertiesOps[Self <: VideoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: AnonUri | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowsExternalPlayback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsExternalPlayback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsExternalPlayback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsExternalPlayback")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticallyWaitsToMinimizeStalling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyWaitsToMinimizeStalling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticallyWaitsToMinimizeStalling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyWaitsToMinimizeStalling")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferConfig(value: AnonBufferForPlaybackAfterRebufferMs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: FilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenAutorotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenAutorotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenAutorotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenAutorotate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenOrientation(value: all | landscape | portrait): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideShutterView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideShutterView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideShutterView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideShutterView")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSilentSwitch(value: ignore | obey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSilentSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSilentSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSilentSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBitRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBitRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBitRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLoadRetryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLoadRetryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLoadRetryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLoadRetryCount")(js.undefined)
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
    def withOnAudioBecomingNoisy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAudioBecomingNoisy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAudioBecomingNoisy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAudioBecomingNoisy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAudioFocusChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAudioFocusChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAudioFocusChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAudioFocusChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBandwidthUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBandwidthUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBandwidthUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBuffer(value: /* data */ OnBufferData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ LoadError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExternalPlaybackChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExternalPlaybackChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExternalPlaybackChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFullscreenPlayerDidDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerDidDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFullscreenPlayerDidDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerDidDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFullscreenPlayerDidPresent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerDidPresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFullscreenPlayerDidPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerDidPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFullscreenPlayerWillDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerWillDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFullscreenPlayerWillDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerWillDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFullscreenPlayerWillPresent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerWillPresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFullscreenPlayerWillPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFullscreenPlayerWillPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* data */ OnLoadData => Unit): Self = {
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
    def withOnLoadStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPictureInPictureStatusChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPictureInPictureStatusChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPictureInPictureStatusChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaybackRateChange(value: /* data */ OnPlaybackRateData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaybackRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaybackResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackResume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlaybackResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackResume")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaybackStalled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackStalled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlaybackStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* data */ OnProgressData => Unit): Self = {
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
    def withOnReadyForDisplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyForDisplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReadyForDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyForDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRestoreUserInterfaceForPictureInPictureStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRestoreUserInterfaceForPictureInPictureStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRestoreUserInterfaceForPictureInPictureStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRestoreUserInterfaceForPictureInPictureStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeek(value: /* data */ OnSeekData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeek")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimedMetadata(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimedMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTimedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoBuffer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoFullscreenPlayerDidDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerDidDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoFullscreenPlayerDidDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerDidDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoFullscreenPlayerDidPresent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerDidPresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoFullscreenPlayerDidPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerDidPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoFullscreenPlayerWillDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerWillDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoFullscreenPlayerWillDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerWillDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoFullscreenPlayerWillPresent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerWillPresent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoFullscreenPlayerWillPresent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoFullscreenPlayerWillPresent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoLoadStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoLoadStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoProgress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVideoSeek(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoSeek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnVideoSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVideoSeek")(js.undefined)
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
    def withPictureInPicture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictureInPicture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPictureInPicture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictureInPicture")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayInBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playInBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayInBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playInBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayWhenInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playWhenInactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayWhenInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playWhenInactive")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withPosterResizeMode(value: stretch | contain | cover | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterResizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosterResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterResizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressUpdateInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUpdateInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressUpdateInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUpdateInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withReportBandwidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportBandwidth")(js.undefined)
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
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withSeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedAudioTrack(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAudioTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedAudioTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAudioTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTextTrack(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTextTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedVideoTrack(value: AnonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedVideoTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedVideoTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedVideoTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withStereoPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStereoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stereoPan")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTracks(value: js.Array[AnonLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTextureView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTextureView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTextureView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTextureView")(js.undefined)
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

