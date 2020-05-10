package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonBearertoken
import typingsSlinky.gapiClientPartners.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeadsResource extends js.Object {
  /** Creates an advertiser lead for the given company ID. */
  def create(request: AnonBearertoken): Request_[CreateLeadResponse] = js.native
  /**
    * Lists advertiser leads for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: AnonCallback): Request_[ListLeadsResponse] = js.native
}

object LeadsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[CreateLeadResponse],
    list: AnonCallback => Request_[ListLeadsResponse]
  ): LeadsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LeadsResource]
  }
  @scala.inline
  implicit class LeadsResourceOps[Self <: LeadsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[CreateLeadResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[ListLeadsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

