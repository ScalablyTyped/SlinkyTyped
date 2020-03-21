package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonReportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsResource extends js.Object {
  /** Lists all columns for a report type */
  def list(request: AnonReportType): Request_[Columns]
}

object ColumnsResource {
  @scala.inline
  def apply(list: AnonReportType => Request_[Columns]): ColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ColumnsResource]
  }
}

