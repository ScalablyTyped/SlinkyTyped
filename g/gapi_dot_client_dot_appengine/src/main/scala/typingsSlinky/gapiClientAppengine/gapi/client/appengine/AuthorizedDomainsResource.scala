package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAppengine.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: Callback): Request[ListAuthorizedDomainsResponse] = js.native
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(list: Callback => Request[ListAuthorizedDomainsResponse]): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
  @scala.inline
  implicit class AuthorizedDomainsResourceOps[Self <: AuthorizedDomainsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: Callback => Request[ListAuthorizedDomainsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

