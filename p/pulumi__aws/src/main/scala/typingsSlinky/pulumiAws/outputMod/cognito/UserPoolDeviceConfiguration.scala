package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolDeviceConfiguration extends js.Object {
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var challengeRequiredOnNewDevice: js.UndefOr[Boolean] = js.native
  /**
    * If true, a device is only remembered on user prompt.
    */
  var deviceOnlyRememberedOnUserPrompt: js.UndefOr[Boolean] = js.native
}

object UserPoolDeviceConfiguration {
  @scala.inline
  def apply(): UserPoolDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDeviceConfiguration]
  }
  @scala.inline
  implicit class UserPoolDeviceConfigurationOps[Self <: UserPoolDeviceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeRequiredOnNewDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeRequiredOnNewDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeRequiredOnNewDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeRequiredOnNewDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceOnlyRememberedOnUserPrompt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceOnlyRememberedOnUserPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceOnlyRememberedOnUserPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceOnlyRememberedOnUserPrompt")(js.undefined)
        ret
    }
  }
  
}

