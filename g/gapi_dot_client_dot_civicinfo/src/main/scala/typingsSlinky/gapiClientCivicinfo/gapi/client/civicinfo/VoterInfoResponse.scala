package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoterInfoResponse extends js.Object {
  /** Contests that will appear on the voter's ballot. */
  var contests: js.UndefOr[js.Array[Contest]] = js.native
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises. These locations could be open on or before election day as indicated in the
    * pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[PollingLocation]] = js.native
  /** Locations where the voter is eligible to vote early, prior to election day. */
  var earlyVoteSites: js.UndefOr[js.Array[PollingLocation]] = js.native
  /** The election that was queried. */
  var election: js.UndefOr[Election] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#voterInfoResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Specifies whether voters in the precinct vote only by mailing their ballots (with the possible option of dropping off their ballots as well). */
  var mailOnly: js.UndefOr[Boolean] = js.native
  /** The normalized version of the requested address */
  var normalizedInput: js.UndefOr[SimpleAddressType] = js.native
  /**
    * If no election ID was specified in the query, and there was more than one election with data for the given voter, this will contain information about
    * the other elections that could apply.
    */
  var otherElections: js.UndefOr[js.Array[Election]] = js.native
  /** Locations where the voter is eligible to vote on election day. */
  var pollingLocations: js.UndefOr[js.Array[PollingLocation]] = js.native
  var precinctId: js.UndefOr[String] = js.native
  /** Local Election Information for the state that the voter votes in. For the US, there will only be one element in this array. */
  var state: js.UndefOr[js.Array[AdministrationRegion]] = js.native
}

object VoterInfoResponse {
  @scala.inline
  def apply(): VoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoterInfoResponse]
  }
  @scala.inline
  implicit class VoterInfoResponseOps[Self <: VoterInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContests(value: js.Array[Contest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contests")(js.undefined)
        ret
    }
    @scala.inline
    def withDropOffLocations(value: js.Array[PollingLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOffLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropOffLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropOffLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withEarlyVoteSites(value: js.Array[PollingLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyVoteSites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyVoteSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyVoteSites")(js.undefined)
        ret
    }
    @scala.inline
    def withElection(value: Election): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("election")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("election")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMailOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizedInput(value: SimpleAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizedInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOtherElections(value: js.Array[Election]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherElections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherElections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherElections")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingLocations(value: js.Array[PollingLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecinctId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecinctId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: js.Array[AdministrationRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

