package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonOriginalEventEventValue
import typingsSlinky.primereact.sliderMod.SliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactSliderMod.Slider] {
  @JSImport("primereact/slider", "Slider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id */
  def apply(
    ariaLabelledBy: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* e */ AnonOriginalEventEventValue => Unit = null,
    onSlideEnd: /* e */ AnonOriginalEventEventValue => Unit = null,
    orientation: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: js.Object = null,
    tabIndex: String = null,
    value: Double | (js.Tuple2[Double, Double]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactSliderMod.Slider] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSlideEnd != null) __obj.updateDynamic("onSlideEnd")(js.Any.fromFunction1(onSlideEnd))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactSliderMod.Slider] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.primereactSliderMod.Slider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SliderProps
}

