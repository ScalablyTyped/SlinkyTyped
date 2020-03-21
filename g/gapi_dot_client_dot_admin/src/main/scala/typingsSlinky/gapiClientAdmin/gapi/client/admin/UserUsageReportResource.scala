package typingsSlinky.gapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdmin.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: AnonFields): Request_[UsageReports]
}

object UserUsageReportResource {
  @scala.inline
  def apply(get: AnonFields => Request_[UsageReports]): UserUsageReportResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UserUsageReportResource]
  }
}

