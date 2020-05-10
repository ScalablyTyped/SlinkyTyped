package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfig extends js.Object {
  /**
    * The maximum number of touch pointers. See {@link Phaser.Input.InputManager#pointers}.
    */
  var activePointers: js.UndefOr[integer] = js.native
  /**
    * Gamepad input configuration. `true` enables gamepad input.
    */
  var gamepad: js.UndefOr[Boolean | GamepadInputConfig] = js.native
  /**
    * Keyboard input configuration. `true` uses the default configuration and `false` disables keyboard input.
    */
  var keyboard: js.UndefOr[Boolean | KeyboardInputConfig] = js.native
  /**
    * Mouse input configuration. `true` uses the default configuration and `false` disables mouse input.
    */
  var mouse: js.UndefOr[Boolean | MouseInputConfig] = js.native
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  var smoothFactor: js.UndefOr[Double] = js.native
  /**
    * Touch input configuration. `true` uses the default configuration and `false` disables touch input.
    */
  var touch: js.UndefOr[Boolean | TouchInputConfig] = js.native
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  var windowEvents: js.UndefOr[Boolean] = js.native
}

object InputConfig {
  @scala.inline
  def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  @scala.inline
  implicit class InputConfigOps[Self <: InputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePointers(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePointers")(js.undefined)
        ret
    }
    @scala.inline
    def withGamepad(value: Boolean | GamepadInputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamepad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepad")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean | KeyboardInputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withMouse(value: Boolean | MouseInputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: Boolean | TouchInputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowEvents")(js.undefined)
        ret
    }
  }
  
}

