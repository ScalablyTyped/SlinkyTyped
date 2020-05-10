package typingsSlinky.gapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdmin.AnonDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerUsageReportsResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a specific customer. */
  def get(request: AnonDate): Request_[UsageReports] = js.native
}

object CustomerUsageReportsResource {
  @scala.inline
  def apply(get: AnonDate => Request_[UsageReports]): CustomerUsageReportsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[CustomerUsageReportsResource]
  }
  @scala.inline
  implicit class CustomerUsageReportsResourceOps[Self <: CustomerUsageReportsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonDate => Request_[UsageReports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

