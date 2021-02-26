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
trait ParamsResourceChildrenInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the folder.
    */
  var folderId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChildReference] = js.native
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
}
object ParamsResourceChildrenInsert {
  
  @scala.inline
  def apply(): ParamsResourceChildrenInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChildrenInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceChildrenInsertMutableBuilder[Self <: ParamsResourceChildrenInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaChildReference): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
  }
}
