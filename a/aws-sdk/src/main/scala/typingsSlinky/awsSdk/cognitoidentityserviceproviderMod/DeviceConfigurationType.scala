package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfigurationType extends js.Object {
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.native
  /**
    * If true, a device is only remembered on user prompt.
    */
  var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.native
}

object DeviceConfigurationType {
  @scala.inline
  def apply(): DeviceConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationType]
  }
  @scala.inline
  implicit class DeviceConfigurationTypeOps[Self <: DeviceConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeRequiredOnNewDevice(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeRequiredOnNewDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeRequiredOnNewDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeRequiredOnNewDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceOnlyRememberedOnUserPrompt(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceOnlyRememberedOnUserPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceOnlyRememberedOnUserPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceOnlyRememberedOnUserPrompt")(js.undefined)
        ret
    }
  }
  
}

