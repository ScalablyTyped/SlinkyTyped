package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.User
import typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsOnFormSubmit extends AppsScriptEvent {
  var namedValues: StringDictionary[js.Array[String]] = js.native
  var range: Range = js.native
  var values: js.Array[String] = js.native
}

object SheetsOnFormSubmit {
  @scala.inline
  def apply(
    authMode: AuthMode,
    namedValues: StringDictionary[js.Array[String]],
    range: Range,
    triggerUid: String,
    user: User,
    values: js.Array[String]
  ): SheetsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], namedValues = namedValues.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnFormSubmit]
  }
  @scala.inline
  implicit class SheetsOnFormSubmitOps[Self <: SheetsOnFormSubmit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedValues(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

