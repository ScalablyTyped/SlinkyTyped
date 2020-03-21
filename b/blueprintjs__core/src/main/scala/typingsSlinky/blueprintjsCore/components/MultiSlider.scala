package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.multiSliderMod.IMultiSliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.MultiSlider] {
  @JSImport("@blueprintjs/core", "MultiSlider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    defaultTrackIntent: Intent = null,
    intent: Intent = null,
    labelPrecision: Int | Double = null,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | ReactElement]) = null,
    labelStepSize: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* values */ js.Array[Double] => Unit = null,
    onRelease: /* values */ js.Array[Double] => Unit = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.MultiSlider] = {
    val __obj = js.Dynamic.literal()
    if (defaultTrackIntent != null) __obj.updateDynamic("defaultTrackIntent")(defaultTrackIntent.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (labelStepSize != null) __obj.updateDynamic("labelStepSize")(labelStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.MultiSlider] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsCore.mod.MultiSlider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IMultiSliderProps
}

