package typingsSlinky.protonNative.mod

import typingsSlinky.protonNative.AnonButtons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaProps extends AreaBaseProps {
  /**
    * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.native
  /**
    * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.native
  /**
    * Whether the area can be seen.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Called when the mouse enters the area.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the mouse leaves the area.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the mouse is moved over the area
    */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ AnonButtons, Unit]] = js.native
  /**
    * **Not working at the moment.**
    *
    * Called when releasing a mouse button over the area.
    */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Whether the area can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object AreaProps {
  @scala.inline
  def apply(): AreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaProps]
  }
  @scala.inline
  implicit class AreaPropsOps[Self <: AreaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnKeyDown(value: /* event */ KeyboardEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: /* event */ KeyboardEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* event */ AnonButtons => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

