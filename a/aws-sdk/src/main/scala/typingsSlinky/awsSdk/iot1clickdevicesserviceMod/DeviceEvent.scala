package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEvent extends js.Object {
  /**
    * An object representing the device associated with the event.
    */
  var Device: js.UndefOr[typingsSlinky.awsSdk.iot1clickdevicesserviceMod.Device] = js.native
  /**
    * A serialized JSON object representing the device-type specific event.
    */
  var StdEvent: js.UndefOr[string] = js.native
}

object DeviceEvent {
  @scala.inline
  def apply(): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEvent]
  }
  @scala.inline
  implicit class DeviceEventOps[Self <: DeviceEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Device")(js.undefined)
        ret
    }
    @scala.inline
    def withStdEvent(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdEvent")(js.undefined)
        ret
    }
  }
  
}

