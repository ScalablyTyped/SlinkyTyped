package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSchedulerStorageControl.ReminderAlert event.
  */
@JSGlobal("ASPxClientSchedulerStorageReminderAlertEventArgs")
@js.native
class ASPxClientSchedulerStorageReminderAlertEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientSchedulerStorageReminderAlertEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSchedulerStorageReminderAlertEventArgs class.
    * @param completedNotifications An array of ASPxClientReminderAlertNotification objects.
    * @param previousNotifications An array of ASPxClientReminderAlertNotification objects.
    */
  def this(
    completedNotifications: js.Array[typingsSlinky.devexpressWeb.ASPxClientReminderAlertNotification],
    previousNotifications: js.Array[typingsSlinky.devexpressWeb.ASPxClientReminderAlertNotification]
  ) = this()
}
