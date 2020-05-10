package typingsSlinky.expoLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocationServicesEnabled extends js.Object {
  var locationServicesEnabled: Boolean = js.native
}

object AnonLocationServicesEnabled {
  @scala.inline
  def apply(locationServicesEnabled: Boolean): AnonLocationServicesEnabled = {
    val __obj = js.Dynamic.literal(locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocationServicesEnabled]
  }
  @scala.inline
  implicit class AnonLocationServicesEnabledOps[Self <: AnonLocationServicesEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationServicesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

