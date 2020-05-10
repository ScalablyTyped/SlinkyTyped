package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Reminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReminderObject extends js.Object {
  val ReminderObject: Reminder = js.native
}

object AnonReminderObject {
  @scala.inline
  def apply(ReminderObject: Reminder): AnonReminderObject = {
    val __obj = js.Dynamic.literal(ReminderObject = ReminderObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReminderObject]
  }
  @scala.inline
  implicit class AnonReminderObjectOps[Self <: AnonReminderObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReminderObject(value: Reminder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

