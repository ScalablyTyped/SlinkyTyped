package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.Anon2
import typingsSlinky.gestalt.Anon3
import typingsSlinky.gestalt.AnonDuration
import typingsSlinky.gestalt.AnonFullscreen
import typingsSlinky.gestalt.AnonLoaded
import typingsSlinky.gestalt.AnonSrc
import typingsSlinky.gestalt.AnonTime
import typingsSlinky.gestalt.AnonVolume
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.metadata
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.mod.VideoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Video
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.mod.Video] {
  @JSImport("gestalt", "Video")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: controls, loop, poster */
  def apply(
    aspectRatio: Double,
    captions: String,
    src: String | js.Array[AnonSrc],
    volume: Double,
    accessibilityMaximizeLabel: String = null,
    accessibilityMinimizeLabel: String = null,
    accessibilityMuteLabel: String = null,
    accessibilityPauseLabel: String = null,
    accessibilityPlayLabel: String = null,
    accessibilityUnmuteLabel: String = null,
    onDurationChange: /* args */ AnonDuration => Unit = null,
    onEnded: /* args */ Anon2 => Unit = null,
    onFullscreenChange: /* args */ AnonFullscreen => Unit = null,
    onLoadedChange: /* args */ AnonLoaded => Unit = null,
    onPause: /* args */ Anon3 => Unit = null,
    onPlay: /* args */ Anon3 => Unit = null,
    onReady: /* args */ Anon2 => Unit = null,
    onSeek: /* args */ Anon2 => Unit = null,
    onTimeChange: /* args */ AnonTime => Unit = null,
    onVolumeChange: /* args */ AnonVolume => Unit = null,
    playbackRate: Int | Double = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    preload: auto | metadata | none = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.mod.Video] = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    if (accessibilityMaximizeLabel != null) __obj.updateDynamic("accessibilityMaximizeLabel")(accessibilityMaximizeLabel.asInstanceOf[js.Any])
    if (accessibilityMinimizeLabel != null) __obj.updateDynamic("accessibilityMinimizeLabel")(accessibilityMinimizeLabel.asInstanceOf[js.Any])
    if (accessibilityMuteLabel != null) __obj.updateDynamic("accessibilityMuteLabel")(accessibilityMuteLabel.asInstanceOf[js.Any])
    if (accessibilityPauseLabel != null) __obj.updateDynamic("accessibilityPauseLabel")(accessibilityPauseLabel.asInstanceOf[js.Any])
    if (accessibilityPlayLabel != null) __obj.updateDynamic("accessibilityPlayLabel")(accessibilityPlayLabel.asInstanceOf[js.Any])
    if (accessibilityUnmuteLabel != null) __obj.updateDynamic("accessibilityUnmuteLabel")(accessibilityUnmuteLabel.asInstanceOf[js.Any])
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onFullscreenChange != null) __obj.updateDynamic("onFullscreenChange")(js.Any.fromFunction1(onFullscreenChange))
    if (onLoadedChange != null) __obj.updateDynamic("onLoadedChange")(js.Any.fromFunction1(onLoadedChange))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1(onSeek))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction1(onTimeChange))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = VideoProps
}

