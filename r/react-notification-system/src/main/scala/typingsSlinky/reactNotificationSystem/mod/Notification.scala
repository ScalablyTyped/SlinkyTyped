package typingsSlinky.reactNotificationSystem.mod

import slinky.core.TagMod
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

trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.undefined
  var autoDismiss: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[error | warning | info | success] = js.undefined
  var message: js.UndefOr[String | ReactElement] = js.undefined
  var onAdd: js.UndefOr[CallBackFunction] = js.undefined
  var onRemove: js.UndefOr[CallBackFunction] = js.undefined
  var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.undefined
  var title: js.UndefOr[String | ReactElement] = js.undefined
  var uid: js.UndefOr[Double | String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    action: ActionObject = null,
    autoDismiss: js.UndefOr[Double] = js.undefined,
    children: TagMod[Any] = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    level: error | warning | info | success = null,
    message: String | ReactElement = null,
    onAdd: /* notification */ Notification => Unit = null,
    onRemove: /* notification */ Notification => Unit = null,
    position: tr | tl | tc | br | bl | bc = null,
    title: String | ReactElement = null,
    uid: Double | String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.get.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

