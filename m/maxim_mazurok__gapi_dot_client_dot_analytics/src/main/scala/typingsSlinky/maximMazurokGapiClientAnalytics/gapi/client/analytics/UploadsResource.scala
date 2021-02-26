package typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.AltCustomDataSourceId
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.CustomDataSourceId
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.CustomDataSourceIdFields
import typingsSlinky.maximMazurokGapiClientAnalytics.anon.UploadId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadsResource extends StObject {
  
  def deleteUploadData(request: AltCustomDataSourceId, body: AnalyticsDataimportDeleteUploadDataRequest): Request[Unit] = js.native
  /** Delete data associated with a previous upload. */
  def deleteUploadData(request: CustomDataSourceId): Request[Unit] = js.native
  
  /** List uploads to which the user has access. */
  def get(): Request[Upload] = js.native
  def get(request: UploadId): Request[Upload] = js.native
  
  /** List uploads to which the user has access. */
  def list(): Request[Uploads] = js.native
  def list(request: CustomDataSourceIdFields): Request[Uploads] = js.native
  
  /** Upload data for a custom data source. */
  def uploadData(): Request[Upload] = js.native
  def uploadData(request: AltCustomDataSourceId): Request[Upload] = js.native
}
