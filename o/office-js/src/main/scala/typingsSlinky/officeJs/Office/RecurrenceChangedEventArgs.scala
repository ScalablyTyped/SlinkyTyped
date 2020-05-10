package typingsSlinky.officeJs.Office

import typingsSlinky.officeJs.officeJsStrings.olkRecurrenceChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceChangedEventArgs extends js.Object {
  /** 
    * Gets the updated recurrence object. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var recurrence: Recurrence = js.native
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkRecurrenceChanged = js.native
}

object RecurrenceChangedEventArgs {
  @scala.inline
  def apply(recurrence: Recurrence, `type`: olkRecurrenceChanged): RecurrenceChangedEventArgs = {
    val __obj = js.Dynamic.literal(recurrence = recurrence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceChangedEventArgs]
  }
  @scala.inline
  implicit class RecurrenceChangedEventArgsOps[Self <: RecurrenceChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecurrence(value: Recurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: olkRecurrenceChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

