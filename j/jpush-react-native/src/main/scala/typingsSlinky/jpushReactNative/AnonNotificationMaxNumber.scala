package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotificationMaxNumber extends js.Object {
  var notificationMaxNumber: Double = js.native
}

object AnonNotificationMaxNumber {
  @scala.inline
  def apply(notificationMaxNumber: Double): AnonNotificationMaxNumber = {
    val __obj = js.Dynamic.literal(notificationMaxNumber = notificationMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotificationMaxNumber]
  }
  @scala.inline
  implicit class AnonNotificationMaxNumberOps[Self <: AnonNotificationMaxNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationMaxNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMaxNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

