package typingsSlinky.babylonjs.gamepadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadButtonChanges extends js.Object {
  /**
    * Called when a gamepad has been changed
    */
  var changed: Boolean = js.native
  /**
    * Called when a gamepad press event has been triggered
    */
  var pressChanged: Boolean = js.native
  /**
    * Called when a touch event has been triggered
    */
  var touchChanged: Boolean = js.native
  /**
    * Called when a value has changed
    */
  var valueChanged: Boolean = js.native
}

object GamepadButtonChanges {
  @scala.inline
  def apply(changed: Boolean, pressChanged: Boolean, touchChanged: Boolean, valueChanged: Boolean): GamepadButtonChanges = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], pressChanged = pressChanged.asInstanceOf[js.Any], touchChanged = touchChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadButtonChanges]
  }
  @scala.inline
  implicit class GamepadButtonChangesOps[Self <: GamepadButtonChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

