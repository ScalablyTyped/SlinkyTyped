package typingsSlinky.googleAdwordsScripts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.File
import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Bulk Uploads
@js.native
trait BulkUploads extends StObject {
  
  def newCsvUpload(columnNames: js.Array[String], optArgs: FileUploadArguments): CsvUpload = js.native
  
  def newFileUpload(file: Blob, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: File, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: Sheet, optArgs: FileUploadArguments): FileUpload = js.native
}
