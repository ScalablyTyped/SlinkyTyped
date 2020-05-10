package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAccesstoken
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAccountId
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: AnonAccesstoken): Request_[ClientUserInvitation] = js.native
  /** Retrieves an existing client user invitation. */
  def get(request: AnonAccountId): Request_[ClientUserInvitation] = js.native
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: AnonAlt): Request_[ListClientUserInvitationsResponse] = js.native
}

object InvitationsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[ClientUserInvitation],
    get: AnonAccountId => Request_[ClientUserInvitation],
    list: AnonAlt => Request_[ListClientUserInvitationsResponse]
  ): InvitationsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InvitationsResource]
  }
  @scala.inline
  implicit class InvitationsResourceOps[Self <: InvitationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[ClientUserInvitation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccountId => Request_[ClientUserInvitation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListClientUserInvitationsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

