package typingsSlinky.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexperiencereport.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: AnonAccesstoken): Request_[SiteSummaryResponse] = js.native
}

object SitesResource {
  @scala.inline
  def apply(get: AnonAccesstoken => Request_[SiteSummaryResponse]): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SitesResource]
  }
  @scala.inline
  implicit class SitesResourceOps[Self <: SitesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[SiteSummaryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

