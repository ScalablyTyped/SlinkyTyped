package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import typingsSlinky.googleAppsScript.GoogleAppsScript.Document.Document
import typingsSlinky.googleAppsScript.GoogleAppsScript.Forms.Form
import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic builder for script triggers.
  */
@js.native
trait TriggerBuilder extends js.Object {
  
  def forDocument(document: Document): DocumentTriggerBuilder = js.native
  def forDocument(key: String): DocumentTriggerBuilder = js.native
  
  def forForm(form: Form): FormTriggerBuilder = js.native
  def forForm(key: String): FormTriggerBuilder = js.native
  
  def forSpreadsheet(key: String): SpreadsheetTriggerBuilder = js.native
  def forSpreadsheet(sheet: Spreadsheet): SpreadsheetTriggerBuilder = js.native
  
  def forUserCalendar(emailId: String): CalendarTriggerBuilder = js.native
  
  def timeBased(): ClockTriggerBuilder = js.native
}
