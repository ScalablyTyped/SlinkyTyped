package typingsSlinky.reactYoutube.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactYoutube.AnonData
import typingsSlinky.reactYoutube.AnonDataTarget
import typingsSlinky.reactYoutube.AnonTarget
import typingsSlinky.reactYoutube.mod.Options
import typingsSlinky.reactYoutube.mod.YouTubeProps
import typingsSlinky.reactYoutube.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactYoutube
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    containerClassName: String = null,
    onEnd: /* event */ AnonData => Unit = null,
    onError: /* event */ AnonData => Unit = null,
    onPause: /* event */ AnonData => Unit = null,
    onPlay: /* event */ AnonData => Unit = null,
    onPlaybackQualityChange: /* event */ AnonDataTarget => Unit = null,
    onPlaybackRateChange: /* event */ AnonData => Unit = null,
    onReady: /* event */ AnonTarget => Unit = null,
    onStateChange: /* event */ AnonData => Unit = null,
    opts: Options = null,
    videoId: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1(onPlaybackQualityChange))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(onPlaybackRateChange))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactYoutube.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = YouTubeProps
}

