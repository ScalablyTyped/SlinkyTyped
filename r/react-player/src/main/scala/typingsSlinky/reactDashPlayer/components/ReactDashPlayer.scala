package typingsSlinky.reactDashPlayer.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.mediastream.MediaStream
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.Config
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.DailyMotionConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.FacebookConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.FileConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.ReactPlayerProps
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.SoundCloudConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.SourceProps
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.VimeoConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.WistiaConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.YouTubeConfig
import typingsSlinky.reactDashPlayer.reactDashPlayerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashPlayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-player", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: controls, height, loop, muted, onProgress, width */
  def apply(
    config: Config = null,
    dailymotionConfig: DailyMotionConfig = null,
    facebookConfig: FacebookConfig = null,
    fileConfig: FileConfig = null,
    light: Boolean | String = null,
    onBuffer: () => Unit = null,
    onBufferEnd: () => Unit = null,
    onDisablePIP: () => Unit = null,
    onDuration: /* duration */ Double => Unit = null,
    onEnablePIP: () => Unit = null,
    onEnded: () => Unit = null,
    onError: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Unit = null,
    onPause: () => Unit = null,
    onPlay: () => Unit = null,
    onReady: () => Unit = null,
    onSeek: /* seconds */ Double => Unit = null,
    onStart: () => Unit = null,
    pip: js.UndefOr[Boolean] = js.undefined,
    playbackRate: Int | Double = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    playsinline: js.UndefOr[Boolean] = js.undefined,
    progressInterval: Int | Double = null,
    soundcloudConfig: SoundCloudConfig = null,
    style: js.Object = null,
    url: String | (js.Array[SourceProps | String]) | MediaStream = null,
    vimeoConfig: VimeoConfig = null,
    volume: Int | Double = null,
    wistiaConfig: WistiaConfig = null,
    wrapper: js.Any = null,
    youtubeConfig: YouTubeConfig = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dailymotionConfig != null) __obj.updateDynamic("dailymotionConfig")(dailymotionConfig.asInstanceOf[js.Any])
    if (facebookConfig != null) __obj.updateDynamic("facebookConfig")(facebookConfig.asInstanceOf[js.Any])
    if (fileConfig != null) __obj.updateDynamic("fileConfig")(fileConfig.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (onBuffer != null) __obj.updateDynamic("onBuffer")(js.Any.fromFunction0(onBuffer))
    if (onBufferEnd != null) __obj.updateDynamic("onBufferEnd")(js.Any.fromFunction0(onBufferEnd))
    if (onDisablePIP != null) __obj.updateDynamic("onDisablePIP")(js.Any.fromFunction0(onDisablePIP))
    if (onDuration != null) __obj.updateDynamic("onDuration")(js.Any.fromFunction1(onDuration))
    if (onEnablePIP != null) __obj.updateDynamic("onEnablePIP")(js.Any.fromFunction0(onEnablePIP))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction0(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction4(onError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction0(onPlay))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1(onSeek))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction0(onStart))
    if (!js.isUndefined(pip)) __obj.updateDynamic("pip")(pip.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (soundcloudConfig != null) __obj.updateDynamic("soundcloudConfig")(soundcloudConfig.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (vimeoConfig != null) __obj.updateDynamic("vimeoConfig")(vimeoConfig.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (wistiaConfig != null) __obj.updateDynamic("wistiaConfig")(wistiaConfig.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    if (youtubeConfig != null) __obj.updateDynamic("youtubeConfig")(youtubeConfig.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashPlayer.reactDashPlayerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactPlayerProps
}

