package typingsSlinky.cathoQuantum.rangeSliderMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.cathoQuantum.AnonBaseFontSizeColors
import typingsSlinky.cathoQuantum.AnonFrom
import typingsSlinky.cathoQuantum.AnonLabelValue
import typingsSlinky.cathoQuantum.cathoQuantumBooleans.`false`
import typingsSlinky.cathoQuantum.cathoQuantumStrings.auto
import typingsSlinky.cathoQuantum.cathoQuantumStrings.inverted
import typingsSlinky.cathoQuantum.cathoQuantumStrings.normal
import typingsSlinky.cathoQuantum.cathoQuantumStrings.off
import typingsSlinky.cathoQuantum.cathoQuantumStrings.on
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSliderProps extends js.Object {
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[Double | AnonFrom] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[js.Array[AnonLabelValue]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var onChangeCommitted: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSizeColors] = js.undefined
  var tipFormatter: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double], String]
  ] = js.undefined
  var track: js.UndefOr[normal | `false` | inverted] = js.undefined
  var value: js.UndefOr[Double | AnonFrom] = js.undefined
  var valueLabelDisplay: js.UndefOr[auto | on | off] = js.undefined
}

object RangeSliderProps {
  @scala.inline
  def apply(
    `aria-labelledby`: String = null,
    defaultValue: Double | AnonFrom = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
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
    valueLabelDisplay: auto | on | off = null
  ): RangeSliderProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[RangeSliderProps]
  }
}

