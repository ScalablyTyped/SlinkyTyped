package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.sliderMod.SliderMarks
import typingsSlinky.antd.sliderMod.SliderProps
import typingsSlinky.antd.sliderMod.SliderValue
import typingsSlinky.antd.sliderMod.default
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, style */
  def apply(
    defaultValue: SliderValue = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    getTooltipPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: SliderMarks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ SliderValue => Unit = null,
    onChange: /* value */ SliderValue => Unit = null,
    prefixCls: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    tipFormatter: /* value */ Double => TagMod[Any] = null,
    tooltipPlacement: TooltipPlacement = null,
    tooltipPrefixCls: String = null,
    tooltipVisible: js.UndefOr[Boolean] = js.undefined,
    value: SliderValue = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (getTooltipPopupContainer != null) __obj.updateDynamic("getTooltipPopupContainer")(js.Any.fromFunction1(getTooltipPopupContainer))
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement.asInstanceOf[js.Any])
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipVisible)) __obj.updateDynamic("tooltipVisible")(tooltipVisible.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.sliderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SliderProps
}

