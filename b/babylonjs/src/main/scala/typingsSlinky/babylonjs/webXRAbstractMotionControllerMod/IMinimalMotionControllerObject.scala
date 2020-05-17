package typingsSlinky.babylonjs.webXRAbstractMotionControllerMod

import typingsSlinky.babylonjs.anon.Pressed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMinimalMotionControllerObject extends js.Object {
  /**
    * Available axes of this controller
    */
  var axes: js.Array[Double] = js.native
  /**
    * An array of available buttons
    */
  var buttons: js.Array[Pressed] = js.native
}

object IMinimalMotionControllerObject {
  @scala.inline
  def apply(axes: js.Array[Double], buttons: js.Array[Pressed]): IMinimalMotionControllerObject = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMinimalMotionControllerObject]
  }
  @scala.inline
  implicit class IMinimalMotionControllerObjectOps[Self <: IMinimalMotionControllerObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[Pressed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

