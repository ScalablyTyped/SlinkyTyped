package typingsSlinky.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAnalyticsdata.anon.Fields
import typingsSlinky.maximMazurokGapiClientAnalyticsdata.anon.Key
import typingsSlinky.maximMazurokGapiClientAnalyticsdata.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAnalyticsdata.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAnalyticsdata.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1alphaResource extends js.Object {
  
  /** Returns multiple pivot reports in a batch. All reports must be for the same Entity. */
  def batchRunPivotReports(request: Fields): Request[BatchRunPivotReportsResponse] = js.native
  def batchRunPivotReports(request: Key, body: BatchRunPivotReportsRequest): Request[BatchRunPivotReportsResponse] = js.native
  
  def batchRunReports(request: Key, body: BatchRunReportsRequest): Request[BatchRunReportsResponse] = js.native
  /** Returns multiple reports in a batch. All reports must be for the same Entity. */
  def batchRunReports(request: Oauthtoken): Request[BatchRunReportsResponse] = js.native
  
  def runPivotReport(request: Key, body: RunPivotReportRequest): Request[RunPivotReportResponse] = js.native
  /**
    * Returns a customized pivot report of your Google Analytics event data. Pivot reports are more advanced and expressive formats than regular reports. In a pivot report, dimensions are
    * only visible if they are included in a pivot. Multiple pivots can be specified to further dissect your data.
    */
  def runPivotReport(request: PrettyPrint): Request[RunPivotReportResponse] = js.native
  
  def runReport(request: Key, body: RunReportRequest): Request[RunReportResponse] = js.native
  /**
    * Returns a customized report of your Google Analytics event data. Reports contain statistics derived from data collected by the Google Analytics tracking code. The data returned from
    * the API is as a table with columns for the requested dimensions and metrics. Metrics are individual measurements of user activity on your property, such as active users or event
    * count. Dimensions break down metrics across some common criteria, such as country or event name.
    */
  def runReport(request: QuotaUser): Request[RunReportResponse] = js.native
}
