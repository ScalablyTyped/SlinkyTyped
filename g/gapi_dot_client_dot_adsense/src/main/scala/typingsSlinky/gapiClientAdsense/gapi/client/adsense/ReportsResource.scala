package typingsSlinky.gapiClientAdsense.gapi.client.adsense

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdsense.AnonDimension
import typingsSlinky.gapiClientAdsense.AnonEndDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  var saved: SavedResource = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: AnonDimension): Request_[AdsenseReportsGenerateResponse] = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: AnonEndDate): Request_[AdsenseReportsGenerateResponse] = js.native
}

