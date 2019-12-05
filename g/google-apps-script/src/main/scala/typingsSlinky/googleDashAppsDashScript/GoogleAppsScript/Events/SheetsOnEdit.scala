package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Events

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Script.AuthMode
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsOnEdit extends AppsScriptEvent {
  var oldValue: String
  var range: Range
  var source: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet
  var value: String
}

object SheetsOnEdit {
  @scala.inline
  def apply(
    authMode: AuthMode,
    oldValue: String,
    range: Range,
    source: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet,
    triggerUid: String,
    user: User,
    value: String
  ): SheetsOnEdit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetsOnEdit]
  }
}

