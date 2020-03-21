package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAccesstoken
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAccountId
import typingsSlinky.gapiClientAdexchangebuyer2.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationsResource extends js.Object {
  /**
    * Creates and sends out an email invitation to access
    * an Ad Exchange client buyer account.
    */
  def create(request: AnonAccesstoken): Request_[ClientUserInvitation]
  /** Retrieves an existing client user invitation. */
  def get(request: AnonAccountId): Request_[ClientUserInvitation]
  /**
    * Lists all the client users invitations for a client
    * with a given account ID.
    */
  def list(request: AnonAlt): Request_[ListClientUserInvitationsResponse]
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
}

