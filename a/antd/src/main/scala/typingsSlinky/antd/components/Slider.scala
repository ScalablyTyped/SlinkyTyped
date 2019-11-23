package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esSliderMod.SliderMarks
import typingsSlinky.antd.esSliderMod.SliderProps
import typingsSlinky.antd.esSliderMod.SliderValue
import typingsSlinky.antd.esSliderMod.default
import typingsSlinky.antd.esTooltipMod.TooltipPlacement
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esSliderMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, defaultValue, disabled, id, onChange, value */
  def apply(
    dots: js.UndefOr[Boolean] = js.undefined,
    getTooltipPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: SliderMarks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ SliderValue => Unit = null,
    prefixCls: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: CSSProperties = null,
    tipFormatter: /* value */ Double => TagMod[Any] = null,
    tooltipPlacement: TooltipPlacement = null,
    tooltipPrefixCls: String = null,
    tooltipVisible: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (getTooltipPopupContainer != null) __obj.updateDynamic("getTooltipPopupContainer")(js.Any.fromFunction1(getTooltipPopupContainer))
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement.asInstanceOf[js.Any])
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipVisible)) __obj.updateDynamic("tooltipVisible")(tooltipVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SliderProps
}

