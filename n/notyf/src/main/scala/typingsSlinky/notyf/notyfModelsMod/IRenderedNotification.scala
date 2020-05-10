package typingsSlinky.notyf.notyfModelsMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderedNotification extends js.Object {
  var node: HTMLElement = js.native
  var notification: NotyfNotification = js.native
}

object IRenderedNotification {
  @scala.inline
  def apply(node: HTMLElement, notification: NotyfNotification): IRenderedNotification = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderedNotification]
  }
  @scala.inline
  implicit class IRenderedNotificationOps[Self <: IRenderedNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: NotyfNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

