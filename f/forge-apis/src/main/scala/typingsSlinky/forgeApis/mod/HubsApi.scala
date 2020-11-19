package typingsSlinky.forgeApis.mod

import typingsSlinky.forgeApis.anon.FilterExtensionTypeFilterId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "HubsApi")
@js.native
class HubsApi () extends js.Object {
  
  /**
    * Returns data on a specific `hub_id`.
    */
  def getHub(hubId: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns a collection of accessible hubs for this member. A Hub represents an A360 Team/Personal hub or a BIM 360 account.
    */
  def getHubs(opts: FilterExtensionTypeFilterId, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
