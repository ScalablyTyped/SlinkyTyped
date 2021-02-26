package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTimelineList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * If provided, only items with the given bundleId will be returned.
    */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * If true, tombstone records for deleted items will be returned.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of items to include in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Controls the order in which timeline items are returned.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * Token for the page of results to return.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * If true, only pinned items will be returned.
    */
  var pinnedOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * If provided, only items with the given sourceItemId will be returned.
    */
  var sourceItemId: js.UndefOr[String] = js.native
}
object ParamsResourceTimelineList {
  
  @scala.inline
  def apply(): ParamsResourceTimelineList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTimelineList]
  }
  
  @scala.inline
  implicit class ParamsResourceTimelineListMutableBuilder[Self <: ParamsResourceTimelineList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
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
    def setPinnedOnly(value: Boolean): Self = StObject.set(x, "pinnedOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedOnlyUndefined: Self = StObject.set(x, "pinnedOnly", js.undefined)
    
    @scala.inline
    def setSourceItemId(value: String): Self = StObject.set(x, "sourceItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceItemIdUndefined: Self = StObject.set(x, "sourceItemId", js.undefined)
  }
}
