package typingsSlinky.reactSwipeableViews.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableViewsProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var animateHeight: js.UndefOr[Boolean] = js.native
  var animateTransitions: js.UndefOr[Boolean] = js.native
  var axis: js.UndefOr[AxisType] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /*
    * This is the config used to disable lazy loading, if true it will render all the views in first rendering.
    */
  var disableLazyLoading: js.UndefOr[Boolean] = js.native
  var enableMouseEvents: js.UndefOr[Boolean] = js.native
  var hysteresis: js.UndefOr[Double] = js.native
  var ignoreNativeScroll: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.native
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.native
  @JSName("onTransitionEnd")
  var onTransitionEnd_SwipeableViewsProps: js.UndefOr[OnTransitionEndCallback] = js.native
  var resistance: js.UndefOr[Boolean] = js.native
  var slideClassName: js.UndefOr[String] = js.native
  var slideStyle: js.UndefOr[CSSProperties] = js.native
  var springConfig: js.UndefOr[SpringConfig] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object SwipeableViewsProps {
  @scala.inline
  def apply(): SwipeableViewsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableViewsProps]
  }
  @scala.inline
  implicit class SwipeableViewsPropsOps[Self <: SwipeableViewsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateTransitions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: AxisType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLazyLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLazyLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLazyLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLazyLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withHysteresis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hysteresis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHysteresis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hysteresis")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreNativeScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNativeScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNativeScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNativeScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChangeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwitching")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSwitching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwitching")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withResistance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistance")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringConfig(value: SpringConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

