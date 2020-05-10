package typingsSlinky.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixOption extends js.Object {
  var devices: js.UndefOr[Double] = js.native
  var pins: js.Any = js.native
}

object MatrixOption {
  @scala.inline
  def apply(pins: js.Any): MatrixOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixOption]
  }
  @scala.inline
  implicit class MatrixOptionOps[Self <: MatrixOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(js.undefined)
        ret
    }
  }
  
}

