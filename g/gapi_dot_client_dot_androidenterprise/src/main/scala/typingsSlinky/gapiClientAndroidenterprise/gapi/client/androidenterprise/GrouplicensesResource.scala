package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonGroupLicenseId
import typingsSlinky.gapiClientAndroidenterprise.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: AnonGroupLicenseId): Request_[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: AnonKey): Request_[GroupLicensesListResponse]
}

object GrouplicensesResource {
  @scala.inline
  def apply(
    get: AnonGroupLicenseId => Request_[GroupLicense],
    list: AnonKey => Request_[GroupLicensesListResponse]
  ): GrouplicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GrouplicensesResource]
  }
}

