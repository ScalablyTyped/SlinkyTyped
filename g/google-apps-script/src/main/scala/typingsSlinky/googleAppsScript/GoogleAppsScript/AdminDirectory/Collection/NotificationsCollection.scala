package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Notification
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsCollection extends js.Object {
  
  // Retrieves a notification.
  def get(customer: String, notificationId: String): Notification = js.native
  
  // Retrieves a list of notifications.
  def list(customer: String): Notifications = js.native
  // Retrieves a list of notifications.
  def list(customer: String, optionalArgs: js.Object): Notifications = js.native
  
  // Updates a notification. This method supports patch semantics.
  def patch(resource: Notification, customer: String, notificationId: String): Notification = js.native
  
  // Deletes a notification
  def remove(customer: String, notificationId: String): Unit = js.native
  
  // Updates a notification.
  def update(resource: Notification, customer: String, notificationId: String): Notification = js.native
}
