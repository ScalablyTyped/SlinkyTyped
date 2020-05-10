package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRMotionControllerComponentChanges extends js.Object {
  /**
    * will be populated with previous and current values if axes changed
    */
  var axes: js.UndefOr[IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]] = js.native
  /**
    * will be populated with previous and current values if pressed changed
    */
  var pressed: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.native
  /**
    * will be populated with previous and current values if touched changed
    */
  var touched: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.native
  /**
    * will be populated with previous and current values if value changed
    */
  var value: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Double]] = js.native
}

object IWebXRMotionControllerComponentChanges {
  @scala.inline
  def apply(): IWebXRMotionControllerComponentChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRMotionControllerComponentChanges]
  }
  @scala.inline
  implicit class IWebXRMotionControllerComponentChangesOps[Self <: IWebXRMotionControllerComponentChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withPressed(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(js.undefined)
        ret
    }
    @scala.inline
    def withTouched(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touched")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: IWebXRMotionControllerComponentChangesValues[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

