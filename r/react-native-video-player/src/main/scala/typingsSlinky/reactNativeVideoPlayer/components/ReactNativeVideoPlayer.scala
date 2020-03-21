package typingsSlinky.reactNativeVideoPlayer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeVideoPlayer.AnonControlButton
import typingsSlinky.reactNativeVideoPlayer.AnonUri
import typingsSlinky.reactNativeVideoPlayer.mod.VideoPlayerProps
import typingsSlinky.reactNativeVideoPlayer.mod.default
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typingsSlinky.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeVideoPlayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-video-player", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: loop, muted */
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    controlsTimeout: Int | Double = null,
    customStyles: AnonControlButton = null,
    defaultMuted: js.UndefOr[Boolean] = js.undefined,
    disableControlsAutoHide: js.UndefOr[Boolean] = js.undefined,
    disableFullscreen: js.UndefOr[Boolean] = js.undefined,
    disableSeek: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    endThumbnail: ImageSourcePropType = null,
    endWithThumbnail: js.UndefOr[Boolean] = js.undefined,
    fullScreenOnLongPress: js.UndefOr[Boolean] = js.undefined,
    hideControlsOnStart: js.UndefOr[Boolean] = js.undefined,
    onEnd: /* event */ js.Any => _ = null,
    onHideControls: () => _ = null,
    onLoad: /* event */ js.Any => _ = null,
    onMutePress: () => _ = null,
    onPlayPress: () => _ = null,
    onProgress: /* event */ js.Any => _ = null,
    onShowControls: () => _ = null,
    onStart: () => _ = null,
    pauseOnPress: js.UndefOr[Boolean] = js.undefined,
    paused: js.UndefOr[Boolean] = js.undefined,
    resizeMode: stretch | contain | cover | none = null,
    style: StyleProp[ViewStyle] = null,
    thumbnail: ImageSourcePropType = null,
    video: AnonUri | Double = null,
    videoHeight: Int | Double = null,
    videoWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (controlsTimeout != null) __obj.updateDynamic("controlsTimeout")(controlsTimeout.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMuted)) __obj.updateDynamic("defaultMuted")(defaultMuted.asInstanceOf[js.Any])
    if (!js.isUndefined(disableControlsAutoHide)) __obj.updateDynamic("disableControlsAutoHide")(disableControlsAutoHide.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreen)) __obj.updateDynamic("disableFullscreen")(disableFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSeek)) __obj.updateDynamic("disableSeek")(disableSeek.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endThumbnail != null) __obj.updateDynamic("endThumbnail")(endThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(endWithThumbnail)) __obj.updateDynamic("endWithThumbnail")(endWithThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreenOnLongPress)) __obj.updateDynamic("fullScreenOnLongPress")(fullScreenOnLongPress.asInstanceOf[js.Any])
    if (!js.isUndefined(hideControlsOnStart)) __obj.updateDynamic("hideControlsOnStart")(hideControlsOnStart.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onHideControls != null) __obj.updateDynamic("onHideControls")(js.Any.fromFunction0(onHideControls))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMutePress != null) __obj.updateDynamic("onMutePress")(js.Any.fromFunction0(onMutePress))
    if (onPlayPress != null) __obj.updateDynamic("onPlayPress")(js.Any.fromFunction0(onPlayPress))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onShowControls != null) __obj.updateDynamic("onShowControls")(js.Any.fromFunction0(onShowControls))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction0(onStart))
    if (!js.isUndefined(pauseOnPress)) __obj.updateDynamic("pauseOnPress")(pauseOnPress.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoHeight != null) __obj.updateDynamic("videoHeight")(videoHeight.asInstanceOf[js.Any])
    if (videoWidth != null) __obj.updateDynamic("videoWidth")(videoWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeVideoPlayer.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VideoPlayerProps
}

