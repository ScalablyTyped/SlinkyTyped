package typingsSlinky.reactDashMic.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMic.reactDashMicMod.ReactMicProps
import typingsSlinky.reactDashMic.reactDashMicStrings.frequencyBars
import typingsSlinky.reactDashMic.reactDashMicStrings.sinewave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMic
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashMic.reactDashMicMod.ReactMic] {
  @JSImport("react-mic", "ReactMic")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    backgroundColor: String = null,
    onData: /* recordedData */ Blob => Unit = null,
    onStop: /* recordedData */ Blob => Unit = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    record: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    visualSetting: sinewave | frequencyBars = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashMic.reactDashMicMod.ReactMic] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (onData != null) __obj.updateDynamic("onData")(js.Any.fromFunction1(onData))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (!js.isUndefined(record)) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (visualSetting != null) __obj.updateDynamic("visualSetting")(visualSetting.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashMic.reactDashMicMod.ReactMic] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashMic.reactDashMicMod.ReactMic](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactMicProps
}

