package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonGroupLicenseId
import typingsSlinky.gapiClientAndroidenterprise.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: AnonGroupLicenseId): Request_[GroupLicense] = js.native
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: AnonKey): Request_[GroupLicensesListResponse] = js.native
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
  @scala.inline
  implicit class GrouplicensesResourceOps[Self <: GrouplicensesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonGroupLicenseId => Request_[GroupLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[GroupLicensesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

