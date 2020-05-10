package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a voter info lookup query.
  */
@js.native
trait SchemaVoterInfoResponse extends js.Object {
  /**
    * Contests that will appear on the voter&#39;s ballot.
    */
  var contests: js.UndefOr[js.Array[SchemaContest]] = js.native
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The
    * voter must have received and completed a ballot prior to arriving at the
    * location. The location may not have ballots available on the premises.
    * These locations could be open on or before election day as indicated in
    * the pollingHours field.
    */
  var dropOffLocations: js.UndefOr[js.Array[SchemaPollingLocation]] = js.native
  /**
    * Locations where the voter is eligible to vote early, prior to election
    * day.
    */
  var earlyVoteSites: js.UndefOr[js.Array[SchemaPollingLocation]] = js.native
  /**
    * The election that was queried.
    */
  var election: js.UndefOr[SchemaElection] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#voterInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Specifies whether voters in the precinct vote only by mailing their
    * ballots (with the possible option of dropping off their ballots as well).
    */
  var mailOnly: js.UndefOr[Boolean] = js.native
  /**
    * The normalized version of the requested address
    */
  var normalizedInput: js.UndefOr[SchemaSimpleAddressType] = js.native
  /**
    * When there are multiple elections for a voter address, the otherElections
    * field is populated in the API response and there are two
    * possibilities: 1. If the earliest election is not the intended election,
    * specify the election ID of the desired election in a second API request
    * using the electionId field. 2. If these elections occur on the same day,
    * the API doesn?t return any polling location, contest, or election
    * official information to ensure that an additional query is made. For
    * user-facing applications, we recommend displaying these elections to the
    * user to disambiguate. A second API request using the electionId field
    * should be made for the election that is relevant to the user.
    */
  var otherElections: js.UndefOr[js.Array[SchemaElection]] = js.native
  /**
    * Locations where the voter is eligible to vote on election day.
    */
  var pollingLocations: js.UndefOr[js.Array[SchemaPollingLocation]] = js.native
  var precinctId: js.UndefOr[String] = js.native
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.native
  /**
    * Local Election Information for the state that the voter votes in. For the
    * US, there will only be one element in this array.
    */
  var state: js.UndefOr[js.Array[SchemaAdministrationRegion]] = js.native
}

object SchemaVoterInfoResponse {
  @scala.inline
  def apply(): SchemaVoterInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoResponse]
  }
  @scala.inline
  implicit class SchemaVoterInfoResponseOps[Self <: SchemaVoterInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContests(value: js.Array[SchemaContest]): Self = {
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
    def withDropOffLocations(value: js.Array[SchemaPollingLocation]): Self = {
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
    def withEarlyVoteSites(value: js.Array[SchemaPollingLocation]): Self = {
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
    def withElection(value: SchemaElection): Self = {
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
    def withNormalizedInput(value: SchemaSimpleAddressType): Self = {
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
    def withOtherElections(value: js.Array[SchemaElection]): Self = {
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
    def withPollingLocations(value: js.Array[SchemaPollingLocation]): Self = {
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
    def withSegments(value: js.Array[SchemaStreetSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: js.Array[SchemaAdministrationRegion]): Self = {
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

