package typingsSlinky.reactDashYoutube.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashYoutube.Anon_Data
import typingsSlinky.reactDashYoutube.Anon_DataTarget
import typingsSlinky.reactDashYoutube.Anon_Target
import typingsSlinky.reactDashYoutube.reactDashYoutubeMod.Options
import typingsSlinky.reactDashYoutube.reactDashYoutubeMod.YouTubeProps
import typingsSlinky.reactDashYoutube.reactDashYoutubeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashYoutube
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onError, onPause, onPlay */
  def apply(
    containerClassName: String = null,
    onEnd: /* event */ Anon_Data => Unit = null,
    onPlaybackQualityChange: /* event */ Anon_DataTarget => Unit = null,
    onPlaybackRateChange: /* event */ Anon_Data => Unit = null,
    onReady: /* event */ Anon_Target => Unit = null,
    onStateChange: /* event */ Anon_Data => Unit = null,
    opts: Options = null,
    videoId: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1(onPlaybackQualityChange))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(onPlaybackRateChange))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashYoutube.reactDashYoutubeMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = YouTubeProps
}

