package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersDraftsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Include drafts from SPAM and TRASH in the results.
    */
  var includeSpamTrash: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of drafts to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Only return draft messages matching the specified query. Supports the
    * same query format as the Gmail search box. For example,
    * "from:someuser@example.com rfc822msgid: is:unread".
    */
  var q: js.UndefOr[String] = js.native
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersDraftsList {
  
  @scala.inline
  def apply(): ParamsResourceUsersDraftsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDraftsList]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersDraftsListMutableBuilder[Self <: ParamsResourceUsersDraftsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeSpamTrash(value: Boolean): Self = StObject.set(x, "includeSpamTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSpamTrashUndefined: Self = StObject.set(x, "includeSpamTrash", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
