package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Activities
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReports.Schema.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitiesCollection extends js.Object {
  
  // Retrieves a list of activities for a specific customer and application.
  def list(userKey: String, applicationName: String): Activities = js.native
  // Retrieves a list of activities for a specific customer and application.
  def list(userKey: String, applicationName: String, optionalArgs: js.Object): Activities = js.native
  
  // Push changes to activities
  def watch(resource: Channel, userKey: String, applicationName: String): Channel = js.native
  // Push changes to activities
  def watch(resource: Channel, userKey: String, applicationName: String, optionalArgs: js.Object): Channel = js.native
}
