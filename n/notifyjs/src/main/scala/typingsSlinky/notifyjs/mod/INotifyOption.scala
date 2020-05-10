package typingsSlinky.notifyjs.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Notify's optional parameter.
  */
@js.native
trait INotifyOption extends js.Object {
  /**
    * notification message body
    */
  var body: js.UndefOr[String] = js.native
  /**
    * path for icon to display in notification
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * callback when notification is clicked
    */
  var notifyClick: js.UndefOr[js.Function] = js.native
  /**
    * callback when notification is closed
    */
  var notifyClose: js.UndefOr[js.Function] = js.native
  /**
    * callback when notification throws an error
    */
  var notifyError: js.UndefOr[js.Function] = js.native
  /**
    * callback when notification is shown
    */
  var notifyShow: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.native
  /**
    * callback when user has denied permission
    */
  var permissionDenied: js.UndefOr[js.Function] = js.native
  /**
    *  callback when user has granted permission
    */
  var permissionGranted: js.UndefOr[js.Function] = js.native
  /**
    * whether we expect for user interaction or not
    * in case value is true the timeout for closing the notification won't be set
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  /**
    * whether this notification should be silent or not
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * unique identifier to stop duplicate notifications
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * number of seconds to close the notification automatically
    */
  var timeout: js.UndefOr[Double] = js.native
}

object INotifyOption {
  @scala.inline
  def apply(): INotifyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INotifyOption]
  }
  @scala.inline
  implicit class INotifyOptionOps[Self <: INotifyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyClose")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyError(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyError")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyShow(value: /* e */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNotifyShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionDenied(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionDenied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionDenied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionDenied")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionGranted(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGranted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionGranted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGranted")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

