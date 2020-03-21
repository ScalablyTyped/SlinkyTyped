package typingsSlinky.reactHowler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactHowler.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHowler
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-howler", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: loop */
  def apply(
    src: String | js.Array[String],
    format: js.Array[String] = null,
    html5: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    onEnd: () => Unit = null,
    onLoad: () => Unit = null,
    onLoadError: /* id */ Double => Unit = null,
    onPause: () => Unit = null,
    onPlay: /* id */ Double => Unit = null,
    onStop: /* id */ Double => Unit = null,
    onVolume: /* id */ Double => Unit = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    preload: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (onVolume != null) __obj.updateDynamic("onVolume")(js.Any.fromFunction1(onVolume))
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactHowler.mod.Props
}

