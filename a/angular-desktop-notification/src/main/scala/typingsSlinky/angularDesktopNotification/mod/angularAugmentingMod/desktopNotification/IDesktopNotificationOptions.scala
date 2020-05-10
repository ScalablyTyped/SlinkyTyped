package typingsSlinky.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IDesktopNotificationOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var showOnPageHidden: js.UndefOr[Boolean] = js.native
}

object IDesktopNotificationOptions {
  @scala.inline
  def apply(): IDesktopNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDesktopNotificationOptions]
  }
  @scala.inline
  implicit class IDesktopNotificationOptionsOps[Self <: IDesktopNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnPageHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnPageHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnPageHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnPageHidden")(js.undefined)
        ret
    }
  }
  
}

