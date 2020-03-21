package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppengine.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: AnonCallback): Request_[ListAuthorizedDomainsResponse]
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(list: AnonCallback => Request_[ListAuthorizedDomainsResponse]): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
}

