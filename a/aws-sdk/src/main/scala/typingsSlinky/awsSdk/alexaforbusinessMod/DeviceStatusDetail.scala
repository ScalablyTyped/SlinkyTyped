package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStatusDetail extends js.Object {
  /**
    * The device status detail code.
    */
  var Code: js.UndefOr[DeviceStatusDetailCode] = js.native
  /**
    * The list of available features on the device.
    */
  var Feature: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.Feature] = js.native
}

object DeviceStatusDetail {
  @scala.inline
  def apply(): DeviceStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusDetail]
  }
  @scala.inline
  implicit class DeviceStatusDetailOps[Self <: DeviceStatusDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: DeviceStatusDetailCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withFeature(value: Feature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feature")(js.undefined)
        ret
    }
  }
  
}

