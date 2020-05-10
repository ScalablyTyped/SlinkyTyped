package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a contest that appears on a voter&#39;s ballot.
  */
@js.native
trait SchemaContest extends js.Object {
  /**
    * A number specifying the position of this contest on the voter&#39;s
    * ballot.
    */
  var ballotPlacement: js.UndefOr[String] = js.native
  /**
    * The official title on the ballot for this contest, only where available.
    */
  var ballotTitle: js.UndefOr[String] = js.native
  /**
    * The candidate choices for this contest.
    */
  var candidates: js.UndefOr[js.Array[SchemaCandidate]] = js.native
  /**
    * Information about the electoral district that this contest is in.
    */
  var district: js.UndefOr[SchemaElectoralDistrict] = js.native
  /**
    * A description of any additional eligibility requirements for voting in
    * this contest.
    */
  var electorateSpecifications: js.UndefOr[String] = js.native
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The levels of government of the office for this contest. There may be
    * more than one in cases where a jurisdiction effectively acts at two
    * different levels of government; for example, the mayor of the District of
    * Columbia acts at &quot;locality&quot; level, but also effectively at both
    * &quot;administrative-area-2&quot; and &quot;administrative-area-1&quot;.
    */
  var level: js.UndefOr[js.Array[String]] = js.native
  /**
    * The number of candidates that will be elected to office in this contest.
    */
  var numberElected: js.UndefOr[String] = js.native
  /**
    * The number of candidates that a voter may vote for in this contest.
    */
  var numberVotingFor: js.UndefOr[String] = js.native
  /**
    * The name of the office for this contest.
    */
  var office: js.UndefOr[String] = js.native
  /**
    * If this is a partisan election, the name of the party it is for.
    */
  var primaryParty: js.UndefOr[String] = js.native
  /**
    * The set of ballot responses for the referendum. A ballot response
    * represents a line on the ballot. Common examples might include
    * &quot;yes&quot; or &quot;no&quot; for referenda. This field is only
    * populated for contests of type &#39;Referendum&#39;.
    */
  var referendumBallotResponses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies a short summary of the referendum that is typically on the
    * ballot below the title but above the text. This field is only populated
    * for contests of type &#39;Referendum&#39;.
    */
  var referendumBrief: js.UndefOr[String] = js.native
  /**
    * A statement in opposition to the referendum. It does not necessarily
    * appear on the ballot. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumConStatement: js.UndefOr[String] = js.native
  /**
    * Specifies what effect abstaining (not voting) on the proposition will
    * have (i.e. whether abstaining is considered a vote against it). This
    * field is only populated for contests of type &#39;Referendum&#39;.
    */
  var referendumEffectOfAbstain: js.UndefOr[String] = js.native
  /**
    * The threshold of votes that the referendum needs in order to pass, e.g.
    * &quot;two-thirds&quot;. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumPassageThreshold: js.UndefOr[String] = js.native
  /**
    * A statement in favor of the referendum. It does not necessarily appear on
    * the ballot. This field is only populated for contests of type
    * &#39;Referendum&#39;.
    */
  var referendumProStatement: js.UndefOr[String] = js.native
  /**
    * A brief description of the referendum. This field is only populated for
    * contests of type &#39;Referendum&#39;.
    */
  var referendumSubtitle: js.UndefOr[String] = js.native
  /**
    * The full text of the referendum. This field is only populated for
    * contests of type &#39;Referendum&#39;.
    */
  var referendumText: js.UndefOr[String] = js.native
  /**
    * The title of the referendum (e.g. &#39;Proposition 42&#39;). This field
    * is only populated for contests of type &#39;Referendum&#39;.
    */
  var referendumTitle: js.UndefOr[String] = js.native
  /**
    * A link to the referendum. This field is only populated for contests of
    * type &#39;Referendum&#39;.
    */
  var referendumUrl: js.UndefOr[String] = js.native
  /**
    * The roles which this office fulfills.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of sources for this contest. If multiple sources are listed, the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
  /**
    * &quot;Yes&quot; or &quot;No&quot; depending on whether this a contest
    * being held outside the normal election cycle.
    */
  var special: js.UndefOr[String] = js.native
  /**
    * The type of contest. Usually this will be &#39;General&#39;,
    * &#39;Primary&#39;, or &#39;Run-off&#39; for contests with candidates. For
    * referenda this will be &#39;Referendum&#39;. For Retention contests this
    * will typically be &#39;Retention&#39;.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaContest {
  @scala.inline
  def apply(): SchemaContest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContest]
  }
  @scala.inline
  implicit class SchemaContestOps[Self <: SchemaContest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBallotPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ballotPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBallotPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ballotPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withBallotTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ballotTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBallotTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ballotTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCandidates(value: js.Array[SchemaCandidate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrict(value: SchemaElectoralDistrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(js.undefined)
        ret
    }
    @scala.inline
    def withElectorateSpecifications(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electorateSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectorateSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electorateSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberElected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberElected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberElected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberElected")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberVotingFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberVotingFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberVotingFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberVotingFor")(js.undefined)
        ret
    }
    @scala.inline
    def withOffice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("office")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("office")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryParty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryParty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryParty")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumBallotResponses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumBallotResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumBallotResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumBallotResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumBrief(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumBrief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumBrief: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumBrief")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumConStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumConStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumConStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumConStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumEffectOfAbstain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumEffectOfAbstain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumEffectOfAbstain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumEffectOfAbstain")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumPassageThreshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumPassageThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumPassageThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumPassageThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumProStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumProStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumProStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumProStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumText")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withReferendumUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferendumUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referendumUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[SchemaSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("special")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

