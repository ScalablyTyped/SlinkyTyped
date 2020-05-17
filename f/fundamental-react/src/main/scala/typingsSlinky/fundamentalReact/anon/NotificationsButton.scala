package typingsSlinky.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsButton extends js.Object {
  var counterLabel: String = js.native
  var notificationsButton: String = js.native
}

object NotificationsButton {
  @scala.inline
  def apply(counterLabel: String, notificationsButton: String): NotificationsButton = {
    val __obj = js.Dynamic.literal(counterLabel = counterLabel.asInstanceOf[js.Any], notificationsButton = notificationsButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsButton]
  }
  @scala.inline
  implicit class NotificationsButtonOps[Self <: NotificationsButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounterLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationsButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

