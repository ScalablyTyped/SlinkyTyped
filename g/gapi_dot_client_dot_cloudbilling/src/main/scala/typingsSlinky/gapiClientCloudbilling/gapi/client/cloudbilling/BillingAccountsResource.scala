package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCloudbilling.anon.Alt
import typingsSlinky.gapiClientCloudbilling.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingAccountsResource extends js.Object {
  var projects: ProjectsResource = js.native
  /**
    * Gets information about a billing account. The current authenticated user
    * must be an [owner of the billing
    * account](https://support.google.com/cloud/answer/4430947).
    */
  def get(request: Alt): Request[BillingAccount] = js.native
  /**
    * Lists the billing accounts that the current authenticated user
    * [owns](https://support.google.com/cloud/answer/4430947).
    */
  def list(request: Bearertoken): Request[ListBillingAccountsResponse] = js.native
}

object BillingAccountsResource {
  @scala.inline
  def apply(
    get: Alt => Request[BillingAccount],
    list: Bearertoken => Request[ListBillingAccountsResponse],
    projects: ProjectsResource
  ): BillingAccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAccountsResource]
  }
  @scala.inline
  implicit class BillingAccountsResourceOps[Self <: BillingAccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[BillingAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListBillingAccountsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProjects(value: ProjectsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

