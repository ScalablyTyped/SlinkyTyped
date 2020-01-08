package typingsSlinky.rcDashSlider.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashSlider.rcDashSliderMod.Marks
import typingsSlinky.rcDashSlider.rcDashSliderMod.RangeProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Range
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rcDashSlider.rcDashSliderMod.Range] {
  @JSImport("rc-slider", "Range")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange */
  def apply(
    activeDotStyle: CSSProperties = null,
    allowCross: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    defaultValue: js.Array[Double] = null,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => TagMod[Any] = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ js.Array[Double] => Unit = null,
    onBeforeChange: /* value */ js.Array[Double] => Unit = null,
    pushable: Boolean | Double = null,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tabIndex: js.Array[Double] = null,
    tipFormatter: /* value */ js.Any => js.UndefOr[_] = null,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null,
    value: js.Array[Double] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rcDashSlider.rcDashSliderMod.Range] = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCross)) __obj.updateDynamic("allowCross")(allowCross.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1(handle))
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (pushable != null) __obj.updateDynamic("pushable")(pushable.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.rcDashSlider.rcDashSliderMod.Range] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcDashSlider.rcDashSliderMod.Range](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RangeProps
}

