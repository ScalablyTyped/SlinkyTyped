package typingsSlinky.ably.mod.Types

import typingsSlinky.ably.ablyStrings.android
import typingsSlinky.ably.ablyStrings.browser
import typingsSlinky.ably.ablyStrings.car
import typingsSlinky.ably.ablyStrings.desktop
import typingsSlinky.ably.ablyStrings.embedded
import typingsSlinky.ably.ablyStrings.ios
import typingsSlinky.ably.ablyStrings.other
import typingsSlinky.ably.ablyStrings.phone
import typingsSlinky.ably.ablyStrings.tablet
import typingsSlinky.ably.ablyStrings.tv
import typingsSlinky.ably.ablyStrings.watch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceDetails extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var deviceSecret: js.UndefOr[String] = js.native
  var formFactor: phone | tablet | desktop | tv | watch | car | embedded | other = js.native
  var id: String = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var platform: android | ios | browser = js.native
  var push: DevicePushDetails = js.native
}

object DeviceDetails {
  @scala.inline
  def apply(
    formFactor: phone | tablet | desktop | tv | watch | car | embedded | other,
    id: String,
    platform: android | ios | browser,
    push: DevicePushDetails
  ): DeviceDetails = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDetails]
  }
  @scala.inline
  implicit class DeviceDetailsOps[Self <: DeviceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormFactor(value: phone | tablet | desktop | tv | watch | car | embedded | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: android | ios | browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: DevicePushDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

