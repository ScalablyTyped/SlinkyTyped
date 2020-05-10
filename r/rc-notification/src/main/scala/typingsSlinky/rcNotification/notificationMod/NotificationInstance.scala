package typingsSlinky.rcNotification.notificationMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationInstance extends js.Object {
  var component: Notification = js.native
  var notice: NoticeFunc = js.native
  def destroy(): Unit = js.native
  def removeNotice(key: Key): Unit = js.native
  def useNotification(): js.Tuple2[NoticeFunc, ReactElement] = js.native
}

object NotificationInstance {
  @scala.inline
  def apply(
    component: Notification,
    destroy: () => Unit,
    notice: /* noticeProps */ NoticeContent => Unit,
    removeNotice: Key => Unit,
    useNotification: () => js.Tuple2[NoticeFunc, ReactElement]
  ): NotificationInstance = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), notice = js.Any.fromFunction1(notice), removeNotice = js.Any.fromFunction1(removeNotice), useNotification = js.Any.fromFunction0(useNotification))
    __obj.asInstanceOf[NotificationInstance]
  }
  @scala.inline
  implicit class NotificationInstanceOps[Self <: NotificationInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotice(value: /* noticeProps */ NoticeContent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNotice(value: Key => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNotice")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseNotification(value: () => js.Tuple2[NoticeFunc, ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNotification")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

