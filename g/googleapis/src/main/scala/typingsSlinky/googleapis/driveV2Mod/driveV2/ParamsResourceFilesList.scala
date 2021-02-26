package typingsSlinky.googleapis.driveV2Mod.driveV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceFilesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Comma-separated list of bodies of items (files/documents) to which the
    * query applies. Supported bodies are 'default', 'domain', 'teamDrive' and
    * 'allTeamDrives'. 'allTeamDrives' must be combined with 'default'; all
    * other values must be used in isolation. Prefer 'default' or 'teamDrive'
    * to 'allTeamDrives' for efficiency.
    */
  var corpora: js.UndefOr[String] = js.native
  
  /**
    * The body of items (files/documents) to which the query applies.
    * Deprecated: use 'corpora' instead.
    */
  var corpus: js.UndefOr[String] = js.native
  
  /**
    * Whether Team Drive items should be included in results.
    */
  var includeTeamDriveItems: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of files to return per page. Partial or empty result
    * pages are possible even before the end of the files list has been
    * reached.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdDate',
    * 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate',
    * 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', 'title', and
    * 'title_natural'. Each key sorts ascending by default, but may be reversed
    * with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate
    * desc,title. Please note that there is a current limitation for users with
    * approximately one million files in which the requested sort order is
    * ignored.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Page token for files.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * This parameter is deprecated and has no function.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Query string for searching files.
    */
  var q: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of spaces to query. Supported values are 'drive',
    * 'appDataFolder' and 'photos'.
    */
  var spaces: js.UndefOr[String] = js.native
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of Team Drive to search.
    */
  var teamDriveId: js.UndefOr[String] = js.native
}
object ParamsResourceFilesList {
  
  @scala.inline
  def apply(): ParamsResourceFilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesList]
  }
  
  @scala.inline
  implicit class ParamsResourceFilesListMutableBuilder[Self <: ParamsResourceFilesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCorpora(value: String): Self = StObject.set(x, "corpora", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorporaUndefined: Self = StObject.set(x, "corpora", js.undefined)
    
    @scala.inline
    def setCorpus(value: String): Self = StObject.set(x, "corpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorpusUndefined: Self = StObject.set(x, "corpus", js.undefined)
    
    @scala.inline
    def setIncludeTeamDriveItems(value: Boolean): Self = StObject.set(x, "includeTeamDriveItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTeamDriveItemsUndefined: Self = StObject.set(x, "includeTeamDriveItems", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setSpaces(value: String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
