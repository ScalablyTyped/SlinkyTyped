package typingsSlinky.blueprintjsCore.rangeSliderMod

import typingsSlinky.blueprintjsCore.multiSliderMod.ISliderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRangeSliderProps extends ISliderBaseProps {
  /** Callback invoked when the range value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.native
  /** Callback invoked when a handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.native
  /**
    * Range value of slider. Handles will be rendered at each position in the range.
    * @default [0, 10]
    */
  var value: js.UndefOr[NumberRange] = js.native
}

object IRangeSliderProps {
  @scala.inline
  def apply(): IRangeSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRangeSliderProps]
  }
  @scala.inline
  implicit class IRangeSliderPropsOps[Self <: IRangeSliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: /* value */ NumberRange => Unit): Self = {
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
    def withOnRelease(value: /* value */ NumberRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: NumberRange): Self = {
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
  }
  
}

