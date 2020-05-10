package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsResource extends js.Object {
  /**
    * Lists analytics data for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: AnonAccesstoken): Request_[ListAnalyticsResponse] = js.native
}

object AnalyticsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => Request_[ListAnalyticsResponse]): AnalyticsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnalyticsResource]
  }
  @scala.inline
  implicit class AnalyticsResourceOps[Self <: AnalyticsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAccesstoken => Request_[ListAnalyticsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

