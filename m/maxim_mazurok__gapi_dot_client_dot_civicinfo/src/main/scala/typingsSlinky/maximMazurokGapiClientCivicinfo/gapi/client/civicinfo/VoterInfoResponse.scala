package typingsSlinky.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoterInfoResponse extends StObject {
  
  /** Contests that will appear on the voter's ballot. */
  var contests: js.UndefOr[js.Array[Contest]] = js.native
  
  /**
    * Locations where a voter is eligible to drop off a completed ballot. The voter must have received and completed a ballot prior to arriving at the location. The location may not have
    * ballots available on the premises. These locations could be open on or before election day as indicated in the pollingHours field.
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
    * When there are multiple elections for a voter address, the otherElections field is populated in the API response and there are two possibilities: 1. If the earliest election is not
    * the intended election, specify the election ID of the desired election in a second API request using the electionId field. 2. If these elections occur on the same day, the API
    * doesn?t return any polling location, contest, or election official information to ensure that an additional query is made. For user-facing applications, we recommend displaying
    * these elections to the user to disambiguate. A second API request using the electionId field should be made for the election that is relevant to the user.
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
  implicit class VoterInfoResponseMutableBuilder[Self <: VoterInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContests(value: js.Array[Contest]): Self = StObject.set(x, "contests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContestsUndefined: Self = StObject.set(x, "contests", js.undefined)
    
    @scala.inline
    def setContestsVarargs(value: Contest*): Self = StObject.set(x, "contests", js.Array(value :_*))
    
    @scala.inline
    def setDropOffLocations(value: js.Array[PollingLocation]): Self = StObject.set(x, "dropOffLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropOffLocationsUndefined: Self = StObject.set(x, "dropOffLocations", js.undefined)
    
    @scala.inline
    def setDropOffLocationsVarargs(value: PollingLocation*): Self = StObject.set(x, "dropOffLocations", js.Array(value :_*))
    
    @scala.inline
    def setEarlyVoteSites(value: js.Array[PollingLocation]): Self = StObject.set(x, "earlyVoteSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyVoteSitesUndefined: Self = StObject.set(x, "earlyVoteSites", js.undefined)
    
    @scala.inline
    def setEarlyVoteSitesVarargs(value: PollingLocation*): Self = StObject.set(x, "earlyVoteSites", js.Array(value :_*))
    
    @scala.inline
    def setElection(value: Election): Self = StObject.set(x, "election", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionUndefined: Self = StObject.set(x, "election", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMailOnly(value: Boolean): Self = StObject.set(x, "mailOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailOnlyUndefined: Self = StObject.set(x, "mailOnly", js.undefined)
    
    @scala.inline
    def setNormalizedInput(value: SimpleAddressType): Self = StObject.set(x, "normalizedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedInputUndefined: Self = StObject.set(x, "normalizedInput", js.undefined)
    
    @scala.inline
    def setOtherElections(value: js.Array[Election]): Self = StObject.set(x, "otherElections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherElectionsUndefined: Self = StObject.set(x, "otherElections", js.undefined)
    
    @scala.inline
    def setOtherElectionsVarargs(value: Election*): Self = StObject.set(x, "otherElections", js.Array(value :_*))
    
    @scala.inline
    def setPollingLocations(value: js.Array[PollingLocation]): Self = StObject.set(x, "pollingLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingLocationsUndefined: Self = StObject.set(x, "pollingLocations", js.undefined)
    
    @scala.inline
    def setPollingLocationsVarargs(value: PollingLocation*): Self = StObject.set(x, "pollingLocations", js.Array(value :_*))
    
    @scala.inline
    def setPrecinctId(value: String): Self = StObject.set(x, "precinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecinctIdUndefined: Self = StObject.set(x, "precinctId", js.undefined)
    
    @scala.inline
    def setState(value: js.Array[AdministrationRegion]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStateVarargs(value: AdministrationRegion*): Self = StObject.set(x, "state", js.Array(value :_*))
  }
}
