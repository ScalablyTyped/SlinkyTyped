package typingsSlinky.reactPlayer.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsSlinky.reactPlayer.AnonLoaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPlayerProps
  extends /* otherProps */ StringDictionary[js.Any] {
  var config: js.UndefOr[Config] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var dailymotionConfig: js.UndefOr[DailyMotionConfig] = js.native
  var facebookConfig: js.UndefOr[FacebookConfig] = js.native
  var fileConfig: js.UndefOr[FileConfig] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var light: js.UndefOr[Boolean | String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onBuffer: js.UndefOr[js.Function0[Unit]] = js.native
  var onBufferEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onDisablePIP: js.UndefOr[js.Function0[Unit]] = js.native
  var onDuration: js.UndefOr[js.Function1[/* duration */ Double, Unit]] = js.native
  var onEnablePIP: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnded: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[
    js.Function4[
      /* error */ js.Any, 
      /* data */ js.UndefOr[js.Any], 
      /* hlsInstance */ js.UndefOr[js.Any], 
      /* hlsGlobal */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* state */ AnonLoaded, Unit]] = js.native
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  var onSeek: js.UndefOr[js.Function1[/* seconds */ Double, Unit]] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  var pip: js.UndefOr[Boolean] = js.native
  var playbackRate: js.UndefOr[Double] = js.native
  var playing: js.UndefOr[Boolean] = js.native
  var playsinline: js.UndefOr[Boolean] = js.native
  var progressInterval: js.UndefOr[Double] = js.native
  var soundcloudConfig: js.UndefOr[SoundCloudConfig] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var url: js.UndefOr[String | (js.Array[SourceProps | String]) | MediaStream] = js.native
  var vimeoConfig: js.UndefOr[VimeoConfig] = js.native
  var volume: js.UndefOr[Double] = js.native
  var width: js.UndefOr[String | Double] = js.native
  var wistiaConfig: js.UndefOr[WistiaConfig] = js.native
  var wrapper: js.UndefOr[js.Any] = js.native
  var youtubeConfig: js.UndefOr[YouTubeConfig] = js.native
}

object ReactPlayerProps {
  @scala.inline
  def apply(): ReactPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactPlayerProps]
  }
  @scala.inline
  implicit class ReactPlayerPropsOps[Self <: ReactPlayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
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
    def withDailymotionConfig(value: DailyMotionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailymotionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailymotionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailymotionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebookConfig(value: FacebookConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebookConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFileConfig(value: FileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(js.undefined)
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
    def withOnBuffer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBufferEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBufferEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBufferEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBufferEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisablePIP(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisablePIP")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDisablePIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisablePIP")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDuration(value: /* duration */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnablePIP(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnablePIP")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnablePIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnablePIP")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(
      value: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
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
    def withOnPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* state */ AnonLoaded => Unit): Self = {
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
    def withOnReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeek(value: /* seconds */ Double => Unit): Self = {
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
    def withOnStart(value: () => Unit): Self = {
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
    def withPip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pip")(js.undefined)
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
    def withPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaysinline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playsinline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaysinline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playsinline")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundcloudConfig(value: SoundCloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundcloudConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundcloudConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundcloudConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
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
    def withUrlMediaStream(value: MediaStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String | (js.Array[SourceProps | String]) | MediaStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVimeoConfig(value: VimeoConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vimeoConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVimeoConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vimeoConfig")(js.undefined)
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
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWistiaConfig(value: WistiaConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wistiaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWistiaConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wistiaConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withYoutubeConfig(value: YouTubeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoutubeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeConfig")(js.undefined)
        ret
    }
  }
  
}

