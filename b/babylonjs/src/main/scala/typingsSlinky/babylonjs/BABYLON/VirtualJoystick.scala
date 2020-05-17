package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualJoystick extends js.Object {
  var _action: js.Any = js.native
  var _axisTargetedByLeftAndRight: js.Any = js.native
  var _axisTargetedByUpAndDown: js.Any = js.native
  var _deltaJoystickVector: js.Any = js.native
  var _drawVirtualJoystick: js.Any = js.native
  var _inversedSensibility: js.Any = js.native
  var _joystickColor: js.Any = js.native
  var _joystickPointerID: js.Any = js.native
  var _joystickPointerPos: js.Any = js.native
  var _joystickPointerStartPos: js.Any = js.native
  var _joystickPreviousPointerPos: js.Any = js.native
  var _joystickSensibility: js.Any = js.native
  var _leftJoystick: js.Any = js.native
  var _onPointerDown: js.Any = js.native
  var _onPointerDownHandlerRef: js.Any = js.native
  var _onPointerMove: js.Any = js.native
  var _onPointerMoveHandlerRef: js.Any = js.native
  var _onPointerUp: js.Any = js.native
  var _onPointerUpHandlerRef: js.Any = js.native
  var _onResize: js.Any = js.native
  var _touches: js.Any = js.native
  /**
    * Gets the offset value for the position (ie. the change of the position value)
    */
  var deltaPosition: Vector3 = js.native
  /**
    * Gets a boolean indicating if the virtual joystick was pressed
    */
  var pressed: Boolean = js.native
  /**
    * Gets or sets a boolean indicating that left and right values must be inverted
    */
  var reverseLeftRight: Boolean = js.native
  /**
    * Gets or sets a boolean indicating that up and down values must be inverted
    */
  var reverseUpDown: Boolean = js.native
  /**
    * Release internal HTML canvas
    */
  def releaseCanvas(): Unit = js.native
  /**
    * Defines a callback to call when the joystick is touched
    * @param action defines the callback
    */
  def setActionOnTouch(action: js.Function0[_]): Unit = js.native
  /**
    * Defines which axis you'd like to control for left & right
    * @param axis defines the axis to use
    */
  def setAxisForLeftRight(axis: JoystickAxis): Unit = js.native
  /**
    * Defines which axis you'd like to control for up & down
    * @param axis defines the axis to use
    */
  def setAxisForUpDown(axis: JoystickAxis): Unit = js.native
  /**
    * Change the color of the virtual joystick
    * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
    */
  def setJoystickColor(newColor: String): Unit = js.native
  /**
    * Defines joystick sensibility (ie. the ratio beteen a physical move and virtual joystick position change)
    * @param newJoystickSensibility defines the new sensibility
    */
  def setJoystickSensibility(newJoystickSensibility: Double): Unit = js.native
}

