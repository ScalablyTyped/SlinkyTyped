package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Reminder class.
  */
@js.native
trait ASPxClientReminder extends js.Object {
  /**
    * Switches the reminder off for the associated appointment.
    */
  def Dismiss(): Unit = js.native
  /**
    * Returns the date and time when the reminder is alerted.
    */
  def GetAlertTime(): js.Date = js.native
  /**
    * Gets the custom field bound to the reminder. An object representing the custom field.
    * @param key A string object representing the custom field's ID.
    */
  def GetCustomField(key: String): js.Any = js.native
  /**
    * Gets the reminder's ID.
    */
  def GetId(): String = js.native
  /**
    * Gets the time interval before the appointment's start time.
    */
  def GetTimeBeforeStart(): js.Date = js.native
  /**
    * Delays the reminder's alert until the alert time has increased by the specified interval.
    * @param remindAfter An integer value that is the time interval.
    */
  def Snooze(remindAfter: Double): Unit = js.native
}

object ASPxClientReminder {
  @scala.inline
  def apply(
    Dismiss: () => Unit,
    GetAlertTime: () => js.Date,
    GetCustomField: String => js.Any,
    GetId: () => String,
    GetTimeBeforeStart: () => js.Date,
    Snooze: Double => Unit
  ): ASPxClientReminder = {
    val __obj = js.Dynamic.literal(Dismiss = js.Any.fromFunction0(Dismiss), GetAlertTime = js.Any.fromFunction0(GetAlertTime), GetCustomField = js.Any.fromFunction1(GetCustomField), GetId = js.Any.fromFunction0(GetId), GetTimeBeforeStart = js.Any.fromFunction0(GetTimeBeforeStart), Snooze = js.Any.fromFunction1(Snooze))
    __obj.asInstanceOf[ASPxClientReminder]
  }
  @scala.inline
  implicit class ASPxClientReminderOps[Self <: ASPxClientReminder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAlertTime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAlertTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomField(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeBeforeStart(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTimeBeforeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSnooze(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Snooze")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

