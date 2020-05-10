package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsListXpnHostsRequest extends js.Object {
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be
    * inferred from the project.
    */
  var organization: js.UndefOr[String] = js.native
}

object ProjectsListXpnHostsRequest {
  @scala.inline
  def apply(): ProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsListXpnHostsRequest]
  }
  @scala.inline
  implicit class ProjectsListXpnHostsRequestOps[Self <: ProjectsListXpnHostsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
        ret
    }
  }
  
}

