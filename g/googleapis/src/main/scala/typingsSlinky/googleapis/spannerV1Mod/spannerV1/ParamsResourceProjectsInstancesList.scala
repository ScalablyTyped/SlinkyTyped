package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsInstancesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * An expression for filtering the results of the request. Filter rules are
    * case insensitive. The fields eligible for filtering are:    * `name`   *
    * `display_name`   * `labels.key` where key is the name of a label  Some
    * examples of using filters are:    * `name:*` --> The instance has a name.
    * * `name:Howl` --> The instance's name contains the string "howl".   *
    * `name:HOWL` --> Equivalent to above.   * `NAME:howl` --> Equivalent to
    * above.   * `labels.env:*` --> The instance has the label "env".   *
    * `labels.env:dev` --> The instance has the label "env" and the value of
    * the label contains the string "dev".   * `name:howl labels.env:dev` -->
    * The instance's name contains "howl" and it has the label "env" with its
    * value                                  containing "dev".
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Number of instances to be returned in the response. If 0 or less,
    * defaults to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * If non-empty, `page_token` should contain a next_page_token from a
    * previous ListInstancesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the project for which a list of instances is
    * requested. Values are of the form `projects/<project>`.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsInstancesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesListMutableBuilder[Self <: ParamsResourceProjectsInstancesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
