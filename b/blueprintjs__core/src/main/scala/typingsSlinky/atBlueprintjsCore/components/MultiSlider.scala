package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typingsSlinky.atBlueprintjsCore.libEsmComponentsSliderMultiSliderMod.IMultiSliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MultiSlider] {
  @JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange */
  def apply(
    defaultTrackIntent: Intent = null,
    labelPrecision: Int | Double = null,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | typingsSlinky.react.reactMod._Global_.JSX.Element]) = null,
    labelStepSize: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onRelease: /* values */ js.Array[Double] => Unit = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MultiSlider] = {
    val __obj = js.Dynamic.literal()
    if (defaultTrackIntent != null) __obj.updateDynamic("defaultTrackIntent")(defaultTrackIntent.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (labelStepSize != null) __obj.updateDynamic("labelStepSize")(labelStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MultiSlider] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.MultiSlider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IMultiSliderProps
}

