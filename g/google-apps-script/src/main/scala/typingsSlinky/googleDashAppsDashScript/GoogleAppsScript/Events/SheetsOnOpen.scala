package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Events

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// External interfaces
trait SheetsOnOpen extends AppsScriptEvent {
  var source: Spreadsheet
}

object SheetsOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Spreadsheet, triggerUid: String, user: User): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetsOnOpen]
  }
}