object VirtualJoystick {
  @scala.inline
  def apply(
    _action: js.Any,
    _axisTargetedByLeftAndRight: js.Any,
    _axisTargetedByUpAndDown: js.Any,
    _deltaJoystickVector: js.Any,
    _drawVirtualJoystick: js.Any,
    _inversedSensibility: js.Any,
    _joystickColor: js.Any,
    _joystickPointerID: js.Any,
    _joystickPointerPos: js.Any,
    _joystickPointerStartPos: js.Any,
    _joystickPreviousPointerPos: js.Any,
    _joystickSensibility: js.Any,
    _leftJoystick: js.Any,
    _onPointerDown: js.Any,
    _onPointerDownHandlerRef: js.Any,
    _onPointerMove: js.Any,
    _onPointerMoveHandlerRef: js.Any,
    _onPointerUp: js.Any,
    _onPointerUpHandlerRef: js.Any,
    _onResize: js.Any,
    _touches: js.Any,
    deltaPosition: Vector3,
    pressed: Boolean,
    releaseCanvas: () => Unit,
    reverseLeftRight: Boolean,
    reverseUpDown: Boolean,
    setActionOnTouch: js.Function0[_] => Unit,
    setAxisForLeftRight: JoystickAxis => Unit,
    setAxisForUpDown: JoystickAxis => Unit,
    setJoystickColor: String => Unit,
    setJoystickSensibility: Double => Unit
  ): VirtualJoystick = {
    val __obj = js.Dynamic.literal(_action = _action.asInstanceOf[js.Any], _axisTargetedByLeftAndRight = _axisTargetedByLeftAndRight.asInstanceOf[js.Any], _axisTargetedByUpAndDown = _axisTargetedByUpAndDown.asInstanceOf[js.Any], _deltaJoystickVector = _deltaJoystickVector.asInstanceOf[js.Any], _drawVirtualJoystick = _drawVirtualJoystick.asInstanceOf[js.Any], _inversedSensibility = _inversedSensibility.asInstanceOf[js.Any], _joystickColor = _joystickColor.asInstanceOf[js.Any], _joystickPointerID = _joystickPointerID.asInstanceOf[js.Any], _joystickPointerPos = _joystickPointerPos.asInstanceOf[js.Any], _joystickPointerStartPos = _joystickPointerStartPos.asInstanceOf[js.Any], _joystickPreviousPointerPos = _joystickPreviousPointerPos.asInstanceOf[js.Any], _joystickSensibility = _joystickSensibility.asInstanceOf[js.Any], _leftJoystick = _leftJoystick.asInstanceOf[js.Any], _onPointerDown = _onPointerDown.asInstanceOf[js.Any], _onPointerDownHandlerRef = _onPointerDownHandlerRef.asInstanceOf[js.Any], _onPointerMove = _onPointerMove.asInstanceOf[js.Any], _onPointerMoveHandlerRef = _onPointerMoveHandlerRef.asInstanceOf[js.Any], _onPointerUp = _onPointerUp.asInstanceOf[js.Any], _onPointerUpHandlerRef = _onPointerUpHandlerRef.asInstanceOf[js.Any], _onResize = _onResize.asInstanceOf[js.Any], _touches = _touches.asInstanceOf[js.Any], deltaPosition = deltaPosition.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], releaseCanvas = js.Any.fromFunction0(releaseCanvas), reverseLeftRight = reverseLeftRight.asInstanceOf[js.Any], reverseUpDown = reverseUpDown.asInstanceOf[js.Any], setActionOnTouch = js.Any.fromFunction1(setActionOnTouch), setAxisForLeftRight = js.Any.fromFunction1(setAxisForLeftRight), setAxisForUpDown = js.Any.fromFunction1(setAxisForUpDown), setJoystickColor = js.Any.fromFunction1(setJoystickColor), setJoystickSensibility = js.Any.fromFunction1(setJoystickSensibility))
    __obj.asInstanceOf[VirtualJoystick]
  }
  @scala.inline
  implicit class VirtualJoystickOps[Self <: VirtualJoystick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_action(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_axisTargetedByLeftAndRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_axisTargetedByLeftAndRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_axisTargetedByUpAndDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_axisTargetedByUpAndDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_deltaJoystickVector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deltaJoystickVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_drawVirtualJoystick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_drawVirtualJoystick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_inversedSensibility(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_inversedSensibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_joystickColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_joystickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_joystickPointerID(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_joystickPointerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_joystickPointerPos(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_joystickPointerPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_joystickPointerStartPos(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_joystickPointerStartPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_joystickPreviousPointerPos(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_joystickPreviousPointerPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_joystickSensibility(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_joystickSensibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_leftJoystick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_leftJoystick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onPointerDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onPointerDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onPointerDownHandlerRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onPointerDownHandlerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onPointerMove(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onPointerMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onPointerMoveHandlerRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onPointerMoveHandlerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onPointerUp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onPointerUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onPointerUpHandlerRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onPointerUpHandlerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onResize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_touches(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_touches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseCanvas(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCanvas")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReverseLeftRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseLeftRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverseUpDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseUpDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetActionOnTouch(value: js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActionOnTouch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAxisForLeftRight(value: JoystickAxis => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxisForLeftRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAxisForUpDown(value: JoystickAxis => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxisForUpDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetJoystickColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJoystickColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetJoystickSensibility(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJoystickSensibility")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

