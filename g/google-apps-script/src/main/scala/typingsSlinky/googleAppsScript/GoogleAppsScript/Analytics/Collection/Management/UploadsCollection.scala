package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.AnalyticsDataimportDeleteUploadDataRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Upload
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema.Uploads
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadsCollection extends js.Object {
  
  // Delete data associated with a previous upload.
  def deleteUploadData(
    resource: AnalyticsDataimportDeleteUploadDataRequest,
    accountId: String,
    webPropertyId: String,
    customDataSourceId: String
  ): Unit = js.native
  
  // List uploads to which the user has access.
  def get(accountId: String, webPropertyId: String, customDataSourceId: String, uploadId: String): Upload = js.native
  
  // List uploads to which the user has access.
  def list(accountId: String, webPropertyId: String, customDataSourceId: String): Uploads = js.native
  // List uploads to which the user has access.
  def list(accountId: String, webPropertyId: String, customDataSourceId: String, optionalArgs: js.Object): Uploads = js.native
  
  // Upload data for a custom data source.
  def uploadData(accountId: String, webPropertyId: String, customDataSourceId: String): Upload = js.native
  // Upload data for a custom data source.
  def uploadData(accountId: String, webPropertyId: String, customDataSourceId: String, mediaData: js.Any): Upload = js.native
}
