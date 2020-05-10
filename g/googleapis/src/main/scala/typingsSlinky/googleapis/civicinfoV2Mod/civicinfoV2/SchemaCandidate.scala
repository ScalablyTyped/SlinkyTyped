package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a candidate running for elected office.
  */
@js.native
trait SchemaCandidate extends js.Object {
  /**
    * The URL for the candidate&#39;s campaign web site.
    */
  var candidateUrl: js.UndefOr[String] = js.native
  /**
    * A list of known (social) media channels for this candidate.
    */
  var channels: js.UndefOr[js.Array[SchemaChannel]] = js.native
  /**
    * The email address for the candidate&#39;s campaign.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The candidate&#39;s name. If this is a joint ticket it will indicate the
    * name of the candidate at the top of a ticket followed by a / and that
    * name of candidate at the bottom of the ticket. e.g. &quot;Mitt Romney /
    * Paul Ryan&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The order the candidate appears on the ballot for this contest.
    */
  var orderOnBallot: js.UndefOr[String] = js.native
  /**
    * The full name of the party the candidate is a member of.
    */
  var party: js.UndefOr[String] = js.native
  /**
    * The voice phone number for the candidate&#39;s campaign office.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * A URL for a photo of the candidate.
    */
  var photoUrl: js.UndefOr[String] = js.native
}

object SchemaCandidate {
  @scala.inline
  def apply(): SchemaCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCandidate]
  }
  @scala.inline
  implicit class SchemaCandidateOps[Self <: SchemaCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandidateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[SchemaChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
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
    def withOrderOnBallot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderOnBallot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderOnBallot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderOnBallot")(js.undefined)
        ret
    }
    @scala.inline
    def withParty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("party")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("party")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(js.undefined)
        ret
    }
  }
  
}

