package typingsSlinky.babylonjs.webXRControllerComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRMotionControllerAxesValue extends js.Object {
  /**
    * The value of the x axis
    */
  var x: Double = js.native
  /**
    * The value of the y-axis
    */
  var y: Double = js.native
}

object IWebXRMotionControllerAxesValue {
  @scala.inline
  def apply(x: Double, y: Double): IWebXRMotionControllerAxesValue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRMotionControllerAxesValue]
  }
  @scala.inline
  implicit class IWebXRMotionControllerAxesValueOps[Self <: IWebXRMotionControllerAxesValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

