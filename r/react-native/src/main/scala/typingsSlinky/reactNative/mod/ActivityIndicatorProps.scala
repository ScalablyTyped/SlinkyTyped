package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.large_
import typingsSlinky.reactNative.reactNativeStrings.small_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityIndicatorProps extends ViewProps {
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
    * Size of the indicator.
    * Small has a height of 20, large has a height of 36.
    *
    * enum('small', 'large')
    */
  var size: js.UndefOr[Double | small_ | large_] = js.native
}

object ActivityIndicatorProps {
  @scala.inline
  def apply(): ActivityIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorProps]
  }
  @scala.inline
  implicit class ActivityIndicatorPropsOps[Self <: ActivityIndicatorProps] (val x: Self) extends AnyVal {
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
    def withSize(value: Double | small_ | large_): Self = {
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

