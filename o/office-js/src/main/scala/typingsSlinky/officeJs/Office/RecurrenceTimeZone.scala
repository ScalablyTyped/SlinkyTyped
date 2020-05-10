package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the time zone of the recurrence.
  * 
  * [Api set: Mailbox 1.7]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait RecurrenceTimeZone extends js.Object {
  /**
    * Represents the name of the recurrence time zone.
    */
  var name: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone | String = js.native
  /**
    * Integer value representing the difference in minutes between the local time zone and UTC at the date that the meeting series began.
    */
  var offset: js.UndefOr[Double] = js.native
}

object RecurrenceTimeZone {
  @scala.inline
  def apply(name: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone | String): RecurrenceTimeZone = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceTimeZone]
  }
  @scala.inline
  implicit class RecurrenceTimeZoneOps[Self <: RecurrenceTimeZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.officeJs.Office.MailboxEnums.RecurrenceTimeZone | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

