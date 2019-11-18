package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.SliderProps
import typingsSlinky.materialDashUi.materialDashUiStrings.`x-reverse`
import typingsSlinky.materialDashUi.materialDashUiStrings.`y-reverse`
import typingsSlinky.materialDashUi.materialDashUiStrings.x
import typingsSlinky.materialDashUi.materialDashUiStrings.y
import typingsSlinky.materialDashUi.sliderMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: disabled, name, onBlur, onDragStart, onFocus, required */
object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.sliderMod.default].asInstanceOf[String | js.Object]
  def apply(
    axis: x | `x-reverse` | y | `y-reverse` = null,
    defaultValue: Int | Double = null,
    description: String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: (/* e */ SyntheticMouseEvent[js.Object], /* value */ Double) => Unit = null,
    onDragStop: SyntheticMouseEvent[js.Object] => Unit = null,
    sliderStyle: CSSProperties = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    value: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1(onDragStop))
    if (sliderStyle != null) __obj.updateDynamic("sliderStyle")(sliderStyle.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SliderProps
}

