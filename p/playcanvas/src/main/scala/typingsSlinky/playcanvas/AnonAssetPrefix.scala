package typingsSlinky.playcanvas

import typingsSlinky.playcanvas.pc.ElementInput
import typingsSlinky.playcanvas.pc.GamePads
import typingsSlinky.playcanvas.pc.Keyboard
import typingsSlinky.playcanvas.pc.Mouse
import typingsSlinky.playcanvas.pc.TouchDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssetPrefix extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.native
  var elementInput: js.UndefOr[ElementInput] = js.native
  var gamepads: js.UndefOr[GamePads] = js.native
  var graphicsDeviceOptions: js.UndefOr[js.Any] = js.native
  var keyboard: js.UndefOr[Keyboard] = js.native
  var mouse: js.UndefOr[Mouse] = js.native
  var scriptPrefix: js.UndefOr[String] = js.native
  var scriptsOrder: js.UndefOr[js.Array[String]] = js.native
  var touch: js.UndefOr[TouchDevice] = js.native
}

object AnonAssetPrefix {
  @scala.inline
  def apply(): AnonAssetPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAssetPrefix]
  }
  @scala.inline
  implicit class AnonAssetPrefixOps[Self <: AnonAssetPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withElementInput(value: ElementInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementInput")(js.undefined)
        ret
    }
    @scala.inline
    def withGamepads(value: GamePads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamepads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphicsDeviceOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphicsDeviceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphicsDeviceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphicsDeviceOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Keyboard): Self = {
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
    def withMouse(value: Mouse): Self = {
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
    def withScriptPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptsOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptsOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptsOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptsOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: TouchDevice): Self = {
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
  }
  
}

