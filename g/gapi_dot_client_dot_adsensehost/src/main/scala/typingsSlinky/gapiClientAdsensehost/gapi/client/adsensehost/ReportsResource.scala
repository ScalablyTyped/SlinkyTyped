package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdsensehost.anon.Dimension
import typingsSlinky.gapiClientAdsensehost.anon.EndDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: Dimension): Request[Report] = js.native
  /**
    * Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format
    * specify "alt=csv" as a query parameter.
    */
  def generate(request: EndDate): Request[Report] = js.native
}

