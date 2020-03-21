package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.cathoQuantum.AnonBaseFontSizeColors
import typingsSlinky.cathoQuantum.AnonFrom
import typingsSlinky.cathoQuantum.AnonLabelValue
import typingsSlinky.cathoQuantum.cathoQuantumBooleans.`false`
import typingsSlinky.cathoQuantum.cathoQuantumStrings.auto
import typingsSlinky.cathoQuantum.cathoQuantumStrings.inverted
import typingsSlinky.cathoQuantum.cathoQuantumStrings.normal
import typingsSlinky.cathoQuantum.cathoQuantumStrings.off
import typingsSlinky.cathoQuantum.cathoQuantumStrings.on
import typingsSlinky.cathoQuantum.rangeSliderMod.RangeSliderProps
import typingsSlinky.cathoQuantum.rangeSliderMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RangeSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@catho/quantum/RangeSlider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    `aria-labelledby`: String = null,
    defaultValue: Double | AnonFrom = null,
    marks: js.Array[AnonLabelValue] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    onChangeCommitted: ChangeEvent[HTMLInputElement] => Unit = null,
    step: Int | Double = null,
    theme: AnonBaseFontSizeColors = null,
    tipFormatter: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String = null,
    track: normal | `false` | inverted = null,
    value: Double | AnonFrom = null,
    valueLabelDisplay: auto | on | off = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCommitted != null) __obj.updateDynamic("onChangeCommitted")(js.Any.fromFunction1(onChangeCommitted))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction2(tipFormatter))
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueLabelDisplay != null) __obj.updateDynamic("valueLabelDisplay")(valueLabelDisplay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.cathoQuantum.rangeSliderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RangeSliderProps
}

