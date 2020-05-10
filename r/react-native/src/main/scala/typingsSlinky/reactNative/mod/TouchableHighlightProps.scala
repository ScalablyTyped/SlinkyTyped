package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchableHighlightProps extends TouchableWithoutFeedbackProps {
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The color of the underlay that will show through when the touch is active.
    */
  var underlayColor: js.UndefOr[String] = js.native
}

object TouchableHighlightProps {
  @scala.inline
  def apply(): TouchableHighlightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableHighlightProps]
  }
  @scala.inline
  implicit class TouchableHighlightPropsOps[Self <: TouchableHighlightProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHideUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShowUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

