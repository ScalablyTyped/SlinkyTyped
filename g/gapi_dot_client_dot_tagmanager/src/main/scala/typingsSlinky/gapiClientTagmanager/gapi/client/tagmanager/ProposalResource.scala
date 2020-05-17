package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Alt
import typingsSlinky.gapiClientTagmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProposalResource extends js.Object {
  /** Creates a GTM Workspace Proposal. */
  def create(request: Alt): Request[WorkspaceProposal] = js.native
  /** Deletes a GTM Workspace Proposal. */
  def delete(request: Fields): Request[Unit] = js.native
}

object ProposalResource {
  @scala.inline
  def apply(create: Alt => Request[WorkspaceProposal], delete: Fields => Request[Unit]): ProposalResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
    __obj.asInstanceOf[ProposalResource]
  }
  @scala.inline
  implicit class ProposalResourceOps[Self <: ProposalResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Alt => Request[WorkspaceProposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

