package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsense.AnonAccountId
import typingsSlinky.gapiClientAdsense.AnonAlt
import typingsSlinky.gapiClientAdsense.AnonSavedReportId
import typingsSlinky.gapiClientAdsense.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedResource extends js.Object {
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonSavedReportId): Request_[AdsenseReportsGenerateResponse] = js.native
  /** Generate an AdSense report based on the saved report ID sent in the query parameters. */
  def generate(request: AnonStartIndex): Request_[AdsenseReportsGenerateResponse] = js.native
  /** List all saved reports in the specified AdSense account. */
  def list(request: AnonAccountId): Request_[SavedReports] = js.native
  /** List all saved reports in this AdSense account. */
  def list(request: AnonAlt): Request_[SavedReports] = js.native
}

