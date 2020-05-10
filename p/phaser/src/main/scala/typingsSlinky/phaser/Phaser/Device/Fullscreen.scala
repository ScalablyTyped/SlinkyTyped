package typingsSlinky.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the full screen support of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.fullscreen` from within any Scene.
  */
@js.native
trait Fullscreen extends js.Object {
  /**
    * Does the browser support the Full Screen API?
    */
  var available: Boolean = js.native
  /**
    * If the browser supports the Full Screen API this holds the call you need to use to cancel it.
    */
  var cancel: String = js.native
  /**
    * Does the browser support access to the Keyboard during Full Screen mode?
    */
  var keyboard: Boolean = js.native
  /**
    * If the browser supports the Full Screen API this holds the call you need to use to activate it.
    */
  var request: String = js.native
}

object Fullscreen {
  @scala.inline
  def apply(available: Boolean, cancel: String, keyboard: Boolean, request: String): Fullscreen = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullscreen]
  }
  @scala.inline
  implicit class FullscreenOps[Self <: Fullscreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

