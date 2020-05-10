package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonFields
import typingsSlinky.gapiClientAdexchangebuyer.AnonOauthtoken
import typingsSlinky.gapiClientAdexchangebuyer.AnonProposalId
import typingsSlinky.gapiClientAdexchangebuyer.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProposalsResource extends js.Object {
  /** Get a proposal given its id */
  def get(request: AnonOauthtoken): Request_[Proposal] = js.native
  /** Create the given list of proposals */
  def insert(request: AnonFields): Request_[CreateOrdersResponse] = js.native
  /** Update the given proposal. This method supports patch semantics. */
  def patch(request: AnonProposalId): Request_[Proposal] = js.native
  /** Search for proposals using pql query */
  def search(request: AnonUserIp): Request_[GetOrdersResponse] = js.native
  /** Update the given proposal to indicate that setup has been completed. */
  def setupcomplete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Update the given proposal */
  def update(request: AnonProposalId): Request_[Proposal] = js.native
}

object ProposalsResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Proposal],
    insert: AnonFields => Request_[CreateOrdersResponse],
    patch: AnonProposalId => Request_[Proposal],
    search: AnonUserIp => Request_[GetOrdersResponse],
    setupcomplete: AnonOauthtoken => Request_[Unit],
    update: AnonProposalId => Request_[Proposal]
  ): ProposalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search), setupcomplete = js.Any.fromFunction1(setupcomplete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProposalsResource]
  }
  @scala.inline
  implicit class ProposalsResourceOps[Self <: ProposalsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Proposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[CreateOrdersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonProposalId => Request_[Proposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonUserIp => Request_[GetOrdersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetupcomplete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupcomplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonProposalId => Request_[Proposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

