package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  var label: js.UndefOr[String] = js.native
  var noNotificationsBody: js.UndefOr[TagMod[Any]] = js.native
  var notificationCount: Double = js.native
  var notificationsBody: js.UndefOr[TagMod[Any]] = js.native
}

object Label {
  @scala.inline
  def apply(notificationCount: Double): Label = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotificationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withNoNotificationsBodyReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNotificationsBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoNotificationsBody(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNotificationsBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoNotificationsBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNotificationsBody")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsBodyReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationsBody(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsBody")(js.undefined)
        ret
    }
  }
  
}

