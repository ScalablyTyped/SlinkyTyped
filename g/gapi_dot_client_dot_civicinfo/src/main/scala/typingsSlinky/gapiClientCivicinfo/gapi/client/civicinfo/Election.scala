package typingsSlinky.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Election extends js.Object {
  /** Day of the election in YYYY-MM-DD format. */
  var electionDay: js.UndefOr[String] = js.native
  /** The unique ID of this election. */
  var id: js.UndefOr[String] = js.native
  /** A displayable name for the election. */
  var name: js.UndefOr[String] = js.native
  /**
    * The political division of the election. Represented as an OCD Division ID. Voters within these political jurisdictions are covered by this election.
    * This is typically a state such as ocd-division/country:us/state:ca or for the midterms or general election the entire US (i.e.
    * ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[String] = js.native
}

object Election {
  @scala.inline
  def apply(): Election = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Election]
  }
  @scala.inline
  implicit class ElectionOps[Self <: Election] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElectionDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionDay")(js.undefined)
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
    def withOcdDivisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocdDivisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOcdDivisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocdDivisionId")(js.undefined)
        ret
    }
  }
  
}

