package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceElectionsVoterinfoquery extends StandardParameters {
  /**
    * The registered address of the voter to look up.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID of the election to look up. A list of election IDs can be
    * obtained at https://www.googleapis.com/civicinfo/{version}/electionsIf no
    * election ID is specified in the query and there is more than one election
    * with data for the given voter, the additional elections are provided in
    * the otherElections response field.
    */
  var electionId: js.UndefOr[String] = js.native
  /**
    * If set to true, only data from official state sources will be returned.
    */
  var officialOnly: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVoterInfoRequest] = js.native
  /**
    * If set to true, the query will return the success codeand include any
    * partial information when it is unable to determine a matching address or
    * unable to determine the election for electionId=0 queries.
    */
  var returnAllAvailableData: js.UndefOr[Boolean] = js.native
}

object ParamsResourceElectionsVoterinfoquery {
  @scala.inline
  def apply(): ParamsResourceElectionsVoterinfoquery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceElectionsVoterinfoquery]
  }
  @scala.inline
  implicit class ParamsResourceElectionsVoterinfoqueryOps[Self <: ParamsResourceElectionsVoterinfoquery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withElectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionId")(js.undefined)
        ret
    }
    @scala.inline
    def withOfficialOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officialOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficialOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officialOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaVoterInfoRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnAllAvailableData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnAllAvailableData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnAllAvailableData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnAllAvailableData")(js.undefined)
        ret
    }
  }
  
}

