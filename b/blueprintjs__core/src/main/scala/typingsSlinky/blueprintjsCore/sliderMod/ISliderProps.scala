package typingsSlinky.blueprintjsCore.sliderMod

import typingsSlinky.blueprintjsCore.multiSliderMod.ISliderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderProps extends ISliderBaseProps {
  /**
    * Initial value of the slider. This determines the other end of the
    * track fill: from `initialValue` to `value`.
    * @default 0
    */
  var initialValue: js.UndefOr[Double] = js.native
  /** Callback invoked when the value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /** Callback invoked when the handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Value of slider.
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
}

object ISliderProps {
  @scala.inline
  def apply(): ISliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderProps]
  }
  @scala.inline
  implicit class ISliderPropsOps[Self <: ISliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ Double => Unit): Self = {
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
    def withOnRelease(value: /* value */ Double => Unit): Self = {
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
    def withValue(value: Double): Self = {
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

