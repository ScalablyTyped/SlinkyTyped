package typingsSlinky.cathoQuantum.rangeSliderMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.cathoQuantum.anon.BaseFontSizeColors
import typingsSlinky.cathoQuantum.anon.From
import typingsSlinky.cathoQuantum.anon.LabelValue
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

@js.native
trait RangeSliderProps extends js.Object {
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[Double | From] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var marks: js.UndefOr[js.Array[LabelValue]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var onChangeCommitted: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var step: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[BaseFontSizeColors] = js.native
  var tipFormatter: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double], String]
  ] = js.native
  var track: js.UndefOr[normal | `false` | inverted] = js.native
  var value: js.UndefOr[Double | From] = js.native
  var valueLabelDisplay: js.UndefOr[auto | on | off] = js.native
}

object RangeSliderProps {
  @scala.inline
  def apply(): RangeSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSliderProps]
  }
  @scala.inline
  implicit class RangeSliderPropsOps[Self <: RangeSliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-labelledby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Double | From): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMarks(value: js.Array[LabelValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeCommitted(value: ChangeEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCommitted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeCommitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCommitted")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: BaseFontSizeColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTipFormatter(value: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTipFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: normal | `false` | inverted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | From): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLabelDisplay(value: auto | on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLabelDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLabelDisplay")(js.undefined)
        ret
    }
  }
  
}

