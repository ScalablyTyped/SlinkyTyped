package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBigquery.AnonFields
import typingsSlinky.gapiClientBigquery.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: AnonFields): Request_[GetServiceAccountResponse] = js.native
  /** Lists all projects to which you have been granted any project role. */
  def list(request: AnonMaxResults): Request_[ProjectList] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    getServiceAccount: AnonFields => Request_[GetServiceAccountResponse],
    list: AnonMaxResults => Request_[ProjectList]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getServiceAccount = js.Any.fromFunction1(getServiceAccount), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetServiceAccount(value: AnonFields => Request_[GetServiceAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getServiceAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[ProjectList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

