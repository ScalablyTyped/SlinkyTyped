package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var noNotificationsBody: js.UndefOr[TagMod[Any]] = js.undefined
  var notificationCount: Double
  var notificationsBody: js.UndefOr[TagMod[Any]] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    notificationCount: Double,
    callback: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    label: String = null,
    noNotificationsBody: TagMod[Any] = null,
    notificationsBody: TagMod[Any] = null
  ): Label = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (noNotificationsBody != null) __obj.updateDynamic("noNotificationsBody")(noNotificationsBody.asInstanceOf[js.Any])
    if (notificationsBody != null) __obj.updateDynamic("notificationsBody")(notificationsBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

