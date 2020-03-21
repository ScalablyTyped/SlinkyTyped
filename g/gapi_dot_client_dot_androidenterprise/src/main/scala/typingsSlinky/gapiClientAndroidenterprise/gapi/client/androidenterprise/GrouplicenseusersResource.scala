package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonGroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicenseusersResource extends js.Object {
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(request: AnonGroupLicenseId): Request_[GroupLicenseUsersListResponse]
}

object GrouplicenseusersResource {
  @scala.inline
  def apply(list: AnonGroupLicenseId => Request_[GroupLicenseUsersListResponse]): GrouplicenseusersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GrouplicenseusersResource]
  }
}

