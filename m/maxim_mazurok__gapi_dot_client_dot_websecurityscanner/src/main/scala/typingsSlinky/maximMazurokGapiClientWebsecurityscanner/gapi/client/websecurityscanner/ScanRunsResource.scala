package typingsSlinky.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientWebsecurityscanner.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientWebsecurityscanner.anon.Alt
import typingsSlinky.maximMazurokGapiClientWebsecurityscanner.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanRunsResource extends js.Object {
  
  var crawledUrls: CrawledUrlsResource = js.native
  
  var findingTypeStats: FindingTypeStatsResource = js.native
  
  var findings: FindingsResource = js.native
  
  /** Gets a ScanRun. */
  def get(): Request[ScanRun] = js.native
  def get(request: Alt): Request[ScanRun] = js.native
  
  /** Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time. */
  def list(): Request[ListScanRunsResponse] = js.native
  def list(request: Accesstoken): Request[ListScanRunsResponse] = js.native
  
  def stop(request: Alt, body: StopScanRunRequest): Request[ScanRun] = js.native
  /** Stops a ScanRun. The stopped ScanRun is returned. */
  def stop(request: Key): Request[ScanRun] = js.native
}
