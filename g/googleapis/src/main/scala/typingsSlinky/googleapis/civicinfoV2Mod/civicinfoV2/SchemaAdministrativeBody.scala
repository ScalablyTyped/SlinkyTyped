package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an election administrative body (e.g. County Board of
  * Elections).
  */
@js.native
trait SchemaAdministrativeBody extends js.Object {
  /**
    * A URL provided by this administrative body for information on absentee
    * voting.
    */
  var absenteeVotingInfoUrl: js.UndefOr[String] = js.native
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  /**
    * A URL provided by this administrative body to give contest information to
    * the voter.
    */
  var ballotInfoUrl: js.UndefOr[String] = js.native
  /**
    * The mailing address of this administrative body.
    */
  var correspondenceAddress: js.UndefOr[SchemaSimpleAddressType] = js.native
  /**
    * A URL provided by this administrative body for looking up general
    * election information.
    */
  var electionInfoUrl: js.UndefOr[String] = js.native
  /**
    * The election officials for this election administrative body.
    */
  var electionOfficials: js.UndefOr[js.Array[SchemaElectionOfficial]] = js.native
  /**
    * A URL provided by this administrative body for confirming that the voter
    * is registered to vote.
    */
  var electionRegistrationConfirmationUrl: js.UndefOr[String] = js.native
  /**
    * A URL provided by this administrative body for looking up how to register
    * to vote.
    */
  var electionRegistrationUrl: js.UndefOr[String] = js.native
  /**
    * A URL provided by this administrative body describing election rules to
    * the voter.
    */
  var electionRulesUrl: js.UndefOr[String] = js.native
  /**
    * A description of the hours of operation for this administrative body.
    */
  var hoursOfOperation: js.UndefOr[String] = js.native
  /**
    * The name of this election administrative body.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The physical address of this administrative body.
    */
  var physicalAddress: js.UndefOr[SchemaSimpleAddressType] = js.native
  /**
    * A description of the services this administrative body may provide.
    */
  var voter_services: js.UndefOr[js.Array[String]] = js.native
  /**
    * A URL provided by this administrative body for looking up where to vote.
    */
  var votingLocationFinderUrl: js.UndefOr[String] = js.native
}

object SchemaAdministrativeBody {
  @scala.inline
  def apply(): SchemaAdministrativeBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrativeBody]
  }
  @scala.inline
  implicit class SchemaAdministrativeBodyOps[Self <: SchemaAdministrativeBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsenteeVotingInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absenteeVotingInfoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsenteeVotingInfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absenteeVotingInfoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLines")(js.undefined)
        ret
    }
    @scala.inline
    def withBallotInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ballotInfoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBallotInfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ballotInfoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrespondenceAddress(value: SchemaSimpleAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correspondenceAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrespondenceAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correspondenceAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionInfoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionInfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionInfoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionOfficials(value: js.Array[SchemaElectionOfficial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionOfficials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionOfficials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionOfficials")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionRegistrationConfirmationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionRegistrationConfirmationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionRegistrationConfirmationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionRegistrationConfirmationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionRegistrationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionRegistrationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionRegistrationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionRegistrationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionRulesUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionRulesUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionRulesUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionRulesUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHoursOfOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursOfOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursOfOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursOfOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalAddress(value: SchemaSimpleAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withVoter_services(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voter_services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoter_services: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voter_services")(js.undefined)
        ret
    }
    @scala.inline
    def withVotingLocationFinderUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("votingLocationFinderUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVotingLocationFinderUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("votingLocationFinderUrl")(js.undefined)
        ret
    }
  }
  
}

