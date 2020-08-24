package typingsSlinky.reactNotificationSystem.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.bc
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.bl
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.br
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.error
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.info
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.success
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.tc
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.tl
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.tr
import typingsSlinky.reactNotificationSystem.reactNotificationSystemStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.native
  var autoDismiss: js.UndefOr[Double] = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var dismissible: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[error | warning | info | success] = js.native
  var message: js.UndefOr[String | ReactElement] = js.native
  var onAdd: js.UndefOr[CallBackFunction] = js.native
  var onRemove: js.UndefOr[CallBackFunction] = js.native
  var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var uid: js.UndefOr[Double | String] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: ActionObject): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAutoDismiss(value: Double): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    @scala.inline
    def setLevel(value: error | warning | info | success): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMessageReactElement(value: ReactElement): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String | ReactElement): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnAdd(value: /* notification */ Notification => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnRemove(value: /* notification */ Notification => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setPosition(value: tr | tl | tc | br | bl | bc): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUid(value: Double | String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

