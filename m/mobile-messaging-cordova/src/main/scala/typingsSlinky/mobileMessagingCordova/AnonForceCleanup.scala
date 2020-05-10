package typingsSlinky.mobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceCleanup extends js.Object {
  var forceCleanup: js.UndefOr[Boolean] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var notificationTypes: js.UndefOr[js.Array[String]] = js.native
}

object AnonForceCleanup {
  @scala.inline
  def apply(): AnonForceCleanup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForceCleanup]
  }
  @scala.inline
  implicit class AnonForceCleanupOps[Self <: AnonForceCleanup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTypes")(js.undefined)
        ret
    }
  }
  
}

