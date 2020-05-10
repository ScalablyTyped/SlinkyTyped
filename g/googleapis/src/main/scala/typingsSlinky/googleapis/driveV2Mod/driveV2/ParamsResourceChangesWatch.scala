package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChangesWatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether changes should include the file resource if the file is still
    * accessible by the user at the time of the request, even when a file was
    * removed from the list of changes and there will be no further change
    * entries for this file.
    */
  var includeCorpusRemovals: js.UndefOr[Boolean] = js.native
  /**
    * Whether to include changes indicating that items have been removed from
    * the list of changes, for example by deletion or loss of access.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Whether to include changes outside the My Drive hierarchy in the result.
    * When set to false, changes to files such as those in the Application Data
    * folder or shared files which have not been added to My Drive will be
    * omitted from the result.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.native
  /**
    * Whether Team Drive files or changes should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of changes to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of 'nextPageToken' from the previous response
    * or to the response from the getStartPageToken method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.native
  /**
    * A comma-separated list of spaces to query. Supported values are 'drive',
    * 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.native
  /**
    * Deprecated - use pageToken instead.
    */
  var startChangeId: js.UndefOr[String] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * The Team Drive from which changes will be returned. If specified the
    * change IDs will be reflective of the Team Drive; use the combined Team
    * Drive ID and change ID as an identifier.
    */
  var teamDriveId: js.UndefOr[String] = js.native
}

object ParamsResourceChangesWatch {
  @scala.inline
  def apply(): ParamsResourceChangesWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesWatch]
  }
  @scala.inline
  implicit class ParamsResourceChangesWatchOps[Self <: ParamsResourceChangesWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIncludeCorpusRemovals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCorpusRemovals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCorpusRemovals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCorpusRemovals")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSubscribed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubscribed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSubscribed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSubscribed")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTeamDriveItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTeamDriveItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTeamDriveItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTeamDriveItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaChannel): Self = {
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
    def withSpaces(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
    @scala.inline
    def withStartChangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartChangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChangeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsTeamDrives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTeamDrives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsTeamDrives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTeamDrives")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDriveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDriveId")(js.undefined)
        ret
    }
  }
  
}

