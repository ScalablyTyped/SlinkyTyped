package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRaycastVehicleOptions extends js.Object {
  var chassisBody: js.UndefOr[Body] = js.native
  var indexLeftAxis: js.UndefOr[Double] = js.native
  var indexRightAxis: js.UndefOr[Double] = js.native
  var indexUpAxis: js.UndefOr[Double] = js.native
}

object IRaycastVehicleOptions {
  @scala.inline
  def apply(): IRaycastVehicleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRaycastVehicleOptions]
  }
  @scala.inline
  implicit class IRaycastVehicleOptionsOps[Self <: IRaycastVehicleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChassisBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChassisBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chassisBody")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexLeftAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLeftAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexLeftAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLeftAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexRightAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexRightAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexRightAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexRightAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexUpAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexUpAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexUpAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexUpAxis")(js.undefined)
        ret
    }
  }
  
}

