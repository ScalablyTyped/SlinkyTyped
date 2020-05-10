package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDescription extends js.Object {
  /**
    * The ARN of the device.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * An array of zero or more elements of DeviceAttribute objects providing
    user specified device attributes.
    */
  var Attributes: js.UndefOr[DeviceAttributes] = js.native
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[string] = js.native
  /**
    * A Boolean value indicating whether or not the device is enabled.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * A value between 0 and 1 inclusive, representing the fraction of life remaining for the
    device.
    */
  var RemainingLife: js.UndefOr[doubleMin0Max100] = js.native
  /**
    * The tags currently associated with the AWS IoT 1-Click device.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * The type of the device, such as "button".
    */
  var Type: js.UndefOr[string] = js.native
}

object DeviceDescription {
  @scala.inline
  def apply(): DeviceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescription]
  }
  @scala.inline
  implicit class DeviceDescriptionOps[Self <: DeviceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: DeviceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainingLife(value: doubleMin0Max100): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingLife")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingLife: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemainingLife")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

