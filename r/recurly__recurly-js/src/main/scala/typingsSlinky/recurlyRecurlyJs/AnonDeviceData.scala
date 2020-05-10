package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeviceData extends js.Object {
  var deviceData: js.UndefOr[String] = js.native
}

object AnonDeviceData {
  @scala.inline
  def apply(): AnonDeviceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDeviceData]
  }
  @scala.inline
  implicit class AnonDeviceDataOps[Self <: AnonDeviceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(js.undefined)
        ret
    }
  }
  
}

