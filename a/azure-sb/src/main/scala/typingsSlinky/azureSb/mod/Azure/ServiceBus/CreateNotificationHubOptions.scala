package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateNotificationHubOptions> */
@js.native
trait CreateNotificationHubOptions extends js.Object {
  var apns: js.UndefOr[Dictionary[String]] = js.native
  var gcm: js.UndefOr[Dictionary[String]] = js.native
  var mpns: js.UndefOr[Dictionary[String]] = js.native
  var wns: js.UndefOr[Dictionary[String]] = js.native
}

object CreateNotificationHubOptions {
  @scala.inline
  def apply(): CreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationHubOptions]
  }
  @scala.inline
  implicit class CreateNotificationHubOptionsOps[Self <: CreateNotificationHubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApns(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apns")(js.undefined)
        ret
    }
    @scala.inline
    def withGcm(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(js.undefined)
        ret
    }
    @scala.inline
    def withMpns(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpns")(js.undefined)
        ret
    }
    @scala.inline
    def withWns(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wns")(js.undefined)
        ret
    }
  }
  
}

