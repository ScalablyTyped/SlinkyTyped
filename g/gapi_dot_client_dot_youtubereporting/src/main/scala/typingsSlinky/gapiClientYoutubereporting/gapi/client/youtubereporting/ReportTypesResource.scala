package typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientYoutubereporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTypesResource extends js.Object {
  /** Lists report types. */
  def list(request: AnonFields): Request_[ListReportTypesResponse]
}

object ReportTypesResource {
  @scala.inline
  def apply(list: AnonFields => Request_[ListReportTypesResponse]): ReportTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ReportTypesResource]
  }
}

