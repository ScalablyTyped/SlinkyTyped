package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsense.anon.AccountId
import typingsSlinky.gapiClientAdsense.anon.Alt
import typingsSlinky.gapiClientAdsense.anon.SavedReportId
import typingsSlinky.gapiClientAdsense.anon.StartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedResource extends js.Object {
  
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: SavedReportId): Request[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: StartIndex): Request[AdsenseReportsGenerateResponse] = js.native
  
  /** List all saved reports in the specified AdSense account. */
  def list(request: AccountId): Request[SavedReports] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: Alt): Request[SavedReports] = js.native
}
