package typingsSlinky.gapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: Fields): Request[UsageReports] = js.native
}

object UserUsageReportResource {
  @scala.inline
  def apply(get: Fields => Request[UsageReports]): UserUsageReportResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[UserUsageReportResource]
  }
  @scala.inline
  implicit class UserUsageReportResourceOps[Self <: UserUsageReportResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Fields => Request[UsageReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

