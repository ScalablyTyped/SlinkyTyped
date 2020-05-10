package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncompatibilityMessage extends js.Object {
  /**
    * A message about the incompatibility.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The type of incompatibility. Allowed values include:   ARN   FORM_FACTOR (for example, phone or tablet)   MANUFACTURER   PLATFORM (for example, Android or iOS)   REMOTE_ACCESS_ENABLED   APPIUM_VERSION  
    */
  var `type`: js.UndefOr[DeviceAttribute] = js.native
}

object IncompatibilityMessage {
  @scala.inline
  def apply(): IncompatibilityMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncompatibilityMessage]
  }
  @scala.inline
  implicit class IncompatibilityMessageOps[Self <: IncompatibilityMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DeviceAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

