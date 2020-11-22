package typingsSlinky.maximMazurokGapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Alt
import typingsSlinky.maximMazurokGapiClientAdsense.anon.Fields
import typingsSlinky.maximMazurokGapiClientAdsense.anon.SavedReportId
import typingsSlinky.maximMazurokGapiClientAdsense.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedResource extends js.Object {
  
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(): Request[AdsenseReportsGenerateResponse] = js.native
  def generate(request: SavedReportId): Request[AdsenseReportsGenerateResponse] = js.native
  def generate(request: StartIndex): Request[AdsenseReportsGenerateResponse] = js.native
  
  /** List all saved reports in the specified AdSense account. */
  def list(): Request[SavedReports] = js.native
  def list(request: Alt): Request[SavedReports] = js.native
  def list(request: Fields): Request[SavedReports] = js.native
}
