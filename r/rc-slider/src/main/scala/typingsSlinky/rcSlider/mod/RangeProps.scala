package typingsSlinky.rcSlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeProps extends CommonApiProps {
  /**
    * allowCross could be set as true to allow those handles to cross.
    *  @default true
    */
  var allowCross: js.UndefOr[Boolean] = js.native
  /**
    * Determine how many ranges to render, and multiple handles will be rendered (number + 1).
    *  @default 1
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Set initial positions of handles.
    *  @default [0,0]
    */
  var defaultValue: js.UndefOr[js.Array[Double]] = js.native
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
  /**
    * onChange will be triggered while the value of Slider changing.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
  /**
    * pushable could be set as true to allow pushing of surrounding handles when moving an handle. When set to a number, the number will be the minimum ensured distance between handles.
    *  @default true
    */
  var pushable: js.UndefOr[Boolean | Double] = js.native
  /**
    * Set the tabIndex of each handle.
    * @default [0,0]
    */
  var tabIndex: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Set current positions of handles.
    */
  var value: js.UndefOr[js.Array[Double]] = js.native
}

object RangeProps {
  @scala.inline
  def apply(): RangeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeProps]
  }
  @scala.inline
  implicit class RangePropsOps[Self <: RangeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCross(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCross: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCross")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Array[Double]): Self = {
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
    def withOnAfterChange(value: /* value */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeChange(value: /* value */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.Array[Double] => Unit): Self = {
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
    def withPushable(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushable")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[Double]): Self = {
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

