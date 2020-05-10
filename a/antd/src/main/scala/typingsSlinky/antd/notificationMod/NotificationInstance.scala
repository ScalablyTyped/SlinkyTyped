package typingsSlinky.antd.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationInstance extends js.Object {
  def error(args: ArgsProps): Unit = js.native
  def info(args: ArgsProps): Unit = js.native
  def open(args: ArgsProps): Unit = js.native
  def success(args: ArgsProps): Unit = js.native
  def warning(args: ArgsProps): Unit = js.native
}

object NotificationInstance {
  @scala.inline
  def apply(
    error: ArgsProps => Unit,
    info: ArgsProps => Unit,
    open: ArgsProps => Unit,
    success: ArgsProps => Unit,
    warning: ArgsProps => Unit
  ): NotificationInstance = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), open = js.Any.fromFunction1(open), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[NotificationInstance]
  }
  @scala.inline
  implicit class NotificationInstanceOps[Self <: NotificationInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: ArgsProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: ArgsProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: ArgsProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: ArgsProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarning(value: ArgsProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

