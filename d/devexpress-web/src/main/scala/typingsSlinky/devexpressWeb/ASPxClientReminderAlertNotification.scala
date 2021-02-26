package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information related to the reminder alert.
  */
@js.native
trait ASPxClientReminderAlertNotification extends StObject {
  
  /**
    * Gets the appointment associated with the reminder.
    */
  def GetAppointment(): ASPxClientAppointment = js.native
  
  /**
    * Gets the triggered reminder.
    */
  def GetReminder(): ASPxClientReminder = js.native
  
  /**
    * Gets the triggered reminder's ID.
    */
  def GetReminderId(): String = js.native
  
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  var appointment: ASPxClientAppointment = js.native
  
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  var ignore: Boolean = js.native
  
  /**
    * Returns the triggered reminder.
    */
  var reminder: ASPxClientReminder = js.native
}
object ASPxClientReminderAlertNotification {
  
  @scala.inline
  def apply(
    GetAppointment: () => ASPxClientAppointment,
    GetReminder: () => ASPxClientReminder,
    GetReminderId: () => String,
    appointment: ASPxClientAppointment,
    handled: Boolean,
    ignore: Boolean,
    reminder: ASPxClientReminder
  ): ASPxClientReminderAlertNotification = {
    val __obj = js.Dynamic.literal(GetAppointment = js.Any.fromFunction0(GetAppointment), GetReminder = js.Any.fromFunction0(GetReminder), GetReminderId = js.Any.fromFunction0(GetReminderId), appointment = appointment.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], reminder = reminder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReminderAlertNotification]
  }
  
  @scala.inline
  implicit class ASPxClientReminderAlertNotificationMutableBuilder[Self <: ASPxClientReminderAlertNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: ASPxClientAppointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAppointment(value: () => ASPxClientAppointment): Self = StObject.set(x, "GetAppointment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReminder(value: () => ASPxClientReminder): Self = StObject.set(x, "GetReminder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReminderId(value: () => String): Self = StObject.set(x, "GetReminderId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminder(value: ASPxClientReminder): Self = StObject.set(x, "reminder", value.asInstanceOf[js.Any])
  }
}
