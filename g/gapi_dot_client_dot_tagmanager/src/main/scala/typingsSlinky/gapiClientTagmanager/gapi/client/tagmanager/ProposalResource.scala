package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalResource extends js.Object {
  /** Creates a GTM Workspace Proposal. */
  def create(request: AnonAlt): Request_[WorkspaceProposal]
  /** Deletes a GTM Workspace Proposal. */
  def delete(request: AnonFields): Request_[Unit]
}

object ProposalResource {
  @scala.inline
  def apply(create: AnonAlt => Request_[WorkspaceProposal], delete: AnonFields => Request_[Unit]): ProposalResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
  
    __obj.asInstanceOf[ProposalResource]
  }
}

