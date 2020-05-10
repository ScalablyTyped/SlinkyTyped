package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsMoveDevicesToOu extends js.Object {
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
}

object ChromeOsMoveDevicesToOu {
  @scala.inline
  def apply(): ChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsMoveDevicesToOu]
  }
  @scala.inline
  implicit class ChromeOsMoveDevicesToOuOps[Self <: ChromeOsMoveDevicesToOu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(js.undefined)
        ret
    }
  }
  
}

