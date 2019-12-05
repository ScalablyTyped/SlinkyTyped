package typingsSlinky.gapiDotClientDotAdmin.gapi.client.admin

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotAdmin.Anon_AltCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerUsageReportsResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a specific customer. */
  def get(request: Anon_AltCustomerId): Request[UsageReports]
}

object CustomerUsageReportsResource {
  @scala.inline
  def apply(get: Anon_AltCustomerId => Request[UsageReports]): CustomerUsageReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[CustomerUsageReportsResource]
  }
}

