package typingsSlinky.reactPlyr.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactPlyr.AnonActive
import typingsSlinky.reactPlyr.AnonControls
import typingsSlinky.reactPlyr.AnonDefault
import typingsSlinky.reactPlyr.AnonEnabled
import typingsSlinky.reactPlyr.AnonFocused
import typingsSlinky.reactPlyr.AnonKey
import typingsSlinky.reactPlyr.AnonKind
import typingsSlinky.reactPlyr.AnonOptions
import typingsSlinky.reactPlyr.AnonSize
import typingsSlinky.reactPlyr.mod.OnVolumeChangeParam
import typingsSlinky.reactPlyr.mod.default
import typingsSlinky.reactPlyr.reactPlyrStrings.audio
import typingsSlinky.reactPlyr.reactPlyrStrings.video
import typingsSlinky.reactPlyr.reactPlyrStrings.vimeo
import typingsSlinky.reactPlyr.reactPlyrStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlyr
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-plyr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, muted, poster, title */
  def apply(
    autopause: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    blankVideo: String = null,
    captions: js.Array[AnonKind] = null,
    clickToPlay: js.UndefOr[Boolean] = js.undefined,
    controls: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableContextMenu: js.UndefOr[Boolean] = js.undefined,
    displayDuration: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fullscreen: AnonEnabled = null,
    hideControls: js.UndefOr[Boolean] = js.undefined,
    iconPrefix: String = null,
    iconUrl: String = null,
    invertTime: js.UndefOr[Boolean] = js.undefined,
    keyboard: AnonFocused = null,
    loadSprite: js.UndefOr[Boolean] = js.undefined,
    loop: AnonActive = null,
    onCaptionsDisabled: () => Unit = null,
    onCaptionsEnabled: () => Unit = null,
    onEnd: () => Unit = null,
    onEnterFullscreen: () => Unit = null,
    onExitFullscreen: () => Unit = null,
    onLoadedData: () => Unit = null,
    onPause: () => Unit = null,
    onPlay: () => Unit = null,
    onReady: /* player */ js.UndefOr[js.Any] => Unit = null,
    onSeeked: /* time */ js.UndefOr[Double] => Unit = null,
    onTimeUpdate: /* time */ js.UndefOr[Double] => Unit = null,
    onVolumeChange: /* params */ OnVolumeChangeParam => Unit = null,
    quality: AnonDefault = null,
    ratio: String = null,
    resetOnEnd: js.UndefOr[Boolean] = js.undefined,
    seekTime: Int | Double = null,
    settings: js.Array[String] = null,
    sources: js.Array[AnonSize] = null,
    speed: AnonOptions = null,
    storage: AnonKey = null,
    toggleInvert: js.UndefOr[Boolean] = js.undefined,
    tooltips: AnonControls = null,
    `type`: youtube | vimeo | video | audio = null,
    url: String = null,
    videoId: String = null,
    volume: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (blankVideo != null) __obj.updateDynamic("blankVideo")(blankVideo.asInstanceOf[js.Any])
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContextMenu)) __obj.updateDynamic("disableContextMenu")(disableContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDuration)) __obj.updateDynamic("displayDuration")(displayDuration.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(hideControls)) __obj.updateDynamic("hideControls")(hideControls.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(invertTime)) __obj.updateDynamic("invertTime")(invertTime.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSprite)) __obj.updateDynamic("loadSprite")(loadSprite.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (onCaptionsDisabled != null) __obj.updateDynamic("onCaptionsDisabled")(js.Any.fromFunction0(onCaptionsDisabled))
    if (onCaptionsEnabled != null) __obj.updateDynamic("onCaptionsEnabled")(js.Any.fromFunction0(onCaptionsEnabled))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onEnterFullscreen != null) __obj.updateDynamic("onEnterFullscreen")(js.Any.fromFunction0(onEnterFullscreen))
    if (onExitFullscreen != null) __obj.updateDynamic("onExitFullscreen")(js.Any.fromFunction0(onExitFullscreen))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction0(onLoadedData))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction0(onPlay))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnEnd)) __obj.updateDynamic("resetOnEnd")(resetOnEnd.asInstanceOf[js.Any])
    if (seekTime != null) __obj.updateDynamic("seekTime")(seekTime.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleInvert)) __obj.updateDynamic("toggleInvert")(toggleInvert.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactPlyr.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactPlyr.mod.Props
}

