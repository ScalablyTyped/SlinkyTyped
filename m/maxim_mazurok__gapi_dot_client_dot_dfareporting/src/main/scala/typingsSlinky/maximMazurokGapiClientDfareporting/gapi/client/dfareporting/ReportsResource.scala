package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.KeyOauthtokenPrettyPrintProfileId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.QuotaUserReportId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ReportIdResource
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Scope
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Synchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends js.Object {
  
  var compatibleFields: CompatibleFieldsResource = js.native
  
  /** Deletes a report by its ID. */
  def delete(): Request[Unit] = js.native
  def delete(request: QuotaUserReportId): Request[Unit] = js.native
  
  var files: FilesResource = js.native
  
  /** Retrieves a report by its ID. */
  def get(): Request[Report] = js.native
  def get(request: QuotaUserReportId): Request[Report] = js.native
  
  def insert(request: Callback, body: Report): Request[Report] = js.native
  /** Creates a report. */
  def insert(request: KeyOauthtokenPrettyPrintProfileId): Request[Report] = js.native
  
  /** Retrieves list of reports. */
  def list(): Request[ReportList] = js.native
  def list(request: Scope): Request[ReportList] = js.native
  
  def patch(request: QuotaUserReportId, body: Report): Request[Report] = js.native
  /** Updates an existing report. This method supports patch semantics. */
  def patch(request: ReportIdResource): Request[Report] = js.native
  
  /** Runs a report. */
  def run(): Request[File] = js.native
  def run(request: Synchronous): Request[File] = js.native
  
  def update(request: QuotaUserReportId, body: Report): Request[Report] = js.native
  /** Updates a report. */
  def update(request: ReportIdResource): Request[Report] = js.native
}
