package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Alt
import typingsSlinky.gapiClientTagmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalResource extends js.Object {
  /** Creates a GTM Workspace Proposal. */
  def create(request: Alt): Request[WorkspaceProposal]
  /** Deletes a GTM Workspace Proposal. */
  def delete(request: Fields): Request[Unit]
}

object ProposalResource {
  @scala.inline
  def apply(create: Alt => Request[WorkspaceProposal], delete: Fields => Request[Unit]): ProposalResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
    __obj.asInstanceOf[ProposalResource]
  }
}

