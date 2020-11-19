package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema.Alerts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertsCollection extends js.Object {
  
  // List the alerts for the specified AdSense account.
  def list(accountId: String): Alerts = js.native
  // List the alerts for the specified AdSense account.
  def list(accountId: String, optionalArgs: js.Object): Alerts = js.native
  
  // Dismiss (delete) the specified alert from the specified publisher AdSense account.
  def remove(accountId: String, alertId: String): Unit = js.native
}
