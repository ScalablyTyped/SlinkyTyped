package typingsSlinky.reactSound.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactSound.mod.ReactSoundProps
import typingsSlinky.reactSound.mod.default
import typingsSlinky.reactSound.reactSoundStrings.PAUSED
import typingsSlinky.reactSound.reactSoundStrings.PLAYING
import typingsSlinky.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSound
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-sound", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: loop */
  def apply(
    playStatus: PLAYING | STOPPED | PAUSED,
    url: String,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    onBufferChange: () => Unit = null,
    onError: () => Unit = null,
    onFinishedPlaying: () => Unit = null,
    onLoad: () => Unit = null,
    onLoading: () => Unit = null,
    onPause: () => Unit = null,
    onPlaying: () => Unit = null,
    onResume: () => Unit = null,
    onStop: () => Unit = null,
    playFromPosition: Int | Double = null,
    playbackRate: Int | Double = null,
    position: Int | Double = null,
    volume: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (onBufferChange != null) __obj.updateDynamic("onBufferChange")(js.Any.fromFunction0(onBufferChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onFinishedPlaying != null) __obj.updateDynamic("onFinishedPlaying")(js.Any.fromFunction0(onFinishedPlaying))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoading != null) __obj.updateDynamic("onLoading")(js.Any.fromFunction0(onLoading))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction0(onPlaying))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction0(onResume))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction0(onStop))
    if (playFromPosition != null) __obj.updateDynamic("playFromPosition")(playFromPosition.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactSoundProps
}

