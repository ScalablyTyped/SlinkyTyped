package typingsSlinky.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutubeanalytics.AnonCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieve your YouTube Analytics reports. */
  def query(request: AnonCurrency): Request_[ResultTable]
}

object ReportsResource {
  @scala.inline
  def apply(query: AnonCurrency => Request_[ResultTable]): ReportsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[ReportsResource]
  }
}

