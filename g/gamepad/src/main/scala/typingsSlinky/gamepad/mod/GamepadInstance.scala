package typingsSlinky.gamepad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadInstance extends js.Object {
  var axisStates: js.Array[Double] = js.native
  var buttonStates: js.Array[Boolean] = js.native
  var description: String = js.native
  var deviceID: Double = js.native
  var productID: Double = js.native
  var vendorID: Double = js.native
}

object GamepadInstance {
  @scala.inline
  def apply(
    axisStates: js.Array[Double],
    buttonStates: js.Array[Boolean],
    description: String,
    deviceID: Double,
    productID: Double,
    vendorID: Double
  ): GamepadInstance = {
    val __obj = js.Dynamic.literal(axisStates = axisStates.asInstanceOf[js.Any], buttonStates = buttonStates.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceID = deviceID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], vendorID = vendorID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadInstance]
  }
  @scala.inline
  implicit class GamepadInstanceOps[Self <: GamepadInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisStates(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonStates(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendorID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

