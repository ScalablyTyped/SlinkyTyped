package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardInputConfig extends js.Object {
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default it is empty.
    */
  var capture: js.UndefOr[js.Array[integer]] = js.native
  /**
    * Where the Keyboard Manager listens for keyboard input events.
    */
  var target: js.UndefOr[js.Any] = js.native
}

object KeyboardInputConfig {
  @scala.inline
  def apply(): KeyboardInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardInputConfig]
  }
  @scala.inline
  implicit class KeyboardInputConfigOps[Self <: KeyboardInputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapture(value: js.Array[integer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

