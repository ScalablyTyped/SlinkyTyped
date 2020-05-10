package typingsSlinky.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceTemplate extends js.Object {
  /**
    * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
    */
  var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.native
  /**
    * The device type, which currently must be "button".
    */
  var deviceType: js.UndefOr[DeviceType] = js.native
}

object DeviceTemplate {
  @scala.inline
  def apply(): DeviceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTemplate]
  }
  @scala.inline
  implicit class DeviceTemplateOps[Self <: DeviceTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackOverrides(value: DeviceCallbackOverrideMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceType(value: DeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(js.undefined)
        ret
    }
  }
  
}

