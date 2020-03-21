package typingsSlinky.reactRangeslider.components

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactRangeslider.mod.SliderProps
import typingsSlinky.reactRangeslider.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRangeslider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-rangeslider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    value: Double,
    format: /* value */ Double => js.UndefOr[String | Double] = null,
    handleLabel: String = null,
    labels: NumberDictionary[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    onChangeComplete: /* value */ Double => Unit = null,
    onChangeStart: /* value */ Double => Unit = null,
    orientation: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (handleLabel != null) __obj.updateDynamic("handleLabel")(handleLabel.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (onChangeStart != null) __obj.updateDynamic("onChangeStart")(js.Any.fromFunction1(onChangeStart))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SliderProps
}

