package typingsSlinky.reactGamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Threshold below which the axis values will be rounded to 0.0 Default: 0.08
    */
  var deadZone: js.UndefOr[Double] = js.native
  /**
    * The index of the gamepad to use, from 0 to 4 Default: 0
    */
  var gamepadIndex: js.UndefOr[Double] = js.native
  /**
    * Layout to use, from Gamepad.layouts. For now, only Gamepad.layouts.XBOX exists Default: Gamepad.layouts.XBOX
    */
  var layout: js.UndefOr[Layout] = js.native
  /**
    * triggered when the A button is pressed.
    */
  var onA: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * triggered when an axis is changed.
    */
  var onAxisChange: js.UndefOr[
    js.Function3[/* axisName */ Axis, /* value */ Double, /* previousValue */ Double, Unit]
  ] = js.native
  /**
    * triggered when the B button is pressed.
    */
  var onB: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * triggered when a button is pushed or released.
    */
  var onButtonChange: js.UndefOr[js.Function2[/* buttonName */ Button, /* pressed */ Boolean, Unit]] = js.native
  /**
    * triggered when a button is pushed.
    */
  var onButtonDown: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.native
  /**
    * triggered when a button is released.
    */
  var onButtonUp: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.native
  /**
    * triggered when the gamepad connects. Will be Triggered at least once after the Gamepad component is mounted.
    */
  var onConnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.native
  /**
    * triggered when the gamepad disconnects.
    */
  var onDisconnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.native
  /**
    * Triggered when the D Pad Down button is pressed or the Left Stick is pushed down (above stickThreshold).
    */
  var onDown: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the LB button is pressed.
    */
  var onLB: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the LS button is pressed.
    */
  var onLS: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the LT button is pressed.
    */
  var onLT: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the D Pad Left button is pressed or the Left Stick is pushed left (above stickThreshold).
    */
  var onLeft: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the RB button is pressed.
    */
  var onRB: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the RS button is pressed.
    */
  var onRS: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the RT button is pressed.
    */
  var onRT: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the D Pad Right button is pressed or the Left Stick is pushed right (above stickThreshold).
    */
  var onRight: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the D Pad Up button is pressed or the Left Stick is pushed up (above stickThreshold).
    */
  var onUp: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * triggered when the X button is pressed.
    */
  var onX: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Triggered when the Y button is pressed.
    */
  var onY: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Threshold above which onUp, onDown,onLeft,onRight are Triggered for the left stick Default: 0.75
    */
  var stickThreshold: js.UndefOr[Double] = js.native
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
    def withDeadZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadZone")(js.undefined)
        ret
    }
    @scala.inline
    def withGamepadIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepadIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamepadIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepadIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnA(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onA")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAxisChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAxisChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAxisChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnB(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onB")(js.undefined)
        ret
    }
    @scala.inline
    def withOnButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnButtonChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnButtonDown(value: /* buttonName */ Button => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnButtonDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnButtonUp(value: /* buttonName */ Button => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnButtonUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onButtonUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: /* gamepadIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisconnect(value: /* gamepadIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLB(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLB")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLS(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLS")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLT(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLT")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLT")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeft(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRB(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRB")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRS(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRS")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRT(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRT")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRT")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnX(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onX")(js.undefined)
        ret
    }
    @scala.inline
    def withOnY(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onY")(js.undefined)
        ret
    }
    @scala.inline
    def withStickThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickThreshold")(js.undefined)
        ret
    }
  }
  
}

