package typingsSlinky.reactCountup.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactCountup.anon.PauseResume
import typingsSlinky.reactCountup.anon.PauseResumeReset
import typingsSlinky.reactCountup.anon.Reset
import typingsSlinky.reactCountup.anon.Start
import typingsSlinky.reactCountup.anon.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* data */ RenderProps, ReactElement]] = js.native
  /**
    * CSS class name of the span element.
    * Note: This won't be applied when using CountUp with render props.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Specifies decimal character.
    * Default: .
    */
  var decimal: js.UndefOr[String] = js.native
  /**
    * Amount of decimals to display.
    * Default: 0
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * Delay in seconds before starting the transition.
    * Default: null
    * Note: delay={0} will automatically start the count up.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Duration in seconds.
    * Default: 2
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Easing function. http://robertpenner.com/easing for more details.
    * Default: easeInExpo
    */
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Unit]
  ] = js.native
  /**
    * Target value.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Function to customize the formatting of the number
    */
  var formattingFn: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  /**
    * Callback function on transition end.
    */
  var onEnd: js.UndefOr[js.Function1[/* providedFn */ PauseResume, Unit]] = js.native
  /**
    * Callback function on pause or resume.
    */
  var onPauseResume: js.UndefOr[js.Function0[js.Function1[/* providedFn */ Start, Unit]]] = js.native
  /**
    * Callback function on reset.
    */
  var onReset: js.UndefOr[js.Function0[js.Function1[/* providedFn */ Update, Unit]]] = js.native
  /**
    * Callback function on transition start.
    */
  var onStart: js.UndefOr[js.Function1[/* providedFn */ Reset, Unit]] = js.native
  /**
    * Callback function on update.
    */
  var onUpdate: js.UndefOr[js.Function1[/* providedFn */ PauseResumeReset, Unit]] = js.native
  /**
    * Static text before the transitioning value.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Save previously ended number to start every new animation from it.
    * Default: false
    */
  var preserveValue: js.UndefOr[Boolean] = js.native
  /**
    * Forces count up transition on every component update.
    * Default: false
    */
  var redraw: js.UndefOr[Boolean] = js.native
  /**
    * Specifies character of thousands separator.
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Initial value.
    * Default: 0
    */
  var start: js.UndefOr[Double] = js.native
  /**
    * Use for start counter on mount for hook usage.
    * Default: true
    */
  var startOnMount: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Static text after the transitioning value.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Enables easing. Set to false for a linear transition.
    * Default: true
    */
  var useEasing: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* data */ RenderProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEasingFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattingFn(value: /* value */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormattingFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattingFn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* providedFn */ PauseResume => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPauseResume(value: () => js.Function1[/* providedFn */ Start, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseResume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPauseResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseResume")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: () => js.Function1[/* providedFn */ Update, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: /* providedFn */ Reset => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* providedFn */ PauseResumeReset => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRedraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEasing")(js.undefined)
        ret
    }
  }
  
}

