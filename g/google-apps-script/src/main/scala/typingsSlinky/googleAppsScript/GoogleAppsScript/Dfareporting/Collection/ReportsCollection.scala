package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection.Reports.CompatibleFieldsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.File
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Report
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ReportList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsCollection extends js.Object {
  
  var CompatibleFields: js.UndefOr[CompatibleFieldsCollection] = js.native
  
  var Files: js.UndefOr[
    typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection.Reports.FilesCollection
  ] = js.native
  
  // Retrieves a report by its ID.
  def get(profileId: String, reportId: String): Report = js.native
  
  // Creates a report.
  def insert(resource: Report, profileId: String): Report = js.native
  
  // Retrieves list of reports.
  def list(profileId: String): ReportList = js.native
  // Retrieves list of reports.
  def list(profileId: String, optionalArgs: js.Object): ReportList = js.native
  
  // Updates a report. This method supports patch semantics.
  def patch(resource: Report, profileId: String, reportId: String): Report = js.native
  
  // Deletes a report by its ID.
  def remove(profileId: String, reportId: String): Unit = js.native
  
  // Runs a report.
  def run(profileId: String, reportId: String): File = js.native
  // Runs a report.
  def run(profileId: String, reportId: String, optionalArgs: js.Object): File = js.native
  
  // Updates a report.
  def update(resource: Report, profileId: String, reportId: String): Report = js.native
}
