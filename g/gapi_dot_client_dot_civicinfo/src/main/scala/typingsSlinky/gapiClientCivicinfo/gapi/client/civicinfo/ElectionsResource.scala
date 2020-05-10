package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCivicinfo.AnonAddress
import typingsSlinky.gapiClientCivicinfo.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectionsResource extends js.Object {
  /** List of available elections to query. */
  def electionQuery(request: AnonFields): Request_[ElectionsQueryResponse] = js.native
  /** Looks up information relevant to a voter based on the voter's registered address. */
  def voterInfoQuery(request: AnonAddress): Request_[VoterInfoResponse] = js.native
}

object ElectionsResource {
  @scala.inline
  def apply(
    electionQuery: AnonFields => Request_[ElectionsQueryResponse],
    voterInfoQuery: AnonAddress => Request_[VoterInfoResponse]
  ): ElectionsResource = {
    val __obj = js.Dynamic.literal(electionQuery = js.Any.fromFunction1(electionQuery), voterInfoQuery = js.Any.fromFunction1(voterInfoQuery))
    __obj.asInstanceOf[ElectionsResource]
  }
  @scala.inline
  implicit class ElectionsResourceOps[Self <: ElectionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElectionQuery(value: AnonFields => Request_[ElectionsQueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVoterInfoQuery(value: AnonAddress => Request_[VoterInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterInfoQuery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

