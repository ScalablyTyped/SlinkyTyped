package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.libSliderMod.SliderProps
import typingsSlinky.antdDashMobile.libSliderMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onChange */
  def apply(
    defaultValue: Int | Double = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    handleStyle: CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: NumberDictionary[String] = null,
    max: Int | Double = null,
    maximumTrackStyle: CSSProperties = null,
    min: Int | Double = null,
    minimumTrackStyle: CSSProperties = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Unit = null,
    prefixCls: String = null,
    railStyle: CSSProperties = null,
    step: Int | Double = null,
    tipFormatter: /* value */ js.UndefOr[String] => TagMod[Any] = null,
    trackStyle: CSSProperties = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maximumTrackStyle != null) __obj.updateDynamic("maximumTrackStyle")(maximumTrackStyle.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minimumTrackStyle != null) __obj.updateDynamic("minimumTrackStyle")(minimumTrackStyle.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdDashMobile.libSliderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SliderProps
}

