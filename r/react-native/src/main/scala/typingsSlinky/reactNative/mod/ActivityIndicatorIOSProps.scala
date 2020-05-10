package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonNativeEvent
import typingsSlinky.reactNative.reactNativeStrings.large_
import typingsSlinky.reactNative.reactNativeStrings.small_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityIndicatorIOSProps extends ViewProps {
  /**
    * Whether to show the indicator (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.native
  /**
    * The foreground color of the spinner (default is gray).
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Whether the indicator should hide when not animating (true by default).
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.native
  /**
    * Invoked on mount and layout changes with
    */
  @JSName("onLayout")
  var onLayout_ActivityIndicatorIOSProps: js.UndefOr[js.Function1[/* event */ AnonNativeEvent, Unit]] = js.native
  /**
    * Size of the indicator.
    * Small has a height of 20, large has a height of 36.
    *
    * enum('small', 'large')
    */
  var size: js.UndefOr[small_ | large_] = js.native
}

object ActivityIndicatorIOSProps {
  @scala.inline
  def apply(): ActivityIndicatorIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorIOSProps]
  }
  @scala.inline
  implicit class ActivityIndicatorIOSPropsOps[Self <: ActivityIndicatorIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHidesWhenStopped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesWhenStopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidesWhenStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesWhenStopped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: /* event */ AnonNativeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small_ | large_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

