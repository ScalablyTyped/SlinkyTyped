package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceInstance extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The ARN of the device.
    */
  var deviceArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A object that contains information about the instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
  /**
    * An array of strings that describe the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  /**
    * The status of the device instance. Valid values are listed here.
    */
  var status: js.UndefOr[InstanceStatus] = js.native
  /**
    * Unique device identifier for the device instance.
    */
  var udid: js.UndefOr[String] = js.native
}

object DeviceInstance {
  @scala.inline
  def apply(): DeviceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstance]
  }
  @scala.inline
  implicit class DeviceInstanceOps[Self <: DeviceInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceProfile(value: InstanceProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: InstanceLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUdid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udid")(js.undefined)
        ret
    }
  }
  
}

