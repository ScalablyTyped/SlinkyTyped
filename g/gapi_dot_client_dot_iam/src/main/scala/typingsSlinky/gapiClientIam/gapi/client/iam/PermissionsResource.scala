package typingsSlinky.gapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientIam.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsResource extends js.Object {
  /**
    * Lists the permissions testable on a resource.
    * A permission is testable if it can be tested for an identity on a resource.
    */
  def queryTestablePermissions(request: AnonOauthtoken): Request_[QueryTestablePermissionsResponse] = js.native
}

object PermissionsResource {
  @scala.inline
  def apply(queryTestablePermissions: AnonOauthtoken => Request_[QueryTestablePermissionsResponse]): PermissionsResource = {
    val __obj = js.Dynamic.literal(queryTestablePermissions = js.Any.fromFunction1(queryTestablePermissions))
    __obj.asInstanceOf[PermissionsResource]
  }
  @scala.inline
  implicit class PermissionsResourceOps[Self <: PermissionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryTestablePermissions(value: AnonOauthtoken => Request_[QueryTestablePermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTestablePermissions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

