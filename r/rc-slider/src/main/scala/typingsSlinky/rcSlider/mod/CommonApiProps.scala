package typingsSlinky.rcSlider.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonApiProps extends js.Object {
  /**
    * The style used for the active dots.
    */
  var activeDotStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Additional CSS class for the root DOM node
    *  @default ''
    */
  var className: js.UndefOr[String] = js.native
  /**
    * If true, handles can't be moved.
    *  @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The style used for the dots.
    */
  var dotStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * When the step value is greater than 1, you can set the dots to true if you want to render the slider with dots.
    *  @default false
    */
  var dots: js.UndefOr[Boolean] = js.native
  /**
    * A handle generator which could be used to customized handle.
    */
  var handle: js.UndefOr[js.Function1[/* props */ js.Any, TagMod[Any]]] = js.native
  /**
    * The style used for handle. (both for slider(Object) and range(Array of Object), the array will be used for mutli handle follow element order)
    */
  var handleStyle: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.native
  /**
    * If the value is true, it means a continuous value interval, otherwise, it is a independent value.
    *  @default true
    */
  var included: js.UndefOr[Boolean] = js.native
  /**
    * Marks on the slider. The key determines the position, and the value determines what will show.
    * If you want to set the style of a specific mark point, the value should be an object which contains style and label properties.
    *  @default '{}' | {number: { style, label }}
    */
  var marks: js.UndefOr[Marks] = js.native
  /**
    * The maximum value of the slider
    *  @default 100
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value of the slider
    *  @default 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The style used for the track base color.
    */
  var railStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Reverse the direction of the slider.
    * From Left to Right To Right to Left
    * @default false
    */
  var reverse: js.UndefOr[Boolean] = js.native
  /**
    * Value to be added or subtracted on each step the slider makes. Must be greater than zero, and max - min should be evenly divisible by the step value.
    *  @default 1
    */
  var step: js.UndefOr[Double | Null] = js.native
  /**
    * The style used for the background and container. (both for slider(Object) and range(Array of Object), the array will be used for mutli handle follow element order)
    */
  var style: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.native
  /**
    * @deprecated in version ^6.0.0. Use rc-tooltip
    * Tooltip formatter
    */
  var tipFormatter: js.UndefOr[(js.Function1[/* value */ js.Any, js.UndefOr[_]]) | Null] = js.native
  /**
    * @deprecated in version ^6.0.0. Use rc-tooltip
    * Tooltip transition class name
    */
  var tipTransitionName: js.UndefOr[String] = js.native
  /**
    * The style used for track. (both for slider(Object) and range(Array of Object), the array will be used for mutli track follow element order)
    */
  var trackStyle: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.native
  /**
    * If vertical is true, the slider will be vertical.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object CommonApiProps {
  @scala.inline
  def apply(): CommonApiProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonApiProps]
  }
  @scala.inline
  implicit class CommonApiPropsOps[Self <: CommonApiProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDotStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withDotStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: /* props */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleStyle(value: js.Array[CSSProperties] | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIncluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("included")(js.undefined)
        ret
    }
    @scala.inline
    def withMarks(value: Marks): Self = {
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
    def withRailStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
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
    def withStepNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(null)
        ret
    }
    @scala.inline
    def withStyle(value: js.Array[CSSProperties] | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTipFormatter(value: /* value */ js.Any => js.UndefOr[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTipFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withTipFormatterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(null)
        ret
    }
    @scala.inline
    def withTipTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipTransitionName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackStyle(value: js.Array[CSSProperties] | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

