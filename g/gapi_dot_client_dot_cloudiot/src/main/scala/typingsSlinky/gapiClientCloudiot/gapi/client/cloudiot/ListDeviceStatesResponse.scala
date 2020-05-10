package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceStatesResponse extends js.Object {
  /**
    * The last few device states. States are listed in descending order of server
    * update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[DeviceState]] = js.native
}

object ListDeviceStatesResponse {
  @scala.inline
  def apply(): ListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceStatesResponse]
  }
  @scala.inline
  implicit class ListDeviceStatesResponseOps[Self <: ListDeviceStatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceStates(value: js.Array[DeviceState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(js.undefined)
        ret
    }
  }
  
}

