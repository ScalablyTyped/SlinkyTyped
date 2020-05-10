package typingsSlinky.reactNotificationSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var Action: js.UndefOr[ItemStyle] = js.native
  var ActionWrapper: js.UndefOr[WrapperStyle] = js.native
  var Containers: js.UndefOr[ContainersStyle] = js.native
  var Dismiss: js.UndefOr[ItemStyle] = js.native
  var MessageWrapper: js.UndefOr[WrapperStyle] = js.native
  var NotificationItem: js.UndefOr[ItemStyle] = js.native
  var Title: js.UndefOr[ItemStyle] = js.native
  var Wrapper: js.UndefOr[js.Any] = js.native
}

object Style {
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ItemStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withActionWrapper(value: WrapperStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withContainers(value: ContainersStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(js.undefined)
        ret
    }
    @scala.inline
    def withDismiss(value: ItemStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageWrapper(value: WrapperStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationItem(value: ItemStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationItem")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: ItemStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wrapper")(js.undefined)
        ret
    }
  }
  
}

